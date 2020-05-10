package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsJobExecutionsRolloutConfig extends js.Object {
  /**
    * The maximum number of OTA update job executions started per minute.
    */
  var maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.native
}

object AwsJobExecutionsRolloutConfig {
  @scala.inline
  def apply(): AwsJobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobExecutionsRolloutConfig]
  }
  @scala.inline
  implicit class AwsJobExecutionsRolloutConfigOps[Self <: AwsJobExecutionsRolloutConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumPerMinute(value: MaximumPerMinute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPerMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPerMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPerMinute")(js.undefined)
        ret
    }
  }
  
}

