package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.challengeStateResponseMod.ChallengeStateResponse
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object challengeRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/challenge.repository", "ChallengeRepository")
  @js.native
  class ChallengeRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def auto(): js.Promise[ChallengeStateResponse] = js.native
    def auto(reset: Boolean): js.Promise[ChallengeStateResponse] = js.native
    
    @JSName("deltaLoginReview")
    def deltaLoginReview_0(choice: `0`): js.Promise[ChallengeStateResponse] = js.native
    @JSName("deltaLoginReview")
    def deltaLoginReview_1(choice: `1`): js.Promise[ChallengeStateResponse] = js.native
    
    var middleware: js.Any = js.native
    
    def replay(choice: String): js.Promise[ChallengeStateResponse] = js.native
    
    def reset(): js.Promise[ChallengeStateResponse] = js.native
    
    def selectVerifyMethod(choice: String): js.Promise[ChallengeStateResponse] = js.native
    def selectVerifyMethod(choice: String, isReplay: Boolean): js.Promise[ChallengeStateResponse] = js.native
    
    def sendPhoneNumber(phoneNumber: String): js.Promise[ChallengeStateResponse] = js.native
    
    def sendSecurityCode(code: String): js.Promise[ChallengeStateResponse] = js.native
    def sendSecurityCode(code: Double): js.Promise[ChallengeStateResponse] = js.native
    
    def state(): js.Promise[ChallengeStateResponse] = js.native
  }
}
