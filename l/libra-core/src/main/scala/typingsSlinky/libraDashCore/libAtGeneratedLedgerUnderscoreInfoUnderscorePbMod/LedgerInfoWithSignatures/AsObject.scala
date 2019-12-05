package typingsSlinky.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfoWithSignatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ledgerInfo: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfo.AsObject
  ] = js.undefined
  var signaturesList: js.Array[
    typingsSlinky.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.ValidatorSignature.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    signaturesList: js.Array[
      typingsSlinky.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.ValidatorSignature.AsObject
    ],
    ledgerInfo: typingsSlinky.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfo.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(signaturesList = signaturesList.asInstanceOf[js.Any])
    if (ledgerInfo != null) __obj.updateDynamic("ledgerInfo")(ledgerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

