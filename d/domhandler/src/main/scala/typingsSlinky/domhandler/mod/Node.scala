package typingsSlinky.domhandler.mod

import typingsSlinky.domelementtype.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler/lib", "Node")
@js.native
class Node protected ()
  extends typingsSlinky.domhandler.nodeMod.Node {
  /**
    *
    * @param type The type of the node.
    */
  def this(`type`: ElementType) = this()
}

