package typingsSlinky.awsCryptoSupportsWebCrypto

import org.scalajs.dom.crypto.SubtleCrypto
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/supports-web-crypto", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def supportsSecureRandom(window: Window_): Boolean = js.native
  def supportsSubtleCrypto(subtle: SubtleCrypto): Boolean = js.native
  def supportsWebCrypto(window: Window_): Boolean = js.native
  def supportsZeroByteGCM(subtle: SubtleCrypto): js.Promise[Boolean] = js.native
}

