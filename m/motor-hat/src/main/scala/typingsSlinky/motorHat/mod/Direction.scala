package typingsSlinky.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.motorHat.motorHatStrings.fwd
  - typingsSlinky.motorHat.motorHatStrings.back
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def back: typingsSlinky.motorHat.motorHatStrings.back = this.cast("back")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fwd: typingsSlinky.motorHat.motorHatStrings.fwd = this.cast("fwd")
}

