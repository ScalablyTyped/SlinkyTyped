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
  def accepted: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted = "accepted".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.accepted]
  @scala.inline
  def content: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.content = "content".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.content]
  @scala.inline
  def file: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.file = "file".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.file]
  @scala.inline
  def host: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.host = "host".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.host]
  @scala.inline
  def safe: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe = "safe".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.safe]
  @scala.inline
  def uncommon: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon = "uncommon".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.uncommon]
  @scala.inline
  def unwanted: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted = "unwanted".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unwanted]
  @scala.inline
  def url: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = "url".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.url]
}

