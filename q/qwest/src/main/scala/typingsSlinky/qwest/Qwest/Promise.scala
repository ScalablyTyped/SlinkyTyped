package typingsSlinky.qwest.Qwest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise extends js.Object {
  /** Request has failed */
  def `catch`(
    callback: js.Function3[/* e */ js.Any, /* xhr */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], _]
  ): Promise = js.native
  /** Always run */
  def complete(callback: js.Function0[_]): Promise = js.native
  /** Request is successful */
  def `then`(callback: js.Function2[/* xhr */ js.Any, /* response */ js.UndefOr[js.Any], _]): Promise = js.native
}

object Promise {
  @scala.inline
  def apply(
    `catch`: js.Function3[/* e */ js.Any, /* xhr */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], _] => Promise,
    complete: js.Function0[_] => Promise,
    `then`: js.Function2[/* xhr */ js.Any, /* response */ js.UndefOr[js.Any], _] => Promise
  ): Promise = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Promise]
  }
  @scala.inline
  implicit class PromiseOps[Self <: Promise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatch(
      value: js.Function3[/* e */ js.Any, /* xhr */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], _] => Promise
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComplete(value: js.Function0[_] => Promise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThen(value: js.Function2[/* xhr */ js.Any, /* response */ js.UndefOr[js.Any], _] => Promise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

