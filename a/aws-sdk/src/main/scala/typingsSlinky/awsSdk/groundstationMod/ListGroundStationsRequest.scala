package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroundStationsRequest extends js.Object {
  /**
    * Maximum number of ground stations returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * Satellite ID to retrieve on-boarded ground stations.
    */
  var satelliteId: js.UndefOr[String] = js.native
}

object ListGroundStationsRequest {
  @scala.inline
  def apply(): ListGroundStationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroundStationsRequest]
  }
  @scala.inline
  implicit class ListGroundStationsRequestOps[Self <: ListGroundStationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
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
    @scala.inline
    def withSatelliteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satelliteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSatelliteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satelliteId")(js.undefined)
        ret
    }
  }
  
}

