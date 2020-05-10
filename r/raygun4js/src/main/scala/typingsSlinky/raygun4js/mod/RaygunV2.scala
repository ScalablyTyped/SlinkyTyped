package typingsSlinky.raygun4js.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.raygun4js.AnonLevel
import typingsSlinky.raygun4js.AnonType
import typingsSlinky.raygun4js.raygun4jsStrings.apiKey
import typingsSlinky.raygun4js.raygun4jsStrings.attach
import typingsSlinky.raygun4js.raygun4jsStrings.detach
import typingsSlinky.raygun4js.raygun4jsStrings.disableAutoBreadcrumbs
import typingsSlinky.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsClicks
import typingsSlinky.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsConsole
import typingsSlinky.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsNavigation
import typingsSlinky.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsXHR
import typingsSlinky.raygun4js.raygun4jsStrings.enableAutoBreadcrumbs
import typingsSlinky.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsClicks
import typingsSlinky.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsConsole
import typingsSlinky.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsNavigation
import typingsSlinky.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsXHR
import typingsSlinky.raygun4js.raygun4jsStrings.enableCrashReporting
import typingsSlinky.raygun4js.raygun4jsStrings.enablePulse
import typingsSlinky.raygun4js.raygun4jsStrings.filterSensitiveData
import typingsSlinky.raygun4js.raygun4jsStrings.getRaygunInstance
import typingsSlinky.raygun4js.raygun4jsStrings.groupingKey
import typingsSlinky.raygun4js.raygun4jsStrings.noConflict
import typingsSlinky.raygun4js.raygun4jsStrings.onAfterSend
import typingsSlinky.raygun4js.raygun4jsStrings.onBeforeSend
import typingsSlinky.raygun4js.raygun4jsStrings.onBeforeXHR
import typingsSlinky.raygun4js.raygun4jsStrings.options
import typingsSlinky.raygun4js.raygun4jsStrings.recordBreadcrumb
import typingsSlinky.raygun4js.raygun4jsStrings.saveIfOffline
import typingsSlinky.raygun4js.raygun4jsStrings.send
import typingsSlinky.raygun4js.raygun4jsStrings.setAutoBreadcrumbsXHRIgnoredHosts
import typingsSlinky.raygun4js.raygun4jsStrings.setBreadcrumbLevel
import typingsSlinky.raygun4js.raygun4jsStrings.setFilterScope
import typingsSlinky.raygun4js.raygun4jsStrings.setUser
import typingsSlinky.raygun4js.raygun4jsStrings.setVersion
import typingsSlinky.raygun4js.raygun4jsStrings.trackEvent
import typingsSlinky.raygun4js.raygun4jsStrings.whitelistCrossOriginDomains
import typingsSlinky.raygun4js.raygun4jsStrings.withCustomData
import typingsSlinky.raygun4js.raygun4jsStrings.withTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunV2 extends js.Object {
  def apply(
    key: detach | disableAutoBreadcrumbs | enableAutoBreadcrumbs | disableAutoBreadcrumbsConsole | enableAutoBreadcrumbsConsole | disableAutoBreadcrumbsNavigation | enableAutoBreadcrumbsNavigation | disableAutoBreadcrumbsClicks | enableAutoBreadcrumbsClicks | disableAutoBreadcrumbsXHR | enableAutoBreadcrumbsXHR | setAutoBreadcrumbsXHRIgnoredHosts
  ): Unit = js.native
  def apply(key: apiKey, value: String): Unit = js.native
  def apply(key: attach, value: Boolean): Unit = js.native
  def apply(key: enableCrashReporting, value: Boolean): Unit = js.native
  def apply(key: enablePulse, value: Boolean): Unit = js.native
  def apply(key: filterSensitiveData, values: js.Array[String | js.RegExp]): Unit = js.native
  def apply(key: getRaygunInstance): RaygunStatic = js.native
  def apply(
    key: groupingKey,
    value: js.Function3[
      /* payload */ RaygunPayload, 
      /* stackTrace */ TracekitStackTrace, 
      /* options */ js.Any, 
      String | Unit
    ]
  ): Unit = js.native
  def apply(key: noConflict, value: Boolean): Unit = js.native
  def apply(key: onAfterSend, callback: js.Function1[/* xhr */ XMLHttpRequest, Unit]): Unit = js.native
  def apply(key: onBeforeSend, callback: js.Function1[/* payload */ RaygunPayload, RaygunPayload | Boolean]): Unit = js.native
  def apply(key: onBeforeXHR, callback: js.Function1[/* xhr */ XMLHttpRequest, Unit]): Unit = js.native
  def apply(key: options, value: RaygunOptions): Unit = js.native
  def apply(key: recordBreadcrumb, message: String, metadata: js.Object): Unit = js.native
  def apply(key: recordBreadcrumb, message: AnonLevel, metadata: js.Object): Unit = js.native
  def apply(key: saveIfOffline, value: Boolean): Unit = js.native
  def apply(key: send, value: js.Any): Unit = js.native
  def apply(key: setBreadcrumbLevel, level: BreadcrumbLevel): Unit = js.native
  def apply(key: setFilterScope, value: String): Unit = js.native
  def apply(key: setUser, value: RaygunV2UserDetails): Unit = js.native
  def apply(key: setVersion, value: String): Unit = js.native
  def apply(key: trackEvent, value: AnonType): Unit = js.native
  def apply(key: whitelistCrossOriginDomains, values: js.Array[String]): Unit = js.native
  def apply(key: withCustomData, value: js.Any): Unit = js.native
  def apply(key: withTags, values: js.Array[String]): Unit = js.native
}

