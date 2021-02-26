package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.commonMod.CustomChallengeResult
import typingsSlinky.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var session: js.Array[typingsSlinky.awsLambda.commonMod.ChallengeResult | CustomChallengeResult] = js.native
  
  var userAttributes: StringMap = js.native
  
  var userNotFound: js.UndefOr[Boolean] = js.native
}
object Session {
  
  @scala.inline
  def apply(
    session: js.Array[typingsSlinky.awsLambda.commonMod.ChallengeResult | CustomChallengeResult],
    userAttributes: StringMap
  ): Session = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    @scala.inline
    def setSession(value: js.Array[typingsSlinky.awsLambda.commonMod.ChallengeResult | CustomChallengeResult]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionVarargs(value: (typingsSlinky.awsLambda.commonMod.ChallengeResult | CustomChallengeResult)*): Self = StObject.set(x, "session", js.Array(value :_*))
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNotFound(value: Boolean): Self = StObject.set(x, "userNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNotFoundUndefined: Self = StObject.set(x, "userNotFound", js.undefined)
  }
}
