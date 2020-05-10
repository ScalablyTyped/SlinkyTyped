package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintDetail extends js.Object {
  /**
    * The identifier of the constraint.
    */
  var ConstraintId: js.UndefOr[Id] = js.native
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.native
  /**
    * The owner of the constraint.
    */
  var Owner: js.UndefOr[AccountId] = js.native
  /**
    * The identifier of the portfolio the product resides in. The constraint applies only to the instance of the product that lives within this portfolio.
    */
  var PortfolioId: js.UndefOr[Id] = js.native
  /**
    * The identifier of the product the constraint applies to. Note that a constraint applies to a specific instance of a product within a certain portfolio.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
    */
  var Type: js.UndefOr[ConstraintType] = js.native
}

object ConstraintDetail {
  @scala.inline
  def apply(): ConstraintDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintDetail]
  }
  @scala.inline
  implicit class ConstraintDetailOps[Self <: ConstraintDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraintId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ConstraintDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
    @scala.inline
    def withPortfolioId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortfolioId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ConstraintType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

