package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.GraphNode
  * @augments pc.EventHandler
  * @classdesc A hierarchical scene node.
  * @param {string} [name] - The non-unique name of the graph node, default is "Untitled".
  * @property {string} name The non-unique name of a graph node.
  * @property {pc.Tags} tags Interface for tagging graph nodes. Tag based searches can be performed using the {@link pc.GraphNode#findByTag} function.
  */
@JSGlobal("pc.GraphNode")
@js.native
class GraphNode ()
  extends typingsSlinky.playcanvas.pc.GraphNode {
  def this(name: String) = this()
}

