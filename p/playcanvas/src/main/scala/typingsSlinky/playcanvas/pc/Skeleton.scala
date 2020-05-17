package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Skeleton
  * @classdesc Represents a skeleton used to play animations.
  * @param {pc.GraphNode} graph - The root pc.GraphNode of the skeleton.
  * @property {boolean} looping Determines whether skeleton is looping its animation.
  */
@js.native
trait Skeleton extends js.Object {
  /**
    * @name pc.Skeleton#animation
    * @type {pc.Animation}
    * @description Animation currently assigned to skeleton.
    */
  var animation: Animation = js.native
  /**
    * @name pc.Skeleton#currentTime
    * @type {number}
    * @description Current time of currently active animation in seconds.
    * This value is between zero and the duration of the animation.
    */
  var currentTime: Double = js.native
  /**
    * Determines whether skeleton is looping its animation.
    */
  var looping: Boolean = js.native
  /**
    * @readonly
    * @name pc.Skeleton#numNodes
    * @type {number}
    * @description Read-only property that returns number of nodes of a skeleton.
    */
  val numNodes: Double = js.native
  /**
    * @function
    * @name pc.Skeleton#addTime
    * @description Progresses The animation assigned to The specified skeleton by The
    * supplied time delta. If the delta takes the animation passed its end point, if
    * the skeleton is set to loop, the animation will continue from the beginning.
    * Otherwise, the animation's current time will remain at its duration (i.e. the
    * end).
    * @param {number} delta - The time in seconds to progress the skeleton's animation.
    */
  def addTime(delta: Double): Unit = js.native
  /**
    * @function
    * @name pc.Skeleton#blend
    * @description Blends two skeletons together.
    * @param {pc.Skeleton} skel1 - Skeleton holding the first pose to be blended.
    * @param {pc.Skeleton} skel2 - Skeleton holding the second pose to be blended.
    * @param {number} alpha - The value controlling the interpolation in relation to the two input
    * skeletons. The value is in the range 0 to 1, 0 generating skel1, 1 generating skel2 and anything
    * in between generating a spherical interpolation between the two.
    */
  def blend(skel1: Skeleton, skel2: Skeleton, alpha: Double): Unit = js.native
  /**
    * @function
    * @name pc.Skeleton#setGraph
    * @description Links a skeleton to a node hierarchy. The nodes animated skeleton are
    * then subsequently used to drive the local transformation matrices of the node
    * hierarchy.
    * @param {pc.GraphNode} graph - The root node of the graph that the skeleton is to drive.
    */
  def setGraph(graph: GraphNode): Unit = js.native
  /**
    * @function
    * @name pc.Skeleton#updateGraph
    * @description Synchronizes the currently linked node hierarchy with the current state of the
    * skeleton. Internally, this function converts the interpolated keyframe at each node in the
    * skeleton into the local transformation matrix at each corresponding node in the linked node
    * hierarchy.
    */
  def updateGraph(): Unit = js.native
}

object Skeleton {
  @scala.inline
  def apply(
    addTime: Double => Unit,
    animation: Animation,
    blend: (Skeleton, Skeleton, Double) => Unit,
    currentTime: Double,
    looping: Boolean,
    numNodes: Double,
    setGraph: GraphNode => Unit,
    updateGraph: () => Unit
  ): Skeleton = {
    val __obj = js.Dynamic.literal(addTime = js.Any.fromFunction1(addTime), animation = animation.asInstanceOf[js.Any], blend = js.Any.fromFunction3(blend), currentTime = currentTime.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], numNodes = numNodes.asInstanceOf[js.Any], setGraph = js.Any.fromFunction1(setGraph), updateGraph = js.Any.fromFunction0(updateGraph))
    __obj.asInstanceOf[Skeleton]
  }
  @scala.inline
  implicit class SkeletonOps[Self <: Skeleton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTime(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlend(value: (Skeleton, Skeleton, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLooping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumNodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetGraph(value: GraphNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGraph")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateGraph(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateGraph")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

