package typingsSlinky.libraCore.getWithProofPbMod.ResponseItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var getAccountStateResponse: js.UndefOr[typingsSlinky.libraCore.getWithProofPbMod.GetAccountStateResponse.AsObject] = js.native
  var getAccountTransactionBySequenceNumberResponse: js.UndefOr[
    typingsSlinky.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse.AsObject
  ] = js.native
  var getEventsByEventAccessPathResponse: js.UndefOr[
    typingsSlinky.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse.AsObject
  ] = js.native
  var getTransactionsResponse: js.UndefOr[typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsResponse.AsObject] = js.native
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
    def withGetAccountStateResponse(value: typingsSlinky.libraCore.getWithProofPbMod.GetAccountStateResponse.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountStateResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetAccountStateResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountStateResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAccountTransactionBySequenceNumberResponse(
      value: typingsSlinky.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse.AsObject
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountTransactionBySequenceNumberResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetAccountTransactionBySequenceNumberResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountTransactionBySequenceNumberResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEventsByEventAccessPathResponse(value: typingsSlinky.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventsByEventAccessPathResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetEventsByEventAccessPathResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventsByEventAccessPathResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTransactionsResponse(value: typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsResponse.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransactionsResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetTransactionsResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransactionsResponse")(js.undefined)
        ret
    }
  }
  
}

