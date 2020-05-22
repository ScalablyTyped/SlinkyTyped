package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Code
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesResource extends js.Object {
  /** Gets one postal code by ID. */
  def get(request: Code): Request[PostalCode]
  /** Retrieves a list of postal codes. */
  def list(request: Key): Request[PostalCodesListResponse]
}

object PostalCodesResource {
  @scala.inline
  def apply(get: Code => Request[PostalCode], list: Key => Request[PostalCodesListResponse]): PostalCodesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PostalCodesResource]
  }
}

