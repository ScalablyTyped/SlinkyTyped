package typingsSlinky.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryRunConfigOutput extends js.Object {
  /**
    * How long the canary is allowed to run before it must stop.
    */
  var TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.native
}

object CanaryRunConfigOutput {
  @scala.inline
  def apply(TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.undefined): CanaryRunConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(TimeoutInSeconds)) __obj.updateDynamic("TimeoutInSeconds")(TimeoutInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryRunConfigOutput]
  }
}

