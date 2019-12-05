package typingsSlinky.doctrine.doctrineMod.`type`

import typingsSlinky.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonNullableType extends Type {
  var expression: Type
  var prefix: Boolean
  var `type`: typingsSlinky.doctrine.doctrineStrings.NonNullableType
}

object NonNullableType {
  @scala.inline
  def apply(expression: Type, prefix: Boolean, `type`: typingsSlinky.doctrine.doctrineStrings.NonNullableType): NonNullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonNullableType]
  }
}

