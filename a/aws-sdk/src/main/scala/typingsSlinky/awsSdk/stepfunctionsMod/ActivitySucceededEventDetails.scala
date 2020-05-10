package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitySucceededEventDetails extends js.Object {
  /**
    * The JSON data output by the activity task.
    */
  var output: js.UndefOr[SensitiveData] = js.native
}

object ActivitySucceededEventDetails {
  @scala.inline
  def apply(): ActivitySucceededEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivitySucceededEventDetails]
  }
  @scala.inline
  implicit class ActivitySucceededEventDetailsOps[Self <: ActivitySucceededEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput(value: SensitiveData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
  }
  
}

