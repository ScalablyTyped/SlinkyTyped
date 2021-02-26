package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Index
import typingsSlinky.primereact.tabViewMod.TabViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabView {
  
  @JSImport("primereact/tabview", "TabView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactTabviewMod.TabView] {
    
    @scala.inline
    def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTabChange(value: /* e */ Index => Unit): this.type = set("onTabChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderActiveOnly(value: Boolean): this.type = set("renderActiveOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TabView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
