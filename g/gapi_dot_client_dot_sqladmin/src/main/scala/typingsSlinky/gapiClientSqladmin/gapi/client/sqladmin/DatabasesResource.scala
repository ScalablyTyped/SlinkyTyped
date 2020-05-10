package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSqladmin.AnonDatabase
import typingsSlinky.gapiClientSqladmin.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabasesResource extends js.Object {
  /** Deletes a database from a Cloud SQL instance. */
  def delete(request: AnonDatabase): Request_[Operation] = js.native
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(request: AnonDatabase): Request_[Database] = js.native
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: AnonFields): Request_[Operation] = js.native
  /** Lists databases in the specified Cloud SQL instance. */
  def list(request: AnonFields): Request_[DatabasesListResponse] = js.native
  /** Updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: AnonDatabase): Request_[Operation] = js.native
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: AnonDatabase): Request_[Operation] = js.native
}

object DatabasesResource {
  @scala.inline
  def apply(
    delete: AnonDatabase => Request_[Operation],
    get: AnonDatabase => Request_[Database],
    insert: AnonFields => Request_[Operation],
    list: AnonFields => Request_[DatabasesListResponse],
    patch: AnonDatabase => Request_[Operation],
    update: AnonDatabase => Request_[Operation]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DatabasesResource]
  }
  @scala.inline
  implicit class DatabasesResourceOps[Self <: DatabasesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonDatabase => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonDatabase => Request_[Database]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[DatabasesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonDatabase => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonDatabase => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

