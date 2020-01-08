package typingsSlinky.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStatusInput extends js.Object {
  var APIVersion: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.APIVersion] = js.native
  var JobId: typingsSlinky.awsDashSdk.clientsImportexportMod.JobId = js.native
}

object GetStatusInput {
  @scala.inline
  def apply(JobId: JobId, APIVersion: APIVersion = null): GetStatusInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatusInput]
  }
}

