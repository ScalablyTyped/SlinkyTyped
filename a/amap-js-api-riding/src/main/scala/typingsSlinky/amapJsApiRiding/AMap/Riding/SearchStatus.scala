package typingsSlinky.amapJsApiRiding.AMap.Riding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiRiding.amapJsApiRidingStrings.complete
  - typingsSlinky.amapJsApiRiding.amapJsApiRidingStrings.error
  - typingsSlinky.amapJsApiRiding.amapJsApiRidingStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.amapJsApiRiding.amapJsApiRidingStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsSlinky.amapJsApiRiding.amapJsApiRidingStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsSlinky.amapJsApiRiding.amapJsApiRidingStrings.no_data = this.cast("no_data")
}

