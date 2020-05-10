package typingsSlinky.randomUseragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgent extends js.Object {
  var appCodename: String = js.native
  var appName: String = js.native
  var appVersion: String = js.native
  var browserMajor: String = js.native
  var browserName: String = js.native
  var browserVersion: String = js.native
  var cpuArchitecture: String = js.native
  var description: String = js.native
  var deviceModel: String = js.native
  var deviceType: String = js.native
  var deviceVendor: String = js.native
  var engineName: String = js.native
  var engineVersion: String = js.native
  var folder: String = js.native
  var osName: String = js.native
  var osVersion: String = js.native
  var platform: String = js.native
  var userAgent: String = js.native
  var vendor: String = js.native
  var vendorSub: String = js.native
}

object UserAgent {
  @scala.inline
  def apply(
    appCodename: String,
    appName: String,
    appVersion: String,
    browserMajor: String,
    browserName: String,
    browserVersion: String,
    cpuArchitecture: String,
    description: String,
    deviceModel: String,
    deviceType: String,
    deviceVendor: String,
    engineName: String,
    engineVersion: String,
    folder: String,
    osName: String,
    osVersion: String,
    platform: String,
    userAgent: String,
    vendor: String,
    vendorSub: String
  ): UserAgent = {
    val __obj = js.Dynamic.literal(appCodename = appCodename.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], browserMajor = browserMajor.asInstanceOf[js.Any], browserName = browserName.asInstanceOf[js.Any], browserVersion = browserVersion.asInstanceOf[js.Any], cpuArchitecture = cpuArchitecture.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], deviceModel = deviceModel.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], deviceVendor = deviceVendor.asInstanceOf[js.Any], engineName = engineName.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], osName = osName.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorSub = vendorSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgent]
  }
  @scala.inline
  implicit class UserAgentOps[Self <: UserAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppCodename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appCodename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowserMajor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserMajor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowserVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpuArchitecture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuArchitecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceVendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendorSub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorSub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

