package typingsSlinky.awsSdkTypes.abortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortController extends js.Object {
  /**
    * An object that reports whether the action associated with this
    * {AbortController} has been cancelled.
    */
  val signal: AbortSignal = js.native
  /**
    * Declares the operation associated with this AbortController to have been
    * cancelled.
    */
  def abort(): Unit = js.native
}

object AbortController {
  @scala.inline
  def apply(abort: () => Unit, signal: AbortSignal): AbortController = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortController]
  }
  @scala.inline
  implicit class AbortControllerOps[Self <: AbortController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

