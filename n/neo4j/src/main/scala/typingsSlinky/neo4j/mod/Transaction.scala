package typingsSlinky.neo4j.mod

import typingsSlinky.request.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var expiresAt: js.Date = js.native
  var expiresIn: js.Date | Double = js.native
  var state: String = js.native
  def commit(callback: DoneCallback): Unit = js.native
  def cypher(options: CypherOptions, callback: ResultCallback): Request = js.native
  def renew(callback: DoneCallback): Unit = js.native
  def rollback(callback: DoneCallback): Unit = js.native
}

object Transaction {
  @scala.inline
  def apply(
    commit: DoneCallback => Unit,
    cypher: (CypherOptions, ResultCallback) => Request,
    expiresAt: js.Date,
    expiresIn: js.Date | Double,
    renew: DoneCallback => Unit,
    rollback: DoneCallback => Unit,
    state: String
  ): Transaction = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction1(commit), cypher = js.Any.fromFunction2(cypher), expiresAt = expiresAt.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], renew = js.Any.fromFunction1(renew), rollback = js.Any.fromFunction1(rollback), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit(value: DoneCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCypher(value: (CypherOptions, ResultCallback) => Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cypher")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExpiresAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiresInDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiresIn(value: js.Date | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenew(value: DoneCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renew")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRollback(value: DoneCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

