package typingsSlinky.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionAlgorithm extends js.Object {
  /** The encryption algorithm. */
  var encryptionAlgorithm: js.UndefOr[String] = js.native
  /** SHA256 hash value of the encryption key. */
  var keySha256: js.UndefOr[String] = js.native
}

object EncryptionAlgorithm {
  @scala.inline
  def apply(): EncryptionAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionAlgorithm]
  }
  @scala.inline
  implicit class EncryptionAlgorithmOps[Self <: EncryptionAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySha256")(js.undefined)
        ret
    }
  }
  
}

