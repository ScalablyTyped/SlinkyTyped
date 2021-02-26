package typingsSlinky.reactNativeElements.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.ButtonGroupProps
import typingsSlinky.reactNativeElements.mod.ElementObject
import typingsSlinky.reactNativeElements.mod.InnerBorderStyleProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroup {
  
  @scala.inline
  def apply(buttons: js.Array[ElementObject | String], onPress: Double => Unit): Builder = {
    val __props = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    new Builder(js.Array(this.component, __props.asInstanceOf[ButtonGroupProps]))
  }
  
  @JSImport("react-native-elements", "ButtonGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.ButtonGroup] {
    
    @scala.inline
    def Component(value: ReactComponentClass[_]): this.type = set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ComponentComponentClass(value: ReactComponentClass[_]): this.type = set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonContainerStyle(value: StyleProp[ViewStyle]): this.type = set("buttonContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonContainerStyleNull: this.type = set("buttonContainerStyle", null)
    
    @scala.inline
    def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonStyleNull: this.type = set("buttonStyle", null)
    
    @scala.inline
    def containerBorderRadius(value: Double): this.type = set("containerBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    
    @scala.inline
    def disabled(value: Boolean | js.Array[Double]): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledSelectedStyle(value: StyleProp[ViewStyle]): this.type = set("disabledSelectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledSelectedStyleNull: this.type = set("disabledSelectedStyle", null)
    
    @scala.inline
    def disabledSelectedTextStyle(value: StyleProp[TextStyle]): this.type = set("disabledSelectedTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledSelectedTextStyleNull: this.type = set("disabledSelectedTextStyle", null)
    
    @scala.inline
    def disabledStyle(value: StyleProp[ViewStyle]): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledStyleNull: this.type = set("disabledStyle", null)
    
    @scala.inline
    def disabledTextStyle(value: StyleProp[TextStyle]): this.type = set("disabledTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledTextStyleNull: this.type = set("disabledTextStyle", null)
    
    @scala.inline
    def disabledVarargs(value: Double*): this.type = set("disabled", js.Array(value :_*))
    
    @scala.inline
    def innerBorderStyle(value: InnerBorderStyleProperty): this.type = set("innerBorderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onHideUnderlay(value: () => Unit): this.type = set("onHideUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def onShowUnderlay(value: () => Unit): this.type = set("onShowUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def selectMultiple(value: Boolean): this.type = set("selectMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedButtonStyle(value: StyleProp[ViewStyle]): this.type = set("selectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedButtonStyleNull: this.type = set("selectedButtonStyle", null)
    
    @scala.inline
    def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedIndexNull: this.type = set("selectedIndex", null)
    
    @scala.inline
    def selectedIndexes(value: js.Array[Double]): this.type = set("selectedIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedIndexesVarargs(value: Double*): this.type = set("selectedIndexes", js.Array(value :_*))
    
    @scala.inline
    def selectedTextStyle(value: StyleProp[TextStyle]): this.type = set("selectedTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedTextStyleNull: this.type = set("selectedTextStyle", null)
    
    @scala.inline
    def setOpacityTo(value: /* value */ Double => Unit): this.type = set("setOpacityTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyleNull: this.type = set("textStyle", null)
    
    @scala.inline
    def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
