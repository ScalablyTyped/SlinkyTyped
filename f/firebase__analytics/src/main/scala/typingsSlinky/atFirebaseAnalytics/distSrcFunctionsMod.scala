package typingsSlinky.atFirebaseAnalytics

import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.AnalyticsCallOptions
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.CustomParams
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.EventParams
import typingsSlinky.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.Gtag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics/dist/src/functions", JSImport.Namespace)
@js.native
object distSrcFunctionsMod extends js.Object {
  def logEvent(gtagFunction: Gtag, analyticsId: String, eventName: String): Unit = js.native
  def logEvent(gtagFunction: Gtag, analyticsId: String, eventName: String, eventParams: EventParams): Unit = js.native
  def logEvent(
    gtagFunction: Gtag,
    analyticsId: String,
    eventName: String,
    eventParams: EventParams,
    options: AnalyticsCallOptions
  ): Unit = js.native
  def setAnalyticsCollectionEnabled(analyticsId: String, enabled: Boolean): Unit = js.native
  def setCurrentScreen(gtagFunction: Gtag, analyticsId: String): Unit = js.native
  def setCurrentScreen(gtagFunction: Gtag, analyticsId: String, screenName: String): Unit = js.native
  def setCurrentScreen(gtagFunction: Gtag, analyticsId: String, screenName: String, options: AnalyticsCallOptions): Unit = js.native
  def setCurrentScreen(gtagFunction: Gtag, analyticsId: String, screenName: Null, options: AnalyticsCallOptions): Unit = js.native
  def setUserId(gtagFunction: Gtag, analyticsId: String): Unit = js.native
  def setUserId(gtagFunction: Gtag, analyticsId: String, id: String): Unit = js.native
  def setUserId(gtagFunction: Gtag, analyticsId: String, id: String, options: AnalyticsCallOptions): Unit = js.native
  def setUserId(gtagFunction: Gtag, analyticsId: String, id: Null, options: AnalyticsCallOptions): Unit = js.native
  def setUserProperties(gtagFunction: Gtag, analyticsId: String, properties: CustomParams): Unit = js.native
  def setUserProperties(gtagFunction: Gtag, analyticsId: String, properties: CustomParams, options: AnalyticsCallOptions): Unit = js.native
}

