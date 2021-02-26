package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the user account.
    */
  var Id: js.UndefOr[UserId] = js.native
  
  /**
    * The Amazon Connect user name of the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.native
}
object UserSummary {
  
  @scala.inline
  def apply(): UserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSummary]
  }
  
  @scala.inline
  implicit class UserSummaryMutableBuilder[Self <: UserSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: UserId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setUsername(value: AgentUsername): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
