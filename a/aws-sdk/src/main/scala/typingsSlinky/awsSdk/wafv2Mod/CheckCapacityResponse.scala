package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckCapacityResponse extends js.Object {
  /**
    * The capacity required by the rules and scope.
    */
  var Capacity: js.UndefOr[ConsumedCapacity] = js.native
}

object CheckCapacityResponse {
  @scala.inline
  def apply(): CheckCapacityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckCapacityResponse]
  }
  @scala.inline
  implicit class CheckCapacityResponseOps[Self <: CheckCapacityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacity(value: ConsumedCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(js.undefined)
        ret
    }
  }
  
}

