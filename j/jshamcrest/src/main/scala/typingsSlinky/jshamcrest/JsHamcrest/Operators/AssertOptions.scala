package typingsSlinky.jshamcrest.JsHamcrest.Operators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options accepted by assert().
  */
@js.native
trait AssertOptions extends js.Object {
  var fail: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.native
  var message: js.UndefOr[js.Any] = js.native
  var pass: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.native
}

object AssertOptions {
  @scala.inline
  def apply(): AssertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertOptions]
  }
  @scala.inline
  implicit class AssertOptionsOps[Self <: AssertOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFail(value: /* description */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withPass(value: /* description */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(js.undefined)
        ret
    }
  }
  
}

