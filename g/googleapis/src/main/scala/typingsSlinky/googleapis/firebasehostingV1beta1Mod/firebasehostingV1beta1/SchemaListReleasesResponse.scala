package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListReleasesResponse extends js.Object {
  /**
    * If there are additional releases remaining beyond the ones in this
    * response, then supply this token in the next
    * [`list`](../sites.versions.files/list) call to continue with the next set
    * of releases.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of hashes of files that still need to be uploaded, if any exist.
    */
  var releases: js.UndefOr[js.Array[SchemaRelease]] = js.native
}

object SchemaListReleasesResponse {
  @scala.inline
  def apply(): SchemaListReleasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReleasesResponse]
  }
  @scala.inline
  implicit class SchemaListReleasesResponseOps[Self <: SchemaListReleasesResponse] (val x: Self) extends AnyVal {
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
    def withReleases(value: js.Array[SchemaRelease]): Self = {
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

