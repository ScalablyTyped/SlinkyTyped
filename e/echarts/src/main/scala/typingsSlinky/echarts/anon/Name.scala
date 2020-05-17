package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  /**
    * The format is \[start coordinate, end coordinate\],
    * where the coordinate system can be `x`, `y` on
    * [cartesian](https://echarts.apache.org/en/option.html#grid)
    * , or `radius`, `angle` on
    * [polar](https://echarts.apache.org/en/option.html#polar)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.coord
    */
  var coord: js.UndefOr[js.Array[_]] = js.native
  /**
    * Style of the item.
    * `itemStyle` of start point and end point will be
    * merged together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle
    */
  var itemStyle: js.UndefOr[Emphasis] = js.native
  /**
    * Label style of the item.
    * Label style of start point and end point will be
    * merged together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.label
    */
  var label: js.UndefOr[FontFamily] = js.native
  /**
    * Name of the marker, which will display as a label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea.data.1.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specify this item is on min or max or average value.
    *
    * **Options:**
    *
    * + `'min'` max value。
    * + `'max'` min value。
    * + `'average'` average value。
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * value of the item, not necessary.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.value
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * Specify the dimension on which min, max, average
    * are calculated, available when
    * [type](https://echarts.apache.org/en/option.html#series-.markArea.data.type)
    * used.
    * The value can be the name of the dimension (for example,
    * the value can be `x`, `angle` in line chart, and
    * `open`, `close` in candlestick).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.valueDim
    */
  var valueDim: js.UndefOr[String] = js.native
  /**
    * Specify the dimension on which min, max, average
    * are calculated, available when
    * [type](https://echarts.apache.org/en/option.html#series-.markArea.data.type)
    * used.
    * The value can be `0` (means xAxis, radiusAxis) or
    * `1` (means yAxis, angleAxis), using the dimension
    * of the first axis by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.valueIndex
    */
  var valueIndex: js.UndefOr[Double] = js.native
  /**
    * x value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.x
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * y value on screen coordinate system, can be pixel
    * number (like `5`), or percent value (like `'20%'`).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.y
    */
  var y: js.UndefOr[Double] = js.native
}

object Name {
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoord(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coord")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: Emphasis): Self = {
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
    def withLabel(value: FontFamily): Self = {
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
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
    @scala.inline
    def withValueDim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDim")(js.undefined)
        ret
    }
    @scala.inline
    def withValueIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

