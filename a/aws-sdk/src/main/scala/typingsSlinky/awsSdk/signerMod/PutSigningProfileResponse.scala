package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSigningProfileResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the signing profile created.
    */
  var arn: js.UndefOr[java.lang.String] = js.native
}

object PutSigningProfileResponse {
  @scala.inline
  def apply(): PutSigningProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSigningProfileResponse]
  }
  @scala.inline
  implicit class PutSigningProfileResponseOps[Self <: PutSigningProfileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
  }
  
}

