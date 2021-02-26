package typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BaseType that describes a service-backed Type.
  */
@js.native
trait SchemaBaseType extends StObject {
  
  /**
    * Allows resource handling overrides for specific collections
    */
  var collectionOverrides: js.UndefOr[js.Array[SchemaCollectionOverride]] = js.native
  
  /**
    * Credential used when interacting with this type.
    */
  var credential: js.UndefOr[SchemaCredential] = js.native
  
  /**
    * Descriptor Url for the this type.
    */
  var descriptorUrl: js.UndefOr[String] = js.native
  
  /**
    * Options to apply when handling any resources in this service.
    */
  var options: js.UndefOr[SchemaOptions] = js.native
}
object SchemaBaseType {
  
  @scala.inline
  def apply(): SchemaBaseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBaseType]
  }
  
  @scala.inline
  implicit class SchemaBaseTypeMutableBuilder[Self <: SchemaBaseType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionOverrides(value: js.Array[SchemaCollectionOverride]): Self = StObject.set(x, "collectionOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionOverridesUndefined: Self = StObject.set(x, "collectionOverrides", js.undefined)
    
    @scala.inline
    def setCollectionOverridesVarargs(value: SchemaCollectionOverride*): Self = StObject.set(x, "collectionOverrides", js.Array(value :_*))
    
    @scala.inline
    def setCredential(value: SchemaCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    @scala.inline
    def setDescriptorUrl(value: String): Self = StObject.set(x, "descriptorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorUrlUndefined: Self = StObject.set(x, "descriptorUrl", js.undefined)
    
    @scala.inline
    def setOptions(value: SchemaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
