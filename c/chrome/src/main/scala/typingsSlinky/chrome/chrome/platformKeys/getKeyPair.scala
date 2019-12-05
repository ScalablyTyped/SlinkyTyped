package typingsSlinky.chrome.chrome.platformKeys

import org.scalajs.dom.crypto.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.platformKeys.getKeyPair")
@js.native
object getKeyPair extends js.Object {
  def apply(
    certificate: scala.scalajs.js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = js.native
}

