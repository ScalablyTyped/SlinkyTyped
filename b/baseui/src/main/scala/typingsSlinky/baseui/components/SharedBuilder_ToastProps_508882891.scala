package typingsSlinky.baseui.components

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.Dismiss
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

@scala.inline
class SharedBuilder_ToastProps_508882891[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoHideDuration(value: Double): this.type = set("autoHideDuration", value.asInstanceOf[js.Any])
  
  @scala.inline
  def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def childrenFunction1(value: /* args */ Dismiss => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
  
  @scala.inline
  def children(value: (js.Function1[/* args */ Dismiss, ReactElement]) | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def closeable(value: Boolean): this.type = set("closeable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `data-baseweb`(value: String): this.type = set("data-baseweb", value.asInstanceOf[js.Any])
  
  @scala.inline
  def kind(value: info | positive | warning | negative): this.type = set("kind", value.asInstanceOf[js.Any])
  
  @scala.inline
  def notificationType(value: `inline` | toast): this.type = set("notificationType", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onBlur(value: /* e */ Event => _): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onClose(value: () => _): this.type = set("onClose", js.Any.fromFunction0(value))
  
  @scala.inline
  def onFocus(value: /* e */ Event => _): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseEnter(value: /* e */ Event => _): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: /* e */ Event => _): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def overrides(value: ToastOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
}
