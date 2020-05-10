package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2SimpleSelect extends js.Object {
  /**
    * List of items users should select from.
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2SimpleSelectItem]] = js.native
}

object GoogleActionsV2SimpleSelect {
  @scala.inline
  def apply(): GoogleActionsV2SimpleSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SimpleSelect]
  }
  @scala.inline
  implicit class GoogleActionsV2SimpleSelectOps[Self <: GoogleActionsV2SimpleSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[GoogleActionsV2SimpleSelectItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

