package typingsSlinky.httpCacheSemantics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachePolicyObject extends js.Object {
  var a: Boolean = js.native
  var ch: Double = js.native
  var h: js.UndefOr[String] = js.native
  var imm: Double = js.native
  var m: String = js.native
  var reqcc: StringDictionary[String] = js.native
  var reqh: Headers | Null = js.native
  var rescc: StringDictionary[String] = js.native
  var resh: Headers = js.native
  var sh: Boolean = js.native
  var st: Double = js.native
  var t: Double = js.native
  var u: js.UndefOr[String] = js.native
  var v: Double = js.native
}

object CachePolicyObject {
  @scala.inline
  def apply(
    a: Boolean,
    ch: Double,
    imm: Double,
    m: String,
    reqcc: StringDictionary[String],
    rescc: StringDictionary[String],
    resh: Headers,
    sh: Boolean,
    st: Double,
    t: Double,
    v: Double
  ): CachePolicyObject = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], ch = ch.asInstanceOf[js.Any], imm = imm.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], reqcc = reqcc.asInstanceOf[js.Any], rescc = rescc.asInstanceOf[js.Any], resh = resh.asInstanceOf[js.Any], sh = sh.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicyObject]
  }
  @scala.inline
  implicit class CachePolicyObjectOps[Self <: CachePolicyObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReqcc(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRescc(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rescc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResh(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("st")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.undefined)
        ret
    }
    @scala.inline
    def withReqh(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReqhNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqh")(null)
        ret
    }
    @scala.inline
    def withU(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutU: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(js.undefined)
        ret
    }
  }
  
}

