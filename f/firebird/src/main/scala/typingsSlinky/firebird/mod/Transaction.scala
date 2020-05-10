package typingsSlinky.firebird.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents SQL transaction.
  *
  * @desc
  * To get instance of this object call @see startNewTransactionSync or @see startNewTransaction methods of @see Connection object.
  * Transaction objects may be reused after commit or rollback.
  */
@js.native
trait Transaction extends js.Object {
  /*
    * A boolean readonly property indicating if this transaction is in started state.
    */
  var inTransaction: Boolean = js.native
  /**
    * Asynchronous commit transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def commit(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Synchronously commits this transaction.
    *
    * @desc
    * Notes:
    * Transacation is automatically started before any query in context of this object
    * if this object does not have active transaction (check inTransaction property).
    * You also should note that DDL statements (altering database structure) are commited automatically.
    */
  def commitSync(): Unit = js.native
  /**
    * Synchronously prepares SQL statement
    *
    * @param sql an SQL query to prepare.
    * @returns object in context of this transaction.
    */
  def prepareSync(sql: String): FBStatement = js.native
  /**
    * Asynchronously executes query in context of this transaction.
    *
    * @param sql an SQL query to execute.
    * @param callback err - is error object or null, res - FBResult object.
    */
  def query(sql: String, callback: js.Function2[/* err */ js.Error | Null, /* res */ FBResult, Unit]): Unit = js.native
  /**
    * Executes SQL query in context of this transaction. Returns FBResult object in case of success. Raises error otherwise.
    *
    * @param sql an SQL query to execute.
    */
  def querySync(sql: String): Unit = js.native
  /**
    * Asynchronously rollbacks transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def rollback(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Synchronously rollbacks transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    */
  def rollbackSync(): Unit = js.native
  /**
    * Asynchronously starts new transaction.
    *
    * @desc
    * Read notes in @see commitSync() .
    *
    * @param callback function(err), where err is error object in case of error.
    */
  def start(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Synchronously starts transaction.
    *
    * @desc
    * The transaction should be not in started state before call to this method.
    * Read notes in @see commitSync() .
    * See @see inTransaction property.
    */
  def startSync(): Unit = js.native
}

object Transaction {
  @scala.inline
  def apply(
    commit: js.Function1[/* err */ js.Error | Null, Unit] => Unit,
    commitSync: () => Unit,
    inTransaction: Boolean,
    prepareSync: String => FBStatement,
    query: (String, js.Function2[/* err */ js.Error | Null, /* res */ FBResult, Unit]) => Unit,
    querySync: String => Unit,
    rollback: js.Function1[/* err */ js.Error | Null, Unit] => Unit,
    rollbackSync: () => Unit,
    start: js.Function1[/* err */ js.Error | Null, Unit] => Unit,
    startSync: () => Unit
  ): Transaction = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction1(commit), commitSync = js.Any.fromFunction0(commitSync), inTransaction = inTransaction.asInstanceOf[js.Any], prepareSync = js.Any.fromFunction1(prepareSync), query = js.Any.fromFunction2(query), querySync = js.Any.fromFunction1(querySync), rollback = js.Any.fromFunction1(rollback), rollbackSync = js.Any.fromFunction0(rollbackSync), start = js.Any.fromFunction1(start), startSync = js.Any.fromFunction0(startSync))
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit(value: js.Function1[/* err */ js.Error | Null, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommitSync(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitSync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInTransaction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrepareSync(value: String => FBStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuery(value: (String, js.Function2[/* err */ js.Error | Null, /* res */ FBResult, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withQuerySync(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRollback(value: js.Function1[/* err */ js.Error | Null, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRollbackSync(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackSync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: js.Function1[/* err */ js.Error | Null, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartSync(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

