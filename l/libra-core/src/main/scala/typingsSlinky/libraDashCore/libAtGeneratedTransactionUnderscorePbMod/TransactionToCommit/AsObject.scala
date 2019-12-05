package typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionToCommit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accountStatesList: js.Array[
    typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.AccountState.AsObject
  ]
  var eventsList: js.Array[typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event.AsObject]
  var gasUsed: String
  var signedTxn: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    accountStatesList: js.Array[
      typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.AccountState.AsObject
    ],
    eventsList: js.Array[typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event.AsObject],
    gasUsed: String,
    signedTxn: typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(accountStatesList = accountStatesList.asInstanceOf[js.Any], eventsList = eventsList.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
    if (signedTxn != null) __obj.updateDynamic("signedTxn")(signedTxn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

