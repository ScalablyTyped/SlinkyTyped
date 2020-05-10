package typingsSlinky.pulumiAws.inputMod.pinpoint

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppLimits extends js.Object {
  /**
    * The maximum number of messages that the campaign can send daily.
    */
  var daily: js.UndefOr[Input[Double]] = js.native
  /**
    * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
    */
  var maximumDuration: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
    */
  var messagesPerSecond: js.UndefOr[Input[Double]] = js.native
  /**
    * The maximum total number of messages that the campaign can send.
    */
  var total: js.UndefOr[Input[Double]] = js.native
}

object AppLimits {
  @scala.inline
  def apply(): AppLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppLimits]
  }
  @scala.inline
  implicit class AppLimitsOps[Self <: AppLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaily(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daily")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumDuration(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesPerSecond(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

