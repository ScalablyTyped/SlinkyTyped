package typingsSlinky.echarts.echarts.EChartOption.SeriesLines

import typingsSlinky.echarts.AnonFontStyle
import typingsSlinky.echarts.AnonLineStyleAnonShadowColor
import typingsSlinky.echarts.AnonShadowColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObject extends js.Object {
  /**
    * An array includes two ore more than two coordinates.
    * Each coordinate could be `[x, y]` in
    * [rectangular coordinate](https://echarts.apache.org/en/option.html#grid)
    * and `[lng, lat]` in
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data.coords
    */
  var coords: js.UndefOr[js.Array[_]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis
    */
  var emphasis: js.UndefOr[AnonLineStyleAnonShadowColor] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.label
    */
  var label: js.UndefOr[AnonFontStyle] = js.native
  /**
    * The line style of this data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowColor] = js.native
  /**
    * the name of data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data.name
    */
  var name: js.UndefOr[String] = js.native
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
    def withCoords(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(js.undefined)
        ret
    }
    @scala.inline
    def withEmphasis(value: AnonLineStyleAnonShadowColor): Self = {
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
    def withLabel(value: AnonFontStyle): Self = {
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
    def withLineStyle(value: AnonShadowColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(js.undefined)
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
  }
  
}

