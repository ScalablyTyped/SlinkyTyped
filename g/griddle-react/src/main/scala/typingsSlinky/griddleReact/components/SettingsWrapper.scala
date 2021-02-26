package typingsSlinky.griddleReact.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.mod.GriddleComponent
import typingsSlinky.griddleReact.mod.components.SettingsProps
import typingsSlinky.griddleReact.mod.components.SettingsToggleProps
import typingsSlinky.griddleReact.mod.components.SettingsWrapperProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SettingsWrapper {
  
  @JSImport("griddle-react", "components.SettingsWrapper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.griddleReact.mod.components.SettingsWrapper] {
    
    @scala.inline
    def Settings(value: GriddleComponent[SettingsProps]): this.type = set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def SettingsComponentClass(value: ReactComponentClass[SettingsProps]): this.type = set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def SettingsFunctionComponent(value: ReactComponentClass[SettingsProps]): this.type = set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def SettingsToggle(value: GriddleComponent[SettingsToggleProps]): this.type = set("SettingsToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def SettingsToggleComponentClass(value: ReactComponentClass[SettingsToggleProps]): this.type = set("SettingsToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def SettingsToggleFunctionComponent(value: ReactComponentClass[SettingsToggleProps]): this.type = set("SettingsToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isEnabled(value: Boolean): this.type = set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isVisible(value: Boolean): this.type = set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SettingsWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SettingsWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
