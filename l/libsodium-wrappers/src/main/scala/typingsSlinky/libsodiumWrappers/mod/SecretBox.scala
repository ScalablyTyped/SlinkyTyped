package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretBox extends js.Object {
  var cipher: js.typedarray.Uint8Array
  var mac: js.typedarray.Uint8Array
}

object SecretBox {
  @scala.inline
  def apply(cipher: js.typedarray.Uint8Array, mac: js.typedarray.Uint8Array): SecretBox = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretBox]
  }
}

