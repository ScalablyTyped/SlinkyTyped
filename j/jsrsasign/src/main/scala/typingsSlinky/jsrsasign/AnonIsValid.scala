package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsValid extends js.Object {
  var isValid: Boolean = js.native
  var parse: AnonCertsIdx = js.native
  var signerInfos: js.Array[_] = js.native
}

object AnonIsValid {
  @scala.inline
  def apply(isValid: Boolean, parse: AnonCertsIdx, signerInfos: js.Array[_]): AnonIsValid = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsValid]
  }
  @scala.inline
  implicit class AnonIsValidOps[Self <: AnonIsValid] (val x: Self) extends AnyVal {
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
    def withParse(value: AnonCertsIdx): Self = {
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

