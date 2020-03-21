package typingsSlinky.playcanvas.mod

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
@JSImport("playcanvas", "Skeleton")
@js.native
class Skeleton protected ()
  extends typingsSlinky.playcanvas.pc.Skeleton {
  def this(graph: typingsSlinky.playcanvas.pc.GraphNode) = this()
}

