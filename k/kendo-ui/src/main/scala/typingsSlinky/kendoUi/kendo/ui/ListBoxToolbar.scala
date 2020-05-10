package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxToolbar extends js.Object {
  var position: js.UndefOr[String] = js.native
  var tools: js.UndefOr[js.Any] = js.native
}

object ListBoxToolbar {
  @scala.inline
  def apply(): ListBoxToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxToolbar]
  }
  @scala.inline
  implicit class ListBoxToolbarOps[Self <: ListBoxToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTools(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(js.undefined)
        ret
    }
  }
  
}

