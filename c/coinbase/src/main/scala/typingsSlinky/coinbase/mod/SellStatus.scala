package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.coinbase.coinbaseStrings.created
  - typingsSlinky.coinbase.coinbaseStrings.completed
  - typingsSlinky.coinbase.coinbaseStrings.canceled
*/
trait SellStatus extends js.Object

object SellStatus {
  @scala.inline
  def canceled: typingsSlinky.coinbase.coinbaseStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsSlinky.coinbase.coinbaseStrings.completed = this.cast("completed")
  @scala.inline
  def created: typingsSlinky.coinbase.coinbaseStrings.created = this.cast("created")
}

