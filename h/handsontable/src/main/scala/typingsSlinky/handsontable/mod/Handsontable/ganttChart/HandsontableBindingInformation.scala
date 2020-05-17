package typingsSlinky.handsontable.mod.Handsontable.ganttChart

import typingsSlinky.handsontable.anon.Label
import typingsSlinky.handsontable.mod.Handsontable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandsontableBindingInformation extends js.Object {
  var additionalData: Label = js.native
  var asyncUpdates: js.UndefOr[Boolean] = js.native
  var endDateColumn: Double = js.native
  var instance: Handsontable = js.native
  var startDateColumn: Double = js.native
}

object HandsontableBindingInformation {
  @scala.inline
  def apply(additionalData: Label, endDateColumn: Double, instance: Handsontable, startDateColumn: Double): HandsontableBindingInformation = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], endDateColumn = endDateColumn.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], startDateColumn = startDateColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandsontableBindingInformation]
  }
  @scala.inline
  implicit class HandsontableBindingInformationOps[Self <: HandsontableBindingInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalData(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDateColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: Handsontable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDateColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncUpdates")(js.undefined)
        ret
    }
  }
  
}

