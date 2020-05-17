package typingsSlinky.ionicReact.anon

import slinky.core.facade.ReactRef
import typingsSlinky.ionicReact.createOverlayComponentMod.OverlayElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1`[OverlayType /* <: OverlayElement */] extends js.Object {
  var forwardedRef: js.UndefOr[ReactRef[OverlayType]] = js.native
}

object `1` {
  @scala.inline
  def apply[OverlayType](): `1`[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[OverlayType]]
  }
  @scala.inline
  implicit class `1Ops`[Self[overlaytype] <: `1`[overlaytype], OverlayType] (val x: Self[OverlayType]) extends AnyVal {
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

