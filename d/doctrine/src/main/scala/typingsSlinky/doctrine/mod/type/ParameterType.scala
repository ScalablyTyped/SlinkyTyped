package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterType extends Type_ {
  var expression: Type_
  var name: String
  var `type`: typingsSlinky.doctrine.doctrineStrings.ParameterType
}

object ParameterType {
  @scala.inline
  def apply(expression: Type_, name: String, `type`: typingsSlinky.doctrine.doctrineStrings.ParameterType): ParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterType]
  }
}

