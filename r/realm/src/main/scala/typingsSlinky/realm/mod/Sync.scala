package typingsSlinky.realm.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.realm.Realm.Sync.ChangeEvent
import typingsSlinky.realm.Realm.Sync.LocalRealm
import typingsSlinky.realm.Realm.Sync.LogLevel
import typingsSlinky.realm.Realm.Sync.NumericLogLevel
import typingsSlinky.realm.Realm.Sync.OpenRealmBehaviorConfiguration
import typingsSlinky.realm.Realm.Sync.RealmListenerConfiguration
import typingsSlinky.realm.Realm.Sync.RealmListenerEventName
import typingsSlinky.realm.Realm.Sync.RealmWatchPredicate
import typingsSlinky.realm.Realm.Sync.SSLConfiguration
import typingsSlinky.realm.Realm.Sync.SerializedTokenUser
import typingsSlinky.realm.Realm.Sync.SerializedUser
import typingsSlinky.realm.anon.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sync
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.html }
  */
@JSImport("realm", "Sync")
@js.native
object Sync extends js.Object {
  @js.native
  class Adapter protected ()
    extends typingsSlinky.realm.Realm.Sync.Adapter {
    def this(
      local_path: String,
      server_url: String,
      admin_user: typingsSlinky.realm.Realm.Sync.User,
      filter: String,
      change_callback: js.Function
    ) = this()
    def this(
      local_path: String,
      server_url: String,
      admin_user: typingsSlinky.realm.Realm.Sync.User,
      filter: RealmWatchPredicate,
      change_callback: js.Function
    ) = this()
    def this(
      local_path: String,
      server_url: String,
      admin_user: typingsSlinky.realm.Realm.Sync.User,
      filter: String,
      change_callback: js.Function,
      ssl: SSLConfiguration
    ) = this()
    def this(
      local_path: String,
      server_url: String,
      admin_user: typingsSlinky.realm.Realm.Sync.User,
      filter: RealmWatchPredicate,
      change_callback: js.Function,
      ssl: SSLConfiguration
    ) = this()
  }
  
  @js.native
  class AdminCredentials ()
    extends typingsSlinky.realm.Realm.Sync.AdminCredentials
  
  /**
    * AuthError
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.AuthError.html }
    */
  @js.native
  class AuthError ()
    extends typingsSlinky.realm.Realm.Sync.AuthError
  
  @js.native
  class Credentials ()
    extends typingsSlinky.realm.Realm.Sync.Credentials
  
  @js.native
  class Permission ()
    extends typingsSlinky.realm.Realm.Sync.Permission
  
  @js.native
  class PermissionChange ()
    extends typingsSlinky.realm.Realm.Sync.PermissionChange
  
  @js.native
  class PermissionOffer ()
    extends typingsSlinky.realm.Realm.Sync.PermissionOffer
  
  /**
    * Session
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Session.html }
    */
  @js.native
  class Session ()
    extends typingsSlinky.realm.Realm.Sync.Session
  
  /**
    * Subscription
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.Subscription.html }
    */
  @js.native
  class Subscription ()
    extends typingsSlinky.realm.Realm.Sync.Subscription
  
  /**
    * User
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.User.html }
    */
  @js.native
  class User ()
    extends typingsSlinky.realm.Realm.Sync.User
  
  var downloadBeforeOpenBehavior: OpenRealmBehaviorConfiguration = js.native
  var openLocalRealmBehavior: OpenRealmBehaviorConfiguration = js.native
  def addListener(
    config: RealmListenerConfiguration,
    eventName: RealmListenerEventName,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, js.Promise[Unit] | Unit]
  ): js.Promise[Unit] = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def addListener(
    serverURL: String,
    adminUser: typingsSlinky.realm.Realm.Sync.User,
    regex: String,
    name: RealmListenerEventName,
    changeCallback: js.Function1[/* changeEvent */ ChangeEvent, js.Promise[Unit] | Unit]
  ): js.Promise[Unit] = js.native
  @JSName("_hasExistingSessions")
  def hasExistingSessions(): Boolean = js.native
  def initiateClientReset(path: String): Unit = js.native
  def localListenerRealms(regex: String): js.Array[LocalRealm] = js.native
  def reconnect(): Unit = js.native
  def removeAllListeners(): js.Promise[Unit] = js.native
  def removeListener(regex: String, name: String, changeCallback: js.Function1[/* changeEvent */ ChangeEvent, Unit]): js.Promise[Unit] = js.native
  /**
    * @deprecated, to be removed in future versions
    */
  def setFeatureToken(token: String): Unit = js.native
  def setLogLevel(logLevel: LogLevel): Unit = js.native
  def setLogger(callback: js.Function2[/* level */ NumericLogLevel, /* message */ String, Unit]): Unit = js.native
  def setUserAgent(userAgent: String): Unit = js.native
  @js.native
  object ConnectionState extends js.Object {
    /* "connected" */ val Connected: typingsSlinky.realm.Realm.Sync.ConnectionState.Connected with String = js.native
    /* "connecting" */ val Connecting: typingsSlinky.realm.Realm.Sync.ConnectionState.Connecting with String = js.native
    /* "disconnected" */ val Disconnected: typingsSlinky.realm.Realm.Sync.ConnectionState.Disconnected with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.realm.Realm.Sync.ConnectionState with String] = js.native
  }
  
  /* static members */
  @js.native
  object Credentials extends js.Object {
    def adminToken(token: String): typingsSlinky.realm.Realm.Sync.AdminCredentials = js.native
    def anonymous(): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def azureAD(token: String): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def custom(providerName: String, token: String): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def custom(providerName: String, token: String, userInfo: StringDictionary[js.Any]): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def facebook(token: String): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def google(token: String): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def jwt(token: String): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def jwt(token: String, providerName: String): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def nickname(value: String): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def nickname(value: String, isAdmin: Boolean): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def usernamePassword(username: String, password: String): typingsSlinky.realm.Realm.Sync.Credentials = js.native
    def usernamePassword(username: String, password: String, createUser: Boolean): typingsSlinky.realm.Realm.Sync.Credentials = js.native
  }
  
  @js.native
  object NumericLogLevel extends js.Object {
    /* 0 */ val All: typingsSlinky.realm.Realm.Sync.NumericLogLevel.All with Double = js.native
    /* 2 */ val Debug: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Debug with Double = js.native
    /* 3 */ val Detail: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Detail with Double = js.native
    /* 6 */ val Error: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Error with Double = js.native
    /* 7 */ val Fatal: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Fatal with Double = js.native
    /* 4 */ val Info: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Info with Double = js.native
    /* 8 */ val Off: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Off with Double = js.native
    /* 1 */ val Trace: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Trace with Double = js.native
    /* 5 */ val Warn: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.realm.Realm.Sync.NumericLogLevel with Double] = js.native
  }
  
  @js.native
  object SubscriptionState extends js.Object {
    /* 3 */ val Complete: typingsSlinky.realm.Realm.Sync.SubscriptionState.Complete with Double = js.native
    /* 1 */ val Creating: typingsSlinky.realm.Realm.Sync.SubscriptionState.Creating with Double = js.native
    /* 0 */ val Error: typingsSlinky.realm.Realm.Sync.SubscriptionState.Error with Double = js.native
    /* 4 */ val Invalidated: typingsSlinky.realm.Realm.Sync.SubscriptionState.Invalidated with Double = js.native
    /* 2 */ val Pending: typingsSlinky.realm.Realm.Sync.SubscriptionState.Pending with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.realm.Realm.Sync.SubscriptionState with Double] = js.native
  }
  
  /* static members */
  @js.native
  object User extends js.Object {
    val all: StringDictionary[typingsSlinky.realm.Realm.Sync.User] = js.native
    val current: js.UndefOr[typingsSlinky.realm.Realm.Sync.User] = js.native
    // Deprecated
    /** @deprecated, to be removed in future versions */
    def adminUser(adminToken: String): typingsSlinky.realm.Realm.Sync.User = js.native
    def adminUser(adminToken: String, server: String): typingsSlinky.realm.Realm.Sync.User = js.native
    /** @deprecated, to be removed in future versions */
    def authenticate(server: String, provider: String, options: js.Any): js.Promise[typingsSlinky.realm.Realm.Sync.User] = js.native
    def completePasswordReset(server: String, resetToken: String, newPassword: String): js.Promise[Unit] = js.native
    def confirmEmail(server: String, confirmationToken: String): js.Promise[Unit] = js.native
    def deserialize(serialized: SerializedTokenUser): typingsSlinky.realm.Realm.Sync.User = js.native
    def deserialize(serialized: SerializedUser): typingsSlinky.realm.Realm.Sync.User = js.native
    def login(server: String, credentials: typingsSlinky.realm.Realm.Sync.AdminCredentials): typingsSlinky.realm.Realm.Sync.User = js.native
    def login(server: String, credentials: typingsSlinky.realm.Realm.Sync.Credentials): js.Promise[typingsSlinky.realm.Realm.Sync.User] = js.native
    /** @deprecated, to be removed in future versions */
    def login(server: String, username: String, password: String): js.Promise[typingsSlinky.realm.Realm.Sync.User] = js.native
    /** @deprecated, to be removed in future versions */
    def register(server: String, username: String, password: String): js.Promise[typingsSlinky.realm.Realm.Sync.User] = js.native
    /** @deprecated, to be removed in future versions */
    def registerWithProvider(server: String, options: Provider): js.Promise[typingsSlinky.realm.Realm.Sync.User] = js.native
    def requestEmailConfirmation(server: String, email: String): js.Promise[Unit] = js.native
    def requestPasswordReset(server: String, email: String): js.Promise[Unit] = js.native
  }
  
}

