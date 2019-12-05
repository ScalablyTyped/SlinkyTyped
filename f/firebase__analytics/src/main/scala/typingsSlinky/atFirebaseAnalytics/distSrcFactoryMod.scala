package typingsSlinky.atFirebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.FirebaseAnalytics
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.SettingsOptions
import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics/dist/src/factory", JSImport.Namespace)
@js.native
object distSrcFactoryMod extends js.Object {
  def factory(app: FirebaseApp, extendApp: js.Function1[/* props */ StringDictionary[js.Any], Unit]): FirebaseAnalytics = js.native
  def resetGlobalVars(): Unit = js.native
  def resetGlobalVars(newGlobalInitDone: Boolean): Unit = js.native
  def resetGlobalVars(newGlobalInitDone: Boolean, newGaInitializedPromise: js.Object): Unit = js.native
  def settings(options: SettingsOptions): Unit = js.native
}

