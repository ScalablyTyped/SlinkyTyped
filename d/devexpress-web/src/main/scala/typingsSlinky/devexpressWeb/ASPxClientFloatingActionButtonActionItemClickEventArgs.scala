package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFloatingActionButton.ActionItemClick event.
  */
@js.native
trait ASPxClientFloatingActionButtonActionItemClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed action.
    */
  var actionName: String = js.native
}

object ASPxClientFloatingActionButtonActionItemClickEventArgs {
  @scala.inline
  def apply(actionName: String): ASPxClientFloatingActionButtonActionItemClickEventArgs = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionItemClickEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFloatingActionButtonActionItemClickEventArgsOps[Self <: ASPxClientFloatingActionButtonActionItemClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

