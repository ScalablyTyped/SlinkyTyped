package typingsSlinky.amapJsApiDistrictSearch.AMap.DistrictSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete
  - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error
  - typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data = this.cast("no_data")
}

