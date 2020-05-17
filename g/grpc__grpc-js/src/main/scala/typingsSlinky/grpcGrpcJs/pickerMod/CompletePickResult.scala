package typingsSlinky.grpcGrpcJs.pickerMod

import typingsSlinky.grpcGrpcJs.pickerMod.PickResultType.COMPLETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletePickResult extends PickResult {
  @JSName("pickResultType")
  var pickResultType_CompletePickResult: COMPLETE = js.native
  @JSName("status")
  var status_CompletePickResult: Null = js.native
}

object CompletePickResult {
  @scala.inline
  def apply(pickResultType: COMPLETE, status: Null): CompletePickResult = {
    val __obj = js.Dynamic.literal(pickResultType = pickResultType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletePickResult]
  }
  @scala.inline
  implicit class CompletePickResultOps[Self <: CompletePickResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPickResultType(value: COMPLETE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickResultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

