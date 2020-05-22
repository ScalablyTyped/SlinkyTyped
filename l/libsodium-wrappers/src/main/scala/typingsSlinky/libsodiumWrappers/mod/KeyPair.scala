package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var keyType: KeyType
  var privateKey: js.typedarray.Uint8Array
  var publicKey: js.typedarray.Uint8Array
}

object KeyPair {
  @scala.inline
  def apply(keyType: KeyType, privateKey: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): KeyPair = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
}

