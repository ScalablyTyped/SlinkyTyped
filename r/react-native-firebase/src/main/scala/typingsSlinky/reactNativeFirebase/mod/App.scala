package typingsSlinky.reactNativeFirebase.mod

import typingsSlinky.reactNativeFirebase.mod.Firebase.Options
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.Analytics
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.auth.Auth
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.config.Config
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.crashlytics.Crashlytics
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.database.Database
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Firestore
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.functions.Functions
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.iid.InstanceId
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.links.Links
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.messaging.Messaging
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Notifications
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.perf.Perf
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.Storage
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
  def functions(appOrRegion: js.UndefOr[scala.Nothing], region: String): Functions = js.native
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

