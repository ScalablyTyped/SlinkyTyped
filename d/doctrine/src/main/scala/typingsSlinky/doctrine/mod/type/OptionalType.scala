package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalType extends Type_ {
  var expression: Type_
  var `type`: typingsSlinky.doctrine.doctrineStrings.OptionalType
}

object OptionalType {
  @scala.inline
  def apply(expression: Type_, `type`: typingsSlinky.doctrine.doctrineStrings.OptionalType): OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalType]
  }
}

