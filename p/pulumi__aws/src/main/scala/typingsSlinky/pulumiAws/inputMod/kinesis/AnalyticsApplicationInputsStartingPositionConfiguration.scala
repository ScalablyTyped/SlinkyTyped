package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsStartingPositionConfiguration extends js.Object {
  var startingPosition: js.UndefOr[Input[String]] = js.native
}

object AnalyticsApplicationInputsStartingPositionConfiguration {
  @scala.inline
  def apply(): AnalyticsApplicationInputsStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsStartingPositionConfiguration]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsStartingPositionConfigurationOps[Self <: AnalyticsApplicationInputsStartingPositionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartingPosition(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingPosition")(js.undefined)
        ret
    }
  }
  
}

