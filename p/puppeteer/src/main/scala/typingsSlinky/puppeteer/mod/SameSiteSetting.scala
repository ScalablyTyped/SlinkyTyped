package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.puppeteer.puppeteerStrings.Strict
  - typingsSlinky.puppeteer.puppeteerStrings.Lax
*/
trait SameSiteSetting extends js.Object

object SameSiteSetting {
  @scala.inline
  def Lax: typingsSlinky.puppeteer.puppeteerStrings.Lax = this.cast("Lax")
  @scala.inline
  def Strict: typingsSlinky.puppeteer.puppeteerStrings.Strict = this.cast("Strict")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

