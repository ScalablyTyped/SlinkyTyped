package typingsSlinky.firebaseAnalytics

import typingsSlinky.firebaseAnalytics.anon.InitializedIdPromisesMap
import typingsSlinky.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import typingsSlinky.firebaseAnalyticsTypes.mod.SettingsOptions
import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseInstallationsTypes.mod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/analytics/dist/src/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  
  def factory(app: FirebaseApp, installations: FirebaseInstallations): FirebaseAnalytics = js.native
  
  def getGlobalVars(): InitializedIdPromisesMap = js.native
  
  def resetGlobalVars(): Unit = js.native
  def resetGlobalVars(newGlobalInitDone: js.UndefOr[scala.Nothing], newGaInitializedPromise: js.Object): Unit = js.native
  def resetGlobalVars(newGlobalInitDone: Boolean): Unit = js.native
  def resetGlobalVars(newGlobalInitDone: Boolean, newGaInitializedPromise: js.Object): Unit = js.native
  
  def settings(options: SettingsOptions): Unit = js.native
}
