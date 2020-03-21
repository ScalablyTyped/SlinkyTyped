package typingsSlinky.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactElemental.reactElementalStrings.regular
  - typingsSlinky.reactElemental.reactElementalStrings.plain
  - typingsSlinky.reactElemental.reactElementalStrings.underline
*/
trait LinkType extends js.Object

object LinkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def plain: typingsSlinky.reactElemental.reactElementalStrings.plain = this.cast("plain")
  @scala.inline
  def regular: typingsSlinky.reactElemental.reactElementalStrings.regular = this.cast("regular")
  @scala.inline
  def underline: typingsSlinky.reactElemental.reactElementalStrings.underline = this.cast("underline")
}

