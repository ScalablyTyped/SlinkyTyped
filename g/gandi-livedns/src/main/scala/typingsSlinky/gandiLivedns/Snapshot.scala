package typingsSlinky.gandiLivedns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snapshot extends js.Object {
  /**
    * Can be used as a date with "new Date(change_time);"
    */
  var change_time: String = js.native
  var serial: Double = js.native
  var zone_data: js.Array[ZoneRecord] = js.native
  var zone_uuid: String = js.native
}

object Snapshot {
  @scala.inline
  def apply(change_time: String, serial: Double, zone_data: js.Array[ZoneRecord], zone_uuid: String): Snapshot = {
    val __obj = js.Dynamic.literal(change_time = change_time.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], zone_data = zone_data.asInstanceOf[js.Any], zone_uuid = zone_uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZone_data(value: js.Array[ZoneRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZone_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone_uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

