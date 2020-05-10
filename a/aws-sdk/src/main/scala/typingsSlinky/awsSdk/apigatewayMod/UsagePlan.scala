package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlan extends js.Object {
  /**
    * The associated API stages of a usage plan.
    */
  var apiStages: js.UndefOr[ListOfApiStage] = js.native
  /**
    * The description of a usage plan.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The identifier of a UsagePlan resource.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of a usage plan.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  var productCode: js.UndefOr[String] = js.native
  /**
    * The maximum number of permitted requests per a given unit time interval.
    */
  var quota: js.UndefOr[QuotaSettings] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The request throttle limits of a usage plan.
    */
  var throttle: js.UndefOr[ThrottleSettings] = js.native
}

object UsagePlan {
  @scala.inline
  def apply(): UsagePlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlan]
  }
  @scala.inline
  implicit class UsagePlanOps[Self <: UsagePlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiStages(value: ListOfApiStage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiStages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiStages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiStages")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCode")(js.undefined)
        ret
    }
    @scala.inline
    def withQuota(value: QuotaSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quota")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle(value: ThrottleSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
  }
  
}

