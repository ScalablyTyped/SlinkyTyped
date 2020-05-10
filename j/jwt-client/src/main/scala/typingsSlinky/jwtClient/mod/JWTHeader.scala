package typingsSlinky.jwtClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWTHeader extends js.Object {
  var alg: String = js.native
  var typ: String = js.native
}

object JWTHeader {
  @scala.inline
  def apply(alg: String, typ: String): JWTHeader = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], typ = typ.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTHeader]
  }
  @scala.inline
  implicit class JWTHeaderOps[Self <: JWTHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTyp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typ")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

