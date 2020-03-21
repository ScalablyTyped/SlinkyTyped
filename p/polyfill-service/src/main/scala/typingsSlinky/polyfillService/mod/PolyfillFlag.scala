package typingsSlinky.polyfillService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.polyfillService.polyfillServiceStrings.gated
  - typingsSlinky.polyfillService.polyfillServiceStrings.always
*/
trait PolyfillFlag extends js.Object

object PolyfillFlag {
  @scala.inline
  def always: typingsSlinky.polyfillService.polyfillServiceStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gated: typingsSlinky.polyfillService.polyfillServiceStrings.gated = this.cast("gated")
}

