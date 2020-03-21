package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.puppeteer.puppeteerStrings.GET
  - typingsSlinky.puppeteer.puppeteerStrings.POST
  - typingsSlinky.puppeteer.puppeteerStrings.PATCH
  - typingsSlinky.puppeteer.puppeteerStrings.PUT
  - typingsSlinky.puppeteer.puppeteerStrings.DELETE
  - typingsSlinky.puppeteer.puppeteerStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typingsSlinky.puppeteer.puppeteerStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.puppeteer.puppeteerStrings.GET = this.cast("GET")
  @scala.inline
  def OPTIONS: typingsSlinky.puppeteer.puppeteerStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typingsSlinky.puppeteer.puppeteerStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typingsSlinky.puppeteer.puppeteerStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.puppeteer.puppeteerStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

