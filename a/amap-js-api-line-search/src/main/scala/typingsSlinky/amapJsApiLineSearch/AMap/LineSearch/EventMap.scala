package typingsSlinky.amapJsApiLineSearch.AMap.LineSearch

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiLineSearch.AnonInfo
import typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
import typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var complete: Event_[
    typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete, 
    SearchResult
  ] = js.native
  var error: Event_[typingsSlinky.amapJsApiLineSearch.amapJsApiLineSearchStrings.error, AnonInfo] = js.native
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: Event_[complete, SearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Event_[error, AnonInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

