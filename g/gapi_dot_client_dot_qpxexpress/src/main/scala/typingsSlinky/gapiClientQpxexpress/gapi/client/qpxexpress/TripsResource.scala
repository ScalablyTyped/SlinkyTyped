package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientQpxexpress.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripsResource extends js.Object {
  /** Returns a list of flights. */
  def search(request: AnonAlt): Request_[TripsSearchResponse]
}

object TripsResource {
  @scala.inline
  def apply(search: AnonAlt => Request_[TripsSearchResponse]): TripsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[TripsResource]
  }
}

