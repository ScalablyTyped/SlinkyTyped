package typingsSlinky.googleCloudKms.mod.v1.KeyManagementServiceClient

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptResponse extends js.Object {
  var plaintext: Buffer = js.native
}

object DecryptResponse {
  @scala.inline
  def apply(plaintext: Buffer): DecryptResponse = {
    val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResponse]
  }
  @scala.inline
  implicit class DecryptResponseOps[Self <: DecryptResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaintext(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

