package typingsSlinky.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchAction extends js.Object {
  def compute(): String = js.native
  def preventDefaults(input: HammerInput): Unit = js.native
  def preventSrc(srcEvent: js.Any): Unit = js.native
  def set(value: String): Unit = js.native
  def update(): Unit = js.native
}

object TouchAction {
  @scala.inline
  def apply(
    compute: () => String,
    preventDefaults: HammerInput => Unit,
    preventSrc: js.Any => Unit,
    set: String => Unit,
    update: () => Unit
  ): TouchAction = {
    val __obj = js.Dynamic.literal(compute = js.Any.fromFunction0(compute), preventDefaults = js.Any.fromFunction1(preventDefaults), preventSrc = js.Any.fromFunction1(preventSrc), set = js.Any.fromFunction1(set), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TouchAction]
  }
  @scala.inline
  implicit class TouchActionOps[Self <: TouchAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompute(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreventDefaults(value: HammerInput => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreventSrc(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSrc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

