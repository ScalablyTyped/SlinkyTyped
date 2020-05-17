package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.QuotaUserUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZonesResource extends js.Object {
  /** Returns the specified Zone resource. Get a list of available zones by making a list() request. */
  def get(request: QuotaUserUserIp): Request[Zone] = js.native
  /** Retrieves the list of Zone resources available to the specified project. */
  def list(request: Alt): Request[ZoneList] = js.native
}

object ZonesResource {
  @scala.inline
  def apply(get: QuotaUserUserIp => Request[Zone], list: Alt => Request[ZoneList]): ZonesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZonesResource]
  }
  @scala.inline
  implicit class ZonesResourceOps[Self <: ZonesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: QuotaUserUserIp => Request[Zone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[ZoneList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

