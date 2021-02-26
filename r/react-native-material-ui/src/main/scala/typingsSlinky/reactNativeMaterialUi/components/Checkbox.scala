package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.Label
import typingsSlinky.reactNativeMaterialUi.mod.CheckBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  @scala.inline
  def apply(label: String, onCheck: Boolean => Unit, value: String | Double): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onCheck = js.Any.fromFunction1(onCheck), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckBoxProps]))
  }
  
  @JSImport("react-native-material-ui", "Checkbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Checkbox] {
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkedIcon(value: String): this.type = set("checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: Label): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def uncheckedIcon(value: String): this.type = set("uncheckedIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
