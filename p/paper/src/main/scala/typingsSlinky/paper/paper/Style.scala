package typingsSlinky.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * Style is used for changing the visual styles of items
  * contained within a Paper.js project and is returned by
  * {@link Item#style} and {@link Project#currentStyle}.
  * 
  * All properties of Style are also reflected directly in {@link Item},
  * i.e.: {@link Item#fillColor}.
  * 
  * To set multiple style properties in one go, you can pass an object to
  * {@link Item#style}. This is a convenient way to define a style once and
  * apply it to a series of items:
  */
@js.native
trait Style extends js.Object {
  /** 
    * Specifies an array containing the dash and gap lengths of the stroke.
    */
  var dashArray: js.Array[Double] = js.native
  /** 
    * The dash offset of the stroke.
    */
  var dashOffset: Double = js.native
  /** 
    * The fill color.
    */
  var fillColor: Color | Null = js.native
  /** 
    * The fill-rule with which the shape gets filled. Please note that only
    * modern browsers support fill-rules other than `'nonzero'`.
    */
  var fillRule: String = js.native
  /** 
    * The font-family to be used in text content.
    */
  var fontFamily: String = js.native
  /** 
    * The font size of text content, as a number in pixels, or as a string with
    * optional units `'px'`, `'pt'` and `'em'`.
    */
  var fontSize: Double | String = js.native
  /** 
    * The font-weight to be used in text content.
    */
  var fontWeight: String | Double = js.native
  /** 
    * The justification of text paragraphs.
    */
  var justification: String = js.native
  /** 
    * The text leading of text content.
    */
  var leading: Double | String = js.native
  /** 
    * The miter limit of the stroke. When two line segments meet at a sharp
    * angle and miter joins have been specified for {@link #strokeJoin}, it is
    * possible for the miter to extend far beyond the {@link #strokeWidth} of
    * the path. The miterLimit imposes a limit on the ratio of the miter length
    * to the {@link #strokeWidth}.
    */
  var miterLimit: Double = js.native
  /** 
    * The color the item is highlighted with when selected. If the item does
    * not specify its own color, the color defined by its layer is used instead.
    */
  var selectedColor: Color | Null = js.native
  /** 
    * The shadow's blur radius.
    */
  var shadowBlur: Double = js.native
  /** 
    * The shadow color.
    */
  var shadowColor: Color | Null = js.native
  /** 
    * The shadow's offset.
    */
  var shadowOffset: Point = js.native
  /** 
    * The shape to be used at the beginning and end of open {@link Path} items,
    * when they have a stroke.
    */
  var strokeCap: String = js.native
  /** 
    * The color of the stroke.
    */
  var strokeColor: Color | Null = js.native
  /** 
    * The shape to be used at the segments and corners of {@link Path} items
    * when they have a stroke.
    */
  var strokeJoin: String = js.native
  /** 
    * Specifies whether the stroke is to be drawn taking the current affine
    * transformation into account (the default behavior), or whether it should
    * appear as a non-scaling stroke.
    */
  var strokeScaling: Boolean = js.native
  /** 
    * The width of the stroke.
    */
  var strokeWidth: Double = js.native
  /** 
    * The view that this style belongs to.
    */
  val view: View = js.native
}

object Style {
  @scala.inline
  def apply(
    dashArray: js.Array[Double],
    dashOffset: Double,
    fillRule: String,
    fontFamily: String,
    fontSize: Double | String,
    fontWeight: String | Double,
    justification: String,
    leading: Double | String,
    miterLimit: Double,
    shadowBlur: Double,
    shadowOffset: Point,
    strokeCap: String,
    strokeJoin: String,
    strokeScaling: Boolean,
    strokeWidth: Double,
    view: View
  ): Style = {
    val __obj = js.Dynamic.literal(dashArray = dashArray.asInstanceOf[js.Any], dashOffset = dashOffset.asInstanceOf[js.Any], fillRule = fillRule.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], justification = justification.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], shadowBlur = shadowBlur.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], strokeCap = strokeCap.asInstanceOf[js.Any], strokeJoin = strokeJoin.asInstanceOf[js.Any], strokeScaling = strokeScaling.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashArray(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJustification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeading(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowOffset(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeCap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(null)
        ret
    }
    @scala.inline
    def withSelectedColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedColor")(null)
        ret
    }
    @scala.inline
    def withShadowColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(null)
        ret
    }
    @scala.inline
    def withStrokeColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(null)
        ret
    }
  }
  
}

