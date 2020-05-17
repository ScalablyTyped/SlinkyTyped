package typingsSlinky.gapiClientMirror.gapi.client.mirror

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientMirror.anon.Alt
import typingsSlinky.gapiClientMirror.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  /** Gets a single location by ID. */
  def get(request: Alt): Request[Location] = js.native
  /** Retrieves a list of locations for the user. */
  def list(request: Fields): Request[LocationsListResponse] = js.native
}

object LocationsResource {
  @scala.inline
  def apply(get: Alt => Request[Location], list: Fields => Request[LocationsListResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LocationsResource]
  }
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Alt => Request[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[LocationsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

