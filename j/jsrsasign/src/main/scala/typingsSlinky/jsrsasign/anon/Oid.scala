package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oid extends js.Object {
  var hash: Alg | typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier = js.native
  var oid: String = js.native
}

object Oid {
  @scala.inline
  def apply(
    hash: Alg | typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier,
    oid: String
  ): Oid = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oid]
  }
  @scala.inline
  implicit class OidOps[Self <: Oid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: Alg | typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

