package typingsSlinky.libraCore.ledgerInfoPbMod.ValidatorSignature

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var signature: js.typedarray.Uint8Array | String
  var validatorId: js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(signature: js.typedarray.Uint8Array | String, validatorId: js.typedarray.Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], validatorId = validatorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

