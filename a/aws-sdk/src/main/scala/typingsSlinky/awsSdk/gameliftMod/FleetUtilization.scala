package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetUtilization extends js.Object {
  /**
    * Number of active game sessions currently being hosted on all instances in the fleet.
    */
  var ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of server processes in an ACTIVE status currently running across all instances in the fleet
    */
  var ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of active player sessions currently being hosted on all instances in the fleet.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * The maximum number of players allowed across all game sessions currently being hosted on all instances in the fleet.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
}

object FleetUtilization {
  @scala.inline
  def apply(): FleetUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetUtilization]
  }
  @scala.inline
  implicit class FleetUtilizationOps[Self <: FleetUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveGameSessionCount(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveGameSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveGameSessionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveGameSessionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveServerProcessCount(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveServerProcessCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveServerProcessCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveServerProcessCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPlayerSessionCount(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPlayerSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPlayerSessionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPlayerSessionCount")(js.undefined)
        ret
    }
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
    @scala.inline
    def withMaximumPlayerSessionCount(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumPlayerSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPlayerSessionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumPlayerSessionCount")(js.undefined)
        ret
    }
  }
  
}

