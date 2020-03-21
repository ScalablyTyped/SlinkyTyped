package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.puppeteer.puppeteerStrings.screen
  - typingsSlinky.puppeteer.puppeteerStrings.print
*/
trait MediaType extends js.Object

object MediaType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def print: typingsSlinky.puppeteer.puppeteerStrings.print = this.cast("print")
  @scala.inline
  def screen: typingsSlinky.puppeteer.puppeteerStrings.screen = this.cast("screen")
}

