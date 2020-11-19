package typingsSlinky.griddleReact.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.mod.components.SettingsToggleProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SettingsToggle {
  
  @JSImport("griddle-react", "components.SettingsToggle")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.griddleReact.mod.components.SettingsToggle] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: js.Any): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SettingsToggleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SettingsToggle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
