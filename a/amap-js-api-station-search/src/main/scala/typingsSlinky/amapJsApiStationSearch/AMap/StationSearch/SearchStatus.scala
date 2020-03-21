package typingsSlinky.amapJsApiStationSearch.AMap.StationSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete
  - typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.error
  - typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsSlinky.amapJsApiStationSearch.amapJsApiStationSearchStrings.no_data = this.cast("no_data")
}

