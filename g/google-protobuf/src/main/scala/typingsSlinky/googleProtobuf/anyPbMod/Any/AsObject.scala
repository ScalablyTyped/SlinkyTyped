package typingsSlinky.googleProtobuf.anyPbMod.Any

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var typeUrl: String
  var value: js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(typeUrl: String, value: js.typedarray.Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(typeUrl = typeUrl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

