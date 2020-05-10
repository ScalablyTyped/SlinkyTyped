package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.echarts.EChartOption.Dataset.DimensionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dataset component is published since ECharts 4.
  * Dataset brings convenience in data management separated with styles and enables data reuse by different series.
  * More importantly, is enables data encoding from data to visual, which brings convenience in some scenarios.
  *
  * @see https://echarts.apache.org/en/option.html#dataset
  */
@js.native
trait Dataset_ extends js.Object {
  /**
    * dimensions can be used to define dimension info for series.data or dataset.source.
    * Notice: if dataset is used, we can provide dimension names in the first column/row of dataset.source,
    * and not need to specify dimensions here. But if dimensions is specified here,
    * echarts will not retrieve dimension names from the first row/column of dataset.source any more.
    *
    * @see https://echarts.apache.org/en/option.html#dataset.dimensions
    */
  var dimensions: js.UndefOr[js.Array[DimensionObject | String]] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Source data. Generally speaking, a source data describe a table, where these format below can be applied:
    * 2d array, where dimension names can be provided in the first row/column, or do not provide, only data.
    *
    * @see https://echarts.apache.org/en/option.html#dataset.source
    */
  var source: js.UndefOr[js.Array[_] | js.Object] = js.native
}

object Dataset_ {
  @scala.inline
  def apply(): Dataset_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset_]
  }
  @scala.inline
  implicit class Dataset_Ops[Self <: Dataset_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: js.Array[DimensionObject | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: js.Array[_] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

