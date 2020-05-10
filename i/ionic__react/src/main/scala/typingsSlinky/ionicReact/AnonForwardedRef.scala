package typingsSlinky.ionicReact

import slinky.core.facade.ReactRef
import typingsSlinky.ionicReact.createControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForwardedRef[OverlayType /* <: OverlayBase */] extends js.Object {
  var forwardedRef: js.UndefOr[ReactRef[OverlayType]] = js.native
}

object AnonForwardedRef {
  @scala.inline
  def apply[OverlayType](): AnonForwardedRef[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonForwardedRef[OverlayType]]
  }
  @scala.inline
  implicit class AnonForwardedRefOps[Self[overlaytype] <: AnonForwardedRef[overlaytype], OverlayType] (val x: Self[OverlayType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OverlayType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OverlayType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OverlayType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OverlayType] with Other]
    @scala.inline
    def withForwardedRef(value: ReactRef[OverlayType]): Self[OverlayType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardedRef: Self[OverlayType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(js.undefined)
        ret
    }
  }
  
}

