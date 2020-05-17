package typingsSlinky.jose.mod

import typingsSlinky.jose.joseStrings.RSA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWKRSAKey
  extends ProduceKeyInput
     with KeyParameters
     with JSONWebKey {
  var d: js.UndefOr[String] = js.native
  var dp: js.UndefOr[String] = js.native
  var dq: js.UndefOr[String] = js.native
  var e: String = js.native
  var kty: RSA = js.native
  var n: String = js.native
  var p: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var qi: js.UndefOr[String] = js.native
}

object JWKRSAKey {
  @scala.inline
  def apply(e: String, kty: RSA, n: String): JWKRSAKey = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKRSAKey]
  }
  @scala.inline
  implicit class JWKRSAKeyOps[Self <: JWKRSAKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKty(value: RSA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
    @scala.inline
    def withDp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp")(js.undefined)
        ret
    }
    @scala.inline
    def withDq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dq")(js.undefined)
        ret
    }
    @scala.inline
    def withP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
        ret
    }
    @scala.inline
    def withQi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qi")(js.undefined)
        ret
    }
  }
  
}

