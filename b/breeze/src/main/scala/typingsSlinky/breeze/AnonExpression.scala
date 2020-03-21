package typingsSlinky.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpression extends js.Object {
  var expression: js.RegExp
  var messageTemplate: js.UndefOr[String] = js.undefined
}

object AnonExpression {
  @scala.inline
  def apply(expression: js.RegExp, messageTemplate: String = null): AnonExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpression]
  }
}

