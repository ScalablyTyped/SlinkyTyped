package typingsSlinky.freedom.freedom

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.freedom.freedomStrings.onClientState
import typingsSlinky.freedom.freedomStrings.onMessage
import typingsSlinky.freedom.freedomStrings.onUserProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Social {
  
  // Status of a client connected to a social network.
  @js.native
  trait ClientState extends StObject {
    
    var clientId: String = js.native
    
    var status: String = js.native
    
    // Either ONLINE, OFFLINE, or ONLINE_WITH_OTHER_APP
    var timestamp: Double = js.native
    
    var userId: String = js.native
  }
  object ClientState {
    
    @scala.inline
    def apply(clientId: String, status: String, timestamp: Double, userId: String): ClientState = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientState]
    }
    
    @scala.inline
    implicit class ClientStateMutableBuilder[Self <: ClientState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  type Clients = StringDictionary[ClientState]
  
  // Event for an incoming messages
  @js.native
  trait IncomingMessage extends StObject {
    
    // UserID/ClientID/status of user from whom the message comes from.
    var from: ClientState = js.native
    
    // Message contents.
    var message: String = js.native
  }
  object IncomingMessage {
    
    @scala.inline
    def apply(from: ClientState, message: String): IncomingMessage = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingMessage]
    }
    
    @scala.inline
    implicit class IncomingMessageMutableBuilder[Self <: IncomingMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: ClientState): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  // A request to login to a specific network as a specific agent
  @js.native
  trait LoginRequest extends StObject {
    
    // Name of the application connecting to the network. Other logins with
    // the same agent field will be listed as having status |ONLINE|, where
    // those with different agents will be listed as
    // |ONLINE_WITH_OTHER_CLIENT|
    var agent: String = js.native
    
    // When |interactive === true| social will always prompt user for login.
    // Promise fails if the user did not login or provided invalid
    // credentials. When |interactive === false|, promise fails unless the
    // social provider has  cached tokens/credentials.
    var interactive: Boolean = js.native
    
    // When true, social provider will remember the token/credentials.
    var rememberLogin: Boolean = js.native
    
    // URL of application
    var url: String = js.native
    
    // Version of application
    var version: String = js.native
  }
  object LoginRequest {
    
    @scala.inline
    def apply(agent: String, interactive: Boolean, rememberLogin: Boolean, url: String, version: String): LoginRequest = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], rememberLogin = rememberLogin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginRequest]
    }
    
    @scala.inline
    implicit class LoginRequestMutableBuilder[Self <: LoginRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRememberLogin(value: Boolean): Self = StObject.set(x, "rememberLogin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Social extends StObject {
    
    // Forget any tokens/credentials used for logging in with the last used
    // userId.
    def clearCachedCredentials(): js.Promise[Unit] = js.native
    
    def getClients(): js.Promise[Clients] = js.native
    
    def getUsers(): js.Promise[Users] = js.native
    
    def login(loginRequest: LoginRequest): js.Promise[ClientState] = js.native
    
    // Logs the user out of the social network. After the logout promise, the
    // user status is OFFLINE.
    def logout(): js.Promise[Unit] = js.native
    
    // Generic Freedom Event stuff. |on| binds an event handler to event type
    // |eventType|. Every time |eventType|  event is raised, the function |f|
    // will be called.
    //
    // Message type |onMessage| happens when the user receives a message from
    // another contact.
    def on(eventType: String, f: js.Function): Unit = js.native
    // Message type |onMyStatus| is received when the user's client's status
    // changes, e.g. when disconnected and online status becomes offline.
    @JSName("on")
    def on_onClientState(eventType: onClientState, f: js.Function1[/* status */ ClientState, Unit]): Unit = js.native
    @JSName("on")
    def on_onMessage(eventType: onMessage, f: js.Function1[/* message */ IncomingMessage, Unit]): Unit = js.native
    // Message type |onRosterProfile| events are received when another user's
    // profile is received or when a client changes status.
    @JSName("on")
    def on_onUserProfile(eventType: onUserProfile, f: js.Function1[/* profile */ UserProfile, Unit]): Unit = js.native
    
    // Do a singleton event binding: |f| will only be called once, on the next
    // event of type |eventType|. Same events as above.
    def once(eventType: String, f: js.Function): Unit = js.native
    
    // Send a message to user on your network
    // If the message is sent to a userId, it is sent to all clients
    // If the message is sent to a clientId, it is sent to just that one client
    // If the destination id is not specified or invalid, promise rejects.
    def sendMessage(destinationId: String, message: String): js.Promise[Unit] = js.native
  }
  
  // The profile of a user on a social network.
  @js.native
  trait UserProfile extends StObject {
    
    // Image URI (e.g. data:image/png;base64,adkwe329...)
    var imageData: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var status: js.UndefOr[Double] = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var userId: String = js.native
  }
  object UserProfile {
    
    @scala.inline
    def apply(name: String, userId: String): UserProfile = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserProfile]
    }
    
    @scala.inline
    implicit class UserProfileMutableBuilder[Self <: UserProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageData(value: String): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  type Users = StringDictionary[UserProfile]
}
