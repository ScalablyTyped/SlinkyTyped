package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSpanner.AnonAccesstoken
import typingsSlinky.gapiClientSpanner.AnonCallback
import typingsSlinky.gapiClientSpanner.AnonDatabase
import typingsSlinky.gapiClientSpanner.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionsResource extends js.Object {
  /**
    * Begins a new transaction. This step can often be skipped:
    * Read, ExecuteSql and
    * Commit can begin a new transaction as a
    * side-effect.
    */
  def beginTransaction(request: AnonCallback): Request_[Transaction] = js.native
  /**
    * Commits a transaction. The request includes the mutations to be
    * applied to rows in the database.
    *
    * `Commit` might return an `ABORTED` error. This can occur at any time;
    * commonly, the cause is conflicts with concurrent
    * transactions. However, it can also happen for a variety of other
    * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt
    * the transaction from the beginning, re-using the same session.
    */
  def commit(request: AnonCallback): Request_[CommitResponse] = js.native
  /**
    * Creates a new session. A session can be used to perform
    * transactions that read and/or modify data in a Cloud Spanner database.
    * Sessions are meant to be reused for many consecutive
    * transactions.
    *
    * Sessions can only execute one transaction at a time. To execute
    * multiple concurrent read-write/write-only transactions, create
    * multiple sessions. Note that standalone reads and queries use a
    * transaction internally, and count toward the one transaction
    * limit.
    *
    * Cloud Spanner limits the number of sessions that can exist at any given
    * time; thus, it is a good idea to delete idle and/or unneeded sessions.
    * Aside from explicit deletes, Cloud Spanner can delete sessions for which no
    * operations are sent for more than an hour. If a session is deleted,
    * requests to it return `NOT_FOUND`.
    *
    * Idle sessions can be kept alive by sending a trivial SQL query
    * periodically, e.g., `"SELECT 1"`.
    */
  def create(request: AnonDatabase): Request_[Session] = js.native
  /** Ends a session, releasing server resources associated with it. */
  def delete(request: AnonAccesstoken): Request_[js.Object] = js.native
  /**
    * Executes an SQL query, returning all rows in a single reply. This
    * method cannot be used to return a result set larger than 10 MiB;
    * if the query yields more data than that, the query fails with
    * a `FAILED_PRECONDITION` error.
    *
    * Queries inside read-write transactions might return `ABORTED`. If
    * this occurs, the application should restart the transaction from
    * the beginning. See Transaction for more details.
    *
    * Larger result sets can be fetched in streaming fashion by calling
    * ExecuteStreamingSql instead.
    */
  def executeSql(request: AnonCallback): Request_[ResultSet] = js.native
  /**
    * Like ExecuteSql, except returns the result
    * set as a stream. Unlike ExecuteSql, there
    * is no limit on the size of the returned result set. However, no
    * individual row in the result set can exceed 100 MiB, and no
    * column value can exceed 10 MiB.
    */
  def executeStreamingSql(request: AnonCallback): Request_[PartialResultSet] = js.native
  /**
    * Gets a session. Returns `NOT_FOUND` if the session does not exist.
    * This is mainly useful for determining whether a session is still
    * alive.
    */
  def get(request: AnonAccesstoken): Request_[Session] = js.native
  /** Lists all sessions in a given database. */
  def list(request: AnonFields): Request_[ListSessionsResponse] = js.native
  /**
    * Reads rows from the database using key lookups and scans, as a
    * simple key/value style alternative to
    * ExecuteSql.  This method cannot be used to
    * return a result set larger than 10 MiB; if the read matches more
    * data than that, the read fails with a `FAILED_PRECONDITION`
    * error.
    *
    * Reads inside read-write transactions might return `ABORTED`. If
    * this occurs, the application should restart the transaction from
    * the beginning. See Transaction for more details.
    *
    * Larger result sets can be yielded in streaming fashion by calling
    * StreamingRead instead.
    */
  def read(request: AnonCallback): Request_[ResultSet] = js.native
  /**
    * Rolls back a transaction, releasing any locks it holds. It is a good
    * idea to call this for any transaction that includes one or more
    * Read or ExecuteSql requests and
    * ultimately decides not to commit.
    *
    * `Rollback` returns `OK` if it successfully aborts the transaction, the
    * transaction was already aborted, or the transaction is not
    * found. `Rollback` never returns `ABORTED`.
    */
  def rollback(request: AnonCallback): Request_[js.Object] = js.native
  /**
    * Like Read, except returns the result set as a
    * stream. Unlike Read, there is no limit on the
    * size of the returned result set. However, no individual row in
    * the result set can exceed 100 MiB, and no column value can exceed
    * 10 MiB.
    */
  def streamingRead(request: AnonCallback): Request_[PartialResultSet] = js.native
}

object SessionsResource {
  @scala.inline
  def apply(
    beginTransaction: AnonCallback => Request_[Transaction],
    commit: AnonCallback => Request_[CommitResponse],
    create: AnonDatabase => Request_[Session],
    delete: AnonAccesstoken => Request_[js.Object],
    executeSql: AnonCallback => Request_[ResultSet],
    executeStreamingSql: AnonCallback => Request_[PartialResultSet],
    get: AnonAccesstoken => Request_[Session],
    list: AnonFields => Request_[ListSessionsResponse],
    read: AnonCallback => Request_[ResultSet],
    rollback: AnonCallback => Request_[js.Object],
    streamingRead: AnonCallback => Request_[PartialResultSet]
  ): SessionsResource = {
    val __obj = js.Dynamic.literal(beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), executeSql = js.Any.fromFunction1(executeSql), executeStreamingSql = js.Any.fromFunction1(executeStreamingSql), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), read = js.Any.fromFunction1(read), rollback = js.Any.fromFunction1(rollback), streamingRead = js.Any.fromFunction1(streamingRead))
    __obj.asInstanceOf[SessionsResource]
  }
  @scala.inline
  implicit class SessionsResourceOps[Self <: SessionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginTransaction(value: AnonCallback => Request_[Transaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginTransaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommit(value: AnonCallback => Request_[CommitResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: AnonDatabase => Request_[Session]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExecuteSql(value: AnonCallback => Request_[ResultSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeSql")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExecuteStreamingSql(value: AnonCallback => Request_[PartialResultSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeStreamingSql")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[Session]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[ListSessionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(value: AnonCallback => Request_[ResultSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRollback(value: AnonCallback => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStreamingRead(value: AnonCallback => Request_[PartialResultSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingRead")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

