package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Animation
  * @classdesc An animation is a sequence of keyframe arrays which map to the nodes of a skeletal hierarchy.
  * It controls how the nodes of the hierarchy are transformed over time.
  * @property {string} name Human-readable name of the animation.
  * @property {number} duration Duration of the animation in seconds.
  */
@js.native
trait Animation extends js.Object {
  /**
    * Duration of the animation in seconds.
    */
  var duration: Double = js.native
  /**
    * Human-readable name of the animation.
    */
  var name: String = js.native
  /**
    * @readonly
    * @name pc.Animation#nodes
    * @type {pc.Node[]}
    * @description A read-only property to get array of animation nodes.
    */
  val nodes: js.Array[Node] = js.native
  /**
    * @function
    * @name pc.Animation#addNode
    * @description Adds a node to the internal nodes array.
    * @param {pc.Node} node - The node to add.
    */
  def addNode(node: Node): Unit = js.native
  /**
    * @function
    * @name pc.Animation#getNode
    * @description Gets a {@link pc.Node} by name.
    * @param {string} name - The name of the pc.Node.
    * @returns {pc.Node} The pc.Node with the specified name.
    */
  def getNode(name: String): Node = js.native
}

object Animation {
  @scala.inline
  def apply(
    addNode: Node => Unit,
    duration: Double,
    getNode: String => Node,
    name: String,
    nodes: js.Array[Node]
  ): Animation = {
    val __obj = js.Dynamic.literal(addNode = js.Any.fromFunction1(addNode), duration = duration.asInstanceOf[js.Any], getNode = js.Any.fromFunction1(getNode), name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNode(value: Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNode(value: String => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

