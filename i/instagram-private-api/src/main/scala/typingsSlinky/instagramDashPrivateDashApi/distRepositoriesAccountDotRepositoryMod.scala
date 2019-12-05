package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesAccountDotRepositoryDotCurrentDashUserDotResponseMod.AccountRepositoryCurrentUserResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesAccountDotRepositoryDotCurrentDashUserDotResponseMod.AccountRepositoryCurrentUserResponseUser
import typingsSlinky.instagramDashPrivateDashApi.distResponsesAccountDotRepositoryDotLoginDotResponseMod.AccountRepositoryLoginResponseLogged_in_user
import typingsSlinky.instagramDashPrivateDashApi.distResponsesStatusDotResponseMod.StatusResponse
import typingsSlinky.instagramDashPrivateDashApi.distTypesAccountDotEditDashProfileDotOptionsMod.AccountEditProfileOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesAccountDotTwoDashFactorDashLoginDotOptionsMod.AccountTwoFactorLoginOptions
import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/account.repository", JSImport.Namespace)
@js.native
object distRepositoriesAccountDotRepositoryMod extends js.Object {
  @js.native
  class AccountRepository () extends Repository {
    var command: js.Any = js.native
    def changePassword(oldPassword: String, newPassword: String): js.Promise[_] = js.native
    def changeProfilePicture(stream: ReadStream): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    def contactPointPrefill(): js.Promise[_] = js.native
    def contactPointPrefill(usage: String): js.Promise[_] = js.native
    def create(hasUsernamePasswordEmailFirst_name: Anon_Email): js.Promise[_] = js.native
    def currentUser(): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    def editProfile(options: AccountEditProfileOptions): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    def getPrefillCandidates(): js.Promise[_] = js.native
    def login(username: String, password: String): js.Promise[AccountRepositoryLoginResponseLogged_in_user] = js.native
    def logout(): js.Promise[StatusResponse] = js.native
    def msisdnHeaderBootstrap(): js.Promise[_] = js.native
    def msisdnHeaderBootstrap(usage: String): js.Promise[_] = js.native
    def processContactPointSignals(): js.Promise[_] = js.native
    def readMsisdnHeader(): js.Promise[_] = js.native
    def readMsisdnHeader(usage: String): js.Promise[_] = js.native
    def removeProfilePicture(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    def setBiography(text: String): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    def setPrivate(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    def setPublic(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    def twoFactorLogin(options: AccountTwoFactorLoginOptions): js.Promise[AccountRepositoryLoginResponseLogged_in_user] = js.native
  }
  
}

