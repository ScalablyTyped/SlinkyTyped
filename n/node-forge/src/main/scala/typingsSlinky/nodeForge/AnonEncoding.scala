package typingsSlinky.nodeForge

import typingsSlinky.nodeForge.mod.pki.ed25519.ToNativeBufferParameters
import typingsSlinky.nodeForge.nodeForgeStrings.binary
import typingsSlinky.nodeForge.nodeForgeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncoding extends ToNativeBufferParameters {
  var encoding: binary | utf8
  var message: String
}

object AnonEncoding {
  @scala.inline
  def apply(encoding: binary | utf8, message: String): AnonEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEncoding]
  }
}

