package typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.ResponseItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var getAccountStateResponse: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountStateResponse.AsObject
  ] = js.undefined
  var getAccountTransactionBySequenceNumberResponse: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountTransactionBySequenceNumberResponse.AsObject
  ] = js.undefined
  var getEventsByEventAccessPathResponse: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetEventsByEventAccessPathResponse.AsObject
  ] = js.undefined
  var getTransactionsResponse: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetTransactionsResponse.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    getAccountStateResponse: typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountStateResponse.AsObject = null,
    getAccountTransactionBySequenceNumberResponse: typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountTransactionBySequenceNumberResponse.AsObject = null,
    getEventsByEventAccessPathResponse: typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetEventsByEventAccessPathResponse.AsObject = null,
    getTransactionsResponse: typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetTransactionsResponse.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (getAccountStateResponse != null) __obj.updateDynamic("getAccountStateResponse")(getAccountStateResponse.asInstanceOf[js.Any])
    if (getAccountTransactionBySequenceNumberResponse != null) __obj.updateDynamic("getAccountTransactionBySequenceNumberResponse")(getAccountTransactionBySequenceNumberResponse.asInstanceOf[js.Any])
    if (getEventsByEventAccessPathResponse != null) __obj.updateDynamic("getEventsByEventAccessPathResponse")(getEventsByEventAccessPathResponse.asInstanceOf[js.Any])
    if (getTransactionsResponse != null) __obj.updateDynamic("getTransactionsResponse")(getTransactionsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

