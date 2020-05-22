package typingsSlinky.ionicReact.anon

import slinky.core.facade.ReactRef
import typingsSlinky.ionicReact.createOverlayComponentMod.OverlayElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1`[OverlayType /* <: OverlayElement */] extends js.Object {
  var forwardedRef: js.UndefOr[ReactRef[OverlayType]] = js.undefined
}

object `1` {
  @scala.inline
  def apply[OverlayType](forwardedRef: ReactRef[OverlayType] = null): `1`[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[OverlayType]]
  }
}

