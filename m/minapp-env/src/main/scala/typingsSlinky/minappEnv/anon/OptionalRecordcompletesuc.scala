package typingsSlinky.minappEnv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.Optional<minapp-env.Record<'complete' | 'success' | 'fail', (args : ...any): any>> */
@js.native
trait OptionalRecordcompletesuc extends js.Object {
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var fail: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object OptionalRecordcompletesuc {
  @scala.inline
  def apply(): OptionalRecordcompletesuc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalRecordcompletesuc]
  }
  @scala.inline
  implicit class OptionalRecordcompletesucOps[Self <: OptionalRecordcompletesuc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* repeated */ js.Any => _): Self = {
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
    def withSuccess(value: /* repeated */ js.Any => _): Self = {
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

