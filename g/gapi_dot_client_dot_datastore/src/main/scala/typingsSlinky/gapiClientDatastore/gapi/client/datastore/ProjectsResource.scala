package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDatastore.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var operations: OperationsResource = js.native
  /**
    * Allocates IDs for the given keys, which is useful for referencing an entity
    * before it is inserted.
    */
  def allocateIds(request: AnonBearertoken): Request_[AllocateIdsResponse] = js.native
  /** Begins a new transaction. */
  def beginTransaction(request: AnonBearertoken): Request_[BeginTransactionResponse] = js.native
  /**
    * Commits a transaction, optionally creating, deleting or modifying some
    * entities.
    */
  def commit(request: AnonBearertoken): Request_[CommitResponse] = js.native
  /** Looks up entities by key. */
  def lookup(request: AnonBearertoken): Request_[LookupResponse] = js.native
  /** Rolls back a transaction. */
  def rollback(request: AnonBearertoken): Request_[js.Object] = js.native
  /** Queries for entities. */
  def runQuery(request: AnonBearertoken): Request_[RunQueryResponse] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    allocateIds: AnonBearertoken => Request_[AllocateIdsResponse],
    beginTransaction: AnonBearertoken => Request_[BeginTransactionResponse],
    commit: AnonBearertoken => Request_[CommitResponse],
    lookup: AnonBearertoken => Request_[LookupResponse],
    operations: OperationsResource,
    rollback: AnonBearertoken => Request_[js.Object],
    runQuery: AnonBearertoken => Request_[RunQueryResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(allocateIds = js.Any.fromFunction1(allocateIds), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), lookup = js.Any.fromFunction1(lookup), operations = operations.asInstanceOf[js.Any], rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery))
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocateIds(value: AnonBearertoken => Request_[AllocateIdsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocateIds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeginTransaction(value: AnonBearertoken => Request_[BeginTransactionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginTransaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommit(value: AnonBearertoken => Request_[CommitResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLookup(value: AnonBearertoken => Request_[LookupResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOperations(value: OperationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollback(value: AnonBearertoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunQuery(value: AnonBearertoken => Request_[RunQueryResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runQuery")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

