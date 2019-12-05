package typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod

import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.Firebase.Options
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.Analytics
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth.Auth
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.config.Config
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.crashlytics.Crashlytics
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.Database
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Firestore
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.functions.Functions
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.iid.InstanceId
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.links.Links
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.messaging.Messaging
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Notifications
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.perf.Perf
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "App")
@js.native
class App protected () extends js.Object {
  // utils(): RNFirebase.utils.Utils;
  val name: String = js.native
  val options: Options = js.native
  // admob(): RNFirebase.admob.AdMob;
  def analytics(): Analytics = js.native
  def auth(): Auth = js.native
  def config(): Config = js.native
  def crashlytics(): Crashlytics = js.native
  def database(): Database = js.native
  def firestore(): Firestore = js.native
  def functions(): Functions = js.native
  def functions(appOrRegion: String): Functions = js.native
  def functions(appOrRegion: String, region: String): Functions = js.native
  def functions(appOrRegion: App): Functions = js.native
  def functions(appOrRegion: App, region: String): Functions = js.native
  def iid(): InstanceId = js.native
  def links(): Links = js.native
  def messaging(): Messaging = js.native
  def notifications(): Notifications = js.native
  def onReady(): js.Promise[App] = js.native
  def perf(): Perf = js.native
  def storage(): Storage = js.native
}

