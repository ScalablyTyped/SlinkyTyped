package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists values specifying whether the user action or APIs has collapsed the action group.
  */
@js.native
trait ASPxClientFloatingActionButtonCollapseReason extends js.Object {
  /**
    * The action group is collapsed using APIs.
    */
  var API: String = js.native
  /**
    * The action group is collapsed by clicking on the action item.
    */
  var ActionItem: String = js.native
  /**
    * The action group is collapsed using the collapse button.
    */
  var CollapseButton: String = js.native
}

object ASPxClientFloatingActionButtonCollapseReason {
  @scala.inline
  def apply(API: String, ActionItem: String, CollapseButton: String): ASPxClientFloatingActionButtonCollapseReason = {
    val __obj = js.Dynamic.literal(API = API.asInstanceOf[js.Any], ActionItem = ActionItem.asInstanceOf[js.Any], CollapseButton = CollapseButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonCollapseReason]
  }
  @scala.inline
  implicit class ASPxClientFloatingActionButtonCollapseReasonOps[Self <: ASPxClientFloatingActionButtonCollapseReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("API")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapseButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollapseButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

