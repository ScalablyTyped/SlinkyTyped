package typingsSlinky.antDesignReactNative.anon

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings._empty
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.android
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.down
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.empty
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.ios
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.middle
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.up
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/list/ListItem.ListItemProps> */
@js.native
trait PartialListItemProps extends StObject {
  
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var align: js.UndefOr[top | middle | bottom] = js.native
  
  var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var delayLongPress: js.UndefOr[Double] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[Boolean] = js.native
  
  var extra: js.UndefOr[ReactElement] = js.native
  
  var multipleLine: js.UndefOr[Boolean] = js.native
  
  var onLongPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onPressIn: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onPressOut: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var platform: js.UndefOr[android | ios] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var styles: js.UndefOr[PartialListStyle] = js.native
  
  var thumb: js.UndefOr[ReactElement | Null] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
}
object PartialListItemProps {
  
  @scala.inline
  def apply(): PartialListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemProps]
  }
  
  @scala.inline
  implicit class PartialListItemPropsMutableBuilder[Self <: PartialListItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveStyleNull: Self = StObject.set(x, "activeStyle", null)
    
    @scala.inline
    def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
    
    @scala.inline
    def setAlign(value: top | middle | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setArrow(value: horizontal | down | up | empty | _empty): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setMultipleLine(value: Boolean): Self = StObject.set(x, "multipleLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleLineUndefined: Self = StObject.set(x, "multipleLine", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setPlatform(value: android | ios): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialListStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setThumb(value: ReactElement): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbNull: Self = StObject.set(x, "thumb", null)
    
    @scala.inline
    def setThumbReactElement(value: ReactElement): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
