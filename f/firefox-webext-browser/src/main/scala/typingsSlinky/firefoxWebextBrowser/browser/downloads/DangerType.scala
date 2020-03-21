package typingsSlinky.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * *file*:
  *   The download's filename is suspicious.
  * *url*:
  *   The download's URL is known to be malicious.
  * *content*:
  *   The downloaded file is known to be malicious.
  * *uncommon*:
  *   The download's URL is not commonly downloaded and could be dangerous.
  * *safe*:
  *   The download presents no known danger to the user's computer.
  *
  * These string constants will never change, however the set of DangerTypes may change.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.file
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.content
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.host
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted
*/
trait DangerType extends js.Object

object DangerType {
  @scala.inline
  def accepted: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def content: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.content = this.cast("content")
  @scala.inline
  def file: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.file = this.cast("file")
  @scala.inline
  def host: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.host = this.cast("host")
  @scala.inline
  def safe: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe = this.cast("safe")
  @scala.inline
  def uncommon: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon = this.cast("uncommon")
  @scala.inline
  def unwanted: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted = this.cast("unwanted")
  @scala.inline
  def url: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = this.cast("url")
}

