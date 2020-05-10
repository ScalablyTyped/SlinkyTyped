package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptInvocationListenerCallbacks extends InvocationListenerCallbacks {
  /**
    * Called synchronously when a thread is about to enter the target function.
    */
  var onEnter: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit]
  ] = js.native
  /**
    * Called synchronously when a thread is about to leave the target function.
    */
  var onLeave: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit]
  ] = js.native
}

object ScriptInvocationListenerCallbacks {
  @scala.inline
  def apply(): ScriptInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptInvocationListenerCallbacks]
  }
  @scala.inline
  implicit class ScriptInvocationListenerCallbacksOps[Self <: ScriptInvocationListenerCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnEnter(value: js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeave(value: js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.undefined)
        ret
    }
  }
  
}

