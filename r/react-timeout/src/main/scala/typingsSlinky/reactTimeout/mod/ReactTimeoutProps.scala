package typingsSlinky.reactTimeout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTimeoutProps extends js.Object {
  var cancelAnimationFrame: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.native
  var clearImmediate: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.native
  var clearInterval: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.native
  var clearTimeout: js.UndefOr[js.Function1[/* timer */ Timer, Unit]] = js.native
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Id]] = js.native
  var setImmediate: js.UndefOr[
    js.Function2[/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any, Id]
  ] = js.native
  var setInterval: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* ms */ Double, 
      /* repeated */ js.Any, 
      Id
    ]
  ] = js.native
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* ms */ Double, 
      /* repeated */ js.Any, 
      Timer
    ]
  ] = js.native
}

object ReactTimeoutProps {
  @scala.inline
  def apply(): ReactTimeoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactTimeoutProps]
  }
  @scala.inline
  implicit class ReactTimeoutPropsOps[Self <: ReactTimeoutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelAnimationFrame(value: /* id */ Id => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAnimationFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancelAnimationFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAnimationFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withClearImmediate(value: /* id */ Id => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearImmediate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClearImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearImmediate")(js.undefined)
        ret
    }
    @scala.inline
    def withClearInterval(value: /* id */ Id => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInterval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClearInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withClearTimeout(value: /* timer */ Timer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClearTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestAnimationFrame(value: /* callback */ js.Function1[/* repeated */ js.Any, Unit] => Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestAnimationFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withSetImmediate(value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInterval(
      value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Id
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInterval")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTimeout(
      value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Timer
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.undefined)
        ret
    }
  }
  
}

