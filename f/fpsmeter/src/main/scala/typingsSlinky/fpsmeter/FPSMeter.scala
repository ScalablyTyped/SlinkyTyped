package typingsSlinky.fpsmeter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FPSMeter extends js.Object {
  var options: FPSMeterOptions = js.native
  def destroy(): Unit = js.native
  def hide(): FPSMeter = js.native
  def pause(): FPSMeter = js.native
  def resume(): FPSMeter = js.native
  def set(name: String, value: js.Any): FPSMeter = js.native
  def show(): FPSMeter = js.native
  def showDuration(): FPSMeter = js.native
  def showFps(): FPSMeter = js.native
  def tick(): Unit = js.native
  def tickStart(): Unit = js.native
  def toggle(): FPSMeter = js.native
}

object FPSMeter {
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => FPSMeter,
    options: FPSMeterOptions,
    pause: () => FPSMeter,
    resume: () => FPSMeter,
    set: (String, js.Any) => FPSMeter,
    show: () => FPSMeter,
    showDuration: () => FPSMeter,
    showFps: () => FPSMeter,
    tick: () => Unit,
    tickStart: () => Unit,
    toggle: () => FPSMeter
  ): FPSMeter = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), options = options.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), set = js.Any.fromFunction2(set), show = js.Any.fromFunction0(show), showDuration = js.Any.fromFunction0(showDuration), showFps = js.Any.fromFunction0(showFps), tick = js.Any.fromFunction0(tick), tickStart = js.Any.fromFunction0(tickStart), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[FPSMeter]
  }
  @scala.inline
  implicit class FPSMeterOps[Self <: FPSMeter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => FPSMeter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: FPSMeterOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: () => FPSMeter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResume(value: () => FPSMeter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, js.Any) => FPSMeter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShow(value: () => FPSMeter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowDuration(value: () => FPSMeter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowFps(value: () => FPSMeter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTickStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => FPSMeter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

