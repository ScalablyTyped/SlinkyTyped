package typingsSlinky.evernote.mod

import typingsSlinky.evernote.mod.Types.AccountLimits
import typingsSlinky.evernote.mod.Types.BusinessInvitation
import typingsSlinky.evernote.mod.Types.PremiumInfo
import typingsSlinky.evernote.mod.Types.ServiceLevel
import typingsSlinky.evernote.mod.Types.User
import typingsSlinky.evernote.mod.Types.UserProfile
import typingsSlinky.evernote.mod.UserStore.AuthenticationResult
import typingsSlinky.evernote.mod.UserStore.BootstrapInfo
import typingsSlinky.evernote.mod.UserStore.PublicUserInfo
import typingsSlinky.evernote.mod.UserStore.UserUrls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "UserStoreClient")
@js.native
class UserStoreClient () extends StObject {
  
  def authenticateLongSession(
    username: String,
    password: String,
    consumerKey: String,
    consumerSecret: String,
    deviceIdentifier: String,
    deviceDescription: String,
    supportsTwoFactor: Boolean
  ): js.Promise[AuthenticationResult] = js.native
  
  def authenticateToBusiness(): js.Promise[AuthenticationResult] = js.native
  
  def checkVersion(clientName: String, edamVersionMajor: Double, edamVersionMinor: Double): js.Promise[Boolean] = js.native
  
  def completeTwoFactorAuthentication(
    authenticationToken: String,
    oneTimeCode: String,
    deviceIdentifier: String,
    deviceDescription: String
  ): js.Promise[AuthenticationResult] = js.native
  
  def getAccountLimits(serviceLevel: ServiceLevel): js.Promise[AccountLimits] = js.native
  
  def getBootstrapInfo(locale: String): js.Promise[BootstrapInfo] = js.native
  
  def getPremiumInfo(): js.Promise[PremiumInfo] = js.native
  
  def getPublicUserInfo(username: String): js.Promise[PublicUserInfo] = js.native
  
  def getUser(): js.Promise[User] = js.native
  
  def getUserUrls(): js.Promise[UserUrls] = js.native
  
  def inviteToBusiness(emailAddress: String): js.Promise[Unit] = js.native
  
  def listBusinessInvitations(includeRequestedInvitations: Boolean): js.Promise[js.Array[BusinessInvitation]] = js.native
  
  def listBusinessUsers(): js.Promise[js.Array[UserProfile]] = js.native
  
  def removeFromBusiness(emailAddress: String): js.Promise[Unit] = js.native
  
  def revokeLongSession(): js.Promise[Unit] = js.native
  
  def updateBusinessUserIdentifier(oldEmailAddress: String, newEmailAddress: String): js.Promise[Unit] = js.native
}
