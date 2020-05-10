package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemRequest extends js.Object {
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.fsxMod.ClientRequestToken] = js.native
  var FileSystemId: typingsSlinky.awsSdk.fsxMod.FileSystemId = js.native
  var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.native
  /**
    * The configuration update for this Microsoft Windows file system. The only supported options are for backup and maintenance and for self-managed Active Directory configuration.
    */
  var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.native
}

object UpdateFileSystemRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
  @scala.inline
  implicit class UpdateFileSystemRequestOps[Self <: UpdateFileSystemRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withLustreConfiguration(value: UpdateFileSystemLustreConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LustreConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLustreConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LustreConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsConfiguration(value: UpdateFileSystemWindowsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowsConfiguration")(js.undefined)
        ret
    }
  }
  
}

