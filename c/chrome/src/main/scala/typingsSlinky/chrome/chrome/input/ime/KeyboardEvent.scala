package typingsSlinky.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardEvent extends js.Object {
  /**
    * Optional.
    * Whether or not the ALT key is pressed.
    */
  var altKey: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Whether or not the CAPS_LOCK is enabled.
    * @since Chrome 29.
    */
  var capsLock: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Value of the physical key being pressed. The value is not affected by current keyboard layout or modifier state.
    * @since Chrome 26.
    */
  var code: String = js.native
  /**
    * Optional.
    * Whether or not the CTRL key is pressed.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * The extension ID of the sender of this keyevent.
    * @since Chrome 34.
    */
  var extensionId: js.UndefOr[String] = js.native
  /** Value of the key being pressed */
  var key: String = js.native
  /**
    * Optional.
    * The deprecated HTML keyCode, which is system- and implementation-dependent numerical code signifying the unmodified identifier associated with the key pressed.
    * @since Chrome 37.
    */
  var keyCode: js.UndefOr[Double] = js.native
  /** The ID of the request. */
  var requestId: String = js.native
  /**
    * Optional.
    * Whether or not the SHIFT key is pressed.
    */
  var shiftKey: js.UndefOr[Boolean] = js.native
  /** One of keyup or keydown. */
  var `type`: String = js.native
}

object KeyboardEvent {
  @scala.inline
  def apply(code: String, key: String, requestId: String, `type`: String): KeyboardEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  @scala.inline
  implicit class KeyboardEventOps[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCapsLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capsLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapsLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capsLock")(js.undefined)
        ret
    }
    @scala.inline
    def withCtrlKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftKey")(js.undefined)
        ret
    }
  }
  
}

