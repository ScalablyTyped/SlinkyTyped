package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.popperPopperMod.PopperPlacementType
import typingsSlinky.materialUiCore.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPlacement extends js.Object {
  var TransitionProps: js.UndefOr[typingsSlinky.materialUiCore.transitionMod.TransitionProps] = js.native
  var placement: PopperPlacementType = js.native
}

object AnonPlacement {
  @scala.inline
  def apply(placement: PopperPlacementType, TransitionProps: TransitionProps = null): AnonPlacement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlacement]
  }
}

