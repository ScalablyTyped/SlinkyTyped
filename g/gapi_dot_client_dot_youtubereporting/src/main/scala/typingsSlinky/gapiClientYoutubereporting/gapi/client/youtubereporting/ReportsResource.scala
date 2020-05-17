package typingsSlinky.gapiClientYoutubereporting.gapi.client.youtubereporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutubereporting.anon.Accesstoken
import typingsSlinky.gapiClientYoutubereporting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  /** Gets the metadata of a specific report. */
  def get(request: Accesstoken): Request[Report] = js.native
  /**
    * Lists reports created by a specific job.
    * Returns NOT_FOUND if the job does not exist.
    */
  def list(request: Alt): Request[ListReportsResponse] = js.native
}

object ReportsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[Report], list: Alt => Request[ListReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ReportsResource]
  }
  @scala.inline
  implicit class ReportsResourceOps[Self <: ReportsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Accesstoken => Request[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[ListReportsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

