package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretBox extends js.Object {
  var cipher: scala.scalajs.js.typedarray.Uint8Array
  var mac: scala.scalajs.js.typedarray.Uint8Array
}

object SecretBox {
  @scala.inline
  def apply(cipher: scala.scalajs.js.typedarray.Uint8Array, mac: scala.scalajs.js.typedarray.Uint8Array): SecretBox = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecretBox]
  }
}

