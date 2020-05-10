package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observation extends js.Object {
  /**
    * The ID advertised by the beacon the client has encountered.
    *
    * If the submitted `advertised_id` type is Eddystone-EID, then the client
    * must be authorized to resolve the given beacon. Otherwise no data will be
    * returned for that beacon.
    * Required.
    */
  var advertisedId: js.UndefOr[AdvertisedId] = js.native
  /**
    * The array of telemetry bytes received from the beacon. The server is
    * responsible for parsing it. This field may frequently be empty, as
    * with a beacon that transmits telemetry only occasionally.
    */
  var telemetry: js.UndefOr[String] = js.native
  /** Time when the beacon was observed. */
  var timestampMs: js.UndefOr[String] = js.native
}

object Observation {
  @scala.inline
  def apply(): Observation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Observation]
  }
  @scala.inline
  implicit class ObservationOps[Self <: Observation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisedId(value: AdvertisedId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedId")(js.undefined)
        ret
    }
    @scala.inline
    def withTelemetry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelemetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetry")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampMs")(js.undefined)
        ret
    }
  }
  
}

