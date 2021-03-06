package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSipMediaApplicationResponse extends StObject {
  
  /**
    * The SIP media application details.
    */
  var SipMediaApplication: js.UndefOr[typingsSlinky.awsSdk.chimeMod.SipMediaApplication] = js.native
}
object GetSipMediaApplicationResponse {
  
  @scala.inline
  def apply(): GetSipMediaApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSipMediaApplicationResponse]
  }
  
  @scala.inline
  implicit class GetSipMediaApplicationResponseMutableBuilder[Self <: GetSipMediaApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipMediaApplication(value: SipMediaApplication): Self = StObject.set(x, "SipMediaApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationUndefined: Self = StObject.set(x, "SipMediaApplication", js.undefined)
  }
}
