package typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.AccountState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var address: scala.scalajs.js.typedarray.Uint8Array | String
  var blob: scala.scalajs.js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    address: scala.scalajs.js.typedarray.Uint8Array | String,
    blob: scala.scalajs.js.typedarray.Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

