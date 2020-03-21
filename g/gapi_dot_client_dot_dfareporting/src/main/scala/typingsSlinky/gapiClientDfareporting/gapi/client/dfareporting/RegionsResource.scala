package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionsResource extends js.Object {
  /** Retrieves a list of regions. */
  def list(request: AnonKey): Request_[RegionsListResponse]
}

object RegionsResource {
  @scala.inline
  def apply(list: AnonKey => Request_[RegionsListResponse]): RegionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RegionsResource]
  }
}

