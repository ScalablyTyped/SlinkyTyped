package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.complete
  - typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.error
  - typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.no_data = this.cast("no_data")
}

