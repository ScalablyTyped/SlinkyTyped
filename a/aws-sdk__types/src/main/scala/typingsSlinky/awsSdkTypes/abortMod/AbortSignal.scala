package typingsSlinky.awsSdkTypes.abortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortSignal extends js.Object {
  /**
    * Whether the action represented by this signal has been cancelled.
    */
  val aborted: Boolean = js.native
  /**
    * A function to be invoked when the action represented by this signal has
    * been cancelled.
    */
  var onabort: js.UndefOr[AbortHandler] = js.native
}

object AbortSignal {
  @scala.inline
  def apply(aborted: Boolean): AbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
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
    def withOnabort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnabort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.undefined)
        ret
    }
  }
  
}

