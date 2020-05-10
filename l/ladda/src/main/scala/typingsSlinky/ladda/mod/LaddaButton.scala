package typingsSlinky.ladda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaddaButton extends js.Object {
  def isLoading(): Boolean = js.native
  def remove(): Unit = js.native
  def setProgress(progress: Double): Unit = js.native
  def start(): LaddaButton = js.native
  def startAfter(delay: Double): LaddaButton = js.native
  def stop(): LaddaButton = js.native
  def toggle(): LaddaButton = js.native
}

object LaddaButton {
  @scala.inline
  def apply(
    isLoading: () => Boolean,
    remove: () => Unit,
    setProgress: Double => Unit,
    start: () => LaddaButton,
    startAfter: Double => LaddaButton,
    stop: () => LaddaButton,
    toggle: () => LaddaButton
  ): LaddaButton = {
    val __obj = js.Dynamic.literal(isLoading = js.Any.fromFunction0(isLoading), remove = js.Any.fromFunction0(remove), setProgress = js.Any.fromFunction1(setProgress), start = js.Any.fromFunction0(start), startAfter = js.Any.fromFunction1(startAfter), stop = js.Any.fromFunction0(stop), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[LaddaButton]
  }
  @scala.inline
  implicit class LaddaButtonOps[Self <: LaddaButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLoading(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetProgress(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => LaddaButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartAfter(value: Double => LaddaButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: () => LaddaButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => LaddaButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

