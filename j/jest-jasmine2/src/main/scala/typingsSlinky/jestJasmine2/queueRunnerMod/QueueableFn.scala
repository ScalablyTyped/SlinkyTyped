package typingsSlinky.jestJasmine2.queueRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueableFn extends js.Object {
  var initError: js.UndefOr[js.Error] = js.native
  var timeout: js.UndefOr[js.Function0[Double]] = js.native
  def fn(done: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

object QueueableFn {
  @scala.inline
  def apply(fn: js.Function1[/* error */ js.UndefOr[js.Any], Unit] => Unit): QueueableFn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn))
    __obj.asInstanceOf[QueueableFn]
  }
  @scala.inline
  implicit class QueueableFnOps[Self <: QueueableFn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFn(value: js.Function1[/* error */ js.UndefOr[js.Any], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initError")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

