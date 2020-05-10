package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /**
    * The path inside the container at which to expose the host device.
    */
  var containerPath: js.UndefOr[String] = js.native
  /**
    * The path for the device on the host container instance.
    */
  var hostPath: String = js.native
  /**
    * The explicit permissions to provide to the container for the device. By default, the container has permissions for read, write, and mknod for the device.
    */
  var permissions: js.UndefOr[DeviceCgroupPermissions] = js.native
}

object Device {
  @scala.inline
  def apply(hostPath: String): Device = {
    val __obj = js.Dynamic.literal(hostPath = hostPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: DeviceCgroupPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
  }
  
}

