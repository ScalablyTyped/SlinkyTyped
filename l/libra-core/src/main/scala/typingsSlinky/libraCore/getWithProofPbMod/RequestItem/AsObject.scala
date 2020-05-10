package typingsSlinky.libraCore.getWithProofPbMod.RequestItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var getAccountStateRequest: js.UndefOr[typingsSlinky.libraCore.getWithProofPbMod.GetAccountStateRequest.AsObject] = js.native
  var getAccountTransactionBySequenceNumberRequest: js.UndefOr[
    typingsSlinky.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberRequest.AsObject
  ] = js.native
  var getEventsByEventAccessPathRequest: js.UndefOr[
    typingsSlinky.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest.AsObject
  ] = js.native
  var getTransactionsRequest: js.UndefOr[typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsRequest.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAccountStateRequest(value: typingsSlinky.libraCore.getWithProofPbMod.GetAccountStateRequest.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountStateRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetAccountStateRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountStateRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAccountTransactionBySequenceNumberRequest(
      value: typingsSlinky.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberRequest.AsObject
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountTransactionBySequenceNumberRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetAccountTransactionBySequenceNumberRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountTransactionBySequenceNumberRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEventsByEventAccessPathRequest(value: typingsSlinky.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventsByEventAccessPathRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetEventsByEventAccessPathRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventsByEventAccessPathRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTransactionsRequest(value: typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsRequest.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransactionsRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetTransactionsRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransactionsRequest")(js.undefined)
        ret
    }
  }
  
}

