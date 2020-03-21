package typingsSlinky.amapJsApiCitySearch.AMap.CitySearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.error
  - typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete
  - typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsSlinky.amapJsApiCitySearch.amapJsApiCitySearchStrings.no_data = this.cast("no_data")
}

