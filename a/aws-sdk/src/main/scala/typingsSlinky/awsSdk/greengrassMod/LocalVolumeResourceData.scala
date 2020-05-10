package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalVolumeResourceData extends js.Object {
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.native
  /**
    * Allows you to configure additional group privileges for the Lambda process. This field is optional.
    */
  var GroupOwnerSetting: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.GroupOwnerSetting] = js.native
  /**
    * The local absolute path of the volume resource on the host. The source path for a volume resource type cannot start with ''/sys''.
    */
  var SourcePath: js.UndefOr[string] = js.native
}

object LocalVolumeResourceData {
  @scala.inline
  def apply(): LocalVolumeResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalVolumeResourceData]
  }
  @scala.inline
  implicit class LocalVolumeResourceDataOps[Self <: LocalVolumeResourceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationPath(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPath")(js.undefined)
        ret
    }
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

