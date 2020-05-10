package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundStationData extends js.Object {
  /**
    * UUID of a ground station.
    */
  var groundStationId: js.UndefOr[String] = js.native
  /**
    * Name of a ground station.
    */
  var groundStationName: js.UndefOr[String] = js.native
  /**
    * Ground station Region.
    */
  var region: js.UndefOr[String] = js.native
}

object GroundStationData {
  @scala.inline
  def apply(): GroundStationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundStationData]
  }
  @scala.inline
  implicit class GroundStationDataOps[Self <: GroundStationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroundStationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundStationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStationId")(js.undefined)
        ret
    }
    @scala.inline
    def withGroundStationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundStationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStationName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

