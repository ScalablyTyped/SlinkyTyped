package typingsSlinky.amapJsApiLineSearch.AMap.LineSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
  - typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
  - typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data = this.cast("no_data")
}

