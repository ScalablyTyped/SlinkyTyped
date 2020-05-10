package typingsSlinky.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeForge.mod.md.MessageDigest
import typingsSlinky.nodeForge.mod.pki.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  var cipherSuite: CipherSuite | Null = js.native
  var clientCertificate: Certificate | Null = js.native
  var compressionMethod: CompressionMethod | Null = js.native
  var extensions: StringDictionary[js.Object] = js.native
  var md5: MessageDigest = js.native
  var serverCertificate: Certificate | Null = js.native
  var sha1: MessageDigest = js.native
  var version: ProtocolVersion | Null = js.native
}

object Session {
  @scala.inline
  def apply(extensions: StringDictionary[js.Object], md5: MessageDigest, sha1: MessageDigest): Session = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd5(value: MessageDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha1(value: MessageDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCipherSuite(value: CipherSuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipherSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCipherSuiteNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipherSuite")(null)
        ret
    }
    @scala.inline
    def withClientCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientCertificateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertificate")(null)
        ret
    }
    @scala.inline
    def withCompressionMethod(value: CompressionMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressionMethodNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionMethod")(null)
        ret
    }
    @scala.inline
    def withServerCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCertificateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificate")(null)
        ret
    }
    @scala.inline
    def withVersion(value: ProtocolVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(null)
        ret
    }
  }
  
}

