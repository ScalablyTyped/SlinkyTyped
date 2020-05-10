package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDealTermsNonGuaranteedFixedPriceTerms extends js.Object {
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
}

object SchemaDealTermsNonGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(): SchemaDealTermsNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsNonGuaranteedFixedPriceTerms]
  }
  @scala.inline
  implicit class SchemaDealTermsNonGuaranteedFixedPriceTermsOps[Self <: SchemaDealTermsNonGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
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

