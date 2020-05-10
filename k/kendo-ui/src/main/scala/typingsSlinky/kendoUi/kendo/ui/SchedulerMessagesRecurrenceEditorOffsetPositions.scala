package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerMessagesRecurrenceEditorOffsetPositions extends js.Object {
  var first: js.UndefOr[String] = js.native
  var fourth: js.UndefOr[String] = js.native
  var last: js.UndefOr[String] = js.native
  var second: js.UndefOr[String] = js.native
  var third: js.UndefOr[String] = js.native
}

object SchedulerMessagesRecurrenceEditorOffsetPositions {
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorOffsetPositions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorOffsetPositions]
  }
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorOffsetPositionsOps[Self <: SchedulerMessagesRecurrenceEditorOffsetPositions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withFourth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fourth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFourth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fourth")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.undefined)
        ret
    }
    @scala.inline
    def withThird(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("third")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThird: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("third")(js.undefined)
        ret
    }
  }
  
}

