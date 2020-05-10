package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchReportEventArgs extends js.Object {
  /** returns the object which holds the necessary parameters required for fetching the report names stored in database.
    */
  var fetchReportSetting: js.UndefOr[js.Any] = js.native
  /** returns the current instance of PivotClient control.
    */
  var targetControl: js.UndefOr[js.Any] = js.native
}

object FetchReportEventArgs {
  @scala.inline
  def apply(): FetchReportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchReportEventArgs]
  }
  @scala.inline
  implicit class FetchReportEventArgsOps[Self <: FetchReportEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchReportSetting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchReportSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchReportSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchReportSetting")(js.undefined)
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

