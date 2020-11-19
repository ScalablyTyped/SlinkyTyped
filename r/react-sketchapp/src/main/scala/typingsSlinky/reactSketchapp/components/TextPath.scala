package typingsSlinky.reactSketchapp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSketchapp.propsMod.AlignmentBaseline
import typingsSlinky.reactSketchapp.propsMod.BaselineShift
import typingsSlinky.reactSketchapp.propsMod.Font
import typingsSlinky.reactSketchapp.propsMod.FontFamily
import typingsSlinky.reactSketchapp.propsMod.FontFeatureSettings
import typingsSlinky.reactSketchapp.propsMod.FontStretch
import typingsSlinky.reactSketchapp.propsMod.FontStyle
import typingsSlinky.reactSketchapp.propsMod.FontVariant
import typingsSlinky.reactSketchapp.propsMod.FontVariantLigatures
import typingsSlinky.reactSketchapp.propsMod.FontWeight
import typingsSlinky.reactSketchapp.propsMod.Kerning
import typingsSlinky.reactSketchapp.propsMod.LengthAdjust
import typingsSlinky.reactSketchapp.propsMod.LetterSpacing
import typingsSlinky.reactSketchapp.propsMod.Method
import typingsSlinky.reactSketchapp.propsMod.MidLine
import typingsSlinky.reactSketchapp.propsMod.NumberArrayProp
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.propsMod.Side
import typingsSlinky.reactSketchapp.propsMod.Spacing
import typingsSlinky.reactSketchapp.propsMod.StartOffset
import typingsSlinky.reactSketchapp.propsMod.TextAnchor
import typingsSlinky.reactSketchapp.propsMod.TextDecoration
import typingsSlinky.reactSketchapp.propsMod.TextLength
import typingsSlinky.reactSketchapp.propsMod.TextPathProps
import typingsSlinky.reactSketchapp.propsMod.VerticalAlign
import typingsSlinky.reactSketchapp.propsMod.WordSpacing
import typingsSlinky.reactSketchapp.reactSketchappStrings.bevel
import typingsSlinky.reactSketchapp.reactSketchappStrings.butt
import typingsSlinky.reactSketchapp.reactSketchappStrings.evenodd
import typingsSlinky.reactSketchapp.reactSketchappStrings.miter
import typingsSlinky.reactSketchapp.reactSketchappStrings.nonzero
import typingsSlinky.reactSketchapp.reactSketchappStrings.round
import typingsSlinky.reactSketchapp.reactSketchappStrings.square
import typingsSlinky.reactSketchapp.textPathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextPath {
  
  @JSImport("react-sketchapp/lib/components/Svg/TextPath", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def alignmentBaseline(value: AlignmentBaseline): this.type = set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baselineShiftVarargs(value: NumberProp*): this.type = set("baselineShift", js.Array(value :_*))
    
    @scala.inline
    def baselineShift(value: BaselineShift): this.type = set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipPath(value: String): this.type = set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipRule(value: evenodd | nonzero): this.type = set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillOpacity(value: NumberProp): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRule(value: evenodd | nonzero): this.type = set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def font(value: Font): this.type = set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontData(value: js.Object): this.type = set("fontData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFamily(value: FontFamily): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFeatureSettings(value: FontFeatureSettings): this.type = set("fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSize(value: typingsSlinky.reactSketchapp.propsMod.fontSize): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStretch(value: FontStretch): this.type = set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStyle(value: FontStyle): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariant(value: FontVariant): this.type = set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariantLigatures(value: FontVariantLigatures): this.type = set("fontVariantLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontWeight(value: FontWeight): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def kerning(value: Kerning): this.type = set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lengthAdjust(value: LengthAdjust): this.type = set("lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def letterSpacing(value: LetterSpacing): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def method(value: Method): this.type = set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def midLine(value: MidLine): this.type = set("midLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def origin(value: NumberProp): this.type = set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def originX(value: NumberProp): this.type = set("originX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def originY(value: NumberProp): this.type = set("originY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: NumberProp): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotation(value: NumberProp): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: NumberProp): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleX(value: NumberProp): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleY(value: NumberProp): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def side(value: Side): this.type = set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skew(value: NumberProp): this.type = set("skew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skewX(value: NumberProp): this.type = set("skewX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skewY(value: NumberProp): this.type = set("skewY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spacing(value: Spacing): this.type = set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startOffset(value: StartOffset): this.type = set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDasharrayVarargs(value: NumberProp*): this.type = set("strokeDasharray", js.Array(value :_*))
    
    @scala.inline
    def strokeDasharray(value: NumberArrayProp): this.type = set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDashoffset(value: NumberProp): this.type = set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinecap(value: butt | square | round): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinejoin(value: miter | bevel | round): this.type = set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeMiterlimit(value: NumberProp): this.type = set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeOpacity(value: NumberProp): this.type = set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: NumberProp): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAnchor(value: TextAnchor): this.type = set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecoration(value: TextDecoration): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textLength(value: TextLength): this.type = set("textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transform(value: js.Object | String): this.type = set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: NumberProp): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translateX(value: NumberProp): this.type = set("translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translateY(value: NumberProp): this.type = set("translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlign(value: VerticalAlign): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wordSpacing(value: WordSpacing): this.type = set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: NumberProp): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: NumberProp): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TextPathProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(href: String): Builder = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TextPathProps]))
  }
}
