package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCostCategoryDefinitionResponse extends js.Object {
  /**
    *  The unique identifier for your newly created Cost Category. 
    */
  var CostCategoryArn: js.UndefOr[Arn] = js.native
  /**
    *  The Cost Category's effective start date. 
    */
  var EffectiveStart: js.UndefOr[ZonedDateTime] = js.native
}

object CreateCostCategoryDefinitionResponse {
  @scala.inline
  def apply(): CreateCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCostCategoryDefinitionResponse]
  }
  @scala.inline
  implicit class CreateCostCategoryDefinitionResponseOps[Self <: CreateCostCategoryDefinitionResponse] (val x: Self) extends AnyVal {
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
    def withEffectiveStart(value: ZonedDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveStart")(js.undefined)
        ret
    }
  }
  
}

