package typingsSlinky.geodesy.utmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.geodesy.geodesyStrings.N
  - typingsSlinky.geodesy.geodesyStrings.S
*/
trait Hemisphere extends js.Object

object Hemisphere {
  @scala.inline
  def N: typingsSlinky.geodesy.geodesyStrings.N = this.cast("N")
  @scala.inline
  def S: typingsSlinky.geodesy.geodesyStrings.S = this.cast("S")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

