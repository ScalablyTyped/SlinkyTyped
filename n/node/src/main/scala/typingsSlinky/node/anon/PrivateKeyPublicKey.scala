package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyPublicKey extends js.Object {
  var privateKey: String
  var publicKey: typingsSlinky.node.Buffer
}

object PrivateKeyPublicKey {
  @scala.inline
  def apply(privateKey: String, publicKey: typingsSlinky.node.Buffer): PrivateKeyPublicKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyPublicKey]
  }
}

