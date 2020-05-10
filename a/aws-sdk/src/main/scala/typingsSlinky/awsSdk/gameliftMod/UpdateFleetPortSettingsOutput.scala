package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetPortSettingsOutput extends js.Object {
  /**
    * A unique identifier for a fleet that was updated.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetId] = js.native
}

object UpdateFleetPortSettingsOutput {
  @scala.inline
  def apply(): UpdateFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetPortSettingsOutput]
  }
  @scala.inline
  implicit class UpdateFleetPortSettingsOutputOps[Self <: UpdateFleetPortSettingsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(js.undefined)
        ret
    }
  }
  
}

