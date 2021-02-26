package typingsSlinky.firebaseAnalytics

import typingsSlinky.firebaseAnalytics.anon.DynamicConfigPromisesList
import typingsSlinky.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import typingsSlinky.firebaseAnalyticsTypes.mod.SettingsOptions
import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@firebase/analytics/dist/src/factory", "factory")
  @js.native
  def factory(app: FirebaseApp, installations: FirebaseInstallations): FirebaseAnalytics = js.native
  
  @JSImport("@firebase/analytics/dist/src/factory", "getGlobalVars")
  @js.native
  def getGlobalVars(): DynamicConfigPromisesList = js.native
  
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: js.UndefOr[scala.Nothing],
    newInitializationPromisesMap: js.UndefOr[scala.Nothing],
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(newGlobalInitDone: js.UndefOr[scala.Nothing], newInitializationPromisesMap: js.Object): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: js.UndefOr[scala.Nothing],
    newInitializationPromisesMap: js.Object,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(newGlobalInitDone: Boolean): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: Boolean,
    newInitializationPromisesMap: js.UndefOr[scala.Nothing],
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(newGlobalInitDone: Boolean, newInitializationPromisesMap: js.Object): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: Boolean,
    newInitializationPromisesMap: js.Object,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  
  @JSImport("@firebase/analytics/dist/src/factory", "settings")
  @js.native
  def settings(options: SettingsOptions): Unit = js.native
}
