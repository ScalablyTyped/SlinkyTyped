package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CelebrityRecognition extends StObject {
  
  /**
    * Information about a recognized celebrity.
    */
  var Celebrity: js.UndefOr[CelebrityDetail] = js.native
  
  /**
    * The time, in milliseconds from the start of the video, that the celebrity was recognized.
    */
  var Timestamp: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Timestamp] = js.native
}
object CelebrityRecognition {
  
  @scala.inline
  def apply(): CelebrityRecognition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CelebrityRecognition]
  }
  
  @scala.inline
  implicit class CelebrityRecognitionMutableBuilder[Self <: CelebrityRecognition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCelebrity(value: CelebrityDetail): Self = StObject.set(x, "Celebrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCelebrityUndefined: Self = StObject.set(x, "Celebrity", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
