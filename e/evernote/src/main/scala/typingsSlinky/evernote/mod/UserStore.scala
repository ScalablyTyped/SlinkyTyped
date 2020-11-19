package typingsSlinky.evernote.mod

import typingsSlinky.evernote.anon.AccountEmailDomain
import typingsSlinky.evernote.anon.AuthenticationToken
import typingsSlinky.evernote.anon.MessageStoreUrl
import typingsSlinky.evernote.anon.Name
import typingsSlinky.evernote.anon.NoteStoreUrl
import typingsSlinky.evernote.anon.Profiles
import typingsSlinky.evernote.mod.Types.ServiceLevel
import typingsSlinky.evernote.mod.Types.Timestamp
import typingsSlinky.evernote.mod.Types.User
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "UserStore")
@js.native
object UserStore extends js.Object {
  
  val EDAM_VERSION_MAJOR: Double = js.native
  
  val EDAM_VERSION_MINOR: Double = js.native
  
  @js.native
  class AuthenticationResult () extends js.Object {
    def this(args: AuthenticationToken) = this()
    
    var authenticationToken: js.UndefOr[String] = js.native
    
    var currentTime: js.UndefOr[Timestamp] = js.native
    
    var expiration: js.UndefOr[Timestamp] = js.native
    
    var noteStoreUrl: js.UndefOr[String] = js.native
    
    var publicUserInfo: js.UndefOr[PublicUserInfo] = js.native
    
    var secondFactorDeliveryHint: js.UndefOr[String] = js.native
    
    var secondFactorRequired: js.UndefOr[Boolean] = js.native
    
    var urls: js.UndefOr[UserUrls] = js.native
    
    var user: js.UndefOr[User] = js.native
    
    var webApiUrlPrefix: js.UndefOr[String] = js.native
  }
  
  @js.native
  class BootstrapInfo () extends js.Object {
    def this(args: Profiles) = this()
    
    var profiles: js.UndefOr[js.Array[BootstrapProfile]] = js.native
  }
  
  @js.native
  class BootstrapProfile () extends js.Object {
    def this(args: Name) = this()
    
    var name: js.UndefOr[String] = js.native
    
    var settings: js.UndefOr[BootstrapSettings] = js.native
  }
  
  @js.native
  class BootstrapSettings () extends js.Object {
    def this(args: AccountEmailDomain) = this()
    
    var accountEmailDomain: js.UndefOr[String] = js.native
    
    var enableFacebookSharing: js.UndefOr[Boolean] = js.native
    
    var enableGiftSubscriptions: js.UndefOr[Boolean] = js.native
    
    var enableGoogle: js.UndefOr[Boolean] = js.native
    
    var enableLinkedInSharing: js.UndefOr[Boolean] = js.native
    
    var enablePublicNotebooks: js.UndefOr[Boolean] = js.native
    
    var enableSharedNotebooks: js.UndefOr[Boolean] = js.native
    
    var enableSingleNoteSharing: js.UndefOr[Boolean] = js.native
    
    var enableSponsoredAccounts: js.UndefOr[Boolean] = js.native
    
    var enableSupportTickets: js.UndefOr[Boolean] = js.native
    
    var enableTwitterSharing: js.UndefOr[Boolean] = js.native
    
    var marketingUrl: js.UndefOr[String] = js.native
    
    var serviceHost: js.UndefOr[String] = js.native
    
    var supportUrl: js.UndefOr[String] = js.native
  }
  
  @js.native
  class PublicUserInfo () extends js.Object {
    def this(args: NoteStoreUrl) = this()
    
    var noteStoreUrl: js.UndefOr[String] = js.native
    
    var serviceLevel: js.UndefOr[ServiceLevel] = js.native
    
    var userId: js.UndefOr[UserID] = js.native
    
    var username: js.UndefOr[String] = js.native
    
    var webApiUrlPrefix: js.UndefOr[String] = js.native
  }
  
  @js.native
  class UserUrls () extends js.Object {
    def this(args: MessageStoreUrl) = this()
    
    var messageStoreUrl: js.UndefOr[String] = js.native
    
    var noteStoreUrl: js.UndefOr[String] = js.native
    
    var userStoreUrl: js.UndefOr[String] = js.native
    
    var userWebSocketUrl: js.UndefOr[String] = js.native
    
    var utilityUrl: js.UndefOr[String] = js.native
    
    var webApiUrlPrefix: js.UndefOr[String] = js.native
  }
}
