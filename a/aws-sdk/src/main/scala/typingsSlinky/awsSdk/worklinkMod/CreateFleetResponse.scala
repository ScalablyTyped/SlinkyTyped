package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetResponse extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.FleetArn] = js.native
}

object CreateFleetResponse {
  @scala.inline
  def apply(): CreateFleetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetResponse]
  }
  @scala.inline
  implicit class CreateFleetResponseOps[Self <: CreateFleetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetArn(value: FleetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(js.undefined)
        ret
    }
  }
  
}

