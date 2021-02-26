package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.accountEditProfileOptionsMod.AccountEditProfileOptions
import typingsSlinky.instagramPrivateApi.accountRepositoryCurrentUserResponseMod.AccountRepositoryCurrentUserResponseRootObject
import typingsSlinky.instagramPrivateApi.accountRepositoryCurrentUserResponseMod.AccountRepositoryCurrentUserResponseUser
import typingsSlinky.instagramPrivateApi.accountRepositoryLoginResponseMod.AccountRepositoryLoginResponseLoggedInUser
import typingsSlinky.instagramPrivateApi.accountTwoFactorLoginOptionsMod.AccountTwoFactorLoginOptions
import typingsSlinky.instagramPrivateApi.anon.Email
import typingsSlinky.instagramPrivateApi.anon.Encrypted
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.statusResponseMod.StatusResponse
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/account.repository", "AccountRepository")
  @js.native
  class AccountRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def changePassword(oldPassword: String, newPassword: String): js.Promise[_] = js.native
    
    def changeProfilePicture(picture: Buffer): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    
    var command: js.Any = js.native
    
    def contactPointPrefill(): js.Promise[_] = js.native
    def contactPointPrefill(usage: String): js.Promise[_] = js.native
    
    def create(hasUsernamePasswordEmailFirst_name: Email): js.Promise[_] = js.native
    
    def currentUser(): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    
    def editProfile(options: AccountEditProfileOptions): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    
    def encryptPassword(password: String): Encrypted = js.native
    
    def getPrefillCandidates(): js.Promise[_] = js.native
    
    def login(username: String, password: String): js.Promise[AccountRepositoryLoginResponseLoggedInUser] = js.native
    
    def logout(): js.Promise[StatusResponse] = js.native
    
    def msisdnHeaderBootstrap(): js.Promise[_] = js.native
    def msisdnHeaderBootstrap(usage: String): js.Promise[_] = js.native
    
    def processContactPointSignals(): js.Promise[_] = js.native
    
    def readMsisdnHeader(): js.Promise[_] = js.native
    def readMsisdnHeader(usage: String): js.Promise[_] = js.native
    
    def removeProfilePicture(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    
    def sendRecoveryFlowEmail(query: String): js.Promise[_] = js.native
    
    def setBiography(text: String): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    
    def setPrivate(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    
    def setPublic(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    
    def twoFactorLogin(options: AccountTwoFactorLoginOptions): js.Promise[AccountRepositoryLoginResponseLoggedInUser] = js.native
  }
  /* static members */
  object AccountRepository {
    
    @JSImport("instagram-private-api/dist/repositories/account.repository", "AccountRepository")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("instagram-private-api/dist/repositories/account.repository", "AccountRepository.accountDebug")
    @js.native
    def accountDebug: js.Any = js.native
    @scala.inline
    def accountDebug_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accountDebug")(x.asInstanceOf[js.Any])
    
    @JSImport("instagram-private-api/dist/repositories/account.repository", "AccountRepository.createJazoest")
    @js.native
    def createJazoest(input: String): String = js.native
  }
}
