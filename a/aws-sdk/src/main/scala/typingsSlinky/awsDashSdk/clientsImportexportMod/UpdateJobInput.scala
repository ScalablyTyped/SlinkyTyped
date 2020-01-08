package typingsSlinky.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobInput extends js.Object {
  var APIVersion: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.APIVersion] = js.native
  var JobId: typingsSlinky.awsDashSdk.clientsImportexportMod.JobId = js.native
  var JobType: typingsSlinky.awsDashSdk.clientsImportexportMod.JobType = js.native
  var Manifest: typingsSlinky.awsDashSdk.clientsImportexportMod.Manifest = js.native
  var ValidateOnly: typingsSlinky.awsDashSdk.clientsImportexportMod.ValidateOnly = js.native
}

object UpdateJobInput {
  @scala.inline
  def apply(
    JobId: JobId,
    JobType: JobType,
    Manifest: Manifest,
    ValidateOnly: ValidateOnly,
    APIVersion: APIVersion = null
  ): UpdateJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobInput]
  }
}

