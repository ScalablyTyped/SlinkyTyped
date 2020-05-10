package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProvisionedProductPlanInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
    */
  var IgnoreErrors: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.IgnoreErrors] = js.native
  /**
    * The plan identifier.
    */
  var PlanId: Id = js.native
}

object DeleteProvisionedProductPlanInput {
  @scala.inline
  def apply(PlanId: Id): DeleteProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(PlanId = PlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisionedProductPlanInput]
  }
  @scala.inline
  implicit class DeleteProvisionedProductPlanInputOps[Self <: DeleteProvisionedProductPlanInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlanId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlanId")(value.asInstanceOf[js.Any])
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
    def withIgnoreErrors(value: IgnoreErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreErrors")(js.undefined)
        ret
    }
  }
  
}

