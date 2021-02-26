package typingsSlinky.baseui.anon

import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.`inline`
import typingsSlinky.baseui.baseuiStrings.info
import typingsSlinky.baseui.baseuiStrings.negative
import typingsSlinky.baseui.baseuiStrings.positive
import typingsSlinky.baseui.baseuiStrings.toast
import typingsSlinky.baseui.baseuiStrings.warning
import typingsSlinky.baseui.toastMod.ToastOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/toast.ToastProps & {  key :react.react.Key} */
@js.native
trait ToastPropskeyKey extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autoHideDuration: js.UndefOr[Double] = js.native
  
  var children: js.UndefOr[(js.Function1[/* args */ Dismiss, ReactElement]) | ReactElement] = js.native
  
  var closeable: js.UndefOr[Boolean] = js.native
  
  var `data-baseweb`: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[typingsSlinky.react.mod.Key] with typingsSlinky.react.mod.Key = js.native
  
  var kind: js.UndefOr[info | positive | warning | negative] = js.native
  
  var notificationType: js.UndefOr[`inline` | toast] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.native
  
  var onClose: js.UndefOr[js.Function0[_]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.native
  
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.native
  
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.native
  
  var overrides: js.UndefOr[ToastOverrides] = js.native
}
object ToastPropskeyKey {
  
  @scala.inline
  def apply(key: js.UndefOr[typingsSlinky.react.mod.Key] with typingsSlinky.react.mod.Key): ToastPropskeyKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastPropskeyKey]
  }
  
  @scala.inline
  implicit class ToastPropskeyKeyMutableBuilder[Self <: ToastPropskeyKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    @scala.inline
    def setChildren(value: (js.Function1[/* args */ Dismiss, ReactElement]) | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* args */ Dismiss => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
    
    @scala.inline
    def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
    
    @scala.inline
    def setKey(value: js.UndefOr[typingsSlinky.react.mod.Key] with typingsSlinky.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: info | positive | warning | negative): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNotificationType(value: `inline` | toast): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ org.scalajs.dom.raw.Event => _): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => _): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ org.scalajs.dom.raw.Event => _): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* e */ org.scalajs.dom.raw.Event => _): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* e */ org.scalajs.dom.raw.Event => _): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOverrides(value: ToastOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
  }
}
