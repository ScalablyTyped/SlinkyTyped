package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.MinimizationStateChanged event.
  */
@js.native
trait ASPxClientRibbonMinimizationStateEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the value indicating the new ribbon state.
    */
  var ribbonState: Double = js.native
}

object ASPxClientRibbonMinimizationStateEventArgs {
  @scala.inline
  def apply(ribbonState: Double): ASPxClientRibbonMinimizationStateEventArgs = {
    val __obj = js.Dynamic.literal(ribbonState = ribbonState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonMinimizationStateEventArgs]
  }
  @scala.inline
  implicit class ASPxClientRibbonMinimizationStateEventArgsOps[Self <: ASPxClientRibbonMinimizationStateEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRibbonState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

