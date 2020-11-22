package typingsSlinky.pulumiAws.inputMod.imagebuilder

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionConfigurationDistributionAmiDistributionConfiguration extends js.Object {
  
  /**
    * Key-value map of tags to apply to the distributed AMI.
    */
  var amiTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Description to apply to the distributed AMI.
    */
  var description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key to encrypt the distributed AMI.
    */
  var kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block of EC2 launch permissions to apply to the distributed AMI. Detailed below.
    */
  var launchPermission: js.UndefOr[
    Input[
      DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
    ]
  ] = js.native
  
  /**
    * Name to apply to the distributed AMI.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Set of AWS Account identifiers to distribute the AMI.
    */
  var targetAccountIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object DistributionConfigurationDistributionAmiDistributionConfiguration {
  
  @scala.inline
  def apply(): DistributionConfigurationDistributionAmiDistributionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionConfigurationDistributionAmiDistributionConfiguration]
  }
  
  @scala.inline
  implicit class DistributionConfigurationDistributionAmiDistributionConfigurationOps[Self <: DistributionConfigurationDistributionAmiDistributionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAmiTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("amiTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmiTags: Self = this.set("amiTags", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setLaunchPermission(
      value: Input[
          DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
        ]
    ): Self = this.set("launchPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchPermission: Self = this.set("launchPermission", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTargetAccountIdsVarargs(value: Input[String]*): Self = this.set("targetAccountIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetAccountIds(value: Input[js.Array[Input[String]]]): Self = this.set("targetAccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetAccountIds: Self = this.set("targetAccountIds", js.undefined)
  }
}
