package typingsSlinky.neo4j.mod

import typingsSlinky.request.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
  def commit(callback: DoneCallback): Unit = js.native
  
  def cypher(options: CypherOptions, callback: ResultCallback): Request = js.native
  
  var expiresAt: js.Date = js.native
  
  var expiresIn: js.Date | Double = js.native
  
  def renew(callback: DoneCallback): Unit = js.native
  
  def rollback(callback: DoneCallback): Unit = js.native
  
  var state: String = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommit(value: DoneCallback => Unit): Self = this.set("commit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCypher(value: (CypherOptions, ResultCallback) => Request): Self = this.set("cypher", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpiresAt(value: js.Date): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInDate(value: js.Date): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: js.Date | Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenew(value: DoneCallback => Unit): Self = this.set("renew", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRollback(value: DoneCallback => Unit): Self = this.set("rollback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
