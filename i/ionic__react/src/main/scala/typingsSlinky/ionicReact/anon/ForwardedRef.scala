package typingsSlinky.ionicReact.anon

import slinky.core.facade.ReactRef
import typingsSlinky.ionicReact.createControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedRef[OverlayType /* <: OverlayBase */] extends js.Object {
  var forwardedRef: js.UndefOr[ReactRef[OverlayType]] = js.undefined
}

object ForwardedRef {
  @scala.inline
  def apply[OverlayType](forwardedRef: ReactRef[OverlayType] = null): ForwardedRef[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedRef[OverlayType]]
  }
}

