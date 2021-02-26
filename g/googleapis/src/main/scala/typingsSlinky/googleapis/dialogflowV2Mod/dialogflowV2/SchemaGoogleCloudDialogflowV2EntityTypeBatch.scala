package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message is a wrapper around a collection of entity types.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2EntityTypeBatch extends StObject {
  
  /**
    * A collection of entity types.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2EntityType]] = js.native
}
object SchemaGoogleCloudDialogflowV2EntityTypeBatch {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2EntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2EntityTypeBatch]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2EntityTypeBatchMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2EntityTypeBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2EntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
  }
}
