package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonDetection extends StObject {
  
  /**
    * Details about a person whose path was tracked in a video.
    */
  var Person: js.UndefOr[PersonDetail] = js.native
  
  /**
    * The time, in milliseconds from the start of the video, that the person's path was tracked.
    */
  var Timestamp: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Timestamp] = js.native
}
object PersonDetection {
  
  @scala.inline
  def apply(): PersonDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonDetection]
  }
  
  @scala.inline
  implicit class PersonDetectionMutableBuilder[Self <: PersonDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerson(value: PersonDetail): Self = StObject.set(x, "Person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonUndefined: Self = StObject.set(x, "Person", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
