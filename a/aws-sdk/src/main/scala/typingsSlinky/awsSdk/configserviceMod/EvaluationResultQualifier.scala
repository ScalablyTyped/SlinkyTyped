package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResultQualifier extends js.Object {
  /**
    * The name of the AWS Config rule that was used in the evaluation.
    */
  var ConfigRuleName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigRuleName] = js.native
  /**
    * The ID of the evaluated AWS resource.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.native
  /**
    * The type of AWS resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object EvaluationResultQualifier {
  @scala.inline
  def apply(): EvaluationResultQualifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResultQualifier]
  }
  @scala.inline
  implicit class EvaluationResultQualifierOps[Self <: EvaluationResultQualifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigRuleName(value: ConfigRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: BaseResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

