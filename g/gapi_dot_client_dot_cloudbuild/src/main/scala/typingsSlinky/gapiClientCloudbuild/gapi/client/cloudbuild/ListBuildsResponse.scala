package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBuildsResponse extends js.Object {
  /** Builds will be sorted by create_time, descending. */
  var builds: js.UndefOr[js.Array[Build]] = js.native
  /** Token to receive the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListBuildsResponse {
  @scala.inline
  def apply(): ListBuildsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsResponse]
  }
  @scala.inline
  implicit class ListBuildsResponseOps[Self <: ListBuildsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuilds(value: js.Array[Build]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builds")(js.undefined)
        ret
    }
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
  }
  
}

