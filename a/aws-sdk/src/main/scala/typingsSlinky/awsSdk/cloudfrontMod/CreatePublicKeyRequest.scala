package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublicKeyRequest extends js.Object {
  /**
    * The request to add a public key to CloudFront.
    */
  var PublicKeyConfig: typingsSlinky.awsSdk.cloudfrontMod.PublicKeyConfig = js.native
}

object CreatePublicKeyRequest {
  @scala.inline
  def apply(PublicKeyConfig: PublicKeyConfig): CreatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublicKeyRequest]
  }
  @scala.inline
  implicit class CreatePublicKeyRequestOps[Self <: CreatePublicKeyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicKeyConfig(value: PublicKeyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

