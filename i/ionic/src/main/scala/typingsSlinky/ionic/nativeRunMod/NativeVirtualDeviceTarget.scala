package typingsSlinky.ionic.nativeRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeVirtualDeviceTarget extends js.Object {
  var id: String = js.native
  var name: String = js.native
  var platform: String = js.native
  var sdkVersion: String = js.native
}

object NativeVirtualDeviceTarget {
  @scala.inline
  def apply(id: String, name: String, platform: String, sdkVersion: String): NativeVirtualDeviceTarget = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeVirtualDeviceTarget]
  }
  @scala.inline
  implicit class NativeVirtualDeviceTargetOps[Self <: NativeVirtualDeviceTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
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

