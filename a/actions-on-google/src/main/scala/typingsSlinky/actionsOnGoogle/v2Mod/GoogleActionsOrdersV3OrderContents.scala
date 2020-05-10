package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3OrderContents extends js.Object {
  /**
    * List of order line items.
    * At least 1 line_item is required and at-most 50 is allowed.
    * All line items must belong to same vertical.
    */
  var lineItems: js.UndefOr[js.Array[GoogleActionsOrdersV3LineItem]] = js.native
}

object GoogleActionsOrdersV3OrderContents {
  @scala.inline
  def apply(): GoogleActionsOrdersV3OrderContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderContents]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3OrderContentsOps[Self <: GoogleActionsOrdersV3OrderContents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineItems(value: js.Array[GoogleActionsOrdersV3LineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(js.undefined)
        ret
    }
  }
  
}

