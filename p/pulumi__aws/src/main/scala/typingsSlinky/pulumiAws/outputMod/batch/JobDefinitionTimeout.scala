package typingsSlinky.pulumiAws.outputMod.batch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinitionTimeout extends js.Object {
  var attemptDurationSeconds: js.UndefOr[Double] = js.native
}

object JobDefinitionTimeout {
  @scala.inline
  def apply(): JobDefinitionTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDefinitionTimeout]
  }
  @scala.inline
  implicit class JobDefinitionTimeoutOps[Self <: JobDefinitionTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptDurationSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptDurationSeconds")(js.undefined)
        ret
    }
  }
  
}

