package typingsSlinky.rasha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jwk extends js.Object {
  var d: String = js.native
  var dp: String = js.native
  var dq: String = js.native
  var e: String = js.native
  var kty: String = js.native
  var n: String = js.native
  var p: String = js.native
  var q: String = js.native
  var qi: String = js.native
}

object Jwk {
  @scala.inline
  def apply(
    d: String,
    dp: String,
    dq: String,
    e: String,
    kty: String,
    n: String,
    p: String,
    q: String,
    qi: String
  ): Jwk = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], dp = dp.asInstanceOf[js.Any], dq = dq.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], qi = qi.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jwk]
  }
  @scala.inline
  implicit class JwkOps[Self <: Jwk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKty(value: String): Self = {
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
    def withP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qi")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

