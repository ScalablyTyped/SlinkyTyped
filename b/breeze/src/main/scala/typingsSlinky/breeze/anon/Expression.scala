package typingsSlinky.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends js.Object {
  var expression: js.RegExp
  var messageTemplate: js.UndefOr[String] = js.undefined
}

object Expression {
  @scala.inline
  def apply(expression: js.RegExp, messageTemplate: String = null): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

