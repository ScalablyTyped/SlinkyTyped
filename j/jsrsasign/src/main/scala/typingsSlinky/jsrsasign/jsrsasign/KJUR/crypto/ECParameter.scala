package typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto

import typingsSlinky.jsrsasign.jsrsasign.BigInteger
import typingsSlinky.jsrsasign.jsrsasign.ECCurveFp
import typingsSlinky.jsrsasign.jsrsasign.ECPointFp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECParameter extends js.Object {
  var G: ECPointFp = js.native
  var curve: ECCurveFp = js.native
  var h: BigInteger = js.native
  var info: js.UndefOr[String] = js.native
  var keylen: Double = js.native
  var n: BigInteger = js.native
  var name: String = js.native
  var oid: js.UndefOr[String] = js.native
}

object ECParameter {
  @scala.inline
  def apply(G: ECPointFp, curve: ECCurveFp, h: BigInteger, keylen: Double, n: BigInteger, name: String): ECParameter = {
    val __obj = js.Dynamic.literal(G = G.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], keylen = keylen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECParameter]
  }
  @scala.inline
  implicit class ECParameterOps[Self <: ECParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withG(value: ECPointFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurve(value: ECCurveFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH(value: BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeylen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keylen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withOid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oid")(js.undefined)
        ret
    }
  }
  
}

