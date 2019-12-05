package typingsSlinky.sarif.sarifMod.Suppression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sarif.sarifStrings.inSource
  - typings.sarif.sarifStrings.external
*/
trait kind extends js.Object

object kind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typingsSlinky.sarif.sarifStrings.external = this.cast("external")
  @scala.inline
  def inSource: typingsSlinky.sarif.sarifStrings.inSource = this.cast("inSource")
}

