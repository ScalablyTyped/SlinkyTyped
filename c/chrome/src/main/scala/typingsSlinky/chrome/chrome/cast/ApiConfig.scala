package typingsSlinky.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiConfig extends StObject {
  
  var autoJoinPolicy: AutoJoinPolicy = js.native
  
  var defaultActionPolicy: DefaultActionPolicy = js.native
  
  def receiverListener(receiverAvailability: ReceiverAvailability): Unit = js.native
  
  def sessionListener(session: Session): Unit = js.native
  
  var sessionRequest: SessionRequest = js.native
}
object ApiConfig {
  
  @scala.inline
  def apply(
    autoJoinPolicy: AutoJoinPolicy,
    defaultActionPolicy: DefaultActionPolicy,
    receiverListener: ReceiverAvailability => Unit,
    sessionListener: Session => Unit,
    sessionRequest: SessionRequest
  ): ApiConfig = {
    val __obj = js.Dynamic.literal(autoJoinPolicy = autoJoinPolicy.asInstanceOf[js.Any], defaultActionPolicy = defaultActionPolicy.asInstanceOf[js.Any], receiverListener = js.Any.fromFunction1(receiverListener), sessionListener = js.Any.fromFunction1(sessionListener), sessionRequest = sessionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiConfig]
  }
  
  @scala.inline
  implicit class ApiConfigMutableBuilder[Self <: ApiConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoJoinPolicy(value: AutoJoinPolicy): Self = StObject.set(x, "autoJoinPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActionPolicy(value: DefaultActionPolicy): Self = StObject.set(x, "defaultActionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiverListener(value: ReceiverAvailability => Unit): Self = StObject.set(x, "receiverListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSessionListener(value: Session => Unit): Self = StObject.set(x, "sessionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSessionRequest(value: SessionRequest): Self = StObject.set(x, "sessionRequest", value.asInstanceOf[js.Any])
  }
}
