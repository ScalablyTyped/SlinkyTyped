package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Terms for Preferred Deals. Note that Preferred Deals cannot be created via
  * the API at this time, but can be returned in a get or list request.
  */
@js.native
trait SchemaNonGuaranteedFixedPriceTerms extends js.Object {
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
}

object SchemaNonGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(): SchemaNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonGuaranteedFixedPriceTerms]
  }
  @scala.inline
  implicit class SchemaNonGuaranteedFixedPriceTermsOps[Self <: SchemaNonGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPrices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedPrices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPrices")(js.undefined)
        ret
    }
  }
  
}

