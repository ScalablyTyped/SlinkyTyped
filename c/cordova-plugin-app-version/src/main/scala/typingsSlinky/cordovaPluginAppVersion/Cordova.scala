package typingsSlinky.cordovaPluginAppVersion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cordova extends js.Object {
  var getAppVersion: AnonGetAppName = js.native
}

object Cordova {
  @scala.inline
  def apply(getAppVersion: AnonGetAppName): Cordova = {
    val __obj = js.Dynamic.literal(getAppVersion = getAppVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  @scala.inline
  implicit class CordovaOps[Self <: Cordova] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAppVersion(value: AnonGetAppName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

