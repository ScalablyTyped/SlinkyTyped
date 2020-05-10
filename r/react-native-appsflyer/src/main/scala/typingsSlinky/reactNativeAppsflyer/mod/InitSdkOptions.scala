package typingsSlinky.reactNativeAppsflyer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitSdkOptions extends js.Object {
  var appId: String = js.native
  var devKey: String = js.native
  var isDebug: Boolean = js.native
}

object InitSdkOptions {
  @scala.inline
  def apply(appId: String, devKey: String, isDebug: Boolean): InitSdkOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], devKey = devKey.asInstanceOf[js.Any], isDebug = isDebug.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitSdkOptions]
  }
  @scala.inline
  implicit class InitSdkOptionsOps[Self <: InitSdkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDebug")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

