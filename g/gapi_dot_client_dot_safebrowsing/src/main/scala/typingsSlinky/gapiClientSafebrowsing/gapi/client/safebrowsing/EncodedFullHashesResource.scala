package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSafebrowsing.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedFullHashesResource extends js.Object {
  def get(request: AnonAccesstoken): Request_[FindFullHashesResponse]
}

object EncodedFullHashesResource {
  @scala.inline
  def apply(get: AnonAccesstoken => Request_[FindFullHashesResponse]): EncodedFullHashesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[EncodedFullHashesResource]
  }
}

