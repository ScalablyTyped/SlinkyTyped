package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHumanLoopRequest extends js.Object {
  /**
    * The name of the human loop you want to delete.
    */
  var HumanLoopName: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
}

object DeleteHumanLoopRequest {
  @scala.inline
  def apply(HumanLoopName: HumanLoopName): DeleteHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHumanLoopRequest]
  }
  @scala.inline
  implicit class DeleteHumanLoopRequestOps[Self <: DeleteHumanLoopRequest] (val x: Self) extends AnyVal {
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

