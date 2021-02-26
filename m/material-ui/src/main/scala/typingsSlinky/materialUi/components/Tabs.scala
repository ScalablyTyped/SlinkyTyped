package typingsSlinky.materialUi.components

import org.scalajs.dom.raw.EventTarget
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Tabs.TabsProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("material-ui", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.Tabs] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentContainerClassName(value: String): this.type = set("contentContainerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentContainerStyle(value: CSSProperties): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialSelectedIndex(value: Double): this.type = set("initialSelectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inkBarStyle(value: CSSProperties): this.type = set("inkBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* value */ js.Any, SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event], /* tab */ typingsSlinky.materialUi.MaterialUI.Tabs.Tab) => Unit
    ): this.type = set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabItemContainerStyle(value: CSSProperties): this.type = set("tabItemContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabTemplate(value: ReactComponentClass[_]): this.type = set("tabTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabTemplateStyle(value: CSSProperties): this.type = set("tabTemplateStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
