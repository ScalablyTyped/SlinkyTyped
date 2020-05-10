package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyRecommendationDetail extends js.Object {
  /**
    * Identifies whether this instance type is the Amazon Web Services default recommendation.
    */
  var TargetInstances: js.UndefOr[TargetInstancesList] = js.native
}

object ModifyRecommendationDetail {
  @scala.inline
  def apply(): ModifyRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyRecommendationDetail]
  }
  @scala.inline
  implicit class ModifyRecommendationDetailOps[Self <: ModifyRecommendationDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetInstances(value: TargetInstancesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetInstances")(js.undefined)
        ret
    }
  }
  
}

