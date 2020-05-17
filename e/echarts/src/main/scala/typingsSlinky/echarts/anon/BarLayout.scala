package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarLayout extends js.Object {
  /**
    * When `barLayout` is needed, (for example, when attaching
    * some extra graphic elements to bar chart), this method
    * can be used to obtain bar layout info.
    *
    * See a
    * [sample](https://echarts.apache.org/examples/en/editor.html?c=custom-bar-trend)
    * .
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.barLayout
    */
  var barLayout: js.UndefOr[js.Function] = js.native
  /**
    * Convert data to coordinate.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.coord
    */
  var coord: js.UndefOr[js.Function] = js.native
  /**
    * Obtain the current series index.
    * Notice that the `currentSeriesIndex` is different
    * from `seriesIndex` when legend is used to filter
    * some series.
    *
    * ```
    * @return {number}
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.currentSeriesIndices
    */
  var currentSeriesIndices: js.UndefOr[js.Function] = js.native
  /**
    * Obtain font string, which can be used on style setting
    * directly.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.font
    */
  var font: js.UndefOr[js.Function] = js.native
  /**
    * ```
    * @return {number} The current devicePixelRatio。
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getDevicePixelRatio
    */
  var getDevicePixelRatio: js.UndefOr[js.Function] = js.native
  /**
    * ```
    * @return {number} Height of echarts container.
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getHeight
    */
  var getHeight: js.UndefOr[js.Function] = js.native
  /**
    * ```
    * @return {number} Width of echarts containter.
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getWidth
    */
  var getWidth: js.UndefOr[js.Function] = js.native
  /**
    * ```
    * @return {module:zrender} zrender instance.
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getZr
    */
  var getZr: js.UndefOr[js.Function] = js.native
  /**
    * Get the size by the given data range.
    *
    * For example, in `cartesian2d`, suppose calling `api.size([2,
    * 4])` returns `[12.4,
    * 55]`.
    * It represents that on x axis, data range `2` corresponds
    * to size `12.4`,
    * and on y axis data range `4` corresponds to size
    * `55`.
    *
    * In some coordinate systems (for example, polar) or
    * when log axis is used, the size is different in different
    * point.
    * So the second parameter is necessary to calculate
    * size on the given point.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.size
    */
  var size: js.UndefOr[js.Function] = js.native
  /**
    * The method obtains style info defined in
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-custom.itemStyle)
    * , and visual info obtained by visual mapping, and
    * return them.
    * Those returned info can be assigned to `style` attribute
    * of graphic element definition directly.
    * Developers can also override style info by calling
    * this method like this: `api.style({fill:
    * 'green', stroke: 'yellow'})`.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.style
    */
  var style: js.UndefOr[js.Function] = js.native
  /**
    * The method obtains style info defined in
    * [series.itemStyle.emphasis](https://echarts.apache.org/en/option.html#series-custom.itemStyle.emphasis)
    * , and visual info obtained by visual mapping, and
    * return them.
    * Those returned info can be assigned to `style` attribute
    * of graphic element definition directly.
    * Developers can also override style info by calling
    * this method like this: `api.style({fill:
    * 'green', stroke: 'yellow'})`.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.styleEmphasis
    */
  var styleEmphasis: js.UndefOr[js.Function] = js.native
  /**
    * Get value on the given dimension.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.value
    */
  var value: js.UndefOr[js.Function] = js.native
  /**
    * Get the visual info. It is rarely be used.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.visual
    */
  var visual: js.UndefOr[js.Function] = js.native
}

object BarLayout {
  @scala.inline
  def apply(): BarLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarLayout]
  }
  @scala.inline
  implicit class BarLayoutOps[Self <: BarLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarLayout(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withCoord(value: js.Function): Self = {
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
    def withCurrentSeriesIndices(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSeriesIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSeriesIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSeriesIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDevicePixelRatio(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDevicePixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetDevicePixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDevicePixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeight(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWidth(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetZr(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetZr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getZr")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleEmphasis(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleEmphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleEmphasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleEmphasis")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Function): Self = {
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
    def withVisual(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual")(js.undefined)
        ret
    }
  }
  
}

