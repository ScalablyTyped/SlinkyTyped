package typingsSlinky.jqueryContextmenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hide extends js.Object {
  var hide: js.UndefOr[js.Function1[/* options */ js.Any, Boolean]] = js.native
  var show: js.UndefOr[js.Function1[/* options */ js.Any, Boolean]] = js.native
}

object Hide {
  @scala.inline
  def apply(): Hide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hide]
  }
  @scala.inline
  implicit class HideOps[Self <: Hide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: /* options */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: /* options */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

