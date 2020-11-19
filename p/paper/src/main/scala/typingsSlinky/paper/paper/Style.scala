package typingsSlinky.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDashArrayVarargs(value: Double*): Self = this.set("dashArray", js.Array(value :_*))
    
    @scala.inline
    def setDashArray(value: js.Array[Double]): Self = this.set("dashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashOffset(value: Double): Self = this.set("dashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRule(value: String): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double | String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: String | Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustification(value: String): Self = this.set("justification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeading(value: Double | String): Self = this.set("leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffset(value: Point): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCap(value: String): Self = this.set("strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeJoin(value: String): Self = this.set("strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeScaling(value: Boolean): Self = this.set("strokeScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColor(value: Color): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorNull: Self = this.set("fillColor", null)
    
    @scala.inline
    def setSelectedColor(value: Color): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColorNull: Self = this.set("selectedColor", null)
    
    @scala.inline
    def setShadowColor(value: Color): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorNull: Self = this.set("shadowColor", null)
    
    @scala.inline
    def setStrokeColor(value: Color): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorNull: Self = this.set("strokeColor", null)
  }
}
