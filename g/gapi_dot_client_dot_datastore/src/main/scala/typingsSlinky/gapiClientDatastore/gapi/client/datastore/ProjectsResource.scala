package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDatastore.anon.Bearertoken
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
  def allocateIds(request: Bearertoken): Request[AllocateIdsResponse] = js.native
  /** Begins a new transaction. */
  def beginTransaction(request: Bearertoken): Request[BeginTransactionResponse] = js.native
  /**
    * Commits a transaction, optionally creating, deleting or modifying some
    * entities.
    */
  def commit(request: Bearertoken): Request[CommitResponse] = js.native
  /** Looks up entities by key. */
  def lookup(request: Bearertoken): Request[LookupResponse] = js.native
  /** Rolls back a transaction. */
  def rollback(request: Bearertoken): Request[js.Object] = js.native
  /** Queries for entities. */
  def runQuery(request: Bearertoken): Request[RunQueryResponse] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    allocateIds: Bearertoken => Request[AllocateIdsResponse],
    beginTransaction: Bearertoken => Request[BeginTransactionResponse],
    commit: Bearertoken => Request[CommitResponse],
    lookup: Bearertoken => Request[LookupResponse],
    operations: OperationsResource,
    rollback: Bearertoken => Request[js.Object],
    runQuery: Bearertoken => Request[RunQueryResponse]
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
    def withAllocateIds(value: Bearertoken => Request[AllocateIdsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocateIds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeginTransaction(value: Bearertoken => Request[BeginTransactionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginTransaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommit(value: Bearertoken => Request[CommitResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLookup(value: Bearertoken => Request[LookupResponse]): Self = {
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
    def withRollback(value: Bearertoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunQuery(value: Bearertoken => Request[RunQueryResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runQuery")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

