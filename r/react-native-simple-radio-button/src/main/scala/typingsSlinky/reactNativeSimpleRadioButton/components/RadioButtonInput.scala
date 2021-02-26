package typingsSlinky.reactNativeSimpleRadioButton.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSimpleRadioButton.mod.RadioButtonInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButtonInput {
  
  @scala.inline
  def apply(index: Double, obj: js.Object): Builder = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonInputProps]))
  }
  
  @JSImport("react-native-simple-radio-button", "RadioButtonInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSimpleRadioButton.mod.RadioButtonInput] {
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonInnerColor(value: String): this.type = set("buttonInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonOuterColor(value: String): this.type = set("buttonOuterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonOuterSize(value: Double): this.type = set("buttonOuterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonSize(value: Double): this.type = set("buttonSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonStyleNull: this.type = set("buttonStyle", null)
    
    @scala.inline
    def buttonWrapStyle(value: StyleProp[ViewStyle]): this.type = set("buttonWrapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonWrapStyleNull: this.type = set("buttonWrapStyle", null)
    
    @scala.inline
    def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPress(value: /* val */ js.UndefOr[js.Any] => _): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioButtonInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
