package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroundStationsResponse extends js.Object {
  /**
    * List of ground stations.
    */
  var groundStationList: js.UndefOr[GroundStationList] = js.native
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListGroundStationsResponse {
  @scala.inline
  def apply(): ListGroundStationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroundStationsResponse]
  }
  @scala.inline
  implicit class ListGroundStationsResponseOps[Self <: ListGroundStationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroundStationList(value: GroundStationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStationList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroundStationList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groundStationList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

