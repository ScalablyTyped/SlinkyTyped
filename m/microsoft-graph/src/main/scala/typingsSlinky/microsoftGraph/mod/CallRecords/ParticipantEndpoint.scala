package typingsSlinky.microsoftGraph.mod.CallRecords

import typingsSlinky.microsoftGraph.mod.IdentitySet
import typingsSlinky.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticipantEndpoint extends Endpoint {
  
  // The feedback provided by the user of this endpoint about the quality of the session.
  var feedback: js.UndefOr[NullableOption[UserFeedback]] = js.native
  
  // Identity associated with the endpoint.
  var identity: js.UndefOr[NullableOption[IdentitySet]] = js.native
}
object ParticipantEndpoint {
  
  @scala.inline
  def apply(): ParticipantEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantEndpoint]
  }
  
  @scala.inline
  implicit class ParticipantEndpointMutableBuilder[Self <: ParticipantEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedback(value: NullableOption[UserFeedback]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackNull: Self = StObject.set(x, "feedback", null)
    
    @scala.inline
    def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    @scala.inline
    def setIdentity(value: NullableOption[IdentitySet]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityNull: Self = StObject.set(x, "identity", null)
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
  }
}
