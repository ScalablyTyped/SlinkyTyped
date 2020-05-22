package typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var blob: js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(blob: js.typedarray.Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

