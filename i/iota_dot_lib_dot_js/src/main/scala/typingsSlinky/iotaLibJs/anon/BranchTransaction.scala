package typingsSlinky.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchTransaction extends js.Object {
  var branchTransaction: String = js.native
  var duration: Double = js.native
  var trunkTransaction: String = js.native
}

object BranchTransaction {
  @scala.inline
  def apply(branchTransaction: String, duration: Double, trunkTransaction: String): BranchTransaction = {
    val __obj = js.Dynamic.literal(branchTransaction = branchTransaction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], trunkTransaction = trunkTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchTransaction]
  }
  @scala.inline
  implicit class BranchTransactionOps[Self <: BranchTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrunkTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trunkTransaction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

