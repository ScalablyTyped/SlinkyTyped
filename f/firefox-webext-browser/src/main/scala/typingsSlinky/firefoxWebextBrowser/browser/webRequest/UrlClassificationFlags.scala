package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tracking flags that match our internal tracking classification */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting_content
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining_content
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_ad
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_analytics
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_social
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_content
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_basic_tracking
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_strict_tracking
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_social_tracking
*/
trait UrlClassificationFlags extends js.Object

object UrlClassificationFlags {
  @scala.inline
  def any_basic_tracking: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_basic_tracking = this.cast("any_basic_tracking")
  @scala.inline
  def any_social_tracking: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_social_tracking = this.cast("any_social_tracking")
  @scala.inline
  def any_strict_tracking: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.any_strict_tracking = this.cast("any_strict_tracking")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cryptomining: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining = this.cast("cryptomining")
  @scala.inline
  def cryptomining_content: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.cryptomining_content = this.cast("cryptomining_content")
  @scala.inline
  def fingerprinting: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting = this.cast("fingerprinting")
  @scala.inline
  def fingerprinting_content: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fingerprinting_content = this.cast("fingerprinting_content")
  @scala.inline
  def tracking: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking = this.cast("tracking")
  @scala.inline
  def tracking_ad: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_ad = this.cast("tracking_ad")
  @scala.inline
  def tracking_analytics: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_analytics = this.cast("tracking_analytics")
  @scala.inline
  def tracking_content: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_content = this.cast("tracking_content")
  @scala.inline
  def tracking_social: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tracking_social = this.cast("tracking_social")
}

