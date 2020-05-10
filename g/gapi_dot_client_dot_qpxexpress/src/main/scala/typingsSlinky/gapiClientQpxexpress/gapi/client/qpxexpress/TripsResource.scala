package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientQpxexpress.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripsResource extends js.Object {
  /** Returns a list of flights. */
  def search(request: AnonAlt): Request_[TripsSearchResponse] = js.native
}

object TripsResource {
  @scala.inline
  def apply(search: AnonAlt => Request_[TripsSearchResponse]): TripsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[TripsResource]
  }
  @scala.inline
  implicit class TripsResourceOps[Self <: TripsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearch(value: AnonAlt => Request_[TripsSearchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

