package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoAbuseReportReasonSnippet extends js.Object {
  var label: js.UndefOr[String] = js.native
  var secondaryReasons: js.UndefOr[js.Array[VideoAbuseReportSecondaryReason]] = js.native
}

object VideoAbuseReportReasonSnippet {
  @scala.inline
  def apply(): VideoAbuseReportReasonSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAbuseReportReasonSnippet]
  }
  @scala.inline
  implicit class VideoAbuseReportReasonSnippetOps[Self <: VideoAbuseReportReasonSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryReasons(value: js.Array[VideoAbuseReportSecondaryReason]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryReasons")(js.undefined)
        ret
    }
  }
  
}

