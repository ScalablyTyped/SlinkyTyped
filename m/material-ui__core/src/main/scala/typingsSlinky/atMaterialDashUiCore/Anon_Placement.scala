package typingsSlinky.atMaterialDashUiCore

import typingsSlinky.atMaterialDashUiCore.popperPopperMod.PopperPlacementType
import typingsSlinky.atMaterialDashUiCore.transitionsTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Placement extends js.Object {
  var TransitionProps: js.UndefOr[typingsSlinky.atMaterialDashUiCore.transitionsTransitionMod.TransitionProps] = js.undefined
  var placement: PopperPlacementType
}

object Anon_Placement {
  @scala.inline
  def apply(placement: PopperPlacementType, TransitionProps: TransitionProps = null): Anon_Placement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Placement]
  }
}

