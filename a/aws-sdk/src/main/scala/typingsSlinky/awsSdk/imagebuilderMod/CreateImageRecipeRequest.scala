package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImageRecipeRequest extends StObject {
  
  /**
    * The block device mappings of the image recipe. 
    */
  var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings] = js.native
  
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The components of the image recipe. 
    */
  var components: ComponentConfigurationList = js.native
  
  /**
    *  The description of the image recipe. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The name of the image recipe. 
    */
  var name: ResourceName = js.native
  
  /**
    * The parent image of the image recipe. The value of the string can be the ARN of the parent image or an AMI ID. The format for the ARN follows this example: arn:aws:imagebuilder:us-west-2:aws:image/windows-server-2016-english-full-base-x86/xxxx.x.x. You can provide the specific version that you want to use, or you can use a wildcard in all of the fields. If you enter an AMI ID for the string value, you must have access to the AMI, and the AMI must be in the same Region in which you are using Image Builder. 
    */
  var parentImage: NonEmptyString = js.native
  
  /**
    * The semantic version of the image recipe. 
    */
  var semanticVersion: VersionNumber = js.native
  
  /**
    *  The tags of the image recipe. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The working directory to be used during build and test workflows.
    */
  var workingDirectory: js.UndefOr[NonEmptyString] = js.native
}
object CreateImageRecipeRequest {
  
  @scala.inline
  def apply(
    clientToken: ClientToken,
    components: ComponentConfigurationList,
    name: ResourceName,
    parentImage: NonEmptyString,
    semanticVersion: VersionNumber
  ): CreateImageRecipeRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentImage = parentImage.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRecipeRequest]
  }
  
  @scala.inline
  implicit class CreateImageRecipeRequestMutableBuilder[Self <: CreateImageRecipeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockDeviceMappings(value: InstanceBlockDeviceMappings): Self = StObject.set(x, "blockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "blockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = StObject.set(x, "blockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: ComponentConfigurationList): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: ComponentConfiguration*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentImage(value: NonEmptyString): Self = StObject.set(x, "parentImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticVersion(value: VersionNumber): Self = StObject.set(x, "semanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setWorkingDirectory(value: NonEmptyString): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
