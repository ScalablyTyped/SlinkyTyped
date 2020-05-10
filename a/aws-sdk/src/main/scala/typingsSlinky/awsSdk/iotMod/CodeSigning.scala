package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeSigning extends js.Object {
  /**
    * The ID of the AWSSignerJob which was created to sign the file.
    */
  var awsSignerJobId: js.UndefOr[SigningJobId] = js.native
  /**
    * A custom method for code signing a file.
    */
  var customCodeSigning: js.UndefOr[CustomCodeSigning] = js.native
  /**
    * Describes the code-signing job.
    */
  var startSigningJobParameter: js.UndefOr[StartSigningJobParameter] = js.native
}

object CodeSigning {
  @scala.inline
  def apply(): CodeSigning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigning]
  }
  @scala.inline
  implicit class CodeSigningOps[Self <: CodeSigning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsSignerJobId(value: SigningJobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsSignerJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsSignerJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsSignerJobId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomCodeSigning(value: CustomCodeSigning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCodeSigning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCodeSigning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCodeSigning")(js.undefined)
        ret
    }
    @scala.inline
    def withStartSigningJobParameter(value: StartSigningJobParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSigningJobParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartSigningJobParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSigningJobParameter")(js.undefined)
        ret
    }
  }
  
}

