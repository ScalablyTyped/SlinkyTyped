package typingsSlinky.preact.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Preact options
// -----------------------------------
/**
	 * Global options for preact
	 */
@js.native
trait Options_ extends js.Object {
  var __suspenseDidResolve: js.UndefOr[js.Function2[/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit], Unit]] = js.native
  var debounceRendering: js.UndefOr[js.Function1[/* cb */ js.Function0[Unit], Unit]] = js.native
  /** Attach a hook that is invoked after a vnode has rendered. */
  var diffed: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.native
  var event: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ FrameRequestCallback, Double]] = js.native
  /** Attach a hook that is invoked immediately before a vnode is unmounted. */
  var unmount: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.native
  var useDebugValue: js.UndefOr[js.Function1[/* value */ String | Double, Unit]] = js.native
  /** Attach a hook that is invoked whenever a VNode is created. */
  var vnode: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.native
}

object Options_ {
  @scala.inline
  def apply(): Options_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_]
  }
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__suspenseDidResolve(value: (/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__suspenseDidResolve")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def without__suspenseDidResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__suspenseDidResolve")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounceRendering(value: /* cb */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDebounceRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffed(value: /* vnode */ VNode[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDiffed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffed")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: /* e */ Event => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestAnimationFrame(value: /* callback */ FrameRequestCallback => Double): Self = {
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
    def withUnmount(value: /* vnode */ VNode[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDebugValue(value: /* value */ String | Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDebugValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUseDebugValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDebugValue")(js.undefined)
        ret
    }
    @scala.inline
    def withVnode(value: /* vnode */ VNode[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vnode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVnode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vnode")(js.undefined)
        ret
    }
  }
  
}

