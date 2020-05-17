package typingsSlinky.forms.anon

import typingsSlinky.forms.mod.Form
import typingsSlinky.forms.mod.FormHandleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Empty extends js.Object {
  var empty: js.UndefOr[FormHandleCallback] = js.native
  var error: js.UndefOr[FormHandleCallback] = js.native
  var other: js.UndefOr[FormHandleCallback] = js.native
  var success: js.UndefOr[FormHandleCallback] = js.native
}

object Empty {
  @scala.inline
  def apply(): Empty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Empty]
  }
  @scala.inline
  implicit class EmptyOps[Self <: Empty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmpty(value: /* form */ Form => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* form */ Form => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withOther(value: /* form */ Form => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* form */ Form => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

