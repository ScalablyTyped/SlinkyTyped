package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopHumanLoopRequest extends js.Object {
  /**
    * The name of the human loop you want to stop.
    */
  var HumanLoopName: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
}

object StopHumanLoopRequest {
  @scala.inline
  def apply(HumanLoopName: HumanLoopName): StopHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopHumanLoopRequest]
  }
  @scala.inline
  implicit class StopHumanLoopRequestOps[Self <: StopHumanLoopRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanLoopName(value: HumanLoopName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

