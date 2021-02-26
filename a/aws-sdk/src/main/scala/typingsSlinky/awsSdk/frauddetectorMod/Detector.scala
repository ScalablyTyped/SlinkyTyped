package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detector extends StObject {
  
  /**
    * The detector ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  
  /**
    * Timestamp of when the detector was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  
  /**
    * The detector description.
    */
  var description: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  
  /**
    * The name of the event type.
    */
  var eventTypeName: js.UndefOr[identifier] = js.native
  
  /**
    * Timestamp of when the detector was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
}
object Detector {
  
  @scala.inline
  def apply(): Detector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detector]
  }
  
  @scala.inline
  implicit class DetectorMutableBuilder[Self <: Detector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    @scala.inline
    def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
  }
}
