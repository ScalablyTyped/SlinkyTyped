package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningJob extends js.Object {
  /**
    * The date and time that the signing job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the signing job.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * A SignedObject structure that contains information about a signing job's signed code image.
    */
  var signedObject: js.UndefOr[SignedObject] = js.native
  /**
    * A SigningMaterial object that contains the Amazon Resource Name (ARN) of the certificate used for the signing job.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  /**
    * A Source that contains information about a signing job's code image source.
    */
  var source: js.UndefOr[Source] = js.native
  /**
    * The status of the signing job.
    */
  var status: js.UndefOr[SigningStatus] = js.native
}

object SigningJob {
  @scala.inline
  def apply(): SigningJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningJob]
  }
  @scala.inline
  implicit class SigningJobOps[Self <: SigningJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

