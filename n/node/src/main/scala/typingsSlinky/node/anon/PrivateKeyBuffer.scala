package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyBuffer extends js.Object {
  var privateKey: typingsSlinky.node.Buffer
  var publicKey: typingsSlinky.node.Buffer
}

object PrivateKeyBuffer {
  @scala.inline
  def apply(privateKey: typingsSlinky.node.Buffer, publicKey: typingsSlinky.node.Buffer): PrivateKeyBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyBuffer]
  }
}

