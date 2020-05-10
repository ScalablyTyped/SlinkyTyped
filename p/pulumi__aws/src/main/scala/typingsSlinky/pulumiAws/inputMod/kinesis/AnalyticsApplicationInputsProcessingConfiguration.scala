package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsProcessingConfiguration extends js.Object {
  var lambda: Input[AnalyticsApplicationInputsProcessingConfigurationLambda] = js.native
}

object AnalyticsApplicationInputsProcessingConfiguration {
  @scala.inline
  def apply(lambda: Input[AnalyticsApplicationInputsProcessingConfigurationLambda]): AnalyticsApplicationInputsProcessingConfiguration = {
    val __obj = js.Dynamic.literal(lambda = lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsProcessingConfiguration]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsProcessingConfigurationOps[Self <: AnalyticsApplicationInputsProcessingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLambda(value: Input[AnalyticsApplicationInputsProcessingConfigurationLambda]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambda")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

