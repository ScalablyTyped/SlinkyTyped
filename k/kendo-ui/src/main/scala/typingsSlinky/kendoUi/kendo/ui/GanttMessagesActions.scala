package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttMessagesActions extends js.Object {
  var addChild: js.UndefOr[String] = js.native
  var append: js.UndefOr[String] = js.native
  var insertAfter: js.UndefOr[String] = js.native
  var insertBefore: js.UndefOr[String] = js.native
  var pdf: js.UndefOr[String] = js.native
}

object GanttMessagesActions {
  @scala.inline
  def apply(): GanttMessagesActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessagesActions]
  }
  @scala.inline
  implicit class GanttMessagesActionsOps[Self <: GanttMessagesActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddChild(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChild")(js.undefined)
        ret
    }
    @scala.inline
    def withAppend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
  }
  
}

