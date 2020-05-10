package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetEbsDefaultKmsKeyIdResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the default CMK for EBS encryption by default.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
}

object ResetEbsDefaultKmsKeyIdResult {
  @scala.inline
  def apply(): ResetEbsDefaultKmsKeyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetEbsDefaultKmsKeyIdResult]
  }
  @scala.inline
  implicit class ResetEbsDefaultKmsKeyIdResultOps[Self <: ResetEbsDefaultKmsKeyIdResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
  }
  
}

