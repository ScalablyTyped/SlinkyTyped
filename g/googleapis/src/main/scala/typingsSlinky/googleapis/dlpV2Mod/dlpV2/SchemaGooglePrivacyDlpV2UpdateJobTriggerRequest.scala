package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateJobTrigger.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest extends js.Object {
  /**
    * New JobTrigger value.
    */
  var jobTrigger: js.UndefOr[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2UpdateJobTriggerRequestOps[Self <: SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobTrigger(value: SchemaGooglePrivacyDlpV2JobTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
  }
  
}

