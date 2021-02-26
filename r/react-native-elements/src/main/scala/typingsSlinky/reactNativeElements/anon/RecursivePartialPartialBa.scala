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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.BadgeProps>> */
@js.native
trait RecursivePartialPartialBa extends StObject {
  
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
  implicit class RecursivePartialPartialBaMutableBuilder[Self <: RecursivePartialPartialBa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadgeStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "badgeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeStyleUndefined: Self = StObject.set(x, "badgeStyle", js.undefined)
    
    @scala.inline
    def setComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setOnPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setStatus(value: RecursivePartial[js.UndefOr[primary | success | warning | error]]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTextProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = StObject.set(x, "textProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPropsUndefined: Self = StObject.set(x, "textProps", js.undefined)
    
    @scala.inline
    def setTextStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setValue(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
