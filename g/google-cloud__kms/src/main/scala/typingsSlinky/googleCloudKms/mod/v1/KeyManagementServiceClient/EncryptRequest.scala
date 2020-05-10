package typingsSlinky.googleCloudKms.mod.v1.KeyManagementServiceClient

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptRequest extends js.Object {
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  var name: String = js.native
  var plaintext: Buffer = js.native
}

object EncryptRequest {
  @scala.inline
  def apply(name: String, plaintext: Buffer): EncryptRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptRequest]
  }
  @scala.inline
  implicit class EncryptRequestOps[Self <: EncryptRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaintext(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalAuthenticatedData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalAuthenticatedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalAuthenticatedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalAuthenticatedData")(js.undefined)
        ret
    }
  }
  
}

