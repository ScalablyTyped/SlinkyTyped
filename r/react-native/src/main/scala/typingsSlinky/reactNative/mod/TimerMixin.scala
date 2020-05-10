package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimerMixin extends js.Object {
  var cancelAnimationFrame: js.Function1[/* handle */ Double, Unit] = js.native
  var clearImmediate: js.Function1[/* handle */ Double, Unit] = js.native
  var clearInterval: js.Function1[/* handle */ Double, Unit] = js.native
  var clearTimeout: js.Function1[/* handle */ Double, Unit] = js.native
  var requestAnimationFrame: js.Function1[/* callback */ js.Function1[/* time */ Double, Unit], Double] = js.native
  var setImmediate: js.Function1[/* handler */ js.Function1[/* repeated */ js.Any, Unit], Double] = js.native
  var setInterval: FnCall = js.native
  var setTimeout: FnCall = js.native
}

object TimerMixin {
  @scala.inline
  def apply(
    cancelAnimationFrame: /* handle */ Double => Unit,
    clearImmediate: /* handle */ Double => Unit,
    clearInterval: /* handle */ Double => Unit,
    clearTimeout: /* handle */ Double => Unit,
    requestAnimationFrame: /* callback */ js.Function1[/* time */ Double, Unit] => Double,
    setImmediate: /* handler */ js.Function1[/* repeated */ js.Any, Unit] => Double,
    setInterval: FnCall,
    setTimeout: FnCall
  ): TimerMixin = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), clearImmediate = js.Any.fromFunction1(clearImmediate), clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame), setImmediate = js.Any.fromFunction1(setImmediate), setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerMixin]
  }
  @scala.inline
  implicit class TimerMixinOps[Self <: TimerMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelAnimationFrame(value: /* handle */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAnimationFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearImmediate(value: /* handle */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearImmediate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearInterval(value: /* handle */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInterval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearTimeout(value: /* handle */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestAnimationFrame(value: /* callback */ js.Function1[/* time */ Double, Unit] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImmediate(value: /* handler */ js.Function1[/* repeated */ js.Any, Unit] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetInterval(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetTimeout(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

