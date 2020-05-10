package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusReport extends js.Object {
  var statusContent: js.UndefOr[String] = js.native
  var statusFileName: js.UndefOr[String] = js.native
}

object StatusReport {
  @scala.inline
  def apply(): StatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusReport]
  }
  @scala.inline
  implicit class StatusReportOps[Self <: StatusReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusContent")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusFileName")(js.undefined)
        ret
    }
  }
  
}

