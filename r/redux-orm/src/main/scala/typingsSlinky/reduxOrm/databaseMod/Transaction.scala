package typingsSlinky.reduxOrm.databaseMod

import typingsSlinky.reduxOrm.sessionMod.BatchToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var batchToken: BatchToken = js.native
  var withMutations: Boolean = js.native
}

object Transaction {
  @scala.inline
  def apply(batchToken: BatchToken, withMutations: Boolean): Transaction = {
    val __obj = js.Dynamic.literal(batchToken = batchToken.asInstanceOf[js.Any], withMutations = withMutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchToken(value: BatchToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithMutations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMutations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

