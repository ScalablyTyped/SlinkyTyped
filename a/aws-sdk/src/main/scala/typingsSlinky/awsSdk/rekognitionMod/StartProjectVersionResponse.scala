package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartProjectVersionResponse extends StObject {
  
  /**
    * The current running status of the model. 
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.native
}
object StartProjectVersionResponse {
  
  @scala.inline
  def apply(): StartProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartProjectVersionResponse]
  }
  
  @scala.inline
  implicit class StartProjectVersionResponseMutableBuilder[Self <: StartProjectVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ProjectVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
