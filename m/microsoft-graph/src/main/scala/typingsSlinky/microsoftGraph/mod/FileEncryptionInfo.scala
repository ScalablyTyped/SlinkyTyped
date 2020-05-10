package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileEncryptionInfo extends js.Object {
  // The key used to encrypt the file content.
  var encryptionKey: js.UndefOr[Double] = js.native
  // The file digest prior to encryption.
  var fileDigest: js.UndefOr[Double] = js.native
  // The file digest algorithm.
  var fileDigestAlgorithm: js.UndefOr[String] = js.native
  // The initialization vector used for the encryption algorithm.
  var initializationVector: js.UndefOr[Double] = js.native
  // The hash of the encrypted file content + IV (content hash).
  var mac: js.UndefOr[Double] = js.native
  // The key used to get mac.
  var macKey: js.UndefOr[Double] = js.native
  // The profile identifier.
  var profileIdentifier: js.UndefOr[String] = js.native
}

object FileEncryptionInfo {
  @scala.inline
  def apply(): FileEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileEncryptionInfo]
  }
  @scala.inline
  implicit class FileEncryptionInfoOps[Self <: FileEncryptionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFileDigest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withFileDigestAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDigestAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileDigestAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDigestAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withInitializationVector(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializationVector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitializationVector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializationVector")(js.undefined)
        ret
    }
    @scala.inline
    def withMac(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(js.undefined)
        ret
    }
    @scala.inline
    def withMacKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macKey")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileIdentifier")(js.undefined)
        ret
    }
  }
  
}

