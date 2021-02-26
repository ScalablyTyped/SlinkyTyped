package typingsSlinky.reactSketchapp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSketchapp.lineMod.LineProps
import typingsSlinky.reactSketchapp.lineMod.default
import typingsSlinky.reactSketchapp.propsMod.NumberArrayProp
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.reactSketchappStrings.bevel
import typingsSlinky.reactSketchapp.reactSketchappStrings.butt
import typingsSlinky.reactSketchapp.reactSketchappStrings.evenodd
import typingsSlinky.reactSketchapp.reactSketchappStrings.miter
import typingsSlinky.reactSketchapp.reactSketchappStrings.nonzero
import typingsSlinky.reactSketchapp.reactSketchappStrings.round
import typingsSlinky.reactSketchapp.reactSketchappStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Line {
  
  @scala.inline
  def apply(x1: NumberProp, x2: NumberProp, y1: NumberProp, y2: NumberProp): Builder = {
    val __props = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineProps]))
  }
  
  @JSImport("react-sketchapp/lib/components/Svg/Line", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
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
    def skew(value: NumberProp): this.type = set("skew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skewX(value: NumberProp): this.type = set("skewX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skewY(value: NumberProp): this.type = set("skewY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDasharray(value: NumberArrayProp): this.type = set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDasharrayVarargs(value: NumberProp*): this.type = set("strokeDasharray", js.Array(value :_*))
    
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
    def transform(value: js.Object | String): this.type = set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: NumberProp): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translateX(value: NumberProp): this.type = set("translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translateY(value: NumberProp): this.type = set("translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: NumberProp): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: NumberProp): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
