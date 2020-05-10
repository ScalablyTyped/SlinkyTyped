package typingsSlinky.gapiClientResourceviews.gapi.client.resourceviews

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientResourceviews.AnonAlt
import typingsSlinky.gapiClientResourceviews.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneOperationsResource extends js.Object {
  /** Retrieves the specified zone-specific operation resource. */
  def get(request: AnonAlt): Request_[Operation] = js.native
  /** Retrieves the list of operation resources contained within the specified zone. */
  def list(request: AnonFields): Request_[OperationList] = js.native
}

object ZoneOperationsResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[Operation], list: AnonFields => Request_[OperationList]): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZoneOperationsResource]
  }
  @scala.inline
  implicit class ZoneOperationsResourceOps[Self <: ZoneOperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAlt => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[OperationList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

