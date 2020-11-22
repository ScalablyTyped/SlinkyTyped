package typingsSlinky.reactNativeSimpleRadioButton.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSimpleRadioButton.mod.RadioButtonLabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButtonLabel {
  
  @JSImport("react-native-simple-radio-button", "RadioButtonLabel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSimpleRadioButton.mod.RadioButtonLabel] {
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelHorizontal(value: Boolean): this.type = set("labelHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyleNull: this.type = set("labelStyle", null)
    
    @scala.inline
    def labelWrapStyle(value: StyleProp[ViewStyle]): this.type = set("labelWrapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelWrapStyleNull: this.type = set("labelWrapStyle", null)
    
    @scala.inline
    def onPress(value: /* val */ js.UndefOr[js.Any] => _): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioButtonLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(index: Double, obj: js.Object): Builder = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonLabelProps]))
  }
}
