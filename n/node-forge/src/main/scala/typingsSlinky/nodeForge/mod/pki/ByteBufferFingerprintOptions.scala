package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.nodeForge.mod.md.MessageDigest
import typingsSlinky.nodeForge.nodeForgeStrings.RSAPublicKey
import typingsSlinky.nodeForge.nodeForgeStrings.SubjectPublicKeyInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteBufferFingerprintOptions extends js.Object {
  /**
    * @description the delimiter to use between bytes for `hex` encoded output
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * @description if not specified defaults to `md.md5`
    */
  var md: js.UndefOr[MessageDigest] = js.native
  /**
    * @description The type of fingerprint. If not specified, defaults to 'RSAPublicKey'
    */
  var `type`: js.UndefOr[SubjectPublicKeyInfo | RSAPublicKey] = js.native
}

object ByteBufferFingerprintOptions {
  @scala.inline
  def apply(): ByteBufferFingerprintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteBufferFingerprintOptions]
  }
  @scala.inline
  implicit class ByteBufferFingerprintOptionsOps[Self <: ByteBufferFingerprintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withMd(value: MessageDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: SubjectPublicKeyInfo | RSAPublicKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

