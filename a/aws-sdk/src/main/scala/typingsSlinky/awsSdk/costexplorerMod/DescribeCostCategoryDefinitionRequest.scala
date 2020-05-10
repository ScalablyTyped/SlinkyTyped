package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCostCategoryDefinitionRequest extends js.Object {
  /**
    *  The unique identifier for your Cost Category. 
    */
  var CostCategoryArn: Arn = js.native
  /**
    *  The date when the Cost Category was effective. 
    */
  var EffectiveOn: js.UndefOr[ZonedDateTime] = js.native
}

object DescribeCostCategoryDefinitionRequest {
  @scala.inline
  def apply(CostCategoryArn: Arn): DescribeCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(CostCategoryArn = CostCategoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCostCategoryDefinitionRequest]
  }
  @scala.inline
  implicit class DescribeCostCategoryDefinitionRequestOps[Self <: DescribeCostCategoryDefinitionRequest] (val x: Self) extends AnyVal {
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
    def withEffectiveOn(value: ZonedDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveOn")(js.undefined)
        ret
    }
  }
  
}

