package typingsSlinky.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var NativeKeyboard: typingsSlinky.cordovaPluginNativeKeyboard.NativeKeyboard
}

object Window {
  @scala.inline
  def apply(NativeKeyboard: NativeKeyboard): Window = {
    val __obj = js.Dynamic.literal(NativeKeyboard = NativeKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

