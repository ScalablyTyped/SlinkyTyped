package typingsSlinky.cryptojs.CryptoJS.mode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModeStatic extends js.Object {
  var CBC: typingsSlinky.cryptojs.CryptoJS.mode.CBC
  var CFB: typingsSlinky.cryptojs.CryptoJS.mode.CFB
  var CTR: typingsSlinky.cryptojs.CryptoJS.mode.CTR
  var CTRGladman: typingsSlinky.cryptojs.CryptoJS.mode.CTRGladman
  var ECB: typingsSlinky.cryptojs.CryptoJS.mode.ECB
  var OFB: typingsSlinky.cryptojs.CryptoJS.mode.OFB
}

object ModeStatic {
  @scala.inline
  def apply(CBC: CBC, CFB: CFB, CTR: CTR, CTRGladman: CTRGladman, ECB: ECB, OFB: OFB): ModeStatic = {
    val __obj = js.Dynamic.literal(CBC = CBC.asInstanceOf[js.Any], CFB = CFB.asInstanceOf[js.Any], CTR = CTR.asInstanceOf[js.Any], CTRGladman = CTRGladman.asInstanceOf[js.Any], ECB = ECB.asInstanceOf[js.Any], OFB = OFB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModeStatic]
  }
}

