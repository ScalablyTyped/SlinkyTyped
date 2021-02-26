package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentVersion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  
  /**
    * The date that the component was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  
  /**
    * The description of the component.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the component.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The owner of the component.
    */
  var owner: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The platform of the component.
    */
  var platform: js.UndefOr[Platform] = js.native
  
  /**
    *  The operating system (OS) version supported by the component. If the OS information is available, a prefix match is performed against the parent image OS version during image recipe creation. 
    */
  var supportedOsVersions: js.UndefOr[OsVersionList] = js.native
  
  /**
    * The type of the component denotes whether the component is used to build the image or only to test it.
    */
  var `type`: js.UndefOr[ComponentType] = js.native
  
  /**
    * The semantic version of the component.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}
object ComponentVersion {
  
  @scala.inline
  def apply(): ComponentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentVersion]
  }
  
  @scala.inline
  implicit class ComponentVersionMutableBuilder[Self <: ComponentVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setSupportedOsVersions(value: OsVersionList): Self = StObject.set(x, "supportedOsVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOsVersionsUndefined: Self = StObject.set(x, "supportedOsVersions", js.undefined)
    
    @scala.inline
    def setSupportedOsVersionsVarargs(value: OsVersion*): Self = StObject.set(x, "supportedOsVersions", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
