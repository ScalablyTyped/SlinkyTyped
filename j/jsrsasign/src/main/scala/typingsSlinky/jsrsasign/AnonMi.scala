package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMi extends js.Object {
  var certreq: Boolean = js.native
  var mi: MessageImprint = js.native
  var nonce: IntegerParam | BigIntegerParam | HexParam | Double = js.native
  var policy: ObjectIdentifierParam | HexParam | NameParam = js.native
}

object AnonMi {
  @scala.inline
  def apply(
    certreq: Boolean,
    mi: MessageImprint,
    nonce: IntegerParam | BigIntegerParam | HexParam | Double,
    policy: ObjectIdentifierParam | HexParam | NameParam
  ): AnonMi = {
    val __obj = js.Dynamic.literal(certreq = certreq.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMi]
  }
  @scala.inline
  implicit class AnonMiOps[Self <: AnonMi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertreq(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certreq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMi(value: MessageImprint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: IntegerParam | BigIntegerParam | HexParam | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: ObjectIdentifierParam | HexParam | NameParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

