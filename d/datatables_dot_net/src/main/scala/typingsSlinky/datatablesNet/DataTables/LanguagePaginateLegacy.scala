package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguagePaginateLegacy extends js.Object {
  var sFirst: js.UndefOr[String] = js.native
  var sLast: js.UndefOr[String] = js.native
  var sNext: js.UndefOr[String] = js.native
  var sPrevious: js.UndefOr[String] = js.native
}

object LanguagePaginateLegacy {
  @scala.inline
  def apply(): LanguagePaginateLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguagePaginateLegacy]
  }
  @scala.inline
  implicit class LanguagePaginateLegacyOps[Self <: LanguagePaginateLegacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withSLast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sLast")(js.undefined)
        ret
    }
    @scala.inline
    def withSNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sNext")(js.undefined)
        ret
    }
    @scala.inline
    def withSPrevious(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sPrevious")(js.undefined)
        ret
    }
  }
  
}

