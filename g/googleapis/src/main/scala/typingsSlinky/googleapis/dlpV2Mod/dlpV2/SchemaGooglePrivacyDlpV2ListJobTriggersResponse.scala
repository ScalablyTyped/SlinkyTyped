package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListJobTriggers.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListJobTriggersResponse extends js.Object {
  /**
    * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
    */
  var jobTriggers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2JobTrigger]] = js.native
  /**
    * If the next page is available then the next page token to be used in
    * following ListJobTriggers request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ListJobTriggersResponse {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListJobTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListJobTriggersResponseOps[Self <: SchemaGooglePrivacyDlpV2ListJobTriggersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobTriggers(value: js.Array[SchemaGooglePrivacyDlpV2JobTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTriggers")(js.undefined)
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
  }
  
}

