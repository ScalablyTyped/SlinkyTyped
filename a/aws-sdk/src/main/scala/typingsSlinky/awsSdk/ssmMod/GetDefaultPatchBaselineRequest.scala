package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultPatchBaselineRequest extends js.Object {
  /**
    * Returns the default patch baseline for the specified operating system.
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OperatingSystem] = js.native
}

object GetDefaultPatchBaselineRequest {
  @scala.inline
  def apply(): GetDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultPatchBaselineRequest]
  }
  @scala.inline
  implicit class GetDefaultPatchBaselineRequestOps[Self <: GetDefaultPatchBaselineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

