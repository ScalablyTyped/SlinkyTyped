package typingsSlinky.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseAnalyticsTypes.mod.DynamicConfig
import typingsSlinky.firebaseAnalyticsTypes.mod.Gtag
import typingsSlinky.firebaseAnalyticsTypes.mod.MinimalDynamicConfig
import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializeIdsMod {
  
  @JSImport("@firebase/analytics/dist/src/initialize-ids", "initializeIds")
  @js.native
  def initializeIds(
    app: FirebaseApp,
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    measurementIdToAppId: StringDictionary[String],
    installations: FirebaseInstallations,
    gtagCore: Gtag
  ): js.Promise[String] = js.native
}
