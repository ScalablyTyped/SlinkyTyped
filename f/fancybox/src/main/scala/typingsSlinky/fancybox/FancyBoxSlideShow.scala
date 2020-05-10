package typingsSlinky.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxSlideShow extends js.Object {
  @JSName("$button")
  var $button: js.UndefOr[JQuery] = js.native
  @JSName("$progress")
  var $progress: JQuery = js.native
  var instance: FancyBoxInstance = js.native
  var isActive: Boolean = js.native
  var timer: js.UndefOr[Double] = js.native
  def clear(): Unit = js.native
  def init(): Unit = js.native
  def set(force: Boolean): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def toggle(): Unit = js.native
}

object FancyBoxSlideShow {
  @scala.inline
  def apply(
    $progress: JQuery,
    clear: () => Unit,
    init: () => Unit,
    instance: FancyBoxInstance,
    isActive: Boolean,
    set: Boolean => Unit,
    start: () => Unit,
    stop: () => Unit,
    toggle: () => Unit
  ): FancyBoxSlideShow = {
    val __obj = js.Dynamic.literal($progress = $progress.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), init = js.Any.fromFunction0(init), instance = instance.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[FancyBoxSlideShow]
  }
  @scala.inline
  implicit class FancyBoxSlideShowOps[Self <: FancyBoxSlideShow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$progress(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstance(value: FancyBoxInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with$button(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$button: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$button")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(js.undefined)
        ret
    }
  }
  
}

