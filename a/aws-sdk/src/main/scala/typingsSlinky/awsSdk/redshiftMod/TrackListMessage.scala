package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackListMessage extends js.Object {
  /**
    * A list of maintenance tracks output by the DescribeClusterTracks operation. 
    */
  var MaintenanceTracks: js.UndefOr[TrackList] = js.native
  /**
    * The starting point to return a set of response tracklist records. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.
    */
  var Marker: js.UndefOr[String] = js.native
}

object TrackListMessage {
  @scala.inline
  def apply(): TrackListMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackListMessage]
  }
  @scala.inline
  implicit class TrackListMessageOps[Self <: TrackListMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaintenanceTracks(value: TrackList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceTracks")(js.undefined)
        ret
    }
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
  }
  
}

