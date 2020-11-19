package typingsSlinky.reactNativeElements.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.anon.PartialTextProperties
import typingsSlinky.reactNativeElements.mod.CheckBoxProps
import typingsSlinky.reactNativeElements.mod.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckBox {
  
  @JSImport("react-native-elements", "CheckBox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.CheckBox] {
    
    @scala.inline
    def Component(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def center(value: Boolean): this.type = set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkedColor(value: String): this.type = set("checkedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkedIconReactElement(value: ReactElement): this.type = set("checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkedIcon(value: String | ReactElement): this.type = set("checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkedTitle(value: String): this.type = set("checkedTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconRight(value: Boolean): this.type = set("iconRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconType(value: IconType): this.type = set("iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onIconPress(value: () => Unit): this.type = set("onIconPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLongIconPress(value: () => Unit): this.type = set("onLongIconPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyleNull: this.type = set("textStyle", null)
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleProps(value: PartialTextProperties): this.type = set("titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def uncheckedColor(value: String): this.type = set("uncheckedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def uncheckedIconReactElement(value: ReactElement): this.type = set("uncheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def uncheckedIcon(value: String | ReactElement): this.type = set("uncheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  def withProps(p: CheckBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(checked: Boolean): Builder = {
    val __props = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CheckBoxProps]))
  }
}
