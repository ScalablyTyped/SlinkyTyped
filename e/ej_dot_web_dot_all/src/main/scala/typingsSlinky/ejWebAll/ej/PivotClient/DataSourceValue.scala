package typingsSlinky.ejWebAll.ej.PivotClient

import typingsSlinky.ejWebAll.ej.PivotAnalysis.SummaryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceValue extends js.Object {
  /** Allows to set the axis name to place the measures items.
    * @Default {rows}
    */
  var axis: js.UndefOr[String] = js.native
  /** Allows to set the custom theme for the values.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Allows you to set the display caption for an item for the relational data source.
    */
  var fieldCaption: js.UndefOr[String] = js.native
  /** Allows you to bind the item by using its unique name as field name for the relational data source.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** Allows to set the format of the values.
    */
  var format: js.UndefOr[String] = js.native
  /** This property is set to display the formatted values with format types in the pivot grid.
    */
  var formatString: js.UndefOr[String] = js.native
  /** Allows to set the formula for calculation of members values in the relational data source.
    */
  var formula: js.UndefOr[String] = js.native
  /** Indicates whether the field is a calculated field or not with the relational data source.
    * @Default {false}
    */
  var isCalculatedField: js.UndefOr[Boolean] = js.native
  /** This holds the list of unique names of measures to bind them from the OLAP cube.
    * @Default {[]}
    */
  var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.native
  /** Allows to set the type of the pivot grid summary calculation for the value field with the relational data source.
    * @Default {ej.PivotAnalysis.SummaryType.Sum}
    */
  var summaryType: js.UndefOr[SummaryType | String] = js.native
}

object DataSourceValue {
  @scala.inline
  def apply(): DataSourceValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceValue]
  }
  @scala.inline
  implicit class DataSourceValueOps[Self <: DataSourceValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatString")(js.undefined)
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCalculatedField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalculatedField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCalculatedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCalculatedField")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasures(value: js.Array[DataSourceValuesMeasure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryType(value: SummaryType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryType")(js.undefined)
        ret
    }
  }
  
}

