package typingsSlinky.browserSync.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn extends js.Object {
  var fn: js.UndefOr[js.Function2[/* snippet */ String, /* match */ String, _]] = js.native
  var `match`: js.UndefOr[js.RegExp] = js.native
}

object Fn {
  @scala.inline
  def apply(): Fn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fn]
  }
  @scala.inline
  implicit class FnOps[Self <: Fn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFn(value: (/* snippet */ String, /* match */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
  }
  
}

