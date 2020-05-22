package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import typingsSlinky.gapiClientDfareporting.anon.SearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldsResource extends js.Object {
  /** Deletes an existing creative field. */
  def delete(request: Fields): Request[Unit]
  /** Gets one creative field by ID. */
  def get(request: Fields): Request[CreativeField]
  /** Inserts a new creative field. */
  def insert(request: Key): Request[CreativeField]
  /** Retrieves a list of creative fields, possibly filtered. This method supports paging. */
  def list(request: SearchString): Request[CreativeFieldsListResponse]
  /** Updates an existing creative field. This method supports patch semantics. */
  def patch(request: Fields): Request[CreativeField]
  /** Updates an existing creative field. */
  def update(request: Key): Request[CreativeField]
}

object CreativeFieldsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[CreativeField],
    insert: Key => Request[CreativeField],
    list: SearchString => Request[CreativeFieldsListResponse],
    patch: Fields => Request[CreativeField],
    update: Key => Request[CreativeField]
  ): CreativeFieldsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeFieldsResource]
  }
}

