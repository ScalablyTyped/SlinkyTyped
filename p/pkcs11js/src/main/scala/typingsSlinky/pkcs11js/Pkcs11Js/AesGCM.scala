package typingsSlinky.pkcs11js.Pkcs11Js

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AesGCM extends IParams {
  var aad: js.UndefOr[Buffer] = js.native
  var iv: js.UndefOr[Buffer] = js.native
  var ivBits: Double = js.native
  var tagBits: Double = js.native
}

object AesGCM {
  @scala.inline
  def apply(ivBits: Double, tagBits: Double, `type`: Double): AesGCM = {
    val __obj = js.Dynamic.literal(ivBits = ivBits.asInstanceOf[js.Any], tagBits = tagBits.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGCM]
  }
  @scala.inline
  implicit class AesGCMOps[Self <: AesGCM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIvBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ivBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagBits")(value.asInstanceOf[js.Any])
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
    def withIv(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(js.undefined)
        ret
    }
  }
  
}

