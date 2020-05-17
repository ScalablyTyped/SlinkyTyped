package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsValid extends js.Object {
  var isValid: Boolean = js.native
  var parse: CertsIdx = js.native
  var signerInfos: js.Array[_] = js.native
}

object IsValid {
  @scala.inline
  def apply(isValid: Boolean, parse: CertsIdx, signerInfos: js.Array[_]): IsValid = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsValid]
  }
  @scala.inline
  implicit class IsValidOps[Self <: IsValid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: CertsIdx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignerInfos(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerInfos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

