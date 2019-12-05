package typingsSlinky.chromeDashApps.chrome.platformKeys

import org.scalajs.dom.crypto.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.platformKeys.subtleCrypto")
@js.native
object subtleCrypto extends js.Object {
  /**
    * An implementation of WebCrypto's SubtleCrypto
    * that allows crypto operations on keys of client
    * certificates that are available to this app.
    * @see[SubtleCrypto]{@link http://www.w3.org/TR/WebCryptoAPI/#subtlecrypto-interface}
    */
  def apply(): SubtleCrypto = js.native
}

