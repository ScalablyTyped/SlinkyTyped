package typingsSlinky.node.asyncHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookCallbacks extends js.Object {
  /**
    * Called immediately after the callback specified in before is completed.
    * @param asyncId the unique identifier assigned to the resource which has executed the callback.
    */
  var after: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.native
  /**
    * When an asynchronous operation is initiated or completes a callback is called to notify the user.
    * The before callback is called just before said callback is executed.
    * @param asyncId the unique identifier assigned to the resource about to execute the callback.
    */
  var before: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.native
  /**
    * Called after the resource corresponding to asyncId is destroyed
    * @param asyncId a unique ID for the async resource
    */
  var destroy: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.native
  /**
    * Called when a class is constructed that has the possibility to emit an asynchronous event.
    * @param asyncId a unique ID for the async resource
    * @param type the type of the async resource
    * @param triggerAsyncId the unique ID of the async resource in whose execution context this async resource was created
    * @param resource reference to the resource representing the async operation, needs to be released during destroy
    */
  var init: js.UndefOr[
    js.Function4[
      /* asyncId */ Double, 
      /* type */ String, 
      /* triggerAsyncId */ Double, 
      /* resource */ js.Object, 
      Unit
    ]
  ] = js.native
  /**
    * Called when a promise has resolve() called. This may not be in the same execution id
    * as the promise itself.
    * @param asyncId the unique id for the promise that was resolve()d.
    */
  var promiseResolve: js.UndefOr[js.Function1[/* asyncId */ Double, Unit]] = js.native
}

object HookCallbacks {
  @scala.inline
  def apply(): HookCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookCallbacks]
  }
  @scala.inline
  implicit class HookCallbacksOps[Self <: HookCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: /* asyncId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: /* asyncId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* asyncId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(
      value: (/* asyncId */ Double, /* type */ String, /* triggerAsyncId */ Double, /* resource */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseResolve(value: /* asyncId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseResolve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPromiseResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseResolve")(js.undefined)
        ret
    }
  }
  
}

