package typingsSlinky.reactStackGrid.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactStackGrid.mod.StackGridProps
import typingsSlinky.reactStackGrid.mod.Units
import typingsSlinky.reactStackGrid.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactStackGrid {
  
  @scala.inline
  def apply(columnWidth: Double | String): Builder = {
    val __props = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StackGridProps]))
  }
  
  @JSImport("react-stack-grid", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def appear(value: () => Unit): this.type = set("appear", js.Any.fromFunction0(value))
    
    @scala.inline
    def appearDelay(value: Double): this.type = set("appearDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def appeared(value: () => Unit): this.type = set("appeared", js.Any.fromFunction0(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easing(value: String): this.type = set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableSSR(value: Boolean): this.type = set("enableSSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enter(value: () => Unit): this.type = set("enter", js.Any.fromFunction0(value))
    
    @scala.inline
    def entered(value: () => Unit): this.type = set("entered", js.Any.fromFunction0(value))
    
    @scala.inline
    def gridRef(value: () => Unit): this.type = set("gridRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def gutterHeight(value: Double): this.type = set("gutterHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gutterWidth(value: Double): this.type = set("gutterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemComponent(value: String): this.type = set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leaved(value: () => Unit): this.type = set("leaved", js.Any.fromFunction0(value))
    
    @scala.inline
    def monitorImagesLoaded(value: Boolean): this.type = set("monitorImagesLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLayout(value: () => Unit): this.type = set("onLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def units(value: Units): this.type = set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def userAgent(value: String): this.type = set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vendorPrefix(value: Boolean): this.type = set("vendorPrefix", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StackGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
