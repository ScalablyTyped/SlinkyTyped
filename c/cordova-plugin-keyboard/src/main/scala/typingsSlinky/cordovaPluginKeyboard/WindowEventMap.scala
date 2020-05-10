package typingsSlinky.cordovaPluginKeyboard

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEventMap extends js.Object {
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardDidHide: Event_ = js.native
  /**
    * This event is fired when keyboard fully shown.
    */
  var keyboardDidShow: Event_ = js.native
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardHeightWillChange: CordovaKeyboardEvent = js.native
  /**
    * This event is fired when the keyboard is fully closed.
    */
  var keyboardWillHide: Event_ = js.native
  /**
    * This event fires before keyboard will be shown.
    */
  var keyboardWillShow: Event_ = js.native
}

object WindowEventMap {
  @scala.inline
  def apply(
    keyboardDidHide: Event_,
    keyboardDidShow: Event_,
    keyboardHeightWillChange: CordovaKeyboardEvent,
    keyboardWillHide: Event_,
    keyboardWillShow: Event_
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(keyboardDidHide = keyboardDidHide.asInstanceOf[js.Any], keyboardDidShow = keyboardDidShow.asInstanceOf[js.Any], keyboardHeightWillChange = keyboardHeightWillChange.asInstanceOf[js.Any], keyboardWillHide = keyboardWillHide.asInstanceOf[js.Any], keyboardWillShow = keyboardWillShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMap]
  }
  @scala.inline
  implicit class WindowEventMapOps[Self <: WindowEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyboardDidHide(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDidHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardDidShow(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDidShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardHeightWillChange(value: CordovaKeyboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardHeightWillChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardWillHide(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardWillHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardWillShow(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardWillShow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

