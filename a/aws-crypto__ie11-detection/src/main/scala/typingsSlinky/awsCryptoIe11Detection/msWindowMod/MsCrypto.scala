package typingsSlinky.awsCryptoIe11Detection.msWindowMod

import typingsSlinky.awsCryptoIe11Detection.msSubtleCryptoMod.MsSubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsCrypto extends js.Object {
  var subtle: MsSubtleCrypto = js.native
  def getRandomValues(toFill: js.typedarray.Uint8Array): Unit = js.native
}

object MsCrypto {
  @scala.inline
  def apply(getRandomValues: js.typedarray.Uint8Array => Unit, subtle: MsSubtleCrypto): MsCrypto = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsCrypto]
  }
  @scala.inline
  implicit class MsCryptoOps[Self <: MsCrypto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRandomValues(value: js.typedarray.Uint8Array => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRandomValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubtle(value: MsSubtleCrypto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

