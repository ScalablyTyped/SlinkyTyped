package typingsSlinky.instagramPrivateApi.locationRepositoryInfoResponseMod

import typingsSlinky.instagramPrivateApi.statusResponseMod.StatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationRepositoryInfoResponseRootObject extends StatusResponse {
  var location: LocationRepositoryInfoResponseLocation = js.native
}

object LocationRepositoryInfoResponseRootObject {
  @scala.inline
  def apply(location: LocationRepositoryInfoResponseLocation, status: String): LocationRepositoryInfoResponseRootObject = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryInfoResponseRootObject]
  }
  @scala.inline
  implicit class LocationRepositoryInfoResponseRootObjectOps[Self <: LocationRepositoryInfoResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: LocationRepositoryInfoResponseLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

