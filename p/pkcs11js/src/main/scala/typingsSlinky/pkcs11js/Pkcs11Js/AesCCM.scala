package typingsSlinky.pkcs11js.Pkcs11Js

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AesCCM extends IParams {
  var aad: js.UndefOr[Buffer] = js.native
  var dataLen: Double = js.native
  var macLen: Double = js.native
  var nonce: js.UndefOr[Buffer] = js.native
}

object AesCCM {
  @scala.inline
  def apply(dataLen: Double, macLen: Double, `type`: Double): AesCCM = {
    val __obj = js.Dynamic.literal(dataLen = dataLen.asInstanceOf[js.Any], macLen = macLen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCCM]
  }
  @scala.inline
  implicit class AesCCMOps[Self <: AesCCM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMacLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAad(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aad")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
  }
  
}

