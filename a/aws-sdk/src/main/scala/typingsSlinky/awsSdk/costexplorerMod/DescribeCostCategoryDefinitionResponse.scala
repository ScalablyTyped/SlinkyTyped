package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCostCategoryDefinitionResponse extends js.Object {
  var CostCategory: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.CostCategory] = js.native
}

object DescribeCostCategoryDefinitionResponse {
  @scala.inline
  def apply(): DescribeCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCostCategoryDefinitionResponse]
  }
  @scala.inline
  implicit class DescribeCostCategoryDefinitionResponseOps[Self <: DescribeCostCategoryDefinitionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCostCategory(value: CostCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostCategory")(js.undefined)
        ret
    }
  }
  
}

