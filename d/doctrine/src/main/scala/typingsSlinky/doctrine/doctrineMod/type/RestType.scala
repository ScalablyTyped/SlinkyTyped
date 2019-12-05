package typingsSlinky.doctrine.doctrineMod.`type`

import typingsSlinky.doctrine.doctrineMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestType extends Type {
  var expression: js.UndefOr[Type] = js.undefined
  var `type`: typingsSlinky.doctrine.doctrineStrings.RestType
}

object RestType {
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.RestType, expression: Type = null): RestType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestType]
  }
}

