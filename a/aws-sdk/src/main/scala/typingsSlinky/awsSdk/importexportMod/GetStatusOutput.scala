package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStatusOutput extends js.Object {
  var ArtifactList: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ArtifactList] = js.native
  var Carrier: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Carrier] = js.native
  var CreationDate: js.UndefOr[js.Date] = js.native
  var CurrentManifest: js.UndefOr[typingsSlinky.awsSdk.importexportMod.CurrentManifest] = js.native
  var ErrorCount: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ErrorCount] = js.native
  var JobId: js.UndefOr[typingsSlinky.awsSdk.importexportMod.JobId] = js.native
  var JobType: js.UndefOr[typingsSlinky.awsSdk.importexportMod.JobType] = js.native
  var LocationCode: js.UndefOr[typingsSlinky.awsSdk.importexportMod.LocationCode] = js.native
  var LocationMessage: js.UndefOr[typingsSlinky.awsSdk.importexportMod.LocationMessage] = js.native
  var LogBucket: js.UndefOr[typingsSlinky.awsSdk.importexportMod.LogBucket] = js.native
  var LogKey: js.UndefOr[typingsSlinky.awsSdk.importexportMod.LogKey] = js.native
  var ProgressCode: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ProgressCode] = js.native
  var ProgressMessage: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ProgressMessage] = js.native
  var Signature: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Signature] = js.native
  var SignatureFileContents: js.UndefOr[Signature] = js.native
  var TrackingNumber: js.UndefOr[typingsSlinky.awsSdk.importexportMod.TrackingNumber] = js.native
}

object GetStatusOutput {
  @scala.inline
  def apply(): GetStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStatusOutput]
  }
  @scala.inline
  implicit class GetStatusOutputOps[Self <: GetStatusOutput] (val x: Self) extends AnyVal {
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
    def withCarrier(value: Carrier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Carrier")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentManifest(value: CurrentManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCount(value: ErrorCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCount")(js.undefined)
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
    def withLocationCode(value: LocationCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationMessage(value: LocationMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLogBucket(value: LogBucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withLogKey(value: LogKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogKey")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCode(value: ProgressCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressCode")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressMessage(value: ProgressMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressMessage")(js.undefined)
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
    def withSignatureFileContents(value: Signature): Self = {
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
    def withTrackingNumber(value: TrackingNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackingNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackingNumber")(js.undefined)
        ret
    }
  }
  
}

