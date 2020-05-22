package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.StringExpr
import typingsSlinky.qlik.qlikStrings.StringExpression
import typingsSlinky.qlik.qlikStrings.ValueExpression
import typingsSlinky.qlik.qlikStrings.array
import typingsSlinky.qlik.qlikStrings.boolean
import typingsSlinky.qlik.qlikStrings.dimension
import typingsSlinky.qlik.qlikStrings.expression
import typingsSlinky.qlik.qlikStrings.integer
import typingsSlinky.qlik.qlikStrings.items
import typingsSlinky.qlik.qlikStrings.measure
import typingsSlinky.qlik.qlikStrings.number
import typingsSlinky.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyExpression
  extends CustomPropertyCommon
     with CustomProperty {
  var component: expression
  var defaultValue: js.UndefOr[String] = js.undefined
  var expressionType: dimension | measure | StringExpr | typingsSlinky.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  @JSName("type")
  var type_CustomPropertyExpression: js.UndefOr[scala.Nothing] = js.undefined
}

object CustomPropertyExpression {
  @scala.inline
  def apply(
    component: expression,
    expressionType: dimension | measure | StringExpr | typingsSlinky.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression,
    defaultValue: String = null,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyExpression]
  }
}

