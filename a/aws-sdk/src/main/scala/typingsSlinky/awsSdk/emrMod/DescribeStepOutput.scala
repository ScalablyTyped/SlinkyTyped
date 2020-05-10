package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStepOutput extends js.Object {
  /**
    * The step details for the requested step identifier.
    */
  var Step: js.UndefOr[typingsSlinky.awsSdk.emrMod.Step] = js.native
}

object DescribeStepOutput {
  @scala.inline
  def apply(): DescribeStepOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStepOutput]
  }
  @scala.inline
  implicit class DescribeStepOutputOps[Self <: DescribeStepOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStep(value: Step): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Step")(js.undefined)
        ret
    }
  }
  
}

