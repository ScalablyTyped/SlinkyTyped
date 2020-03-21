package typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete
  - typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error
  - typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data = this.cast("no_data")
}

