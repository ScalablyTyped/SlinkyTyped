package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certs extends js.Object {
  var certs: js.Array[String] = js.native
  var content: StringParam = js.native
  var signerInfos: js.Array[HashAlg] = js.native
}

object Certs {
  @scala.inline
  def apply(certs: js.Array[String], content: StringParam, signerInfos: js.Array[HashAlg]): Certs = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certs]
  }
  @scala.inline
  implicit class CertsOps[Self <: Certs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCerts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: StringParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignerInfos(value: js.Array[HashAlg]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerInfos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

