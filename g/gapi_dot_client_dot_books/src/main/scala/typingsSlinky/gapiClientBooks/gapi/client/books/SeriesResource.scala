package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonSeriesid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesResource extends js.Object {
  var membership: MembershipResource = js.native
  /** Returns Series metadata for the given series ids. */
  def get(request: AnonSeriesid): Request_[Series] = js.native
}

object SeriesResource {
  @scala.inline
  def apply(get: AnonSeriesid => Request_[Series], membership: MembershipResource): SeriesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), membership = membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesResource]
  }
  @scala.inline
  implicit class SeriesResourceOps[Self <: SeriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonSeriesid => Request_[Series]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMembership(value: MembershipResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membership")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

