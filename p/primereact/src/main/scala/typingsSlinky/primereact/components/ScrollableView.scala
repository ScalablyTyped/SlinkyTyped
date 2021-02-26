package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.scrollableViewMod.ScrollableViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollableView {
  
  @JSImport("primereact/components/datatable/ScrollableView", "ScrollableView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.scrollableViewMod.ScrollableView] {
    
    @scala.inline
    def body(value: js.Any): this.type = set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: js.Any): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def frozen(value: Boolean): this.type = set("frozen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def frozenBody(value: js.Any): this.type = set("frozenBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def frozenWidth(value: String): this.type = set("frozenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onVirtualScroll(value: /* page */ Double => Unit): this.type = set("onVirtualScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def totalRcords(value: Double): this.type = set("totalRcords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unfrozenWidth(value: String): this.type = set("unfrozenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def virtualScroll(value: Boolean): this.type = set("virtualScroll", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScrollableView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollableViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
