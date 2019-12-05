package typingsSlinky.doctrine.doctrineMod.`type`

import typingsSlinky.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalType extends Type {
  var expression: Type
  var `type`: typingsSlinky.doctrine.doctrineStrings.OptionalType
}

object OptionalType {
  @scala.inline
  def apply(expression: Type, `type`: typingsSlinky.doctrine.doctrineStrings.OptionalType): OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalType]
  }
}

