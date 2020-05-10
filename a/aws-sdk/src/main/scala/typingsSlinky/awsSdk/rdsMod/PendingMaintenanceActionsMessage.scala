package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingMaintenanceActionsMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous DescribePendingMaintenanceActions request. If this parameter is specified, the response includes only records beyond the marker, up to a number of records specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActions: js.UndefOr[typingsSlinky.awsSdk.rdsMod.PendingMaintenanceActions] = js.native
}

object PendingMaintenanceActionsMessage {
  @scala.inline
  def apply(): PendingMaintenanceActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenanceActionsMessage]
  }
  @scala.inline
  implicit class PendingMaintenanceActionsMessageOps[Self <: PendingMaintenanceActionsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingMaintenanceActions(value: PendingMaintenanceActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingMaintenanceActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingMaintenanceActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingMaintenanceActions")(js.undefined)
        ret
    }
  }
  
}

