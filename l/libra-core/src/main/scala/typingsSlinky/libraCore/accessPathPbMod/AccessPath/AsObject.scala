package typingsSlinky.libraCore.accessPathPbMod.AccessPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var address: js.typedarray.Uint8Array | String
  var path: js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(address: js.typedarray.Uint8Array | String, path: js.typedarray.Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

