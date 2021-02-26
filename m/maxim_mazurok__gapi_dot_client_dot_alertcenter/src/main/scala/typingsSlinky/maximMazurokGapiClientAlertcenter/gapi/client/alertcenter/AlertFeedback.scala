package typingsSlinky.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertFeedback extends StObject {
  
  /** Output only. The alert identifier. */
  var alertId: js.UndefOr[String] = js.native
  
  /** Output only. The time this feedback was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The unique identifier of the Google account of the customer. */
  var customerId: js.UndefOr[String] = js.native
  
  /** Output only. The email of the user that provided the feedback. */
  var email: js.UndefOr[String] = js.native
  
  /** Output only. The unique identifier for the feedback. */
  var feedbackId: js.UndefOr[String] = js.native
  
  /** Required. The type of the feedback. */
  var `type`: js.UndefOr[String] = js.native
}
object AlertFeedback {
  
  @scala.inline
  def apply(): AlertFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertFeedback]
  }
  
  @scala.inline
  implicit class AlertFeedbackMutableBuilder[Self <: AlertFeedback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertId(value: String): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFeedbackId(value: String): Self = StObject.set(x, "feedbackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackIdUndefined: Self = StObject.set(x, "feedbackId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
