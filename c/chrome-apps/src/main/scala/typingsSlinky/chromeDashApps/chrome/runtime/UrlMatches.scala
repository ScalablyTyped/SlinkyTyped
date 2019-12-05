package typingsSlinky.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.`https://wwwDOTgoogle-analyticsDOTcom/ *`
  - typings.chromeDashApps.chromeDashAppsStrings.`https://wwwDOTgoogleapisDOTcom/ *`
  - typings.chromeDashApps.chromeDashAppsStrings.`<all_urls>`
  - typings.chromeDashApps.chromeDashAppsStrings.`http:// * / *`
  - typings.chromeDashApps.chromeDashAppsStrings.`https:// * / *`
  - typings.chromeDashApps.chromeDashAppsStrings.`file:/// * / *`
  - typings.chromeDashApps.chromeDashAppsStrings.`chrome://favicon/`
*/
trait UrlMatches extends Permission

object UrlMatches {
  @scala.inline
  def `<all_urls>`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`<all_urls>` = this.cast("<all_urls>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `chrome://favicon/`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`chrome://favicon/` = this.cast("chrome://favicon/")
  @scala.inline
  def `file:///*/*`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`file:///*/*` = this.cast("file:///*/*")
  @scala.inline
  def `http://*/*`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`http://*/*` = this.cast("http://*/*")
  @scala.inline
  def `https://*/*`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`https://*/*` = this.cast("https://*/*")
  @scala.inline
  def `https://wwwDOTgoogle-analyticsDOTcom/*`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`https://wwwDOTgoogle-analyticsDOTcom/*` = this.cast("https://www.google-analytics.com/*")
  @scala.inline
  def `https://wwwDOTgoogleapisDOTcom/*`: typingsSlinky.chromeDashApps.chromeDashAppsStrings.`https://wwwDOTgoogleapisDOTcom/*` = this.cast("https://www.googleapis.com/*")
}

