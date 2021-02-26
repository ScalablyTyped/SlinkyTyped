package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerEditsEvent extends StObject {
  
  var addedAttachments: js.Array[FeatureEditResult] = js.native
  
  var addedFeatures: js.Array[FeatureEditResult] = js.native
  
  var deletedAttachments: js.Array[FeatureEditResult] = js.native
  
  var deletedFeatures: js.Array[FeatureEditResult] = js.native
  
  var updatedAttachments: js.Array[FeatureEditResult] = js.native
  
  var updatedFeatures: js.Array[FeatureEditResult] = js.native
}
object FeatureLayerEditsEvent {
  
  @scala.inline
  def apply(
    addedAttachments: js.Array[FeatureEditResult],
    addedFeatures: js.Array[FeatureEditResult],
    deletedAttachments: js.Array[FeatureEditResult],
    deletedFeatures: js.Array[FeatureEditResult],
    updatedAttachments: js.Array[FeatureEditResult],
    updatedFeatures: js.Array[FeatureEditResult]
  ): FeatureLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedAttachments = addedAttachments.asInstanceOf[js.Any], addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedAttachments = deletedAttachments.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], updatedAttachments = updatedAttachments.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerEditsEvent]
  }
  
  @scala.inline
  implicit class FeatureLayerEditsEventMutableBuilder[Self <: FeatureLayerEditsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedAttachments(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "addedAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedAttachmentsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "addedAttachments", js.Array(value :_*))
    
    @scala.inline
    def setAddedFeatures(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "addedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedFeaturesVarargs(value: FeatureEditResult*): Self = StObject.set(x, "addedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setDeletedAttachments(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "deletedAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedAttachmentsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "deletedAttachments", js.Array(value :_*))
    
    @scala.inline
    def setDeletedFeatures(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "deletedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedFeaturesVarargs(value: FeatureEditResult*): Self = StObject.set(x, "deletedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedAttachments(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "updatedAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAttachmentsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "updatedAttachments", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedFeatures(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "updatedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedFeaturesVarargs(value: FeatureEditResult*): Self = StObject.set(x, "updatedFeatures", js.Array(value :_*))
  }
}
