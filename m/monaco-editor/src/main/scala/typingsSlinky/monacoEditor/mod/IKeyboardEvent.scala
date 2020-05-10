package typingsSlinky.monacoEditor.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.monacoEditor.monacoEditorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyboardEvent extends js.Object {
  val _standardKeyboardEventBrand: `true` = js.native
  val altKey: Boolean = js.native
  val browserEvent: KeyboardEvent = js.native
  val code: String = js.native
  val ctrlKey: Boolean = js.native
  val keyCode: KeyCode = js.native
  val metaKey: Boolean = js.native
  val shiftKey: Boolean = js.native
  val target: HTMLElement = js.native
  def equals(keybinding: Double): Boolean = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object IKeyboardEvent {
  @scala.inline
  def apply(
    _standardKeyboardEventBrand: `true`,
    altKey: Boolean,
    browserEvent: KeyboardEvent,
    code: String,
    ctrlKey: Boolean,
    equals: Double => Boolean,
    keyCode: KeyCode,
    metaKey: Boolean,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: HTMLElement
  ): IKeyboardEvent = {
    val __obj = js.Dynamic.literal(_standardKeyboardEventBrand = _standardKeyboardEventBrand.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], browserEvent = browserEvent.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyboardEvent]
  }
  @scala.inline
  implicit class IKeyboardEventOps[Self <: IKeyboardEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_standardKeyboardEventBrand(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_standardKeyboardEventBrand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowserEvent(value: KeyboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtrlKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquals(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyCode(value: KeyCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
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
  }
  
}

