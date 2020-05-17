package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClientBigquery.anon.FriendlyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectList extends js.Object {
  /** A hash of the page of results */
  var etag: js.UndefOr[String] = js.native
  /** The type of list. */
  var kind: js.UndefOr[String] = js.native
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Projects to which you have at least READ access. */
  var projects: js.UndefOr[js.Array[FriendlyName]] = js.native
  /** The total number of projects in the list. */
  var totalItems: js.UndefOr[Double] = js.native
}

object ProjectList {
  @scala.inline
  def apply(): ProjectList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectList]
  }
  @scala.inline
  implicit class ProjectListOps[Self <: ProjectList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    @scala.inline
    def withProjects(value: js.Array[FriendlyName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(js.undefined)
        ret
    }
  }
  
}

