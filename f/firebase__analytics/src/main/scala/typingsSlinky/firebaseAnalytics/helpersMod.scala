package typingsSlinky.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLScriptElement
import typingsSlinky.firebaseAnalytics.anon.GtagCore
import typingsSlinky.firebaseAnalyticsTypes.mod.DataLayer
import typingsSlinky.firebaseAnalyticsTypes.mod.Gtag
import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseInstallationsTypes.mod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics/dist/src/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def findGtagScriptOnPage(): HTMLScriptElement | Null = js.native
  def getOrCreateDataLayer(dataLayerName: String): DataLayer = js.native
  def initializeGAId(app: FirebaseApp, installations: FirebaseInstallations, gtagCore: Gtag): js.Promise[Unit] = js.native
  def insertScriptTag(dataLayerName: String): Unit = js.native
  def wrapOrCreateGtag(
    initializedIdPromisesMap: StringDictionary[js.Promise[Unit]],
    dataLayerName: String,
    gtagFunctionName: String
  ): GtagCore = js.native
}

