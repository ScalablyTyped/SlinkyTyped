package typingsSlinky.firebaseAppTypes.mod

import typingsSlinky.firebaseAppTypes.anon.Call
import typingsSlinky.firebaseLogger.loggerMod.LogCallback
import typingsSlinky.firebaseLogger.loggerMod.LogLevelString
import typingsSlinky.firebaseLogger.loggerMod.LogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseNamespace extends js.Object {
  
  // The current SDK version.
  var SDK_VERSION: String = js.native
  
  /**
    * Retrieve an instance of a FirebaseApp.
    *
    * Usage: firebase.app()
    *
    * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
    */
  def app(): FirebaseApp = js.native
  def app(name: String): FirebaseApp = js.native
  @JSName("app")
  var app_Original: Call = js.native
  
  /**
    * A (read-only) array of all the initialized Apps.
    */
  var apps: js.Array[FirebaseApp] = js.native
  
  /**
    * Create (and initialize) a FirebaseApp.
    *
    * @param options Options to configure the services used in the App.
    * @param config The optional config for your firebase app
    */
  def initializeApp(options: FirebaseOptions): FirebaseApp = js.native
  def initializeApp(options: FirebaseOptions, config: FirebaseAppConfig): FirebaseApp = js.native
  def initializeApp(options: FirebaseOptions, name: String): FirebaseApp = js.native
  
  // Sets log handler for all Firebase components.
  def onLog(logCallback: LogCallback): Unit = js.native
  def onLog(logCallback: LogCallback, options: LogOptions): Unit = js.native
  
  /**
    * Registers a library's name and version for platform logging purposes.
    * @param library Name of 1p or 3p library (e.g. firestore, angularfire)
    * @param version Current version of that library.
    */
  def registerVersion(library: String, version: String): Unit = js.native
  def registerVersion(library: String, version: String, variant: String): Unit = js.native
  
  // Sets log level for all Firebase components.
  def setLogLevel(logLevel: LogLevelString): Unit = js.native
}
