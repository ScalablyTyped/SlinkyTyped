package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorSaturation extends js.Object {
  /**
    * The border color and gap color of a node.
    *
    *
    * @default
    * "#fff',"
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * The color saturation of a border or gap.
    * The value range is between 0 ~ 1.
    *
    * Tips:
    *
    * When `borderColorSaturation` is set, the `borderColor`
    * is disabled, and, instead, the final border color is
    * calculated based on the color of this node (this color
    * could be sepcified explicitly or inherited from its parent
    * node) and mixing with `borderColorSaturation`.
    *
    * In this way, a effect can be implemented: different sections
    * have different hue of gap color repectively, which makes
    * users easy to distinguish both sections and levels.
    *
    * **How to avoid confusion by setting border/gap of node**
    *
    * If all of the border/gaps are set with the same color,
    * confusion might occur when rectangulars in different
    * levels display at the same time.
    *
    * See the
    * [example](https://echarts.apache.org/examples/en/editor.html?c=doc-example/treemap-borderColor&edit=1&reset=1)
    *
    * Noticed that the child rectangles in the red area are
    * in the deeper level than rectangles that are saparated
    * by white gap.
    * So in the red area, basically we set gap color with red,
    * and use `borderColorSaturation` to lift the saturation.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.borderColorSaturation
    */
  var borderColorSaturation: js.UndefOr[String] = js.native
  /**
    * The border width of a node.
    * There is no border when it is set as `0`.
    *
    * Tip, gaps between child nodes are specified by
    * [gapWidth](https://echarts.apache.org/en/option.html#series-treemap.levels.gapWidth)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * The color of a node. It use global palette
    * [option.color](https://echarts.apache.org/en/option.html#color)
    * by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The tranparent rate of a node, the range is between 0
    * ~ 1.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.colorAlpha
    */
  var colorAlpha: js.UndefOr[Double] = js.native
  /**
    * The color saturation of a node.
    * The range is between 0 ~ 1.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.colorSaturation
    */
  var colorSaturation: js.UndefOr[Double] = js.native
  /**
    * Gaps between child nodes.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.gapWidth
    */
  var gapWidth: js.UndefOr[Double] = js.native
  /**
    * Stroke color of each rect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.strokeColor
    */
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * Stroke width of each rect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.strokeWidth
    */
  var strokeWidth: js.UndefOr[Double] = js.native
}

object BorderColorSaturation {
  @scala.inline
  def apply(): BorderColorSaturation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorSaturation]
  }
  @scala.inline
  implicit class BorderColorSaturationOps[Self <: BorderColorSaturation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColorSaturation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColorSaturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColorSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColorSaturation")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSaturation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSaturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSaturation")(js.undefined)
        ret
    }
    @scala.inline
    def withGapWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
  }
  
}

