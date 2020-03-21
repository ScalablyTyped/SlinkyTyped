package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.puppeteer.puppeteerStrings.document
  - typingsSlinky.puppeteer.puppeteerStrings.stylesheet
  - typingsSlinky.puppeteer.puppeteerStrings.image
  - typingsSlinky.puppeteer.puppeteerStrings.media
  - typingsSlinky.puppeteer.puppeteerStrings.font
  - typingsSlinky.puppeteer.puppeteerStrings.script
  - typingsSlinky.puppeteer.puppeteerStrings.texttrack
  - typingsSlinky.puppeteer.puppeteerStrings.xhr
  - typingsSlinky.puppeteer.puppeteerStrings.fetch
  - typingsSlinky.puppeteer.puppeteerStrings.eventsource
  - typingsSlinky.puppeteer.puppeteerStrings.websocket
  - typingsSlinky.puppeteer.puppeteerStrings.manifest
  - typingsSlinky.puppeteer.puppeteerStrings.other
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typingsSlinky.puppeteer.puppeteerStrings.document = this.cast("document")
  @scala.inline
  def eventsource: typingsSlinky.puppeteer.puppeteerStrings.eventsource = this.cast("eventsource")
  @scala.inline
  def fetch: typingsSlinky.puppeteer.puppeteerStrings.fetch = this.cast("fetch")
  @scala.inline
  def font: typingsSlinky.puppeteer.puppeteerStrings.font = this.cast("font")
  @scala.inline
  def image: typingsSlinky.puppeteer.puppeteerStrings.image = this.cast("image")
  @scala.inline
  def manifest: typingsSlinky.puppeteer.puppeteerStrings.manifest = this.cast("manifest")
  @scala.inline
  def media: typingsSlinky.puppeteer.puppeteerStrings.media = this.cast("media")
  @scala.inline
  def other: typingsSlinky.puppeteer.puppeteerStrings.other = this.cast("other")
  @scala.inline
  def script: typingsSlinky.puppeteer.puppeteerStrings.script = this.cast("script")
  @scala.inline
  def stylesheet: typingsSlinky.puppeteer.puppeteerStrings.stylesheet = this.cast("stylesheet")
  @scala.inline
  def texttrack: typingsSlinky.puppeteer.puppeteerStrings.texttrack = this.cast("texttrack")
  @scala.inline
  def websocket: typingsSlinky.puppeteer.puppeteerStrings.websocket = this.cast("websocket")
  @scala.inline
  def xhr: typingsSlinky.puppeteer.puppeteerStrings.xhr = this.cast("xhr")
}

