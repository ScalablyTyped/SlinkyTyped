package typingsSlinky.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceValue extends js.Object {
  /** Allows to set the axis name to place the measures items.
    * @Default {rows}
    */
  var axis: js.UndefOr[String] = js.native
  /** Allows the user to set the display caption for an item for Relational datasource.
    */
  var fieldCaption: js.UndefOr[String] = js.native
  /** Allows the user to bind the item by using its unique name as field name for Relational datasource.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** Allows to set the formula for calculation of values for calculated members in Relational datasource.
    */
  var formula: js.UndefOr[String] = js.native
  /** Indicates whether the field is a calculated field or not with Relational datasource.
    * @Default {false}
    */
  var isCalculatedField: js.UndefOr[Boolean] = js.native
  /** This holds the list of unique names of measures to bind them from the OLAP cube.
    * @Default {[]}
    */
  var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.native
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
  }
  
}

