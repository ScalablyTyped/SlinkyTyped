package typingsSlinky.chrome.chrome.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chrome.chromeStrings.main_frame
  - typings.chrome.chromeStrings.sub_frame
  - typings.chrome.chromeStrings.stylesheet
  - typings.chrome.chromeStrings.script
  - typings.chrome.chromeStrings.image
  - typings.chrome.chromeStrings.font
  - typings.chrome.chromeStrings.`object`
  - typings.chrome.chromeStrings.xmlhttprequest
  - typings.chrome.chromeStrings.ping
  - typings.chrome.chromeStrings.csp_report
  - typings.chrome.chromeStrings.media
  - typings.chrome.chromeStrings.websocket
  - typings.chrome.chromeStrings.other
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def csp_report: typingsSlinky.chrome.chromeStrings.csp_report = this.cast("csp_report")
  @scala.inline
  def font: typingsSlinky.chrome.chromeStrings.font = this.cast("font")
  @scala.inline
  def image: typingsSlinky.chrome.chromeStrings.image = this.cast("image")
  @scala.inline
  def main_frame: typingsSlinky.chrome.chromeStrings.main_frame = this.cast("main_frame")
  @scala.inline
  def media: typingsSlinky.chrome.chromeStrings.media = this.cast("media")
  @scala.inline
  def `object`: typingsSlinky.chrome.chromeStrings.`object` = this.cast("object")
  @scala.inline
  def other: typingsSlinky.chrome.chromeStrings.other = this.cast("other")
  @scala.inline
  def ping: typingsSlinky.chrome.chromeStrings.ping = this.cast("ping")
  @scala.inline
  def script: typingsSlinky.chrome.chromeStrings.script = this.cast("script")
  @scala.inline
  def stylesheet: typingsSlinky.chrome.chromeStrings.stylesheet = this.cast("stylesheet")
  @scala.inline
  def sub_frame: typingsSlinky.chrome.chromeStrings.sub_frame = this.cast("sub_frame")
  @scala.inline
  def websocket: typingsSlinky.chrome.chromeStrings.websocket = this.cast("websocket")
  @scala.inline
  def xmlhttprequest: typingsSlinky.chrome.chromeStrings.xmlhttprequest = this.cast("xmlhttprequest")
}

