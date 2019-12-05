package typingsSlinky.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.ValidatorSignature

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var signature: scala.scalajs.js.typedarray.Uint8Array | String
  var validatorId: scala.scalajs.js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    signature: scala.scalajs.js.typedarray.Uint8Array | String,
    validatorId: scala.scalajs.js.typedarray.Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], validatorId = validatorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

