package typingsSlinky.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobOutput extends js.Object {
  var ArtifactList: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.ArtifactList] = js.native
  var JobId: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.JobId] = js.native
  var JobType: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.JobType] = js.native
  var Signature: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.Signature] = js.native
  var SignatureFileContents: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.SignatureFileContents] = js.native
  var WarningMessage: js.UndefOr[typingsSlinky.awsDashSdk.clientsImportexportMod.WarningMessage] = js.native
}

object CreateJobOutput {
  @scala.inline
  def apply(
    ArtifactList: ArtifactList = null,
    JobId: JobId = null,
    JobType: JobType = null,
    Signature: Signature = null,
    SignatureFileContents: SignatureFileContents = null,
    WarningMessage: WarningMessage = null
  ): CreateJobOutput = {
    val __obj = js.Dynamic.literal()
    if (ArtifactList != null) __obj.updateDynamic("ArtifactList")(ArtifactList.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    if (Signature != null) __obj.updateDynamic("Signature")(Signature.asInstanceOf[js.Any])
    if (SignatureFileContents != null) __obj.updateDynamic("SignatureFileContents")(SignatureFileContents.asInstanceOf[js.Any])
    if (WarningMessage != null) __obj.updateDynamic("WarningMessage")(WarningMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobOutput]
  }
}

