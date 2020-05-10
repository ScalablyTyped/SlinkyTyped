package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelClassLabelExpressionInfo extends Object {
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that evaluates to a string used to label features in the layer. The most simple expressions return field values. For example, to label a layer of cities with their names, simply reference the field value with the global variable: `$feature.CITY_NAME`. Expressions can be more sophisticated and use logical functions. This may be useful if you want to use classed labels. For example, the following expression appends `city` to the end of the label if the feature's population field contains a number greater than 10,000. Otherwise, `town` is appended to the end of the label. Additionally, you can use `TextFormatting.NewLine` to add a new line to the label.  `IIF($feature.POPULATION > 10000, $feature.NAME + ' city', $feature.NAME + ' town')`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var expression: String = js.native
  /**
    * The SQL expression defining the content of the label text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var value: js.UndefOr[String] = js.native
}

object LabelClassLabelExpressionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    expression: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LabelClassLabelExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LabelClassLabelExpressionInfo]
  }
  @scala.inline
  implicit class LabelClassLabelExpressionInfoOps[Self <: LabelClassLabelExpressionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

