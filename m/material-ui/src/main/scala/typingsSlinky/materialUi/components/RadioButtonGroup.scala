package typingsSlinky.materialUi.components

import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Switches.RadioButtonGroupProps
import typingsSlinky.materialUi.materialUiStrings.left
import typingsSlinky.materialUi.materialUiStrings.right
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButtonGroup {
  
  @scala.inline
  def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonGroupProps]))
  }
  
  @JSImport("material-ui", "RadioButtonGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.RadioButtonGroup] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSelected(value: js.Any): this.type = set("defaultSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelPosition(value: left | right): this.type = set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event], /* selected */ String) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueSelected(value: js.Any): this.type = set("valueSelected", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioButtonGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
