package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.puppeteer.puppeteerStrings.left
  - typingsSlinky.puppeteer.puppeteerStrings.right
  - typingsSlinky.puppeteer.puppeteerStrings.middle
*/
trait MouseButtons extends js.Object

object MouseButtons {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typingsSlinky.puppeteer.puppeteerStrings.left = this.cast("left")
  @scala.inline
  def middle: typingsSlinky.puppeteer.puppeteerStrings.middle = this.cast("middle")
  @scala.inline
  def right: typingsSlinky.puppeteer.puppeteerStrings.right = this.cast("right")
}

