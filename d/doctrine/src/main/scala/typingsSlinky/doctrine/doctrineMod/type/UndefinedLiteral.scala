package typingsSlinky.doctrine.doctrineMod.`type`

import typingsSlinky.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndefinedLiteral extends Type {
  var `type`: typingsSlinky.doctrine.doctrineStrings.UndefinedLiteral
}

object UndefinedLiteral {
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.UndefinedLiteral): UndefinedLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndefinedLiteral]
  }
}

