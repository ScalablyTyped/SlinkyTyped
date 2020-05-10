package typingsSlinky.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongDateFormatSpec extends js.Object {
  var L: String = js.native
  var LL: String = js.native
  var LLL: String = js.native
  var LLLL: String = js.native
  var LT: String = js.native
  var LTS: String = js.native
  var l: js.UndefOr[String] = js.native
  var ll: js.UndefOr[String] = js.native
  var lll: js.UndefOr[String] = js.native
  var llll: js.UndefOr[String] = js.native
  var lt: js.UndefOr[String] = js.native
  // lets forget for a sec that any upper/lower permutation will also work
  var lts: js.UndefOr[String] = js.native
}

object LongDateFormatSpec {
  @scala.inline
  def apply(L: String, LL: String, LLL: String, LLLL: String, LT: String, LTS: String): LongDateFormatSpec = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], LL = LL.asInstanceOf[js.Any], LLL = LLL.asInstanceOf[js.Any], LLLL = LLLL.asInstanceOf[js.Any], LT = LT.asInstanceOf[js.Any], LTS = LTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongDateFormatSpec]
  }
  @scala.inline
  implicit class LongDateFormatSpecOps[Self <: LongDateFormatSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLLL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LLL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLLLL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LLLL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLTS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(js.undefined)
        ret
    }
    @scala.inline
    def withoutLl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ll")(js.undefined)
        ret
    }
    @scala.inline
    def withoutLll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lll")(js.undefined)
        ret
    }
    @scala.inline
    def withoutLlll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("llll")(js.undefined)
        ret
    }
    @scala.inline
    def withoutLt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.undefined)
        ret
    }
    @scala.inline
    def withoutLts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lts")(js.undefined)
        ret
    }
  }
  
}

