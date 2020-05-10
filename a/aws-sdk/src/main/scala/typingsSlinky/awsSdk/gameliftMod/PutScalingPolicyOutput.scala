package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutScalingPolicyOutput extends js.Object {
  /**
    * A descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
}

object PutScalingPolicyOutput {
  @scala.inline
  def apply(): PutScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutScalingPolicyOutput]
  }
  @scala.inline
  implicit class PutScalingPolicyOutputOps[Self <: PutScalingPolicyOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

