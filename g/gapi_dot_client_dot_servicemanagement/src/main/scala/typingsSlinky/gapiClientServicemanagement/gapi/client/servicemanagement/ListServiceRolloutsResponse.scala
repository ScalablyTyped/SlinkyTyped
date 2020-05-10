package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceRolloutsResponse extends js.Object {
  /** The token of the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of rollout resources. */
  var rollouts: js.UndefOr[js.Array[Rollout]] = js.native
}

object ListServiceRolloutsResponse {
  @scala.inline
  def apply(): ListServiceRolloutsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceRolloutsResponse]
  }
  @scala.inline
  implicit class ListServiceRolloutsResponseOps[Self <: ListServiceRolloutsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRollouts(value: js.Array[Rollout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollouts")(js.undefined)
        ret
    }
  }
  
}

