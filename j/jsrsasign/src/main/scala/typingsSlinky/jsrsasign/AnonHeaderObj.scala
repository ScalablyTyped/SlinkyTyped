package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeaderObj extends js.Object {
  var headerObj: AnonTyp = js.native
  var headerPP: AnonTyp = js.native
  var sigHex: String = js.native
}

object AnonHeaderObj {
  @scala.inline
  def apply(headerObj: AnonTyp, headerPP: AnonTyp, sigHex: String): AnonHeaderObj = {
    val __obj = js.Dynamic.literal(headerObj = headerObj.asInstanceOf[js.Any], headerPP = headerPP.asInstanceOf[js.Any], sigHex = sigHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaderObj]
  }
  @scala.inline
  implicit class AnonHeaderObjOps[Self <: AnonHeaderObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderObj(value: AnonTyp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerObj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderPP(value: AnonTyp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigHex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

