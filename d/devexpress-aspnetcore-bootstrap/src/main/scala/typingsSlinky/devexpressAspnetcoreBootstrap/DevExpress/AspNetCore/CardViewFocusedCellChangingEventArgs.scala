package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardViewFocusedCellChangingEventArgs extends CancelEventArgs {
  val cellInfo: BootstrapCardViewCellInfo = js.native
}

object CardViewFocusedCellChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cellInfo: BootstrapCardViewCellInfo, sender: Control): CardViewFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewFocusedCellChangingEventArgs]
  }
  @scala.inline
  implicit class CardViewFocusedCellChangingEventArgsOps[Self <: CardViewFocusedCellChangingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellInfo(value: BootstrapCardViewCellInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

