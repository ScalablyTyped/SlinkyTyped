package typingsSlinky.cancan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  var createError: js.UndefOr[js.Function0[_]] = js.native
  var instanceOf: js.UndefOr[js.Function2[/* instance */ js.Any, /* model */ js.Any, Boolean]] = js.native
}

object Option {
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateError(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreateError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createError")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceOf(value: (/* instance */ js.Any, /* model */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInstanceOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOf")(js.undefined)
        ret
    }
  }
  
}

