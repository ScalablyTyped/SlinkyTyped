package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  var JobId: typingsSlinky.awsSdk.importexportMod.JobId = js.native
  var JobType: typingsSlinky.awsSdk.importexportMod.JobType = js.native
  var Manifest: typingsSlinky.awsSdk.importexportMod.Manifest = js.native
  var ValidateOnly: typingsSlinky.awsSdk.importexportMod.ValidateOnly = js.native
}

object UpdateJobInput {
  @scala.inline
  def apply(JobId: JobId, JobType: JobType, Manifest: Manifest, ValidateOnly: ValidateOnly): UpdateJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobInput]
  }
  @scala.inline
  implicit class UpdateJobInputOps[Self <: UpdateJobInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobType(value: JobType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifest(value: Manifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateOnly(value: ValidateOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidateOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAPIVersion(value: APIVersion_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAPIVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIVersion")(js.undefined)
        ret
    }
  }
  
}

