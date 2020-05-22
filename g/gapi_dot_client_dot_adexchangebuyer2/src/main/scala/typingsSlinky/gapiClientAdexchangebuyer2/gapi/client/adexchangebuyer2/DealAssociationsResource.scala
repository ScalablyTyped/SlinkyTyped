package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer2.anon.CreativeId
import typingsSlinky.gapiClientAdexchangebuyer2.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealAssociationsResource extends js.Object {
  /** Associate an existing deal with a creative. */
  def add(request: CreativeId): Request[js.Object]
  /** List all creative-deal associations. */
  def list(request: Key): Request[ListDealAssociationsResponse]
  /** Remove the association between a deal and a creative. */
  def remove(request: CreativeId): Request[js.Object]
}

object DealAssociationsResource {
  @scala.inline
  def apply(
    add: CreativeId => Request[js.Object],
    list: Key => Request[ListDealAssociationsResponse],
    remove: CreativeId => Request[js.Object]
  ): DealAssociationsResource = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[DealAssociationsResource]
  }
}

