package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.mod.RadioButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButton {
  
  @scala.inline
  def apply(label: String, onSelect: String => Unit, value: String | Double): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonProps]))
  }
  
  @JSImport("react-native-material-ui", "RadioButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.RadioButton] {
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
