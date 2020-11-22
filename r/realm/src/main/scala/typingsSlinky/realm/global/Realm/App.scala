package typingsSlinky.realm.global.Realm

import typingsSlinky.realm.Realm.App.Sync.LogLevel
import typingsSlinky.realm.Realm.App.Sync.NumericLogLevel
import typingsSlinky.realm.Realm.AppConfiguration
import typingsSlinky.realm.Realm.DefaultFunctionsFactory
import typingsSlinky.realm.Realm.OpenRealmBehaviorConfiguration
import typingsSlinky.realm.anon.TypeofCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
/* static members */
@JSGlobal("Realm.App")
@js.native
object App extends js.Object {
  
  /**
    * All credentials available for authentication.
    */
  val Credentials: TypeofCredentials = js.native
  
  /**
    * Get or create a singleton Realm App from an id.
    * Calling this function multiple times with the same id will return the same instance.
    *
    * @param id The Realm App id visible from the MongoDB Realm UI or a configuration.
    * @returns The Realm App instance.
    */
  def getApp(appId: String): typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _] = js.native
  
  @js.native
  object Sync extends js.Object {
    
    /**
      * The default behavior settings if you want to wait for downloading a synchronized Realm to complete before opening it.
      */
    val downloadBeforeOpenBehavior: OpenRealmBehaviorConfiguration = js.native
    
    def enableSessionMultiplexing(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _]): Unit = js.native
    
    def getAllSyncSessions(user: typingsSlinky.realm.Realm.User[DefaultFunctionsFactory, _]): js.Array[typingsSlinky.realm.Realm.App.Sync.Session] = js.native
    
    def getSyncSession(user: typingsSlinky.realm.Realm.User[DefaultFunctionsFactory, _]): typingsSlinky.realm.Realm.App.Sync.Session = js.native
    def getSyncSession(user: typingsSlinky.realm.Realm.User[DefaultFunctionsFactory, _], partitionValue: String): typingsSlinky.realm.Realm.App.Sync.Session = js.native
    def getSyncSession(
      user: typingsSlinky.realm.Realm.User[DefaultFunctionsFactory, _],
      partitionValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectId */ js.Any
    ): typingsSlinky.realm.Realm.App.Sync.Session = js.native
    def getSyncSession(user: typingsSlinky.realm.Realm.User[DefaultFunctionsFactory, _], partitionValue: Double): typingsSlinky.realm.Realm.App.Sync.Session = js.native
    
    @JSName("_hasExistingSessions")
    def hasExistingSessions(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _]): Boolean = js.native
    
    def initiateClientReset(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _], path: String): Unit = js.native
    
    /**
      * The default behavior settings if you want to open a synchronized Realm immediately and start working on it.
      * If this is the first time you open the Realm, it will be empty while the server data is being downloaded in the background.
      */
    val openLocalRealmBehavior: OpenRealmBehaviorConfiguration = js.native
    
    def reconnect(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _]): Unit = js.native
    
    def setLogLevel(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _], logLevel: LogLevel): Unit = js.native
    
    def setLogger(
      app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _],
      callback: js.Function2[/* level */ NumericLogLevel, /* message */ String, Unit]
    ): Unit = js.native
    
    def setUserAgent(app: typingsSlinky.realm.Realm.App[DefaultFunctionsFactory, _], userAgent: String): Unit = js.native
    
    /**
      * AuthError
      */
    @js.native
    class AuthError ()
      extends typingsSlinky.realm.Realm.App.Sync.AuthError
    
    @js.native
    object NumericLogLevel extends js.Object {
      
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
    
    @js.native
    class Session ()
      extends typingsSlinky.realm.Realm.App.Sync.Session
  }
}
