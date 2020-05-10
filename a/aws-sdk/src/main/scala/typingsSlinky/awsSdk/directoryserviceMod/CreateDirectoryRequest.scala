package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryRequest extends js.Object {
  /**
    * A description for the directory.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * The fully qualified name for the directory, such as corp.example.com.
    */
  var Name: DirectoryName = js.native
  /**
    * The password for the directory administrator. The directory creation process creates a directory administrator account with the user name Administrator and this password. If you need to change the password for the administrator account, you can use the ResetUserPassword API call.
    */
  var Password: typingsSlinky.awsSdk.directoryserviceMod.Password = js.native
  /**
    * The NetBIOS name of the directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The size of the directory.
    */
  var Size: DirectorySize = js.native
  /**
    * The tags to be assigned to the Simple AD directory.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Tags] = js.native
  /**
    * A DirectoryVpcSettings object that contains additional information for the operation.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.native
}

object CreateDirectoryRequest {
  @scala.inline
  def apply(Name: DirectoryName, Password: Password, Size: DirectorySize): CreateDirectoryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryRequest]
  }
  @scala.inline
  implicit class CreateDirectoryRequestOps[Self <: CreateDirectoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: DirectoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: DirectorySize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withShortName(value: DirectoryShortName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSettings(value: DirectoryVpcSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSettings")(js.undefined)
        ret
    }
  }
  
}

