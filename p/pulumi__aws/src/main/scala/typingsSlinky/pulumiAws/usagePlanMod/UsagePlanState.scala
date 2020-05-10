package typingsSlinky.pulumiAws.usagePlanMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanApiStage
import typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanQuotaSettings
import typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanThrottleSettings
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanState extends js.Object {
  /**
    * The associated API stages of the usage plan.
    */
  val apiStages: js.UndefOr[Input[js.Array[Input[UsagePlanApiStage]]]] = js.native
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The description of a usage plan.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the usage plan.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  val productCode: js.UndefOr[Input[String]] = js.native
  /**
    * The quota settings of the usage plan.
    */
  val quotaSettings: js.UndefOr[Input[UsagePlanQuotaSettings]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The throttling limits of the usage plan.
    */
  val throttleSettings: js.UndefOr[Input[UsagePlanThrottleSettings]] = js.native
}

object UsagePlanState {
  @scala.inline
  def apply(): UsagePlanState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlanState]
  }
  @scala.inline
  implicit class UsagePlanStateOps[Self <: UsagePlanState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiStages(value: Input[js.Array[Input[UsagePlanApiStage]]]): Self = {
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
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
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
    def withName(value: Input[String]): Self = {
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
    def withProductCode(value: Input[String]): Self = {
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
    def withQuotaSettings(value: Input[UsagePlanQuotaSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
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
    def withThrottleSettings(value: Input[UsagePlanThrottleSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleSettings")(js.undefined)
        ret
    }
  }
  
}

