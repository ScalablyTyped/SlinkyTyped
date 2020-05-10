package typingsSlinky.nodeForge.mod.pkcs7

import typingsSlinky.nodeForge.mod.asn1.Asn1
import typingsSlinky.nodeForge.mod.pki.Certificate
import typingsSlinky.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PkcsEnvelopedData extends js.Object {
  var content: js.UndefOr[String | ByteBuffer] = js.native
  def addRecipient(certificate: Certificate): Unit = js.native
  def encrypt(): Unit = js.native
  def toAsn1(): Asn1 = js.native
}

object PkcsEnvelopedData {
  @scala.inline
  def apply(addRecipient: Certificate => Unit, encrypt: () => Unit, toAsn1: () => Asn1): PkcsEnvelopedData = {
    val __obj = js.Dynamic.literal(addRecipient = js.Any.fromFunction1(addRecipient), encrypt = js.Any.fromFunction0(encrypt), toAsn1 = js.Any.fromFunction0(toAsn1))
    __obj.asInstanceOf[PkcsEnvelopedData]
  }
  @scala.inline
  implicit class PkcsEnvelopedDataOps[Self <: PkcsEnvelopedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRecipient(value: Certificate => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRecipient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncrypt(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToAsn1(value: () => Asn1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toAsn1")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContent(value: String | ByteBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
  }
  
}

