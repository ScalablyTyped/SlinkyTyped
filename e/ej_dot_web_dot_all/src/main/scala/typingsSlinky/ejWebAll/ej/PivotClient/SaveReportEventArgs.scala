package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveReportEventArgs extends js.Object {
  /** returns the object which holds the necessary parameters required for saving the report collection.
    */
  var saveReportSetting: js.UndefOr[js.Any] = js.native
  /** returns the current instance of PivotClient control.
    */
  var targetControl: js.UndefOr[js.Any] = js.native
}

object SaveReportEventArgs {
  @scala.inline
  def apply(): SaveReportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveReportEventArgs]
  }
  @scala.inline
  implicit class SaveReportEventArgsOps[Self <: SaveReportEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSaveReportSetting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveReportSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveReportSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveReportSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetControl")(js.undefined)
        ret
    }
  }
  
}

