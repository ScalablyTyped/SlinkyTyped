package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cms.EncapsulatedContentInfo
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEciObj extends js.Object {
  var eciObj: EncapsulatedContentInfo = js.native
  var hashAlg: String = js.native
  var sdobj: SignedData = js.native
}

object AnonEciObj {
  @scala.inline
  def apply(eciObj: EncapsulatedContentInfo, hashAlg: String, sdobj: SignedData): AnonEciObj = {
    val __obj = js.Dynamic.literal(eciObj = eciObj.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sdobj = sdobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEciObj]
  }
  @scala.inline
  implicit class AnonEciObjOps[Self <: AnonEciObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEciObj(value: EncapsulatedContentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eciObj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSdobj(value: SignedData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdobj")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

