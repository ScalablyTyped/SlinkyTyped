package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelStepsOutput extends js.Object {
  /**
    * A list of CancelStepsInfo, which shows the status of specified cancel requests for each StepID specified.
    */
  var CancelStepsInfoList: js.UndefOr[typingsSlinky.awsSdk.emrMod.CancelStepsInfoList] = js.native
}

object CancelStepsOutput {
  @scala.inline
  def apply(): CancelStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelStepsOutput]
  }
  @scala.inline
  implicit class CancelStepsOutputOps[Self <: CancelStepsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelStepsInfoList(value: CancelStepsInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelStepsInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelStepsInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelStepsInfoList")(js.undefined)
        ret
    }
  }
  
}

