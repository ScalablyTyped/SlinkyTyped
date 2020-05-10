package typingsSlinky.gapiClientAdmin.gapi.client.admin

import typingsSlinky.gapiClientAdmin.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageReports extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  /** The kind of object. */
  var kind: js.UndefOr[String] = js.native
  /** Token for retrieving the next page */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Various application parameter records. */
  var usageReports: js.UndefOr[js.Array[UsageReport]] = js.native
  /** Warnings if any. */
  var warnings: js.UndefOr[js.Array[AnonCode]] = js.native
}

object UsageReports {
  @scala.inline
  def apply(): UsageReports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageReports]
  }
  @scala.inline
  implicit class UsageReportsOps[Self <: UsageReports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageReports(value: js.Array[UsageReport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageReports")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[AnonCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

