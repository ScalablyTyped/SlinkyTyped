package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateProductWithPortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * The identifier of the source portfolio.
    */
  var SourcePortfolioId: js.UndefOr[Id] = js.native
}

object AssociateProductWithPortfolioInput {
  @scala.inline
  def apply(PortfolioId: Id, ProductId: Id): AssociateProductWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateProductWithPortfolioInput]
  }
  @scala.inline
  implicit class AssociateProductWithPortfolioInputOps[Self <: AssociateProductWithPortfolioInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPortfolioId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptLanguage(value: AcceptLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePortfolioId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePortfolioId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePortfolioId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePortfolioId")(js.undefined)
        ret
    }
  }
  
}

