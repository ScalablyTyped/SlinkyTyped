package typingsSlinky.router5.routerMod

import typingsSlinky.router5.baseMod.NavigationOptions
import typingsSlinky.router5.baseMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onStop: js.UndefOr[js.Function0[Unit]] = js.native
  var onTransitionCancel: js.UndefOr[
    js.Function2[/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], Unit]
  ] = js.native
  var onTransitionError: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[State], 
      /* fromState */ js.UndefOr[State], 
      /* err */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var onTransitionStart: js.UndefOr[
    js.Function2[/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], Unit]
  ] = js.native
  var onTransitionSuccess: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[State], 
      /* fromState */ js.UndefOr[State], 
      /* opts */ js.UndefOr[NavigationOptions], 
      Unit
    ]
  ] = js.native
  var teardown: js.UndefOr[js.Function0[Unit]] = js.native
}

object Plugin {
  @scala.inline
  def apply(): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionCancel(value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionCancel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionError(
      value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], /* err */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionStart(value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionSuccess(
      value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], /* opts */ js.UndefOr[NavigationOptions]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionSuccess")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withTeardown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTeardown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardown")(js.undefined)
        ret
    }
  }
  
}

