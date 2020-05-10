package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectDirectoryRequest extends js.Object {
  /**
    * A DirectoryConnectSettings object that contains additional information for the operation.
    */
  var ConnectSettings: DirectoryConnectSettings = js.native
  /**
    * A description for the directory.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * The fully qualified name of the on-premises directory, such as corp.example.com.
    */
  var Name: DirectoryName = js.native
  /**
    * The password for the on-premises user account.
    */
  var Password: ConnectPassword = js.native
  /**
    * The NetBIOS name of the on-premises directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The size of the directory.
    */
  var Size: DirectorySize = js.native
  /**
    * The tags to be assigned to AD Connector.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Tags] = js.native
}

object ConnectDirectoryRequest {
  @scala.inline
  def apply(
    ConnectSettings: DirectoryConnectSettings,
    Name: DirectoryName,
    Password: ConnectPassword,
    Size: DirectorySize
  ): ConnectDirectoryRequest = {
    val __obj = js.Dynamic.literal(ConnectSettings = ConnectSettings.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectDirectoryRequest]
  }
  @scala.inline
  implicit class ConnectDirectoryRequestOps[Self <: ConnectDirectoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectSettings(value: DirectoryConnectSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: DirectoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: ConnectPassword): Self = {
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
  }
  
}

