package typingsSlinky.ineum

import typingsSlinky.ineum.anon.BackendTraceId
import typingsSlinky.ineum.anon.ComponentStack
import typingsSlinky.ineum.ineumStrings.autoClearResourceTimings
import typingsSlinky.ineum.ineumStrings.getPageLoadId
import typingsSlinky.ineum.ineumStrings.ignoreErrorMessages
import typingsSlinky.ineum.ineumStrings.ignoreUrls
import typingsSlinky.ineum.ineumStrings.ignoreUserTimings
import typingsSlinky.ineum.ineumStrings.key
import typingsSlinky.ineum.ineumStrings.meta
import typingsSlinky.ineum.ineumStrings.page
import typingsSlinky.ineum.ineumStrings.reportError
import typingsSlinky.ineum.ineumStrings.reportEvent
import typingsSlinky.ineum.ineumStrings.reportingUrl
import typingsSlinky.ineum.ineumStrings.terminateSession
import typingsSlinky.ineum.ineumStrings.traceId
import typingsSlinky.ineum.ineumStrings.trackSessions
import typingsSlinky.ineum.ineumStrings.user
import typingsSlinky.ineum.ineumStrings.whitelistedOrigins
import typingsSlinky.ineum.ineumStrings.wrapEventHandlers
import typingsSlinky.ineum.ineumStrings.wrapTimers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @JSName("ineum")
  def ineum_autoClearResourceTimings(command: autoClearResourceTimings, enable: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_getPageLoadId(command: getPageLoadId): js.UndefOr[String] = js.native
  @JSName("ineum")
  def ineum_ignoreErrorMessages(command: ignoreErrorMessages, values: js.Array[js.RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_ignoreUrls(command: ignoreUrls, values: js.Array[js.RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_ignoreUserTimings(command: ignoreUserTimings, values: js.Array[js.RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_key(command: key, value: String): Unit = js.native
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
  def ineum_trackSessions(command: trackSessions, sessionInactivityTimeout: Double): Unit = js.native
  @JSName("ineum")
  def ineum_trackSessions(command: trackSessions, sessionInactivityTimeout: Double, sessionTerminationTimeout: Double): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String, userName: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String, userName: String, userEmail: String): Unit = js.native
  @JSName("ineum")
  def ineum_whitelistedOrigins(command: whitelistedOrigins, values: js.Array[js.RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_wrapEventHandlers(command: wrapEventHandlers, enable: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_wrapTimers(command: wrapTimers, enable: Boolean): Unit = js.native
}

