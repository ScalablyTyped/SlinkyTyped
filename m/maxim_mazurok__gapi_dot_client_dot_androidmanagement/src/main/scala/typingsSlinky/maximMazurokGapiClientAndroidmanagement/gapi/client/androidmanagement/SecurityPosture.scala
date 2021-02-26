package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPosture extends StObject {
  
  /** Device's security posture value. */
  var devicePosture: js.UndefOr[String] = js.native
  
  /** Additional details regarding the security posture of the device. */
  var postureDetails: js.UndefOr[js.Array[PostureDetail]] = js.native
}
object SecurityPosture {
  
  @scala.inline
  def apply(): SecurityPosture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPosture]
  }
  
  @scala.inline
  implicit class SecurityPostureMutableBuilder[Self <: SecurityPosture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicePosture(value: String): Self = StObject.set(x, "devicePosture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePostureUndefined: Self = StObject.set(x, "devicePosture", js.undefined)
    
    @scala.inline
    def setPostureDetails(value: js.Array[PostureDetail]): Self = StObject.set(x, "postureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostureDetailsUndefined: Self = StObject.set(x, "postureDetails", js.undefined)
    
    @scala.inline
    def setPostureDetailsVarargs(value: PostureDetail*): Self = StObject.set(x, "postureDetails", js.Array(value :_*))
  }
}
