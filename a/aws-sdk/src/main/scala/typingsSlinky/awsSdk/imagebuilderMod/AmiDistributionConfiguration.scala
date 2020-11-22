package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmiDistributionConfiguration extends js.Object {
  
  /**
    * The tags to apply to AMIs distributed to this Region. 
    */
  var amiTags: js.UndefOr[TagMap] = js.native
  
  /**
    * The description of the distribution configuration. Minimum and maximum length are in characters.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The KMS key identifier used to encrypt the distributed image. 
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances. 
    */
  var launchPermission: js.UndefOr[LaunchPermissionConfiguration] = js.native
  
  /**
    * The name of the distribution configuration. 
    */
  var name: js.UndefOr[AmiNameString] = js.native
  
  /**
    *  The ID of an account to which you want to distribute an image. 
    */
  var targetAccountIds: js.UndefOr[AccountList] = js.native
}
object AmiDistributionConfiguration {
  
  @scala.inline
  def apply(): AmiDistributionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiDistributionConfiguration]
  }
  
  @scala.inline
  implicit class AmiDistributionConfigurationOps[Self <: AmiDistributionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmiTags(value: TagMap): Self = this.set("amiTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmiTags: Self = this.set("amiTags", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setLaunchPermission(value: LaunchPermissionConfiguration): Self = this.set("launchPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchPermission: Self = this.set("launchPermission", js.undefined)
    
    @scala.inline
    def setName(value: AmiNameString): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTargetAccountIdsVarargs(value: AccountId*): Self = this.set("targetAccountIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetAccountIds(value: AccountList): Self = this.set("targetAccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetAccountIds: Self = this.set("targetAccountIds", js.undefined)
  }
}
