package typingsSlinky.ineum

import typingsSlinky.ineum.anon.BackendTraceId
import typingsSlinky.ineum.anon.ComponentStack
import typingsSlinky.ineum.ineumStrings.allowedOrigins
import typingsSlinky.ineum.ineumStrings.apiKey
import typingsSlinky.ineum.ineumStrings.beaconBatchingTime
import typingsSlinky.ineum.ineumStrings.getPageLoadId
import typingsSlinky.ineum.ineumStrings.ignoreErrorMessages
import typingsSlinky.ineum.ineumStrings.ignorePings
import typingsSlinky.ineum.ineumStrings.ignoreUrls
import typingsSlinky.ineum.ineumStrings.ignoreUserTimings
import typingsSlinky.ineum.ineumStrings.key
import typingsSlinky.ineum.ineumStrings.maxMaitForPageLoadMetricsMillis
import typingsSlinky.ineum.ineumStrings.maxWaitForResourceTimingsMillis
import typingsSlinky.ineum.ineumStrings.meta
import typingsSlinky.ineum.ineumStrings.page
import typingsSlinky.ineum.ineumStrings.reportError
import typingsSlinky.ineum.ineumStrings.reportEvent
import typingsSlinky.ineum.ineumStrings.reportingUrl
import typingsSlinky.ineum.ineumStrings.terminateSession
import typingsSlinky.ineum.ineumStrings.traceId
import typingsSlinky.ineum.ineumStrings.trackSessions
import typingsSlinky.ineum.ineumStrings.urlsToCheckForGraphQlInsights
import typingsSlinky.ineum.ineumStrings.user
import typingsSlinky.ineum.ineumStrings.whitelistedOrigins
import typingsSlinky.ineum.ineumStrings.wrapEventHandlers
import typingsSlinky.ineum.ineumStrings.wrapTimers
import typingsSlinky.ineum.ineumStrings.xhrTransmissionTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @JSName("ineum")
  def ineum_allowedOrigins(command: allowedOrigins, values: js.Array[js.RegExp]): Unit = js.native
  /**
    * Use command: 'key' instead.
    *
    * @deprecated
    */
  // tslint:disable-next-line unified-signatures
  @JSName("ineum")
  def ineum_apiKey(command: apiKey, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_beaconBatchingTime(command: beaconBatchingTime, durationMillis: Double): Unit = js.native
  @JSName("ineum")
  def ineum_getPageLoadId(command: getPageLoadId): js.UndefOr[String] = js.native
  @JSName("ineum")
  def ineum_ignoreErrorMessages(command: ignoreErrorMessages, values: js.Array[js.RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_ignorePings(command: ignorePings, value: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_ignoreUrls(command: ignoreUrls, values: js.Array[js.RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_ignoreUserTimings(command: ignoreUserTimings, values: js.Array[js.RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_key(command: key, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_maxMaitForPageLoadMetricsMillis(command: maxMaitForPageLoadMetricsMillis, durationMillis: Double): Unit = js.native
  @JSName("ineum")
  def ineum_maxWaitForResourceTimingsMillis(command: maxWaitForResourceTimingsMillis, durationMillis: Double): Unit = js.native
  @JSName("ineum")
  def ineum_meta(command: meta, key: String, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_meta(command: meta, key: String, value: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_meta(command: meta, key: String, value: Double): Unit = js.native
  @JSName("ineum")
  def ineum_page(command: page, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_reportError(command: reportError, error: String): Unit = js.native
  @JSName("ineum")
  def ineum_reportError(command: reportError, error: String, opts: ComponentStack): Unit = js.native
  @JSName("ineum")
  def ineum_reportError(command: reportError, error: js.Error): Unit = js.native
  @JSName("ineum")
  def ineum_reportError(command: reportError, error: js.Error, opts: ComponentStack): Unit = js.native
  @JSName("ineum")
  def ineum_reportEvent(command: reportEvent, name: String): Unit = js.native
  @JSName("ineum")
  def ineum_reportEvent(command: reportEvent, name: String, opts: BackendTraceId): Unit = js.native
  @JSName("ineum")
  def ineum_reportingUrl(command: reportingUrl, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_terminateSession(command: terminateSession): Unit = js.native
  @JSName("ineum")
  def ineum_traceId(command: traceId, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_trackSessions(command: trackSessions): Unit = js.native
  @JSName("ineum")
  def ineum_trackSessions(
    command: trackSessions,
    sessionInactivityTimeout: js.UndefOr[scala.Nothing],
    sessionTerminationTimeout: Double
  ): Unit = js.native
  @JSName("ineum")
  def ineum_trackSessions(command: trackSessions, sessionInactivityTimeout: Double): Unit = js.native
  @JSName("ineum")
  def ineum_trackSessions(command: trackSessions, sessionInactivityTimeout: Double, sessionTerminationTimeout: Double): Unit = js.native
  @JSName("ineum")
  def ineum_urlsToCheckForGraphQlInsights(command: urlsToCheckForGraphQlInsights, values: js.Array[js.RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user): Unit = js.native
  @JSName("ineum")
  def ineum_user(
    command: user,
    userId: js.UndefOr[scala.Nothing],
    userName: js.UndefOr[scala.Nothing],
    userEmail: String
  ): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: js.UndefOr[scala.Nothing], userName: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: js.UndefOr[scala.Nothing], userName: String, userEmail: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String, userName: js.UndefOr[scala.Nothing], userEmail: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String, userName: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String, userName: String, userEmail: String): Unit = js.native
  /**
    * Use command: 'allowedOrigins' instead (from release 185).
    *
    * @deprecated
    */
  // tslint:disable-next-line unified-signatures
  @JSName("ineum")
  def ineum_whitelistedOrigins(command: whitelistedOrigins, values: js.Array[js.RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_wrapEventHandlers(command: wrapEventHandlers, value: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_wrapTimers(command: wrapTimers, value: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_xhrTransmissionTimeout(command: xhrTransmissionTimeout, durationMillis: Double): Unit = js.native
}
