package typingsSlinky.instagramPrivateApi.locationRepositorySearchResponseMod

import typingsSlinky.instagramPrivateApi.statusResponseMod.StatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationRepositorySearchResponseRootObject extends StatusResponse {
  var rank_token: String = js.native
  var request_id: String = js.native
  var venues: js.Array[LocationRepositorySearchResponseVenuesItem] = js.native
}

object LocationRepositorySearchResponseRootObject {
  @scala.inline
  def apply(
    rank_token: String,
    request_id: String,
    status: String,
    venues: js.Array[LocationRepositorySearchResponseVenuesItem]
  ): LocationRepositorySearchResponseRootObject = {
    val __obj = js.Dynamic.literal(rank_token = rank_token.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], venues = venues.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositorySearchResponseRootObject]
  }
  @scala.inline
  implicit class LocationRepositorySearchResponseRootObjectOps[Self <: LocationRepositorySearchResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRank_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVenues(value: js.Array[LocationRepositorySearchResponseVenuesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("venues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

