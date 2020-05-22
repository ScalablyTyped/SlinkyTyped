package typingsSlinky.jqueryui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends js.Object {
  var attribute: js.UndefOr[String] = js.undefined
  var expression: js.UndefOr[js.RegExp] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

object Expression {
  @scala.inline
  def apply(attribute: String = null, expression: js.RegExp = null, key: String = null): Expression = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

