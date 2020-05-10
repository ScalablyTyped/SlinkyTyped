package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceRequestStatus extends js.Object {
  /**
    * The current status of the conference create request. Read-only. The
    * possible values are:   - &quot;pending&quot;: the conference create
    * request is still being processed. - &quot;success&quot;: the conference
    * create request succeeded, the entry points are populated. -
    * &quot;failure&quot;: the conference create request failed, there are no
    * entry points.
    */
  var statusCode: js.UndefOr[String] = js.native
}

object SchemaConferenceRequestStatus {
  @scala.inline
  def apply(): SchemaConferenceRequestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceRequestStatus]
  }
  @scala.inline
  implicit class SchemaConferenceRequestStatusOps[Self <: SchemaConferenceRequestStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

