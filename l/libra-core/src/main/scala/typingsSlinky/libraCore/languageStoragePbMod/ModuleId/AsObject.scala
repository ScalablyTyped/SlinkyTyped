package typingsSlinky.libraCore.languageStoragePbMod.ModuleId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var address: js.typedarray.Uint8Array | String
  var name: String
}

object AsObject {
  @scala.inline
  def apply(address: js.typedarray.Uint8Array | String, name: String): AsObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

