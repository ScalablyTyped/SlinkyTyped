package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserverHandle extends js.Object {
  /**
  	 * Removes the listener or observer.j
  	 */
  def cancel(): Unit = js.native
  /**
  	 * @returns true if the callback is not going to be called
  	 */
  def isSilenced(): Boolean = js.native
  /**
  	 * Resume calling the callback with changes or events.
  	 */
  def resume(): Unit = js.native
  /**
  	 * Stops further firings of the callback. Any related observers will still stay up-to-date, so the old value will be updated as the data changes.
  	 */
  def silence(): Unit = js.native
}

object ObserverHandle {
  @scala.inline
  def apply(cancel: () => Unit, isSilenced: () => Boolean, resume: () => Unit, silence: () => Unit): ObserverHandle = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), isSilenced = js.Any.fromFunction0(isSilenced), resume = js.Any.fromFunction0(resume), silence = js.Any.fromFunction0(silence))
    __obj.asInstanceOf[ObserverHandle]
  }
  @scala.inline
  implicit class ObserverHandleOps[Self <: ObserverHandle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSilenced(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSilenced")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSilence(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silence")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

