package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionProperty extends js.Object {
  /**
    * The maximum number of concurrent runs allowed for a job. The default is 1.
    */
  var maxConcurrentRuns: js.UndefOr[Input[Double]] = js.native
}

object JobExecutionProperty {
  @scala.inline
  def apply(): JobExecutionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionProperty]
  }
  @scala.inline
  implicit class JobExecutionPropertyOps[Self <: JobExecutionProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxConcurrentRuns(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentRuns")(js.undefined)
        ret
    }
  }
  
}

