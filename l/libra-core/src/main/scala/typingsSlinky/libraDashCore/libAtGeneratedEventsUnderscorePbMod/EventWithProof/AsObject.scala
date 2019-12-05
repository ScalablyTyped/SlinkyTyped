package typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var event: js.UndefOr[typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event.AsObject] = js.undefined
  var eventIndex: String
  var proof: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.EventProof.AsObject
  ] = js.undefined
  var transactionVersion: String
}

object AsObject {
  @scala.inline
  def apply(
    eventIndex: String,
    transactionVersion: String,
    event: typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event.AsObject = null,
    proof: typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.EventProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventIndex = eventIndex.asInstanceOf[js.Any], transactionVersion = transactionVersion.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (proof != null) __obj.updateDynamic("proof")(proof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

