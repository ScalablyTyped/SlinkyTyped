package typingsSlinky.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReleasesResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value is
    * empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** List of `Release` instances. */
  var releases: js.UndefOr[js.Array[Release]] = js.native
}

object ListReleasesResponse {
  @scala.inline
  def apply(): ListReleasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReleasesResponse]
  }
  @scala.inline
  implicit class ListReleasesResponseOps[Self <: ListReleasesResponse] (val x: Self) extends AnyVal {
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
    def withReleases(value: js.Array[Release]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releases")(js.undefined)
        ret
    }
  }
  
}

