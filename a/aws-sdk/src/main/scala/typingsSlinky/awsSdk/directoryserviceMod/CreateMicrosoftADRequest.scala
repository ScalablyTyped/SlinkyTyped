package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMicrosoftADRequest extends js.Object {
  /**
    * A description for the directory. This label will appear on the AWS console Directory Details page after the directory is created.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * AWS Managed Microsoft AD is available in two editions: Standard and Enterprise. Enterprise is the default.
    */
  var Edition: js.UndefOr[DirectoryEdition] = js.native
  /**
    * The fully qualified domain name for the AWS Managed Microsoft AD directory, such as corp.example.com. This name will resolve inside your VPC only. It does not need to be publicly resolvable.
    */
  var Name: DirectoryName = js.native
  /**
    * The password for the default administrative user named Admin. If you need to change the password for the administrator account, you can use the ResetUserPassword API call.
    */
  var Password: typingsSlinky.awsSdk.directoryserviceMod.Password = js.native
  /**
    * The NetBIOS name for your domain, such as CORP. If you don't specify a NetBIOS name, it will default to the first part of your directory DNS. For example, CORP for the directory DNS corp.example.com. 
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The tags to be assigned to the AWS Managed Microsoft AD directory.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Tags] = js.native
  /**
    * Contains VPC information for the CreateDirectory or CreateMicrosoftAD operation.
    */
  var VpcSettings: DirectoryVpcSettings = js.native
}

object CreateMicrosoftADRequest {
  @scala.inline
  def apply(Name: DirectoryName, Password: Password, VpcSettings: DirectoryVpcSettings): CreateMicrosoftADRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], VpcSettings = VpcSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMicrosoftADRequest]
  }
  @scala.inline
  implicit class CreateMicrosoftADRequestOps[Self <: CreateMicrosoftADRequest] (val x: Self) extends AnyVal {
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
    def withVpcSettings(value: DirectoryVpcSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSettings")(value.asInstanceOf[js.Any])
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
    def withEdition(value: DirectoryEdition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edition")(js.undefined)
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

