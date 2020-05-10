package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Responsible for the account
  */
@js.native
trait AccountGuarantor extends BackboneElement {
  /**
    * Contains extended information for property 'onHold'.
    */
  var _onHold: js.UndefOr[Element] = js.native
  /**
    * Credit or other hold applied
    */
  var onHold: js.UndefOr[Boolean] = js.native
  /**
    * Responsible entity
    */
  var party: Reference = js.native
  /**
    * Guarrantee account during
    */
  var period: js.UndefOr[Period] = js.native
}

object AccountGuarantor {
  @scala.inline
  def apply(party: Reference): AccountGuarantor = {
    val __obj = js.Dynamic.literal(party = party.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountGuarantor]
  }
  @scala.inline
  implicit class AccountGuarantorOps[Self <: AccountGuarantor] (val x: Self) extends AnyVal {
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
    def with_onHold(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onHold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_onHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onHold")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHold")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
  }
  
}

