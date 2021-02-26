package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultDetection extends StObject {
  
  /**
    * The total number of occurrences of the type of sensitive data that was detected.
    */
  var count: js.UndefOr[long] = js.native
  
  /**
    * The location of 1-15 occurrences of the sensitive data that was detected. A finding includes location data for a maximum of 15 occurrences of sensitive data.
    */
  var occurrences: js.UndefOr[Occurrences] = js.native
  
  /**
    * The type of sensitive data that was detected. For example, AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
    */
  var `type`: js.UndefOr[string] = js.native
}
object DefaultDetection {
  
  @scala.inline
  def apply(): DefaultDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultDetection]
  }
  
  @scala.inline
  implicit class DefaultDetectionMutableBuilder[Self <: DefaultDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setOccurrences(value: Occurrences): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
