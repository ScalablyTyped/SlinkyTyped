package typingsSlinky.ionicReact

import slinky.core.facade.ReactRef
import typingsSlinky.ionicReact.createControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRef[OverlayType /* <: OverlayBase */] extends js.Object {
  var forwardedRef: js.UndefOr[ReactRef[OverlayType]] = js.undefined
}

object AnonForwardedRef {
  @scala.inline
  def apply[OverlayType /* <: OverlayBase */](forwardedRef: ReactRef[OverlayType] = null): AnonForwardedRef[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRef[OverlayType]]
  }
}

