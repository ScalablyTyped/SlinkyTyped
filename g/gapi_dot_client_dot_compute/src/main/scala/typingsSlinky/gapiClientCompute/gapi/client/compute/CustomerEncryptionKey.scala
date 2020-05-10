package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerEncryptionKey extends js.Object {
  /** Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. */
  var rawKey: js.UndefOr[String] = js.native
  /** [Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption key that protects this resource. */
  var sha256: js.UndefOr[String] = js.native
}

object CustomerEncryptionKey {
  @scala.inline
  def apply(): CustomerEncryptionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerEncryptionKey]
  }
  @scala.inline
  implicit class CustomerEncryptionKeyOps[Self <: CustomerEncryptionKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRawKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(js.undefined)
        ret
    }
  }
  
}

