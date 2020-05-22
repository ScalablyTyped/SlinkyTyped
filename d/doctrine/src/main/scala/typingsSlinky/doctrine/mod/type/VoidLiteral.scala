package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidLiteral extends Type_ {
  var `type`: typingsSlinky.doctrine.doctrineStrings.VoidLiteral
}

object VoidLiteral {
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.VoidLiteral): VoidLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidLiteral]
  }
}

