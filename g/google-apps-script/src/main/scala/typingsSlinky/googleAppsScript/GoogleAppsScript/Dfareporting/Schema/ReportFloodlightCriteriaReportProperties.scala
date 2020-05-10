package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportFloodlightCriteriaReportProperties extends js.Object {
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
}

object ReportFloodlightCriteriaReportProperties {
  @scala.inline
  def apply(): ReportFloodlightCriteriaReportProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportFloodlightCriteriaReportProperties]
  }
  @scala.inline
  implicit class ReportFloodlightCriteriaReportPropertiesOps[Self <: ReportFloodlightCriteriaReportProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeAttributedIPConversions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAttributedIPConversions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAttributedIPConversions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAttributedIPConversions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUnattributedCookieConversions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUnattributedCookieConversions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUnattributedCookieConversions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUnattributedCookieConversions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUnattributedIPConversions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUnattributedIPConversions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUnattributedIPConversions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUnattributedIPConversions")(js.undefined)
        ret
    }
  }
  
}

