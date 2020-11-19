package typingsSlinky.reactVis.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVis.mod.XAxisProps
import typingsSlinky.reactVis.reactVisStrings.bottom
import typingsSlinky.reactVis.reactVisStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XAxis {
  
  @JSImport("react-vis", "XAxis")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def attr(value: String): this.type = set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def attrAxis(value: String): this.type = set("attrAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideLine(value: Boolean): this.type = set("hideLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideTicks(value: Boolean): this.type = set("hideTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerHeight(value: Double): this.type = set("innerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerWidth(value: Double): this.type = set("innerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def left(value: Double): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBottom(value: Double): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginLeft(value: Double): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginRight(value: Double): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginTop(value: Double): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def on0(value: Boolean): this.type = set("on0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orientation(value: top | bottom): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickFormat(value: /* tick */ js.Any => String): this.type = set("tickFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def tickLabelAngle(value: Double): this.type = set("tickLabelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickPadding(value: Double): this.type = set("tickPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickSize(value: Double): this.type = set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickSizeInner(value: Double): this.type = set("tickSizeInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickSizeOuter(value: Double): this.type = set("tickSizeOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickTotal(value: Double): this.type = set("tickTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickValuesVarargs(value: js.Any*): this.type = set("tickValues", js.Array(value :_*))
    
    @scala.inline
    def tickValues(value: js.Array[_]): this.type = set("tickValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def top(value: Double): this.type = set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: XAxisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: XAxis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
