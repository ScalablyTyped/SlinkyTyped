package typingsSlinky.pathwatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathWatchErrorThrownEvent extends js.Object {
  /** The error object. */
  var error: js.Error = js.native
  /**
    *  Call this function to indicate you have handled the error.
    *  The error will not be thrown if this function is called.
    */
  def handle(): Unit = js.native
}

object PathWatchErrorThrownEvent {
  @scala.inline
  def apply(error: js.Error, handle: () => Unit): PathWatchErrorThrownEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], handle = js.Any.fromFunction0(handle))
    __obj.asInstanceOf[PathWatchErrorThrownEvent]
  }
  @scala.inline
  implicit class PathWatchErrorThrownEventOps[Self <: PathWatchErrorThrownEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

