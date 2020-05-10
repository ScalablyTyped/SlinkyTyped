package typingsSlinky.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderOptions extends js.Object {
  def isSliderEnabled(): Boolean = js.native
  def onEnd(): Unit = js.native
  def onMove(): Unit = js.native
  def onStart(): Unit = js.native
}

object SliderOptions {
  @scala.inline
  def apply(isSliderEnabled: () => Boolean, onEnd: () => Unit, onMove: () => Unit, onStart: () => Unit): SliderOptions = {
    val __obj = js.Dynamic.literal(isSliderEnabled = js.Any.fromFunction0(isSliderEnabled), onEnd = js.Any.fromFunction0(onEnd), onMove = js.Any.fromFunction0(onMove), onStart = js.Any.fromFunction0(onStart))
    __obj.asInstanceOf[SliderOptions]
  }
  @scala.inline
  implicit class SliderOptionsOps[Self <: SliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSliderEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSliderEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

