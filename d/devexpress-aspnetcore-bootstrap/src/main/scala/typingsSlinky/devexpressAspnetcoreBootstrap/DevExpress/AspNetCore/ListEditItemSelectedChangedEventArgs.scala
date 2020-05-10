package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEditItemSelectedChangedEventArgs extends ProcessingModeEventArgs {
  val index: Double = js.native
  val isSelected: Boolean = js.native
}

object ListEditItemSelectedChangedEventArgs {
  @scala.inline
  def apply(index: Double, isSelected: Boolean, processOnServer: Boolean, sender: Control): ListEditItemSelectedChangedEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEditItemSelectedChangedEventArgs]
  }
  @scala.inline
  implicit class ListEditItemSelectedChangedEventArgsOps[Self <: ListEditItemSelectedChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

