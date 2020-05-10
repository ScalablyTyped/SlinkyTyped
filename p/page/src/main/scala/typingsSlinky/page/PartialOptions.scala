package typingsSlinky.page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<page.PageJS.Options> */
@js.native
trait PartialOptions extends js.Object {
  var click: js.UndefOr[Boolean] = js.native
  var decodeURLComponents: js.UndefOr[Boolean] = js.native
  var dispatch: js.UndefOr[Boolean] = js.native
  var hashbang: js.UndefOr[Boolean] = js.native
  var popstate: js.UndefOr[Boolean] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withDecodeURLComponents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeURLComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodeURLComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeURLComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.undefined)
        ret
    }
    @scala.inline
    def withHashbang(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashbang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashbang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashbang")(js.undefined)
        ret
    }
    @scala.inline
    def withPopstate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopstate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popstate")(js.undefined)
        ret
    }
  }
  
}

