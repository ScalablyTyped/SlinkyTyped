package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Signatory
  */
@js.native
trait ContractSigner extends BackboneElement {
  /**
    * Contract Signatory Party
    */
  var party: Reference = js.native
  /**
    * Contract Documentation Signature
    */
  var signature: js.Array[Signature] = js.native
  /**
    * Contract Signatory Role
    */
  var `type`: Coding = js.native
}

object ContractSigner {
  @scala.inline
  def apply(party: Reference, signature: js.Array[Signature], `type`: Coding): ContractSigner = {
    val __obj = js.Dynamic.literal(party = party.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractSigner]
  }
  @scala.inline
  implicit class ContractSignerOps[Self <: ContractSigner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParty(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("party")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: js.Array[Signature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

