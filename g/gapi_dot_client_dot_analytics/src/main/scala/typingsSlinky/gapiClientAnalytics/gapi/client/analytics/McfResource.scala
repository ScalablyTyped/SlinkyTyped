package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalytics.anon.Enddate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait McfResource extends js.Object {
  /** Returns Analytics Multi-Channel Funnels data for a view (profile). */
  def get(request: Enddate): Request[McfData] = js.native
}

object McfResource {
  @scala.inline
  def apply(get: Enddate => Request[McfData]): McfResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[McfResource]
  }
  @scala.inline
  implicit class McfResourceOps[Self <: McfResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Enddate => Request[McfData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

