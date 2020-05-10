package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultPatchBaselineResult extends js.Object {
  /**
    * The ID of the default patch baseline.
    */
  var BaselineId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The operating system for the returned patch baseline. 
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OperatingSystem] = js.native
}

object GetDefaultPatchBaselineResult {
  @scala.inline
  def apply(): GetDefaultPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultPatchBaselineResult]
  }
  @scala.inline
  implicit class GetDefaultPatchBaselineResultOps[Self <: GetDefaultPatchBaselineResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaselineId(value: BaselineId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystem(value: OperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(js.undefined)
        ret
    }
  }
  
}

