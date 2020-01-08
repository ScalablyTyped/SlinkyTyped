package typingsSlinky.atFirebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLScriptElement
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.DataLayer
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.Gtag
import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typingsSlinky.atFirebaseInstallationsDashTypes.atFirebaseInstallationsDashTypesMod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics/dist/src/helpers", JSImport.Namespace)
@js.native
object distSrcHelpersMod extends js.Object {
  def findGtagScriptOnPage(): HTMLScriptElement | Null = js.native
  def getOrCreateDataLayer(dataLayerName: String): DataLayer = js.native
  def initializeGAId(app: FirebaseApp, installations: FirebaseInstallations, gtagCore: Gtag): js.Promise[Unit] = js.native
  def insertScriptTag(dataLayerName: String): Unit = js.native
  def wrapOrCreateGtag(
    initializedIdPromisesMap: StringDictionary[js.Promise[Unit]],
    dataLayerName: String,
    gtagFunctionName: String
  ): Anon_GtagCore = js.native
}

