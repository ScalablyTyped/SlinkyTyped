package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.error
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.primary
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.success
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.BadgeProps>> */
@js.native
trait RecursivePartialPartialBa extends js.Object {
  
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.native
  
  var badgeStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var status: js.UndefOr[RecursivePartial[js.UndefOr[primary | success | warning | error]]] = js.native
  
  var textProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.native
  
  var textStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var value: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.native
}
object RecursivePartialPartialBa {
  
  @scala.inline
  def apply(): RecursivePartialPartialBa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialBa]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialBaOps[Self <: RecursivePartialPartialBa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setBadgeStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("badgeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeStyle: Self = this.set("badgeStyle", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setOnPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setStatus(value: RecursivePartial[js.UndefOr[primary | success | warning | error]]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTextProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = this.set("textProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextProps: Self = this.set("textProps", js.undefined)
    
    @scala.inline
    def setTextStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setValue(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
