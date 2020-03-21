package typingsSlinky.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.k6.k6Strings.binary
  - typingsSlinky.k6.k6Strings.none
  - typingsSlinky.k6.k6Strings.text
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def binary: typingsSlinky.k6.k6Strings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.k6.k6Strings.none = this.cast("none")
  @scala.inline
  def text: typingsSlinky.k6.k6Strings.text = this.cast("text")
}

