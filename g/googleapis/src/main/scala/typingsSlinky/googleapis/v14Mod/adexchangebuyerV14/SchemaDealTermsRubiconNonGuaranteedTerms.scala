package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDealTermsRubiconNonGuaranteedTerms extends js.Object {
  /**
    * Optional price for Rubicon priority access in the auction.
    */
  var priorityPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Optional price for Rubicon standard access in the auction.
    */
  var standardPrice: js.UndefOr[SchemaPrice] = js.native
}

object SchemaDealTermsRubiconNonGuaranteedTerms {
  @scala.inline
  def apply(): SchemaDealTermsRubiconNonGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsRubiconNonGuaranteedTerms]
  }
  @scala.inline
  implicit class SchemaDealTermsRubiconNonGuaranteedTermsOps[Self <: SchemaDealTermsRubiconNonGuaranteedTerms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriorityPrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriorityPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardPrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardPrice")(js.undefined)
        ret
    }
  }
  
}

