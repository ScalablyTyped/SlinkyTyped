package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationResponse extends js.Object {
  /**
    * A complex type that contains information about the operation.
    */
  var Operation: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.Operation] = js.native
}

object GetOperationResponse {
  @scala.inline
  def apply(): GetOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationResponse]
  }
  @scala.inline
  implicit class GetOperationResponseOps[Self <: GetOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: Operation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(js.undefined)
        ret
    }
  }
  
}

