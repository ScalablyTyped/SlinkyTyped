package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroup extends js.Object {
  /**
    * Use Custom Group Name (CustomName) to specify a name for the output group. This value is displayed on the console and can make your job settings JSON more human-readable. It does not affect your outputs. Use up to twelve characters that are either letters, numbers, spaces, or underscores.
    */
  var CustomName: js.UndefOr[string] = js.native
  /**
    * Name of the output group
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Output Group settings, including type
    */
  var OutputGroupSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.OutputGroupSettings] = js.native
  /**
    * This object holds groups of encoding settings, one group of settings per output.
    */
  var Outputs: js.UndefOr[listOfOutput] = js.native
}

object OutputGroup {
  @scala.inline
  def apply(): OutputGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroup]
  }
  @scala.inline
  implicit class OutputGroupOps[Self <: OutputGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
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
    @scala.inline
    def withOutputGroupSettings(value: OutputGroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputGroupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputGroupSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: listOfOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(js.undefined)
        ret
    }
  }
  
}

