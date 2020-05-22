package typingsSlinky.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryRunConfigInput extends js.Object {
  /**
    * How long the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
    */
  var TimeoutInSeconds: MaxFifteenMinutesInSeconds = js.native
}

object CanaryRunConfigInput {
  @scala.inline
  def apply(TimeoutInSeconds: MaxFifteenMinutesInSeconds): CanaryRunConfigInput = {
    val __obj = js.Dynamic.literal(TimeoutInSeconds = TimeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryRunConfigInput]
  }
}

