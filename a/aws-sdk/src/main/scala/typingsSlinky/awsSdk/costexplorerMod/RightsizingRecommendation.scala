package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightsizingRecommendation extends js.Object {
  /**
    * The account that this recommendation is for.
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  /**
    *  Context regarding the current instance.
    */
  var CurrentInstance: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.CurrentInstance] = js.native
  /**
    *  Details for modification recommendations. 
    */
  var ModifyRecommendationDetail: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ModifyRecommendationDetail] = js.native
  /**
    * Recommendation to either terminate or modify the resource.
    */
  var RightsizingType: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.RightsizingType] = js.native
  /**
    * Details for termination recommendations.
    */
  var TerminateRecommendationDetail: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.TerminateRecommendationDetail] = js.native
}

object RightsizingRecommendation {
  @scala.inline
  def apply(): RightsizingRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsizingRecommendation]
  }
  @scala.inline
  implicit class RightsizingRecommendationOps[Self <: RightsizingRecommendation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentInstance(value: CurrentInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyRecommendationDetail(value: ModifyRecommendationDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifyRecommendationDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyRecommendationDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifyRecommendationDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withRightsizingType(value: RightsizingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightsizingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightsizingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightsizingType")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateRecommendationDetail(value: TerminateRecommendationDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminateRecommendationDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateRecommendationDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminateRecommendationDetail")(js.undefined)
        ret
    }
  }
  
}

