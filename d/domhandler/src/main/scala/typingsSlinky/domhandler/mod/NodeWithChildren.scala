package typingsSlinky.domhandler.mod

import typingsSlinky.domhandler.domhandlerStrings.cdata
import typingsSlinky.domhandler.domhandlerStrings.script
import typingsSlinky.domhandler.domhandlerStrings.style
import typingsSlinky.domhandler.domhandlerStrings.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler/lib", "NodeWithChildren")
@js.native
class NodeWithChildren protected ()
  extends typingsSlinky.domhandler.nodeMod.NodeWithChildren {
  /**
    *
    * @param type Type of the node.
    * @param children Children of the node. Only certain node types can have children.
    */
  def this(`type`: cdata, children: js.Array[typingsSlinky.domhandler.nodeMod.Node]) = this()
  def this(`type`: script, children: js.Array[typingsSlinky.domhandler.nodeMod.Node]) = this()
  def this(`type`: style, children: js.Array[typingsSlinky.domhandler.nodeMod.Node]) = this()
  def this(`type`: tag, children: js.Array[typingsSlinky.domhandler.nodeMod.Node]) = this()
}

