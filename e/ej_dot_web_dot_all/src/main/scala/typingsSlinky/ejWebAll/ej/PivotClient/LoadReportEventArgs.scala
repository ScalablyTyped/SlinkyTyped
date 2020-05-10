package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadReportEventArgs extends js.Object {
  /** returns the object which holds the necessary parameters required for loading a report collection from database.
    */
  var loadReportSetting: js.UndefOr[js.Any] = js.native
  /** returns the current instance of PivotClient control.
    */
  var targetControl: js.UndefOr[js.Any] = js.native
}

object LoadReportEventArgs {
  @scala.inline
  def apply(): LoadReportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadReportEventArgs]
  }
  @scala.inline
  implicit class LoadReportEventArgsOps[Self <: LoadReportEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadReportSetting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadReportSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadReportSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadReportSetting")(js.undefined)
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

