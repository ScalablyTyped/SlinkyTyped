package typingsSlinky.node.osMod

import typingsSlinky.node.nodeStrings.BE
import typingsSlinky.node.nodeStrings.LE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "endianness")
@js.native
object endianness extends js.Object {
  def apply(): BE | LE = js.native
}

