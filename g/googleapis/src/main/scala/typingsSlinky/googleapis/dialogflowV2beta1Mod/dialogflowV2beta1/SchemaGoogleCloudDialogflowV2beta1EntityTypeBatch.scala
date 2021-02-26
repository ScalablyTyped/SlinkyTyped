package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message is a wrapper around a collection of entity types.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch extends StObject {
  
  /**
    * A collection of entity types.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1EntityTypeBatchMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1EntityTypeBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2beta1EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
  }
}
