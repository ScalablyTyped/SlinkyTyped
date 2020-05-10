package typingsSlinky.dayjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  LT  :string,   LTS  :string,   L  :string,   LL  :string,   LLL  :string,   LLLL  :string}> */
@js.native
trait PartialLTstringLTSstringL extends js.Object {
  var L: js.UndefOr[String] = js.native
  var LL: js.UndefOr[String] = js.native
  var LLL: js.UndefOr[String] = js.native
  var LLLL: js.UndefOr[String] = js.native
  var LT: js.UndefOr[String] = js.native
  var LTS: js.UndefOr[String] = js.native
}

object PartialLTstringLTSstringL {
  @scala.inline
  def apply(): PartialLTstringLTSstringL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLTstringLTSstringL]
  }
  @scala.inline
  implicit class PartialLTstringLTSstringLOps[Self <: PartialLTstringLTSstringL] (val x: Self) extends AnyVal {
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
    def withoutL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(js.undefined)
        ret
    }
    @scala.inline
    def withLL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LL")(js.undefined)
        ret
    }
    @scala.inline
    def withLLL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LLL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLLL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LLL")(js.undefined)
        ret
    }
    @scala.inline
    def withLLLL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LLLL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLLLL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LLLL")(js.undefined)
        ret
    }
    @scala.inline
    def withLT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LT")(js.undefined)
        ret
    }
    @scala.inline
    def withLTS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLTS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LTS")(js.undefined)
        ret
    }
  }
  
}

