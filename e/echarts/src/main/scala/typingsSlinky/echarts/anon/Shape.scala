package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
  /**
    * id is used to specifying element when willing to update
    * it. id can be ignored if you do not need it.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether the element is totally ignored (neither render
    * nor listen events).
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.ignore
    */
  var ignore: js.UndefOr[Boolean] = js.native
  /**
    * User defined data, can be visited in event listeners.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.return_polyline)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.info
    */
  var info: js.UndefOr[js.Any] = js.native
  /**
    * Whether the element is visible.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.invisible
    */
  var invisible: js.UndefOr[Boolean] = js.native
  /**
    * See
    * [diffChildrenByName](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.diffChildrenByName)
    * 。
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.origin
    */
  var origin: js.UndefOr[Double] = js.native
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.position
    */
  var position: js.UndefOr[js.Array[_]] = js.native
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.rotation
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * `2D transform` can be applied to graphic elements, including:
    *
    * + [position](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.position)
    * : `[horizontal translate offset, vertical translate offset]`,
    * `[0, 0]` by default.
    * Positive value means translate towards right or bottom.
    * + [rotation](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.rotation)
    * : Rotation in radian, `0` by default.
    * Positive when anticlockwise.
    * + [scale](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.scale)
    * : `[horizontal scale factor, vertical scale factor]`,
    * `[1, 1]` by default.
    *
    * [origin](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.origin)
    * specifies the origin point of rotation and scaling, `[0,
    * 0]` by default.
    *
    * Notice:
    *
    * + The coordinates specified in the transform attribute
    * above are relative to the `[0, 0]` of the parent element
    * (that is,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * or the root canvas). Thus we are able to
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * multiple elements, and
    * [groups](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * can be nested.
    * + The order that the transform attributes are applied
    * to a single graphic element is: Firstly, `rotation`,
    * then, `scale`, finally, `position`.
    *
    *
    * @default
    * [1, 1]
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.scale
    */
  var scale: js.UndefOr[js.Array[_]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.shape
    */
  var shape: js.UndefOr[Points] = js.native
  /**
    * Whether response to mouse events / touch events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * More attributes in `style` (for example,
    * [rich text](https://echarts.apache.org/en/tutorial.html#Rich%20Text)
    * ), see the `style` related attributes in
    * [zrender/graphic/Displayable](https://ecomfe.github.io/zrender-doc/public/api.html#zrenderdisplayable)
    * .
    *
    * Notice, the attribute names of the `style` of graphic
    * elements is derived from `zrender`, which may be different
    * from the attribute names in `echarts label`, `echarts
    * itemStyle`, etc.,
    * although they have the same meaning. For example:
    *
    * + [itemStyle.color](https://echarts.apache.org/en/option.html#series-scatter.label.color)
    * => `style.fill`
    * + [itemStyle.borderColor](https://echarts.apache.org/en/option.html#series-scatter.label.color)
    * => `style.stroke`
    * + [label.color](https://echarts.apache.org/en/option.html#series-scatter.label.color)
    * => `style.textFill`
    * + [label.textBorderColor](https://echarts.apache.org/en/option.html#series-scatter.label.textBorderColor)
    * => `style.textStroke`
    * + ...
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.style
    */
  var style: js.UndefOr[Fill] = js.native
  /**
    * Empahsis style of the graphic element, whose structure
    * is the same as
    * [style](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon.style)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.styleEmphasis
    */
  var styleEmphasis: js.UndefOr[js.Object] = js.native
  /**
    * Must be specified when define a graphic element at the
    * first time.
    *
    * Optional values:
    *
    * [image](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_image)
    * ,
    * [text](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_text)
    * ,
    * [circle](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_circle)
    * ,
    * [sector](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_sector)
    * ,
    * [ring](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring)
    * ,
    * [polygon](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polygon)
    * ,
    * [polyline](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline)
    * ,
    * [rect](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect)
    * ,
    * [line](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line)
    * ,
    * [bezierCurve](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve)
    * ,
    * [arc](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc)
    * ,
    * [group](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_group)
    * ,
    *
    *
    * @default
    * "polyline"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Define the overlap relationship between graphic elements.
    *
    *
    * @default
    * "undefined"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_polyline.z2
    */
  var z2: js.UndefOr[Double] = js.native
}

object Shape {
  @scala.inline
  def apply(): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  implicit class ShapeOps[Self <: Shape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIgnore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withInvisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invisible")(js.undefined)
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
    def withOrigin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: Points): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Fill): Self = {
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
    def withStyleEmphasis(value: js.Object): Self = {
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
    def withZ2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z2")(js.undefined)
        ret
    }
  }
  
}

