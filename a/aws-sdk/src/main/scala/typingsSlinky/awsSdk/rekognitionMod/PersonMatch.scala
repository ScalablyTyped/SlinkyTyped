package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonMatch extends StObject {
  
  /**
    * Information about the faces in the input collection that match the face of a person in the video.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.native
  
  /**
    * Information about the matched person.
    */
  var Person: js.UndefOr[PersonDetail] = js.native
  
  /**
    * The time, in milliseconds from the beginning of the video, that the person was matched in the video.
    */
  var Timestamp: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Timestamp] = js.native
}
object PersonMatch {
  
  @scala.inline
  def apply(): PersonMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonMatch]
  }
  
  @scala.inline
  implicit class PersonMatchMutableBuilder[Self <: PersonMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaceMatches(value: FaceMatchList): Self = StObject.set(x, "FaceMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceMatchesUndefined: Self = StObject.set(x, "FaceMatches", js.undefined)
    
    @scala.inline
    def setFaceMatchesVarargs(value: FaceMatch*): Self = StObject.set(x, "FaceMatches", js.Array(value :_*))
    
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
