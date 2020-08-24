package typingsSlinky.domhandler.mod

import typingsSlinky.domhandler.domhandlerStrings.comment
import typingsSlinky.domhandler.domhandlerStrings.directive
import typingsSlinky.domhandler.domhandlerStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler/lib", "DataNode")
@js.native
class DataNode protected ()
  extends typingsSlinky.domhandler.nodeMod.DataNode {
  /**
    *
    * @param type The type of the node
    * @param data The content of the data node
    */
  def this(`type`: comment, data: String) = this()
  def this(`type`: directive, data: String) = this()
  def this(`type`: text, data: String) = this()
}

