package typingsSlinky.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyEventCallbacks[D, T, S] extends js.Object {
  /**
    * Gets notified right after the object has been deallocated.
    *
    * This is where you might clean up any associated state.
    */
  var dealloc: js.UndefOr[js.ThisFunction0[/* this */ UserMethodInvocation[D, T, S], Unit]] = js.native
  /**
    * Gets notified about the method name that we’re about to forward
    * a call to.
    *
    * This might be where you’d start out with a temporary callback
    * that just logs the names to help you decide which methods to
    * override.
    *
    * @param name Name of method that is about to get called.
    */
  var forward: js.UndefOr[
    js.ThisFunction1[/* this */ UserMethodInvocation[D, T, S], /* name */ String, Unit]
  ] = js.native
}

object ProxyEventCallbacks {
  @scala.inline
  def apply[D, T, S](): ProxyEventCallbacks[D, T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyEventCallbacks[D, T, S]]
  }
  @scala.inline
  implicit class ProxyEventCallbacksOps[Self[d, t, s] <: ProxyEventCallbacks[d, t, s], D, T, S] (val x: Self[D, T, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, T, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, T, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, T, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, T, S]) with Other]
    @scala.inline
    def withDealloc(value: js.ThisFunction0[/* this */ UserMethodInvocation[D, T, S], Unit]): Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealloc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealloc: Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealloc")(js.undefined)
        ret
    }
    @scala.inline
    def withForward(value: js.ThisFunction1[/* this */ UserMethodInvocation[D, T, S], /* name */ String, Unit]): Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward: Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(js.undefined)
        ret
    }
  }
  
}

