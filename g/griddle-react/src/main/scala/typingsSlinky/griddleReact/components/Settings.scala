package typingsSlinky.griddleReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.mod.GriddleComponent
import typingsSlinky.griddleReact.mod.components.SettingsProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Settings {
  
  @JSImport("griddle-react", "components.Settings")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.griddleReact.mod.components.Settings] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def settingsComponents(value: js.Array[GriddleComponent[_]]): this.type = set("settingsComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def settingsComponentsVarargs(value: GriddleComponent[js.Any]*): this.type = set("settingsComponents", js.Array(value :_*))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Settings.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SettingsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
