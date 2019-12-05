package typingsSlinky.atReachDialog

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialFocusRef extends js.Object {
  var initialFocusRef: js.UndefOr[ReactRef[HTMLElement]] = js.undefined
}

object Anon_InitialFocusRef {
  @scala.inline
  def apply(initialFocusRef: ReactRef[HTMLElement] = null): Anon_InitialFocusRef = {
    val __obj = js.Dynamic.literal()
    if (initialFocusRef != null) __obj.updateDynamic("initialFocusRef")(initialFocusRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InitialFocusRef]
  }
}

