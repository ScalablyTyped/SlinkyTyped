package typingsSlinky.ivViewer.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slider extends js.Object {
  var container: Element | Null = js.native
  def destroy(): Unit = js.native
  def endHandler(): Unit = js.native
  def init(): Unit = js.native
  def isSliderEnabled(): Boolean = js.native
  def moveHandler(event: Event_): Unit = js.native
  def onEnd(): Unit = js.native
  def onMove(): Unit = js.native
  def onStart(): Unit = js.native
  def removeListeners(): Unit = js.native
  def startHandler(event: Event_): Unit = js.native
}

object Slider {
  @scala.inline
  def apply(
    destroy: () => Unit,
    endHandler: () => Unit,
    init: () => Unit,
    isSliderEnabled: () => Boolean,
    moveHandler: Event_ => Unit,
    onEnd: () => Unit,
    onMove: () => Unit,
    onStart: () => Unit,
    removeListeners: () => Unit,
    startHandler: Event_ => Unit
  ): Slider = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), endHandler = js.Any.fromFunction0(endHandler), init = js.Any.fromFunction0(init), isSliderEnabled = js.Any.fromFunction0(isSliderEnabled), moveHandler = js.Any.fromFunction1(moveHandler), onEnd = js.Any.fromFunction0(onEnd), onMove = js.Any.fromFunction0(onMove), onStart = js.Any.fromFunction0(onStart), removeListeners = js.Any.fromFunction0(removeListeners), startHandler = js.Any.fromFunction1(startHandler))
    __obj.asInstanceOf[Slider]
  }
  @scala.inline
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
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
    def withEndHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSliderEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSliderEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveHandler(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveHandler")(js.Any.fromFunction1(value))
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
    @scala.inline
    def withRemoveListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartHandler(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
  }
  
}

