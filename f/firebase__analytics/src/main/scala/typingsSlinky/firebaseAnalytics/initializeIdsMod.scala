package typingsSlinky.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseAnalyticsTypes.mod.DynamicConfig
import typingsSlinky.firebaseAnalyticsTypes.mod.Gtag
import typingsSlinky.firebaseAnalyticsTypes.mod.MinimalDynamicConfig
import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseInstallationsTypes.mod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/analytics/dist/src/initialize-ids", JSImport.Namespace)
@js.native
object initializeIdsMod extends js.Object {
  
  def initializeIds(
    app: FirebaseApp,
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    measurementIdToAppId: StringDictionary[String],
    installations: FirebaseInstallations,
    gtagCore: Gtag
  ): js.Promise[String] = js.native
}
