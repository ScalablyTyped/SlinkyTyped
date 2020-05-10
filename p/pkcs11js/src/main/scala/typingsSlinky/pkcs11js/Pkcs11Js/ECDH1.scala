package typingsSlinky.pkcs11js.Pkcs11Js

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECDH1 extends IParams {
  var kdf: Double = js.native
  var publicData: Buffer = js.native
  var sharedData: js.UndefOr[Buffer] = js.native
}

object ECDH1 {
  @scala.inline
  def apply(kdf: Double, publicData: Buffer, `type`: Double): ECDH1 = {
    val __obj = js.Dynamic.literal(kdf = kdf.asInstanceOf[js.Any], publicData = publicData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECDH1]
  }
  @scala.inline
  implicit class ECDH1Ops[Self <: ECDH1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKdf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedData")(js.undefined)
        ret
    }
  }
  
}

