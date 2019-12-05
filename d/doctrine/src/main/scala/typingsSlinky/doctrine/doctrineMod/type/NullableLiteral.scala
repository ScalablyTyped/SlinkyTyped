package typingsSlinky.doctrine.doctrineMod.`type`

import typingsSlinky.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullableLiteral extends Type {
  var `type`: typingsSlinky.doctrine.doctrineStrings.NullableLiteral
}

object NullableLiteral {
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.NullableLiteral): NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableLiteral]
  }
}

