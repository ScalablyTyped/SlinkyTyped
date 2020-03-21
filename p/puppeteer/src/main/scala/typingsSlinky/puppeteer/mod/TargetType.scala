package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.puppeteer.puppeteerStrings.page
  - typingsSlinky.puppeteer.puppeteerStrings.background_page
  - typingsSlinky.puppeteer.puppeteerStrings.shared_worker
  - typingsSlinky.puppeteer.puppeteerStrings.service_worker
  - typingsSlinky.puppeteer.puppeteerStrings.browser
  - typingsSlinky.puppeteer.puppeteerStrings.other
*/
trait TargetType extends js.Object

object TargetType {
  @scala.inline
  def background_page: typingsSlinky.puppeteer.puppeteerStrings.background_page = this.cast("background_page")
  @scala.inline
  def browser: typingsSlinky.puppeteer.puppeteerStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def other: typingsSlinky.puppeteer.puppeteerStrings.other = this.cast("other")
  @scala.inline
  def page: typingsSlinky.puppeteer.puppeteerStrings.page = this.cast("page")
  @scala.inline
  def service_worker: typingsSlinky.puppeteer.puppeteerStrings.service_worker = this.cast("service_worker")
  @scala.inline
  def shared_worker: typingsSlinky.puppeteer.puppeteerStrings.shared_worker = this.cast("shared_worker")
}

