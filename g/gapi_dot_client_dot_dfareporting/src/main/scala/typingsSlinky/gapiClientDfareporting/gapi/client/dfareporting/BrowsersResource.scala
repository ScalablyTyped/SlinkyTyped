package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowsersResource extends js.Object {
  /** Retrieves a list of browsers. */
  def list(request: Key): Request[BrowsersListResponse]
}

object BrowsersResource {
  @scala.inline
  def apply(list: Key => Request[BrowsersListResponse]): BrowsersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BrowsersResource]
  }
}

