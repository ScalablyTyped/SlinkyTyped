package typingsSlinky.baseui.anon

import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.`inline`
import typingsSlinky.baseui.baseuiStrings.info
import typingsSlinky.baseui.baseuiStrings.negative
import typingsSlinky.baseui.baseuiStrings.positive
import typingsSlinky.baseui.baseuiStrings.toast
import typingsSlinky.baseui.baseuiStrings.warning
import typingsSlinky.baseui.toastMod.ToastOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<baseui.baseui/toast.ToastProps> & {  key :react.react.Key} */
@js.native
trait ReadonlyToastPropskeyKey extends js.Object {
  
  val autoFocus: js.UndefOr[Boolean] = js.native
  
  val autoHideDuration: js.UndefOr[Double] = js.native
  
  val children: js.UndefOr[(js.Function1[/* args */ Dismiss, ReactElement]) | ReactElement] = js.native
  
  val closeable: js.UndefOr[Boolean] = js.native
  
  val `data-baseweb`: js.UndefOr[String] = js.native
  
  val key: js.UndefOr[typingsSlinky.react.mod.Key] with typingsSlinky.react.mod.Key = js.native
  
  val kind: js.UndefOr[info | positive | warning | negative] = js.native
  
  val notificationType: js.UndefOr[`inline` | toast] = js.native
  
  val onBlur: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.native
  
  val onClose: js.UndefOr[js.Function0[_]] = js.native
  
  val onFocus: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.native
  
  val onMouseEnter: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.native
  
  val onMouseLeave: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.raw.Event, _]] = js.native
  
  val overrides: js.UndefOr[ToastOverrides] = js.native
}
object ReadonlyToastPropskeyKey {
  
  @scala.inline
  def apply(key: js.UndefOr[typingsSlinky.react.mod.Key] with typingsSlinky.react.mod.Key): ReadonlyToastPropskeyKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyToastPropskeyKey]
  }
  
  @scala.inline
  implicit class ReadonlyToastPropskeyKeyOps[Self <: ReadonlyToastPropskeyKey] (val x: Self) extends AnyVal {
    
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
    def setKey(value: js.UndefOr[typingsSlinky.react.mod.Key] with typingsSlinky.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setAutoHideDuration(value: Double): Self = this.set("autoHideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideDuration: Self = this.set("autoHideDuration", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* args */ Dismiss => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: (js.Function1[/* args */ Dismiss, ReactElement]) | ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCloseable(value: Boolean): Self = this.set("closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseable: Self = this.set("closeable", js.undefined)
    
    @scala.inline
    def `setData-baseweb`(value: String): Self = this.set("data-baseweb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteData-baseweb`: Self = this.set("data-baseweb", js.undefined)
    
    @scala.inline
    def setKind(value: info | positive | warning | negative): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNotificationType(value: `inline` | toast): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationType: Self = this.set("notificationType", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ org.scalajs.dom.raw.Event => _): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => _): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ org.scalajs.dom.raw.Event => _): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* e */ org.scalajs.dom.raw.Event => _): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* e */ org.scalajs.dom.raw.Event => _): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOverrides(value: ToastOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
