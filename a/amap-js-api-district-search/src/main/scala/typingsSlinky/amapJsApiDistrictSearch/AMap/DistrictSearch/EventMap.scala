package typingsSlinky.amapJsApiDistrictSearch.AMap.DistrictSearch

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error
import typingsSlinky.amapJsApiDistrictSearch.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

