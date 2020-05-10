package typingsSlinky.pulumiAws.inputMod.batch

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinitionRetryStrategy extends js.Object {
  var attempts: js.UndefOr[Input[Double]] = js.native
}

object JobDefinitionRetryStrategy {
  @scala.inline
  def apply(): JobDefinitionRetryStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDefinitionRetryStrategy]
  }
  @scala.inline
  implicit class JobDefinitionRetryStrategyOps[Self <: JobDefinitionRetryStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttempts(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(js.undefined)
        ret
    }
  }
  
}

