package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extendables
@js.native
trait canBeEnabled extends js.Object {
  def enable(): Unit = js.native
  def isEnabled(): Boolean = js.native
  def isPaused(): Boolean = js.native
  def pause(): Unit = js.native
}

object canBeEnabled {
  @scala.inline
  def apply(enable: () => Unit, isEnabled: () => Boolean, isPaused: () => Boolean, pause: () => Unit): canBeEnabled = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled), isPaused = js.Any.fromFunction0(isPaused), pause = js.Any.fromFunction0(pause))
    __obj.asInstanceOf[canBeEnabled]
  }
  @scala.inline
  implicit class canBeEnabledOps[Self <: canBeEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPaused(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

