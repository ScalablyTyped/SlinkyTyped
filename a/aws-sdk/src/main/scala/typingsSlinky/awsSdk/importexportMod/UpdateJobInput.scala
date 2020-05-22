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
  def apply(
    JobId: JobId,
    JobType: JobType,
    Manifest: Manifest,
    ValidateOnly: ValidateOnly,
    APIVersion: APIVersion_ = null
  ): UpdateJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobInput]
  }
}

