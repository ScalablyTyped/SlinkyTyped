package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersLineItemSubLine extends js.Object {
  /**
    * A generic line item (e.g. add-on).
    */
  var lineItem: js.UndefOr[GoogleActionsV2OrdersLineItem] = js.native
  /**
    * A note associated with the line item.
    */
  var note: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersLineItemSubLine {
  @scala.inline
  def apply(): GoogleActionsV2OrdersLineItemSubLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItemSubLine]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersLineItemSubLineOps[Self <: GoogleActionsV2OrdersLineItemSubLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineItem(value: GoogleActionsV2OrdersLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItem")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
  }
  
}

