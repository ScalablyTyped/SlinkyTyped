package typingsSlinky.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  var CreationDate: js.UndefOr[js.Date] = js.native
  var IsCanceled: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.IsCanceled] = js.native
  var JobId: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.JobId] = js.native
  var JobType: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.JobType] = js.native
}

object Job {
  @scala.inline
  def apply(
    CreationDate: js.Date = null,
    IsCanceled: js.UndefOr[Boolean] = js.undefined,
    JobId: JobId = null,
    JobType: JobType = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(IsCanceled)) __obj.updateDynamic("IsCanceled")(IsCanceled.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

