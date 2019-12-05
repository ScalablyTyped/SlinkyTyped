package typingsSlinky.atAwsDashCryptoIe11DashDetection.buildMsWindowMod

import typingsSlinky.atAwsDashCryptoIe11DashDetection.buildMsSubtleCryptoMod.MsSubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsCrypto extends js.Object {
  var subtle: MsSubtleCrypto
  def getRandomValues(toFill: scala.scalajs.js.typedarray.Uint8Array): Unit
}

object MsCrypto {
  @scala.inline
  def apply(getRandomValues: scala.scalajs.js.typedarray.Uint8Array => Unit, subtle: MsSubtleCrypto): MsCrypto = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), subtle = subtle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MsCrypto]
  }
}

