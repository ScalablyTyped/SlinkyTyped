package typingsSlinky.cordovaPluginFileOpener2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPlugins extends js.Object {
  var fileOpener2: CordovaPluginsFileOpener2 = js.native
}

object CordovaPlugins {
  @scala.inline
  def apply(fileOpener2: CordovaPluginsFileOpener2): CordovaPlugins = {
    val __obj = js.Dynamic.literal(fileOpener2 = fileOpener2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  @scala.inline
  implicit class CordovaPluginsOps[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileOpener2(value: CordovaPluginsFileOpener2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileOpener2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

