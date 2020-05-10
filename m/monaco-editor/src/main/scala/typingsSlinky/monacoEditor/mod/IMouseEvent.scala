package typingsSlinky.monacoEditor.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMouseEvent extends js.Object {
  val altKey: Boolean = js.native
  val browserEvent: MouseEvent = js.native
  val ctrlKey: Boolean = js.native
  val detail: Double = js.native
  val leftButton: Boolean = js.native
  val metaKey: Boolean = js.native
  val middleButton: Boolean = js.native
  val posx: Double = js.native
  val posy: Double = js.native
  val rightButton: Boolean = js.native
  val shiftKey: Boolean = js.native
  val target: HTMLElement = js.native
  val timestamp: Double = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object IMouseEvent {
  @scala.inline
  def apply(
    altKey: Boolean,
    browserEvent: MouseEvent,
    ctrlKey: Boolean,
    detail: Double,
    leftButton: Boolean,
    metaKey: Boolean,
    middleButton: Boolean,
    posx: Double,
    posy: Double,
    preventDefault: () => Unit,
    rightButton: Boolean,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: HTMLElement,
    timestamp: Double
  ): IMouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], browserEvent = browserEvent.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], leftButton = leftButton.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], middleButton = middleButton.asInstanceOf[js.Any], posx = posx.asInstanceOf[js.Any], posy = posy.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), rightButton = rightButton.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEvent]
  }
  @scala.inline
  implicit class IMouseEventOps[Self <: IMouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowserEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtrlKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddleButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRightButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShiftKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

