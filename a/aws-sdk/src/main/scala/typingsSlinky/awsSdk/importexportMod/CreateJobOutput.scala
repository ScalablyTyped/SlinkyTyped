package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobOutput extends js.Object {
  var ArtifactList: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ArtifactList] = js.native
  var JobId: js.UndefOr[typingsSlinky.awsSdk.importexportMod.JobId] = js.native
  var JobType: js.UndefOr[typingsSlinky.awsSdk.importexportMod.JobType] = js.native
  var Signature: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Signature] = js.native
  var SignatureFileContents: js.UndefOr[typingsSlinky.awsSdk.importexportMod.SignatureFileContents] = js.native
  var WarningMessage: js.UndefOr[typingsSlinky.awsSdk.importexportMod.WarningMessage] = js.native
}

object CreateJobOutput {
  @scala.inline
  def apply(): CreateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobOutput]
  }
  @scala.inline
  implicit class CreateJobOutputOps[Self <: CreateJobOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactList(value: ArtifactList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArtifactList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArtifactList")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
    @scala.inline
    def withJobType(value: JobType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobType")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signature")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureFileContents(value: SignatureFileContents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureFileContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureFileContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureFileContents")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningMessage(value: WarningMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarningMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarningMessage")(js.undefined)
        ret
    }
  }
  
}

