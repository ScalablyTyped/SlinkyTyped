package typingsSlinky.reactVis.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVis.mod.AnimationParam
import typingsSlinky.reactVis.mod.VerticalGridLinesProps
import typingsSlinky.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VerticalGridLines {
  
  @JSImport("react-vis", "VerticalGridLines")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def animation(value: String | AnimationParam | Boolean): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def attr(value: String): this.type = set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
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
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickTotal(value: Double): this.type = set("tickTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickValues(value: js.Array[_]): this.type = set("tickValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickValuesVarargs(value: js.Any*): this.type = set("tickValues", js.Array(value :_*))
    
    @scala.inline
    def top(value: Double): this.type = set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VerticalGridLines.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VerticalGridLinesProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
