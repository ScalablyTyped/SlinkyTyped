package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ActionCollapsing event.
  */
@js.native
trait ASPxClientFloatingActionButtonActionCollapsingEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether the user action or APIs has collapsed the action group.
    */
  var collapseReason: ASPxClientFloatingActionButtonCollapseReason = js.native
  /**
    * Specifies the FAB action's context name.
    */
  var contextName: String = js.native
}

object ASPxClientFloatingActionButtonActionCollapsingEventArgs {
  @scala.inline
  def apply(collapseReason: ASPxClientFloatingActionButtonCollapseReason, contextName: String): ASPxClientFloatingActionButtonActionCollapsingEventArgs = {
    val __obj = js.Dynamic.literal(collapseReason = collapseReason.asInstanceOf[js.Any], contextName = contextName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionCollapsingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientFloatingActionButtonActionCollapsingEventArgsOps[Self <: ASPxClientFloatingActionButtonActionCollapsingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseReason(value: ASPxClientFloatingActionButtonCollapseReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

