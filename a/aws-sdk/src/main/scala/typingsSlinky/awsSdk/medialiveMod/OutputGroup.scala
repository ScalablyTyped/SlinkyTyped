package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroup extends js.Object {
  /**
    * Custom output group name optionally defined by the user.  Only letters, numbers, and the underscore character allowed; only 32 characters allowed.
    */
  var Name: js.UndefOr[stringMax32] = js.native
  /**
    * Settings associated with the output group.
    */
  var OutputGroupSettings: typingsSlinky.awsSdk.medialiveMod.OutputGroupSettings = js.native
  var Outputs: listOfOutput = js.native
}

object OutputGroup {
  @scala.inline
  def apply(OutputGroupSettings: OutputGroupSettings, Outputs: listOfOutput): OutputGroup = {
    val __obj = js.Dynamic.literal(OutputGroupSettings = OutputGroupSettings.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroup]
  }
  @scala.inline
  implicit class OutputGroupOps[Self <: OutputGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputGroupSettings(value: OutputGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: listOfOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: stringMax32): Self = {
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

