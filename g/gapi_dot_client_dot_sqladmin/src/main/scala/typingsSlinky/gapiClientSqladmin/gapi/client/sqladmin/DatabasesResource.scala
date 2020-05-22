package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientSqladmin.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasesResource extends js.Object {
  /** Deletes a database from a Cloud SQL instance. */
  def delete(request: typingsSlinky.gapiClientSqladmin.anon.Database): Request[Operation]
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(request: typingsSlinky.gapiClientSqladmin.anon.Database): Request[Database]
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: Fields): Request[Operation]
  /** Lists databases in the specified Cloud SQL instance. */
  def list(request: Fields): Request[DatabasesListResponse]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: typingsSlinky.gapiClientSqladmin.anon.Database): Request[Operation]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: typingsSlinky.gapiClientSqladmin.anon.Database): Request[Operation]
}

object DatabasesResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientSqladmin.anon.Database => Request[Operation],
    get: typingsSlinky.gapiClientSqladmin.anon.Database => Request[Database],
    insert: Fields => Request[Operation],
    list: Fields => Request[DatabasesListResponse],
    patch: typingsSlinky.gapiClientSqladmin.anon.Database => Request[Operation],
    update: typingsSlinky.gapiClientSqladmin.anon.Database => Request[Operation]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DatabasesResource]
  }
}

