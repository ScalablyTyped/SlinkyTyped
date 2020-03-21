package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`
  - typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign
  - typingsSlinky.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk
  - typingsSlinky.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash
*/
trait UrlMatches extends Permission

object UrlMatches {
  @scala.inline
  def Lessthansignall_urlsGreaterthansign: typingsSlinky.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign = this.cast("<all_urls>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chromeColonSlashSlashfaviconSlash: typingsSlinky.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash = this.cast("chrome://favicon/")
  @scala.inline
  def fileColonSlashSlashSlashAsteriskSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk = this.cast("file:///*/*")
  @scala.inline
  def httpColonSlashSlashAsteriskSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk = this.cast("http://*/*")
  @scala.inline
  def httpsColonSlashSlashAsteriskSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk = this.cast("https://*/*")
  @scala.inline
  def `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`: typingsSlinky.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk` = this.cast("https://www.google-analytics.com/*")
  @scala.inline
  def httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk: typingsSlinky.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk = this.cast("https://www.googleapis.com/*")
}

