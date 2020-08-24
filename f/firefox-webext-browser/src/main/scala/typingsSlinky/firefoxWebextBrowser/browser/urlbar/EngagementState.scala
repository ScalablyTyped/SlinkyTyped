package typingsSlinky.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* urlbar types */
/**
  * The state of an engagement made with the urlbar by the user. `start`: The user has started an engagement.
  * `engagement`: The user has completed an engagement by picking a result. `abandonment`: The user has abandoned
  * their engagement, for example by blurring the urlbar. `discard`: The engagement ended in a way that should be
  * ignored by listeners.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.start
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard
*/
trait EngagementState extends js.Object

object EngagementState {
  @scala.inline
  def abandonment: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment = "abandonment".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment]
  @scala.inline
  def discard: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard = "discard".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard]
  @scala.inline
  def engagement: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement = "engagement".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement]
  @scala.inline
  def start: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.start = "start".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.start]
}

