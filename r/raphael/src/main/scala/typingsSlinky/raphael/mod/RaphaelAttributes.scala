package typingsSlinky.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelAttributes extends js.Object {
  /**
    * Arrowhead on the end of the path. The format for the string is `<type>[-<width>[-<length>]]`.
    *
    * Possible value for `type` are:
    * - classic
    * - block
    * - open
    * - oval
    * - diamond
    * - none
    *
    * Possible value for `width` are:
    * - wide
    * - narrow
    * - medium
    *
    * Possible values for `length` are
    * - long
    * - short
    * - medium
    */
  var `arrow-end`: String = js.native
  /**
    * Comma or space separated values: `x`, `y`, `width` and `height`.
    */
  var `clip-rect`: String = js.native
  /**
    * CSS type of the cursor.
    */
  var cursor: String = js.native
  /**
    * Horizontal coordinate of the origin of the circle.
    */
  var cx: Double = js.native
  /**
    * Vertical coordinate of the origin of the circle.
    */
  var cy: Double = js.native
  /**
    * Colour, gradient or image.
    */
  var fill: String = js.native
  /**
    * Opacity of the fill color.
    */
  var `fill-opacity`: Double = js.native
  /**
    * The combined font family and font size, e.g. `10px "Arial"`.
    */
  var font: String = js.native
  /**
    * Name of the font family to use.
    */
  var `font-family`: String = js.native
  /**
    * Font size in pixels.
    */
  var `font-size`: Double | String = js.native
  /**
    * Font weight as a number, usually between `100` to `900`. Can also be `"bold"` etc.
    */
  var `font-weight`: String = js.native
  /**
    * The height of e.g. a rectangle in pixels.
    */
  var height: Double = js.native
  /**
    * URL, if specified element behaves as hyperlink.
    */
  var href: String = js.native
  /**
    * Opacity of the element, usually between `0` and `1`.
    */
  var opacity: Double = js.native
  /**
    * An SVG path string, e.g. `M 10 10 L 20 10 Z`.
    */
  var path: String = js.native
  /**
    * Radius of the circle in pixels.
    */
  var r: Double = js.native
  /**
    * Horizontal half-axis of the ellipse in pixels.
    */
  var rx: Double = js.native
  /**
    * Vertical half-axis of the ellipse in pixels.
    */
  var ry: Double = js.native
  /**
    * Image URL, only works for {@link RaphaelPaper.image} elements.
    */
  var src: String = js.native
  /**
    * CSS stroke color.
    */
  var stroke: String = js.native
  /**
    * Controls the pattern of dashes and gaps used to form the shape of a path's stroke.
    */
  var `stroke-dasharray`: RaphaelDashArrayType = js.native
  /**
    * Specifies the shape to be used at the end of open subpaths when they are stroked, and the shape to be drawn
    * for zero length subpaths whether they are open or closed.
    */
  var `stroke-linecap`: RaphaelLineCapType = js.native
  /**
    * Specifies the shape to be used at the corners of paths or basic shapes when they are stroked.
    */
  var `stroke-linejoin`: RaphaelLineJoinType = js.native
  /**
    * When two line segments meet at a sharp angle and a value of `miter`, `miter-clip`, or `arcs` has been
    * specified for `stroke-linejoin`, it is possible for the join to extend far beyond the thickness of the line
    * stroking the path. The `stroke-miterlimit` imposes a limit on the extent of the line join.
    */
  var `stroke-miterlimit`: Double = js.native
  /**
    * Opacity of the stroke, usually between `0` and `1`.
    */
  var `stroke-opacity`: Double = js.native
  /**
    * Width of the stroke in pixels.
    */
  var `stroke-width`: Double = js.native
  /**
    * Used with {@link href}.
    */
  var target: String = js.native
  /**
    * Contents of the text element.
    */
  var text: String = js.native
  /**
    * Used to align (start-, middle- or end-alignment) a string of pre-formatted text or auto-wrapped text where
    * the wrapping area is determined from the `inline-size` property relative to a given point.
    */
  var `text-anchor`: RaphaelTextAnchorType = js.native
  /**
    * Will create a tooltip with a given text.
    */
  var title: String = js.native
  /**
    * The transform property of this element.
    */
  var transform: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment] = js.native
  /**
    * The width of e.g. a rectangle in pixels.
    */
  var width: Double = js.native
  /**
    * The horizontal x coordinate in pixels.
    */
  var x: Double = js.native
  /**
    * The vertical y coordinate in pixels.
    */
  var y: Double = js.native
}

object RaphaelAttributes {
  @scala.inline
  def apply(
    `arrow-end`: String,
    `clip-rect`: String,
    cursor: String,
    cx: Double,
    cy: Double,
    fill: String,
    `fill-opacity`: Double,
    font: String,
    `font-family`: String,
    `font-size`: Double | String,
    `font-weight`: String,
    height: Double,
    href: String,
    opacity: Double,
    path: String,
    r: Double,
    rx: Double,
    ry: Double,
    src: String,
    stroke: String,
    `stroke-dasharray`: RaphaelDashArrayType,
    `stroke-linecap`: RaphaelLineCapType,
    `stroke-linejoin`: RaphaelLineJoinType,
    `stroke-miterlimit`: Double,
    `stroke-opacity`: Double,
    `stroke-width`: Double,
    target: String,
    text: String,
    `text-anchor`: RaphaelTextAnchorType,
    title: String,
    transform: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment],
    width: Double,
    x: Double,
    y: Double
  ): RaphaelAttributes = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("arrow-end")(`arrow-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("clip-rect")(`clip-rect`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-dasharray")(`stroke-dasharray`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-linecap")(`stroke-linecap`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-linejoin")(`stroke-linejoin`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-miterlimit")(`stroke-miterlimit`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-opacity")(`stroke-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelAttributes]
  }
  @scala.inline
  implicit class RaphaelAttributesOps[Self <: RaphaelAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withArrow-end`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withClip-rect`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip-rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFill-opacity`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFont-family`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFont-size`(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFont-weight`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStroke-dasharray`(value: RaphaelDashArrayType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-dasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStroke-linecap`(value: RaphaelLineCapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStroke-linejoin`(value: RaphaelLineJoinType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStroke-miterlimit`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-miterlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStroke-opacity`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStroke-width`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-anchor`(value: RaphaelTextAnchorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

