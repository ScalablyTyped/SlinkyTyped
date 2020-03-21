package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SponsorsResource extends js.Object {
  /** Lists sponsors for a channel. */
  def list(request: AnonFilter): Request_[SponsorListResponse]
}

object SponsorsResource {
  @scala.inline
  def apply(list: AnonFilter => Request_[SponsorListResponse]): SponsorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SponsorsResource]
  }
}

