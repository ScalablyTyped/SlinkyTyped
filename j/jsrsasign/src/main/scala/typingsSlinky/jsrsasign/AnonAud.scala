package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAud extends js.Object {
  var alg: js.Array[String] = js.native
  var aud: js.Array[String] = js.native
  var iss: js.Array[String] = js.native
  var jti: js.UndefOr[String] = js.native
  var sub: js.Array[String] = js.native
  var verifyAt: js.UndefOr[String | Double] = js.native
}

object AnonAud {
  @scala.inline
  def apply(alg: js.Array[String], aud: js.Array[String], iss: js.Array[String], sub: js.Array[String]): AnonAud = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAud]
  }
  @scala.inline
  implicit class AnonAudOps[Self <: AnonAud] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAud(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIss(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJti(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jti")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyAt(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyAt")(js.undefined)
        ret
    }
  }
  
}

