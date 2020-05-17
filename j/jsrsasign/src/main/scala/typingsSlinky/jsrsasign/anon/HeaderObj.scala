package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderObj extends js.Object {
  var headerObj: Typ = js.native
  var headerPP: Typ = js.native
  var sigHex: String = js.native
}

object HeaderObj {
  @scala.inline
  def apply(headerObj: Typ, headerPP: Typ, sigHex: String): HeaderObj = {
    val __obj = js.Dynamic.literal(headerObj = headerObj.asInstanceOf[js.Any], headerPP = headerPP.asInstanceOf[js.Any], sigHex = sigHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderObj]
  }
  @scala.inline
  implicit class HeaderObjOps[Self <: HeaderObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderObj(value: Typ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerObj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderPP(value: Typ): Self = {
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

