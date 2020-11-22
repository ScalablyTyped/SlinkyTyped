package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.commonMod.CustomChallengeResult
import typingsSlinky.awsLambda.commonMod.StringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeName extends js.Object {
  
  var challengeName: String = js.native
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var session: js.Array[typingsSlinky.awsLambda.commonMod.ChallengeResult | CustomChallengeResult] = js.native
  
  var userAttributes: StringMap = js.native
  
  var userNotFound: js.UndefOr[Boolean] = js.native
}
object ChallengeName {
  
  @scala.inline
  def apply(
    challengeName: String,
    session: js.Array[typingsSlinky.awsLambda.commonMod.ChallengeResult | CustomChallengeResult],
    userAttributes: StringMap
  ): ChallengeName = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeName]
  }
  
  @scala.inline
  implicit class ChallengeNameOps[Self <: ChallengeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChallengeName(value: String): Self = this.set("challengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionVarargs(value: (typingsSlinky.awsLambda.commonMod.ChallengeResult | CustomChallengeResult)*): Self = this.set("session", js.Array(value :_*))
    
    @scala.inline
    def setSession(value: js.Array[typingsSlinky.awsLambda.commonMod.ChallengeResult | CustomChallengeResult]): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = this.set("clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMetadata: Self = this.set("clientMetadata", js.undefined)
    
    @scala.inline
    def setUserNotFound(value: Boolean): Self = this.set("userNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserNotFound: Self = this.set("userNotFound", js.undefined)
  }
}
