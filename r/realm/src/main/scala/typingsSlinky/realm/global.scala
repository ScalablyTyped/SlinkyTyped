package typingsSlinky.realm

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.realm.Realm.App.Sync.LogLevel
import typingsSlinky.realm.Realm.App.Sync.NumericLogLevel
import typingsSlinky.realm.Realm.AppConfiguration
import typingsSlinky.realm.Realm.Configuration
import typingsSlinky.realm.Realm.Credentials.AnonymousPayload
import typingsSlinky.realm.Realm.Credentials.ApiKeyPayload
import typingsSlinky.realm.Realm.Credentials.ApplePayload
import typingsSlinky.realm.Realm.Credentials.EmailPasswordPayload
import typingsSlinky.realm.Realm.Credentials.FacebookPayload
import typingsSlinky.realm.Realm.Credentials.FunctionPayload
import typingsSlinky.realm.Realm.Credentials.GooglePayload
import typingsSlinky.realm.Realm.Credentials.JWTPayload
import typingsSlinky.realm.Realm.DefaultFunctionsFactory
import typingsSlinky.realm.Realm.ObjectSchema
import typingsSlinky.realm.Realm.OpenRealmBehaviorConfiguration
import typingsSlinky.realm.anon.TypeofCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Realm")
  @js.native
  /**
    * @param  {Realm.Configuration} config?
    */
  class Realm ()
    extends typingsSlinky.realm.Realm {
    def this(config: Configuration) = this()
    def this(path: String) = this()
  }
  object Realm {
    
    @JSGlobal("Realm")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A MongoDB Realm App.
      */
    @JSGlobal("Realm.App")
    @js.native
    class App[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] protected ()
      extends typingsSlinky.realm.Realm.App[FunctionsFactoryType, CustomDataType] {
      /**
        * Construct a MongoDB Realm App.
        *
        * @param idOrConfiguration The id string or configuration for the app.
        */
      def this(idOrConfiguration: String) = this()
      def this(idOrConfiguration: AppConfiguration) = this()
    }
    object App {
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("Realm.App.Credentials")
      @js.native
      class Credentials[PayloadType /* <: js.Object */] ()
        extends typingsSlinky.realm.Realm.Credentials[PayloadType]
      /**
        * All credentials available for authentication.
        */
      /* static member */
      /* was `typeof Credentials` */
      @JSGlobal("Realm.App.Credentials")
      @js.native
      val Credentials: TypeofCredentials with Instantiable0[typingsSlinky.realm.Realm.Credentials[js.Object]] = js.native
      
      object Sync {
        
        /**
          * AuthError
          */
        @JSGlobal("Realm.App.Sync.AuthError")
        @js.native
        class AuthError ()
          extends typingsSlinky.realm.Realm.App.Sync.AuthError
        
        @JSGlobal("Realm.App.Sync.NumericLogLevel")
        @js.native
        object NumericLogLevel extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsSlinky.realm.Realm.App.Sync.NumericLogLevel with Double] = js.native
          
          /* 0 */ val All: typingsSlinky.realm.Realm.App.Sync.NumericLogLevel.All with Double = js.native
          
          /* 2 */ val Debug: typingsSlinky.realm.Realm.App.Sync.NumericLogLevel.Debug with Double = js.native
          
          /* 3 */ val Detail: typingsSlinky.realm.Realm.App.Sync.NumericLogLevel.Detail with Double = js.native
          
          /* 6 */ val Error: typingsSlinky.realm.Realm.App.Sync.NumericLogLevel.Error with Double = js.native
          
          /* 7 */ val Fatal: typingsSlinky.realm.Realm.App.Sync.NumericLogLevel.Fatal with Double = js.native
          
          /* 4 */ val Info: typingsSlinky.realm.Realm.App.Sync.NumericLogLevel.Info with Double = js.native
          
          /* 8 */ val Off: typingsSlinky.realm.Realm.App.Sync.NumericLogLevel.Off with Double = js.native
          
          /* 1 */ val Trace: typingsSlinky.realm.Realm.App.Sync.NumericLogLevel.Trace with Double = js.native
          
          /* 5 */ val Warn: typingsSlinky.realm.Realm.App.Sync.NumericLogLevel.Warn with Double = js.native
        }
        
        @JSGlobal("Realm.App.Sync.Session")
        @js.native
        class Session ()
          extends typingsSlinky.realm.Realm.App.Sync.Session
        
        /**
          * The default behavior settings if you want to wait for downloading a synchronized Realm to complete before opening it.
          */
        @JSGlobal("Realm.App.Sync.downloadBeforeOpenBehavior")
        @js.native
        val downloadBeforeOpenBehavior: OpenRealmBehaviorConfiguration = js.native
        
        @JSGlobal("Realm.App.Sync.enableSessionMultiplexing")
        @js.native
        def enableSessionMultiplexing(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _]): Unit = js.native
        
        @JSGlobal("Realm.App.Sync.getAllSyncSessions")
        @js.native
        def getAllSyncSessions(user: typingsSlinky.realm.Realm.User[DefaultFunctionsFactory, _]): js.Array[typingsSlinky.realm.Realm.App.Sync.Session] = js.native
        
        @JSGlobal("Realm.App.Sync.getSyncSession")
        @js.native
        def getSyncSession(user: typingsSlinky.realm.Realm.User[DefaultFunctionsFactory, _]): typingsSlinky.realm.Realm.App.Sync.Session = js.native
        @JSGlobal("Realm.App.Sync.getSyncSession")
        @js.native
        def getSyncSession(user: typingsSlinky.realm.Realm.User[DefaultFunctionsFactory, _], partitionValue: String): typingsSlinky.realm.Realm.App.Sync.Session = js.native
        @JSGlobal("Realm.App.Sync.getSyncSession")
        @js.native
        def getSyncSession(
          user: typingsSlinky.realm.Realm.User[DefaultFunctionsFactory, _],
          partitionValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectId */ js.Any
        ): typingsSlinky.realm.Realm.App.Sync.Session = js.native
        @JSGlobal("Realm.App.Sync.getSyncSession")
        @js.native
        def getSyncSession(user: typingsSlinky.realm.Realm.User[DefaultFunctionsFactory, _], partitionValue: Double): typingsSlinky.realm.Realm.App.Sync.Session = js.native
        
        @JSGlobal("Realm.App.Sync._hasExistingSessions")
        @js.native
        def hasExistingSessions(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _]): Boolean = js.native
        
        @JSGlobal("Realm.App.Sync.initiateClientReset")
        @js.native
        def initiateClientReset(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _], path: String): Unit = js.native
        
        /**
          * The default behavior settings if you want to open a synchronized Realm immediately and start working on it.
          * If this is the first time you open the Realm, it will be empty while the server data is being downloaded in the background.
          */
        @JSGlobal("Realm.App.Sync.openLocalRealmBehavior")
        @js.native
        val openLocalRealmBehavior: OpenRealmBehaviorConfiguration = js.native
        
        @JSGlobal("Realm.App.Sync.reconnect")
        @js.native
        def reconnect(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _]): Unit = js.native
        
        @JSGlobal("Realm.App.Sync.setLogLevel")
        @js.native
        def setLogLevel(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _], logLevel: LogLevel): Unit = js.native
        
        @JSGlobal("Realm.App.Sync.setLogger")
        @js.native
        def setLogger(
          app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _],
          callback: js.Function2[/* level */ NumericLogLevel, /* message */ String, Unit]
        ): Unit = js.native
        
        @JSGlobal("Realm.App.Sync.setUserAgent")
        @js.native
        def setUserAgent(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _], userAgent: String): Unit = js.native
      }
      
      /**
        * Get or create a singleton Realm App from an id.
        * Calling this function multiple times with the same id will return the same instance.
        *
        * @param id The Realm App id visible from the MongoDB Realm UI or a configuration.
        * @returns The Realm App instance.
        */
      /* static member */
      @JSGlobal("Realm.App.getApp")
      @js.native
      def getApp(appId: String): typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _] = js.native
    }
    
    object Auth {
      
      /**
        * Authentication provider where users identify using an API-key.
        */
      @JSGlobal("Realm.Auth.ApiKeyAuth")
      @js.native
      class ApiKeyAuth ()
        extends typingsSlinky.realm.Realm.Auth.ApiKeyAuth
      
      /**
        * Authentication provider where users identify using email and password.
        */
      @JSGlobal("Realm.Auth.EmailPasswordAuth")
      @js.native
      class EmailPasswordAuth ()
        extends typingsSlinky.realm.Realm.Auth.EmailPasswordAuth
    }
    
    @JSGlobal("Realm.ConnectionState")
    @js.native
    object ConnectionState extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.realm.Realm.ConnectionState with String] = js.native
      
      /* "connected" */ val Connected: typingsSlinky.realm.Realm.ConnectionState.Connected with String = js.native
      
      /* "connecting" */ val Connecting: typingsSlinky.realm.Realm.ConnectionState.Connecting with String = js.native
      
      /* "disconnected" */ val Disconnected: typingsSlinky.realm.Realm.ConnectionState.Disconnected with String = js.native
    }
    
    // TODO: Add providerCapabilities?
    /**
      * End-users enter credentials to authenticate toward your MongoDB Realm App.
      */
    @JSGlobal("Realm.Credentials")
    @js.native
    class Credentials[PayloadType /* <: js.Object */] ()
      extends typingsSlinky.realm.Realm.Credentials[PayloadType]
    object Credentials {
      
      /**
        * Factory for `Credentials` which authenticate using the [Anonymous Provider](https://docs.mongodb.com/realm/authentication/anonymous/).
        *
        * @returns A `Credentials` object for logging in using `app.logIn`.
        */
      /* static member */
      @JSGlobal("Realm.Credentials.anonymous")
      @js.native
      def anonymous(): typingsSlinky.realm.Realm.Credentials[AnonymousPayload] = js.native
      
      /**
        * Factory for `Credentials` which authenticate using the [Apple ID Provider](https://docs.mongodb.com/realm/authentication/apple/).
        *
        * @param idToken The id_token returned from Apple.
        * @returns A `Credentials` object for logging in using `app.logIn`.
        */
      /* static member */
      @JSGlobal("Realm.Credentials.apple")
      @js.native
      def apple(idToken: String): typingsSlinky.realm.Realm.Credentials[ApplePayload] = js.native
      
      /**
        * Factory for `Credentials` which authenticate using the [Email/Password Provider](https://docs.mongodb.com/realm/authentication/email-password/).
        * Note: This was formerly known as the "Username/Password" provider.
        *
        * @param email The end-users email address.
        * @param password The end-users password.
        * @returns A `Credentials` object for logging in using `app.logIn`.
        */
      /* static member */
      @JSGlobal("Realm.Credentials.emailPassword")
      @js.native
      def emailPassword(email: String, password: String): typingsSlinky.realm.Realm.Credentials[EmailPasswordPayload] = js.native
      
      /**
        * Factory for `Credentials` which authenticate using the [Facebook Provider](https://docs.mongodb.com/realm/authentication/facebook/).
        *
        * @param accessToken The access token returned from Facebook.
        * @returns A `Credentials` object for logging in using `app.logIn`.
        */
      /* static member */
      @JSGlobal("Realm.Credentials.facebook")
      @js.native
      def facebook(accessToken: String): typingsSlinky.realm.Realm.Credentials[FacebookPayload] = js.native
      
      /**
        * Factory for `Credentials` which authenticate using the [Custom Function Provider](https://docs.mongodb.com/realm/authentication/custom-function/).
        *
        * @param payload The custom payload as expected by the server.
        * @returns A `Credentials` object for logging in using `app.logIn`.
        */
      /* static member */
      @JSGlobal("Realm.Credentials.function")
      @js.native
      def function[PayloadType /* <: FunctionPayload */](payload: PayloadType): typingsSlinky.realm.Realm.Credentials[PayloadType] = js.native
      
      /**
        * Factory for `Credentials` which authenticate using the [Google Provider](https://docs.mongodb.com/realm/authentication/google/).
        *
        * @param authCode The auth code returned from Google.
        * @returns A `Credentials` object for logging in using `app.logIn`.
        */
      /* static member */
      @JSGlobal("Realm.Credentials.google")
      @js.native
      def google(authCode: String): typingsSlinky.realm.Realm.Credentials[GooglePayload] = js.native
      
      /**
        * Factory for `Credentials` which authenticate using the [Custom JWT Provider](https://docs.mongodb.com/realm/authentication/custom-jwt/).
        *
        * @param token The JSON Web Token (JWT).
        * @returns A `Credentials` object for logging in using `app.logIn`.
        */
      /* static member */
      @JSGlobal("Realm.Credentials.jwt")
      @js.native
      def jwt(token: String): typingsSlinky.realm.Realm.Credentials[JWTPayload] = js.native
      
      /**
        * Factory for `Credentials` which authenticate using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
        *
        * @deprecated Use `Credentials.apiKey`.
        *
        * @param key The secret content of the API key.
        * @returns A `Credentials` object for logging in using `app.logIn`.
        */
      /* static member */
      @JSGlobal("Realm.Credentials.serverApiKey")
      @js.native
      def serverApiKey(key: String): typingsSlinky.realm.Realm.Credentials[ApiKeyPayload] = js.native
      
      /**
        * Factory for `Credentials` which authenticate using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
        *
        * @deprecated Use `Credentials.apiKey`.
        *
        * @param key The secret content of the API key.
        * @returns A `Credentials` object for logging in using `app.logIn`.
        */
      /* static member */
      @JSGlobal("Realm.Credentials.userApiKey")
      @js.native
      def userApiKey(key: String): typingsSlinky.realm.Realm.Credentials[ApiKeyPayload] = js.native
    }
    
    /**
      * JsonSerializationReplacer solves circular structures when serializing Realm entities
      * @example JSON.stringify(realm.objects("Person"), Realm.JsonSerializationReplacer)
      */
    @JSGlobal("Realm.JsonSerializationReplacer")
    @js.native
    def JsonSerializationReplacer(key: String, `val`: js.Any): js.Any = js.native
    
    /**
      * Object
      * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Object.html }
      */
    @JSGlobal("Realm.Object")
    @js.native
    abstract class Object ()
      extends typingsSlinky.realm.Realm.Object
    
    @JSGlobal("Realm.UpdateMode")
    @js.native
    object UpdateMode extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.realm.Realm.UpdateMode with String] = js.native
      
      /* "all" */ val All: typingsSlinky.realm.Realm.UpdateMode.All with String = js.native
      
      /* "modified" */ val Modified: typingsSlinky.realm.Realm.UpdateMode.Modified with String = js.native
      
      /* "never" */ val Never: typingsSlinky.realm.Realm.UpdateMode.Never with String = js.native
    }
    
    /**
      * Representation of an authenticated user of an app.
      */
    @JSGlobal("Realm.User")
    @js.native
    class User[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] ()
      extends typingsSlinky.realm.Realm.User[FunctionsFactoryType, CustomDataType]
    
    /**
      * The state of a user.
      */
    @JSGlobal("Realm.UserState")
    @js.native
    object UserState extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.realm.Realm.UserState with String] = js.native
      
      /* "active" */ val Active: typingsSlinky.realm.Realm.UserState.Active with String = js.native
      
      /* "logged-out" */ val LoggedOut: typingsSlinky.realm.Realm.UserState.LoggedOut with String = js.native
      
      /* "removed" */ val Removed: typingsSlinky.realm.Realm.UserState.Removed with String = js.native
    }
    
    /**
      * The type of a user.
      */
    @JSGlobal("Realm.UserType")
    @js.native
    object UserType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.realm.Realm.UserType with String] = js.native
      
      /* "normal" */ val Normal: typingsSlinky.realm.Realm.UserType.Normal with String = js.native
      
      /* "server" */ val Server: typingsSlinky.realm.Realm.UserType.Server with String = js.native
    }
    
    /**
      * Clears the state by closing and deleting any Realm in the default directory and logout all users.
      * @private Not a part of the public API: It's primarily used from the library's tests.
      */
    /* static member */
    @JSGlobal("Realm.clearTestState")
    @js.native
    def clearTestState(): Unit = js.native
    
    /**
      * Copy all bundled Realm files to app's default file folder.
      */
    /* static member */
    @JSGlobal("Realm.copyBundledRealmFiles")
    @js.native
    def copyBundledRealmFiles(): Unit = js.native
    
    /**
      * @param {Realm.ObjectSchema} object schema describing the object that should be created.
      * @returns {T}
      */
    /* static member */
    @JSGlobal("Realm.createTemplateObject")
    @js.native
    def createTemplateObject[T](objectSchema: ObjectSchema): T with typingsSlinky.realm.Realm.Object = js.native
    
    /* static member */
    @JSGlobal("Realm.defaultPath")
    @js.native
    def defaultPath: String = js.native
    @scala.inline
    def defaultPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPath")(x.asInstanceOf[js.Any])
    
    /**
      * Delete the Realm file for the given configuration.
      * @param {Configuration} config
      */
    /* static member */
    @JSGlobal("Realm.deleteFile")
    @js.native
    def deleteFile(config: Configuration): Unit = js.native
    
    /**
      * Checks if the Realm already exists on disk.
      */
    /* static member */
    @JSGlobal("Realm.exists")
    @js.native
    def exists(config: Configuration): Boolean = js.native
    
    /**
      * Open a realm asynchronously with a promise. If the realm is synced, it will be fully synchronized before it is available.
      * @param {Configuration} config
      */
    /* static member */
    @JSGlobal("Realm.open")
    @js.native
    def open(config: Configuration): ProgressPromise = js.native
    
    /**
      * Get the current schema version of the Realm at the given path.
      * @param  {string} path
      * @param  {any} encryptionKey?
      * @returns number
      */
    /* static member */
    @JSGlobal("Realm.schemaVersion")
    @js.native
    def schemaVersion(path: String): Double = js.native
    @JSGlobal("Realm.schemaVersion")
    @js.native
    def schemaVersion(path: String, encryptionKey: js.typedarray.ArrayBuffer): Double = js.native
    @JSGlobal("Realm.schemaVersion")
    @js.native
    def schemaVersion(path: String, encryptionKey: js.typedarray.ArrayBufferView): Double = js.native
  }
}
