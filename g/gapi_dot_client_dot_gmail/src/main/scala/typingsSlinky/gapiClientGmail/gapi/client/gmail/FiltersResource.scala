package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGmail.anon.Alt
import typingsSlinky.gapiClientGmail.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Creates a filter. */
  def create(request: Alt): Request[Filter]
  /** Deletes a filter. */
  def delete(request: Fields): Request[Unit]
  /** Gets a filter. */
  def get(request: Fields): Request[Filter]
  /** Lists the message filters of a Gmail user. */
  def list(request: Alt): Request[ListFiltersResponse]
}

object FiltersResource {
  @scala.inline
  def apply(
    create: Alt => Request[Filter],
    delete: Fields => Request[Unit],
    get: Fields => Request[Filter],
    list: Alt => Request[ListFiltersResponse]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FiltersResource]
  }
}

