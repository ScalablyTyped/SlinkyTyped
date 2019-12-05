package typingsSlinky.libraDashCore.libAtGeneratedValidatorUnderscoreChangeUnderscorePbMod.ValidatorChangeEventWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventWithProof: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventWithProof.AsObject
  ] = js.undefined
  var ledgerInfoWithSigs: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfoWithSignatures.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    eventWithProof: typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventWithProof.AsObject = null,
    ledgerInfoWithSigs: typingsSlinky.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfoWithSignatures.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (eventWithProof != null) __obj.updateDynamic("eventWithProof")(eventWithProof.asInstanceOf[js.Any])
    if (ledgerInfoWithSigs != null) __obj.updateDynamic("ledgerInfoWithSigs")(ledgerInfoWithSigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

