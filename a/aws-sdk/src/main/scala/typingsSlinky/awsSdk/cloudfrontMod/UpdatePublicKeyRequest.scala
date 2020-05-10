package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePublicKeyRequest extends js.Object {
  /**
    * ID of the public key to be updated.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the public key to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
  /**
    * Request to update public key information.
    */
  var PublicKeyConfig: typingsSlinky.awsSdk.cloudfrontMod.PublicKeyConfig = js.native
}

object UpdatePublicKeyRequest {
  @scala.inline
  def apply(Id: String, PublicKeyConfig: PublicKeyConfig): UpdatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublicKeyRequest]
  }
  @scala.inline
  implicit class UpdatePublicKeyRequestOps[Self <: UpdatePublicKeyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyConfig(value: PublicKeyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfMatch")(js.undefined)
        ret
    }
  }
  
}

