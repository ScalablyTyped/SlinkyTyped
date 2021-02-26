package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceSearchSettings extends StObject {
  
  /**
    * The ID of a collection that contains faces that you want to search for.
    */
  var CollectionId: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.CollectionId] = js.native
  
  /**
    * Minimum face match confidence score that must be met to return a result for a recognized face. Default is 80. 0 is the lowest confidence. 100 is the highest confidence.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.native
}
object FaceSearchSettings {
  
  @scala.inline
  def apply(): FaceSearchSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceSearchSettings]
  }
  
  @scala.inline
  implicit class FaceSearchSettingsMutableBuilder[Self <: FaceSearchSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIdUndefined: Self = StObject.set(x, "CollectionId", js.undefined)
    
    @scala.inline
    def setFaceMatchThreshold(value: Percent): Self = StObject.set(x, "FaceMatchThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceMatchThresholdUndefined: Self = StObject.set(x, "FaceMatchThreshold", js.undefined)
  }
}
