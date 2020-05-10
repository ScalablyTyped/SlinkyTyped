package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAcceleratorResponse extends js.Object {
  /**
    * The accelerator that is created by specifying a listener and the supported IP address types.
    */
  var Accelerator: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.Accelerator] = js.native
}

object CreateAcceleratorResponse {
  @scala.inline
  def apply(): CreateAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAcceleratorResponse]
  }
  @scala.inline
  implicit class CreateAcceleratorResponseOps[Self <: CreateAcceleratorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerator(value: Accelerator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accelerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accelerator")(js.undefined)
        ret
    }
  }
  
}

