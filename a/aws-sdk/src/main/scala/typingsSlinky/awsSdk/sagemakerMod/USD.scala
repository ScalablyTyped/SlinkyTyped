package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USD extends js.Object {
  /**
    * The fractional portion, in cents, of the amount. 
    */
  var Cents: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.Cents] = js.native
  /**
    * The whole number of dollars in the amount.
    */
  var Dollars: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.Dollars] = js.native
  /**
    * Fractions of a cent, in tenths.
    */
  var TenthFractionsOfACent: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TenthFractionsOfACent] = js.native
}

object USD {
  @scala.inline
  def apply(): USD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USD]
  }
  @scala.inline
  implicit class USDOps[Self <: USD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCents(value: Cents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cents")(js.undefined)
        ret
    }
    @scala.inline
    def withDollars(value: Dollars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dollars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDollars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dollars")(js.undefined)
        ret
    }
    @scala.inline
    def withTenthFractionsOfACent(value: TenthFractionsOfACent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TenthFractionsOfACent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenthFractionsOfACent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TenthFractionsOfACent")(js.undefined)
        ret
    }
  }
  
}

