package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvInfo extends js.Object {
  var appKey: String = js.native
  	// 智能小程序 App Key	2.0.28
  var appName: String = js.native
  	// 智能小程序名称
  var lastAppURL: String = js.native
  	// 基础库版本
  var scheme: String = js.native
  	// 智能小程序最近一次打开的调起协议
  var sdkVersion: String = js.native
}

object EnvInfo {
  @scala.inline
  def apply(appKey: String, appName: String, lastAppURL: String, scheme: String, sdkVersion: String): EnvInfo = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], lastAppURL = lastAppURL.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvInfo]
  }
  @scala.inline
  implicit class EnvInfoOps[Self <: EnvInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastAppURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAppURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSdkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

