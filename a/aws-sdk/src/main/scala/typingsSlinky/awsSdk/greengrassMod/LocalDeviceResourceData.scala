package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalDeviceResourceData extends js.Object {
  /**
    * Group/owner related settings for local resources.
    */
  var GroupOwnerSetting: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.GroupOwnerSetting] = js.native
  /**
    * The local absolute path of the device resource. The source path for a device resource can refer only to a character device or block device under ''/dev''.
    */
  var SourcePath: js.UndefOr[string] = js.native
}

object LocalDeviceResourceData {
  @scala.inline
  def apply(): LocalDeviceResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalDeviceResourceData]
  }
  @scala.inline
  implicit class LocalDeviceResourceDataOps[Self <: LocalDeviceResourceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupOwnerSetting(value: GroupOwnerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupOwnerSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupOwnerSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupOwnerSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePath(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePath")(js.undefined)
        ret
    }
  }
  
}

