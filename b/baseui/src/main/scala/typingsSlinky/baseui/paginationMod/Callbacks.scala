package typingsSlinky.baseui.paginationMod

import typingsSlinky.baseui.anon.EventAny
import typingsSlinky.baseui.anon.NextPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callbacks extends js.Object {
  var onNextClick: js.UndefOr[js.Function1[/* args */ EventAny, _]] = js.native
  var onPageChange: js.UndefOr[js.Function1[/* args */ NextPage, _]] = js.native
  var onPrevClick: js.UndefOr[js.Function1[/* args */ EventAny, _]] = js.native
}

object Callbacks {
  @scala.inline
  def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  @scala.inline
  implicit class CallbacksOps[Self <: Callbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnNextClick(value: /* args */ EventAny => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNextClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageChange(value: /* args */ NextPage => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrevClick(value: /* args */ EventAny => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPrevClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevClick")(js.undefined)
        ret
    }
  }
  
}

