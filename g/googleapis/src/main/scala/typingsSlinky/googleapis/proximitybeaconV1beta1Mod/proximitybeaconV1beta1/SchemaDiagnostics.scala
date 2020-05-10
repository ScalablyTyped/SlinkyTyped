package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Diagnostics for a single beacon.
  */
@js.native
trait SchemaDiagnostics extends js.Object {
  /**
    * An unordered list of Alerts that the beacon has.
    */
  var alerts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Resource name of the beacon. For Eddystone-EID beacons, this may be the
    * beacon&#39;s current EID, or the beacon&#39;s &quot;stable&quot;
    * Eddystone-UID.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * The date when the battery is expected to be low. If the value is missing
    * then there is no estimate for when the battery will be low. This value is
    * only an estimate, not an exact date.
    */
  var estimatedLowBatteryDate: js.UndefOr[SchemaDate] = js.native
}

object SchemaDiagnostics {
  @scala.inline
  def apply(): SchemaDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiagnostics]
  }
  @scala.inline
  implicit class SchemaDiagnosticsOps[Self <: SchemaDiagnostics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlerts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alerts")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconName")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedLowBatteryDate(value: SchemaDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedLowBatteryDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedLowBatteryDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedLowBatteryDate")(js.undefined)
        ret
    }
  }
  
}

