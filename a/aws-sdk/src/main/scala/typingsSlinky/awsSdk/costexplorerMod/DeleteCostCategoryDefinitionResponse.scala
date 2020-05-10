package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCostCategoryDefinitionResponse extends js.Object {
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.native
  /**
    *  The effective end date of the Cost Category as a result of deleting it. No costs after this date will be categorized by the deleted Cost Category. 
    */
  var EffectiveEnd: js.UndefOr[ZonedDateTime] = js.native
}

object DeleteCostCategoryDefinitionResponse {
  @scala.inline
  def apply(): DeleteCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCostCategoryDefinitionResponse]
  }
  @scala.inline
  implicit class DeleteCostCategoryDefinitionResponseOps[Self <: DeleteCostCategoryDefinitionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCostCategoryArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostCategoryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostCategoryArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostCategoryArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveEnd(value: ZonedDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveEnd")(js.undefined)
        ret
    }
  }
  
}

