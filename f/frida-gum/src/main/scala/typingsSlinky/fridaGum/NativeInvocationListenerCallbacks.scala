package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeInvocationListenerCallbacks extends InvocationListenerCallbacks {
  /**
    * Called synchronously when a thread is about to enter the target function.
    *
    * Typically implemented using `CModule`.
    *
    * Signature: `void onEnter (GumInvocationContext * ic)`
    */
  var onEnter: js.UndefOr[NativePointer] = js.native
  /**
    * Called synchronously when a thread is about to leave the target function.
    *
    * Typically implemented using `CModule`.
    *
    * Signature: `void onLeave (GumInvocationContext * ic)`
    */
  var onLeave: js.UndefOr[NativePointer] = js.native
}

object NativeInvocationListenerCallbacks {
  @scala.inline
  def apply(): NativeInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeInvocationListenerCallbacks]
  }
  @scala.inline
  implicit class NativeInvocationListenerCallbacksOps[Self <: NativeInvocationListenerCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnEnter(value: NativePointer): Self = {
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
    def withOnLeave(value: NativePointer): Self = {
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

