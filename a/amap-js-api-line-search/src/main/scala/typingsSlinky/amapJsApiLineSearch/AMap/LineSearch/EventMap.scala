package typingsSlinky.amapJsApiLineSearch.AMap.LineSearch

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
import typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
import typingsSlinky.amapJsApiLineSearch.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

