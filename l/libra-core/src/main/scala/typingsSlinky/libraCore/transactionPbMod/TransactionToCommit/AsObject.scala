package typingsSlinky.libraCore.transactionPbMod.TransactionToCommit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var accountStatesList: js.Array[typingsSlinky.libraCore.transactionPbMod.AccountState.AsObject] = js.native
  var eventsList: js.Array[typingsSlinky.libraCore.eventsPbMod.Event.AsObject] = js.native
  var gasUsed: String = js.native
  var signedTxn: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    accountStatesList: js.Array[typingsSlinky.libraCore.transactionPbMod.AccountState.AsObject],
    eventsList: js.Array[typingsSlinky.libraCore.eventsPbMod.Event.AsObject],
    gasUsed: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(accountStatesList = accountStatesList.asInstanceOf[js.Any], eventsList = eventsList.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountStatesList(value: js.Array[typingsSlinky.libraCore.transactionPbMod.AccountState.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountStatesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsList(value: js.Array[typingsSlinky.libraCore.eventsPbMod.Event.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGasUsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedTxn(value: typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedTxn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedTxn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedTxn")(js.undefined)
        ret
    }
  }
  
}

