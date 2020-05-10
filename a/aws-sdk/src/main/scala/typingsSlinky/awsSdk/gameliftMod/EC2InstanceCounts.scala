package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2InstanceCounts extends js.Object {
  /**
    * Actual number of active instances in the fleet.
    */
  var ACTIVE: js.UndefOr[WholeNumber] = js.native
  /**
    * Ideal number of active instances in the fleet.
    */
  var DESIRED: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of active instances in the fleet that are not currently hosting a game session.
    */
  var IDLE: js.UndefOr[WholeNumber] = js.native
  /**
    * The maximum value allowed for the fleet's instance count.
    */
  var MAXIMUM: js.UndefOr[WholeNumber] = js.native
  /**
    * The minimum value allowed for the fleet's instance count.
    */
  var MINIMUM: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of instances in the fleet that are starting but not yet active.
    */
  var PENDING: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of instances in the fleet that are no longer active but haven't yet been terminated.
    */
  var TERMINATING: js.UndefOr[WholeNumber] = js.native
}

object EC2InstanceCounts {
  @scala.inline
  def apply(): EC2InstanceCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2InstanceCounts]
  }
  @scala.inline
  implicit class EC2InstanceCountsOps[Self <: EC2InstanceCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACTIVE(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutACTIVE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(js.undefined)
        ret
    }
    @scala.inline
    def withDESIRED(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DESIRED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDESIRED: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DESIRED")(js.undefined)
        ret
    }
    @scala.inline
    def withIDLE(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIDLE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDLE")(js.undefined)
        ret
    }
    @scala.inline
    def withMAXIMUM(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAXIMUM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMAXIMUM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAXIMUM")(js.undefined)
        ret
    }
    @scala.inline
    def withMINIMUM(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MINIMUM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMINIMUM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MINIMUM")(js.undefined)
        ret
    }
    @scala.inline
    def withPENDING(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPENDING: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(js.undefined)
        ret
    }
    @scala.inline
    def withTERMINATING(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TERMINATING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTERMINATING: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TERMINATING")(js.undefined)
        ret
    }
  }
  
}

