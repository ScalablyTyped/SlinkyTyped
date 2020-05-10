package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.DERInteger
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIssuer extends js.Object {
  var issuer: StringParam = js.native
  var serial: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double = js.native
}

object AnonIssuer {
  @scala.inline
  def apply(issuer: StringParam, serial: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double): AnonIssuer = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIssuer]
  }
  @scala.inline
  implicit class AnonIssuerOps[Self <: AnonIssuer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssuer(value: StringParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

