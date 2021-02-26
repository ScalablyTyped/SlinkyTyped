package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeVersionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the type version.
    */
  var Arn: js.UndefOr[TypeArn] = js.native
  
  /**
    * The description of the type version.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * Whether the specified type version is set as the default version.
    */
  var IsDefaultVersion: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.IsDefaultVersion] = js.native
  
  /**
    * When the version was registered.
    */
  var TimeCreated: js.UndefOr[js.Date] = js.native
  
  /**
    * The kind of type.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  
  /**
    * The name of the type.
    */
  var TypeName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TypeName] = js.native
  
  /**
    * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the type version when it is registered.
    */
  var VersionId: js.UndefOr[TypeVersionId] = js.native
}
object TypeVersionSummary {
  
  @scala.inline
  def apply(): TypeVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeVersionSummary]
  }
  
  @scala.inline
  implicit class TypeVersionSummaryMutableBuilder[Self <: TypeVersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: TypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIsDefaultVersion(value: IsDefaultVersion): Self = StObject.set(x, "IsDefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultVersionUndefined: Self = StObject.set(x, "IsDefaultVersion", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: js.Date): Self = StObject.set(x, "TimeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreatedUndefined: Self = StObject.set(x, "TimeCreated", js.undefined)
    
    @scala.inline
    def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVersionId(value: TypeVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
