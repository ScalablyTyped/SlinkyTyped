package typingsSlinky.gapiClientResourceviews.gapi.client.resourceviews

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientResourceviews.anon.Alt
import typingsSlinky.gapiClientResourceviews.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneOperationsResource extends js.Object {
  /** Retrieves the specified zone-specific operation resource. */
  def get(request: Alt): Request[Operation] = js.native
  /** Retrieves the list of operation resources contained within the specified zone. */
  def list(request: Fields): Request[OperationList] = js.native
}

object ZoneOperationsResource {
  @scala.inline
  def apply(get: Alt => Request[Operation], list: Fields => Request[OperationList]): ZoneOperationsResource = {
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
    def withGet(value: Alt => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[OperationList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

