package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arguments extends js.Object {
  /**
    * Parameters of `renderItem`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments
    */
  var arguments: js.UndefOr[Api] = js.native
  /**
    * `renderItem` should returns graphic element definitions.
    * Each graphic element is an object. See
    * [graphic](https://echarts.apache.org/en/option.html#graphic.elements)
    * for detailed info.
    * (But width\\height\\top\\bottom is not supported here)
    *
    * If nothing should be rendered in this data item, just returns
    * nothing.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem)
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return
    */
  var `return`: js.UndefOr[js.Object] = js.native
  /**
    * Arc element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc
    */
  var return_arc: js.UndefOr[Scale] = js.native
  /**
    * Quadratic bezier curve or cubic bezier curve.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve
    */
  var return_bezierCurve: js.UndefOr[Style] = js.native
  /**
    * Circle element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_circle
    */
  var return_circle: js.UndefOr[Origin] = js.native
  /**
    * `group` is the only type that can contain children, so that
    * a group of elements can be positioned and transformed together.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group
    */
  var return_group: js.UndefOr[Children] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image
    */
  var return_image: js.UndefOr[Ignore] = js.native
  /**
    * Line element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line
    */
  var return_line: js.UndefOr[Silent] = js.native
  /**
    * Use
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * to describe a path.
    * Can be used to draw icons or any other shapes fitting the
    * specified size by auto transforming.
    *
    * See examples:
    * [icons](https://echarts.apache.org/examples/en/editor.html?c=custom-calendar-icon)
    * and
    * [shapes](https://echarts.apache.org/examples/en/editor.html?c=custom-gantt-flight)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path
    */
  var return_path: js.UndefOr[Id] = js.native
  /**
    * Polygon element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon
    */
  var return_polygon: js.UndefOr[Shape] = js.native
  /**
    * Polyline element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline
    */
  var return_polyline: js.UndefOr[Shape] = js.native
  /**
    * Rectangle element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect
    */
  var return_rect: js.UndefOr[Invisible] = js.native
  /**
    * Ring element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring
    */
  var return_ring: js.UndefOr[Rotation] = js.native
  /**
    * Sector element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_sector
    */
  var return_sector: js.UndefOr[Scale] = js.native
  /**
    * Text block.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text
    */
  var return_text: js.UndefOr[Info] = js.native
}

object Arguments {
  @scala.inline
  def apply(): Arguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arguments]
  }
  @scala.inline
  implicit class ArgumentsOps[Self <: Arguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: Api): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_arc(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_arc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_arc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_arc")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_bezierCurve(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_bezierCurve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_bezierCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_bezierCurve")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_circle(value: Origin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_circle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_circle")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_group(value: Children): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_group")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_image(value: Ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_image")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_line(value: Silent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_line: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_line")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_path(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_path")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_polygon(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_polygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_polygon")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_polyline(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_polyline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_polyline")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_rect(value: Invisible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_rect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_rect")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_ring(value: Rotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_ring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_ring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_ring")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_sector(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_sector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_sector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_sector")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_text(value: Info): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_text")(js.undefined)
        ret
    }
  }
  
}

