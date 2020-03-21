package typingsSlinky.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.elasticApmNode.elasticApmNodeStrings.off
  - typingsSlinky.elasticApmNode.elasticApmNodeStrings.errors
  - typingsSlinky.elasticApmNode.elasticApmNodeStrings.transactions
  - typingsSlinky.elasticApmNode.elasticApmNodeStrings.all
*/
trait CaptureBody extends js.Object

object CaptureBody {
  @scala.inline
  def all: typingsSlinky.elasticApmNode.elasticApmNodeStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def errors: typingsSlinky.elasticApmNode.elasticApmNodeStrings.errors = this.cast("errors")
  @scala.inline
  def off: typingsSlinky.elasticApmNode.elasticApmNodeStrings.off = this.cast("off")
  @scala.inline
  def transactions: typingsSlinky.elasticApmNode.elasticApmNodeStrings.transactions = this.cast("transactions")
}

