package typingsSlinky.jsMoney.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsMoney.jsMoneyStrings.round
  - typingsSlinky.jsMoney.jsMoneyStrings.floor
  - typingsSlinky.jsMoney.jsMoneyStrings.ceil
*/
trait Rounders extends js.Object

object Rounders {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ceil: typingsSlinky.jsMoney.jsMoneyStrings.ceil = this.cast("ceil")
  @scala.inline
  def floor: typingsSlinky.jsMoney.jsMoneyStrings.floor = this.cast("floor")
  @scala.inline
  def round: typingsSlinky.jsMoney.jsMoneyStrings.round = this.cast("round")
}

