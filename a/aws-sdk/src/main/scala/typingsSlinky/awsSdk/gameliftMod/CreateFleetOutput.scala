package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetOutput extends js.Object {
  /**
    * Properties for the newly created fleet.
    */
  var FleetAttributes: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetAttributes] = js.native
}

object CreateFleetOutput {
  @scala.inline
  def apply(): CreateFleetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetOutput]
  }
  @scala.inline
  implicit class CreateFleetOutputOps[Self <: CreateFleetOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetAttributes(value: FleetAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetAttributes")(js.undefined)
        ret
    }
  }
  
}

