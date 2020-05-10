package typingsSlinky.cordovaPluginInappbrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cordova extends js.Object {
  var InAppBrowser: typingsSlinky.cordovaPluginInappbrowser.InAppBrowser = js.native
}

object Cordova {
  @scala.inline
  def apply(InAppBrowser: InAppBrowser): Cordova = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  @scala.inline
  implicit class CordovaOps[Self <: Cordova] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInAppBrowser(value: InAppBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InAppBrowser")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

