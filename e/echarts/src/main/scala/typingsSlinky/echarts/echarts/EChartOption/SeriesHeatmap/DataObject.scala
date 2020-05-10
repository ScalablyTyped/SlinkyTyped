package typingsSlinky.echarts.echarts.EChartOption.SeriesHeatmap

import typingsSlinky.echarts.AnonBorderType
import typingsSlinky.echarts.AnonDistance
import typingsSlinky.echarts.AnonItemStyleAnonBorderTypeLabelAnonDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data.emphasis
    */
  var emphasis: js.UndefOr[AnonItemStyleAnonBorderTypeLabelAnonDistance] = js.native
  /**
    * Style of a single data point. It is valid with
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * of 'cartesian2d' value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.native
  /**
    * It is valid with
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * of 'cartesian2d' value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data.label
    */
  var label: js.UndefOr[AnonDistance] = js.native
  /**
    * Name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data.value
    */
  var value: js.UndefOr[js.Array[_]] = js.native
}

object DataObject {
  @scala.inline
  def apply(): DataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataObject]
  }
  @scala.inline
  implicit class DataObjectOps[Self <: DataObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmphasis(value: AnonItemStyleAnonBorderTypeLabelAnonDistance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmphasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: AnonBorderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnonDistance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[_]): Self = {
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

