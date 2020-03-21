package typingsSlinky.bigJs.mod._Global_.BigJs

import typingsSlinky.bigJs.bigJsNumbers.`0`
import typingsSlinky.bigJs.bigJsNumbers.`1`
import typingsSlinky.bigJs.bigJsNumbers.`2`
import typingsSlinky.bigJs.bigJsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bigJs.bigJsNumbers.`0`
  - typingsSlinky.bigJs.bigJsNumbers.`1`
  - typingsSlinky.bigJs.bigJsNumbers.`2`
  - typingsSlinky.bigJs.bigJsNumbers.`3`
*/
trait RoundingMode extends js.Object

object RoundingMode {
  /**
    * Rounds towards zero.
    * I.e. truncate, no rounding.
    */
  @scala.inline
  def RoundDown: `0` = this.cast(0)
  /**
    * Rounds towards nearest neighbour.
    * If equidistant, rounds towards even neighbour.
    */
  @scala.inline
  def RoundHalfEven: `2` = this.cast(2)
  /**
    * Rounds towards nearest neighbour.
    * If equidistant, rounds away from zero.
    */
  @scala.inline
  def RoundHalfUp: `1` = this.cast(1)
  /**
    * Rounds away from zero.
    */
  @scala.inline
  def RoundUp: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

