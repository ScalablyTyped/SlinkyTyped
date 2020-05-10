package typingsSlinky.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawKey extends js.Object {
  var alg: String = js.native
  // e and n make up the public key
  var e: String = js.native
  var kid: String = js.native
  var kty: String = js.native
  var n: String = js.native
  var use: KeyUse = js.native
}

object RawKey {
  @scala.inline
  def apply(alg: String, e: String, kid: String, kty: String, n: String, use: KeyUse): RawKey = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawKey]
  }
  @scala.inline
  implicit class RawKeyOps[Self <: RawKey] (val x: Self) extends AnyVal {
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
    def withE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kid")(value.asInstanceOf[js.Any])
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
    def withUse(value: KeyUse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

