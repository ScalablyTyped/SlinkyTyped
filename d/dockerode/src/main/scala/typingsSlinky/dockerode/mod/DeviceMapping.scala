package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMapping extends js.Object {
  var CgroupPermissions: String = js.native
  var PathInContainer: String = js.native
  var PathOnHost: String = js.native
}

object DeviceMapping {
  @scala.inline
  def apply(CgroupPermissions: String, PathInContainer: String, PathOnHost: String): DeviceMapping = {
    val __obj = js.Dynamic.literal(CgroupPermissions = CgroupPermissions.asInstanceOf[js.Any], PathInContainer = PathInContainer.asInstanceOf[js.Any], PathOnHost = PathOnHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMapping]
  }
  @scala.inline
  implicit class DeviceMappingOps[Self <: DeviceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCgroupPermissions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CgroupPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathInContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathInContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathOnHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathOnHost")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

