package typingsSlinky.reactNativeSimpleRadioButton.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSimpleRadioButton.anon.Label
import typingsSlinky.reactNativeSimpleRadioButton.mod.ReactNativeRadioFormProps
import typingsSlinky.reactNativeSimpleRadioButton.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSimpleRadioButton {
  
  @JSImport("react-native-simple-radio-button", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: Boolean): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonColor(value: String): this.type = set("buttonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formHorizontal(value: Boolean): this.type = set("formHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initial(value: Double): this.type = set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelColor(value: String): this.type = set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelHorizontal(value: Boolean): this.type = set("labelHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPress(value: /* val */ js.UndefOr[js.Any] => _): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def radio_propsVarargs(value: Label*): this.type = set("radio_props", js.Array(value :_*))
    
    @scala.inline
    def radio_props(value: js.Array[Label]): this.type = set("radio_props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactNativeRadioFormProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeSimpleRadioButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
