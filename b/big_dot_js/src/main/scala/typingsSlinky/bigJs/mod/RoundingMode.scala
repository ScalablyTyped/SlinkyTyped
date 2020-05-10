package typingsSlinky.bigJs.mod

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
  def RoundDown: `0` = 0.asInstanceOf[`0`]
  /**
    * Rounds towards nearest neighbour.
    * If equidistant, rounds towards even neighbour.
    */
  @scala.inline
  def RoundHalfEven: `2` = 2.asInstanceOf[`2`]
  /**
    * Rounds towards nearest neighbour.
    * If equidistant, rounds away from zero.
    */
  @scala.inline
  def RoundHalfUp: `1` = 1.asInstanceOf[`1`]
  /**
    * Rounds away from zero.
    */
  @scala.inline
  def RoundUp: `3` = 3.asInstanceOf[`3`]
}

