package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainRequest extends js.Object {
  /**
    * The mode of authentication that member use to access the domain.
    */
  var AuthMode: typingsSlinky.awsSdk.sagemakerMod.AuthMode = js.native
  /**
    * The default user settings.
    */
  var DefaultUserSettings: UserSettings = js.native
  /**
    * A name for the domain.
    */
  var DomainName: typingsSlinky.awsSdk.sagemakerMod.DomainName = js.native
  /**
    * The AWS Key Management Service encryption key ID.
    */
  var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * Security setting to limit to a set of subnets.
    */
  var SubnetIds: Subnets = js.native
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Security setting to limit the domain's communication to a Amazon Virtual Private Cloud.
    */
  var VpcId: typingsSlinky.awsSdk.sagemakerMod.VpcId = js.native
}

object CreateDomainRequest {
  @scala.inline
  def apply(
    AuthMode: AuthMode,
    DefaultUserSettings: UserSettings,
    DomainName: DomainName,
    SubnetIds: Subnets,
    VpcId: VpcId
  ): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(AuthMode = AuthMode.asInstanceOf[js.Any], DefaultUserSettings = DefaultUserSettings.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
  @scala.inline
  implicit class CreateDomainRequestOps[Self <: CreateDomainRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthMode(value: AuthMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultUserSettings(value: UserSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultUserSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: Subnets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: VpcId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomeEfsFileSystemKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeEfsFileSystemKmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeEfsFileSystemKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeEfsFileSystemKmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
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

