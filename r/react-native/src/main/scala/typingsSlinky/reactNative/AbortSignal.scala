package typingsSlinky.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortSignal extends js.Object {
  /**
    * Returns `true` if this `AbortSignal`'s `AbortController` has signaled to abort, and `false` otherwise.
    */
  val aborted: Boolean = js.native
  def onabort(event: AbortEvent): Unit = js.native
}

object AbortSignal {
  @scala.inline
  def apply(aborted: Boolean, onabort: AbortEvent => Unit): AbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort))
    __obj.asInstanceOf[AbortSignal]
  }
  @scala.inline
  implicit class AbortSignalOps[Self <: AbortSignal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAborted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aborted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnabort(value: AbortEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

