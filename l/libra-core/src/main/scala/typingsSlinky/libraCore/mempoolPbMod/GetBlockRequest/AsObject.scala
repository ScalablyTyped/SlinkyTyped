package typingsSlinky.libraCore.mempoolPbMod.GetBlockRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var maxBlockSize: String = js.native
  var transactionsList: js.Array[typingsSlinky.libraCore.mempoolPbMod.TransactionExclusion.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    maxBlockSize: String,
    transactionsList: js.Array[typingsSlinky.libraCore.mempoolPbMod.TransactionExclusion.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(maxBlockSize = maxBlockSize.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxBlockSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBlockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionsList(value: js.Array[typingsSlinky.libraCore.mempoolPbMod.TransactionExclusion.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionsList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

