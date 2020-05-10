package typingsSlinky.cordovaIonic

import typingsSlinky.cordovaIonic.Ionic.Keyboard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPlugins extends js.Object {
  var Keyboard: typingsSlinky.cordovaIonic.Ionic.Keyboard = js.native
}

object CordovaPlugins {
  @scala.inline
  def apply(Keyboard: Keyboard): CordovaPlugins = {
    val __obj = js.Dynamic.literal(Keyboard = Keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  @scala.inline
  implicit class CordovaPluginsOps[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyboard(value: Keyboard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keyboard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

