package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSigningJobResponse extends js.Object {
  /**
    * Date and time that the signing job was completed.
    */
  var completedAt: js.UndefOr[js.Date] = js.native
  /**
    * Date and time that the signing job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the signing job on output.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * A list of any overrides that were applied to the signing operation.
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.native
  /**
    * The microcontroller platform to which your signed code image will be distributed.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  /**
    * The name of the profile that initiated the signing operation.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  /**
    * The IAM principal that requested the signing job.
    */
  var requestedBy: js.UndefOr[RequestedBy] = js.native
  /**
    * Name of the S3 bucket where the signed code image is saved by code signing.
    */
  var signedObject: js.UndefOr[SignedObject] = js.native
  /**
    * The Amazon Resource Name (ARN) of your code signing certificate.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  /**
    * Map of user-assigned key-value pairs used during signing. These values contain any information that you specified for use in your signing job. 
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.native
  /**
    * The object that contains the name of your S3 bucket or your raw code.
    */
  var source: js.UndefOr[Source] = js.native
  /**
    * Status of the signing job.
    */
  var status: js.UndefOr[SigningStatus] = js.native
  /**
    * String value that contains the status reason.
    */
  var statusReason: js.UndefOr[StatusReason] = js.native
}

object DescribeSigningJobResponse {
  @scala.inline
  def apply(): DescribeSigningJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSigningJobResponse]
  }
  @scala.inline
  implicit class DescribeSigningJobResponseOps[Self <: DescribeSigningJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: SigningPlatformOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformId(value: PlatformId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformId")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileName(value: ProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedBy(value: RequestedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSignedObject(value: SignedObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedObject")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningMaterial(value: SigningMaterial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingMaterial")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningParameters(value: SigningParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SigningStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReason(value: StatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReason")(js.undefined)
        ret
    }
  }
  
}

