package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListSearchApplicationsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var searchApplications: js.UndefOr[js.Array[SchemaSearchApplication]] = js.native
}

object SchemaListSearchApplicationsResponse {
  @scala.inline
  def apply(): SchemaListSearchApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSearchApplicationsResponse]
  }
  @scala.inline
  implicit class SchemaListSearchApplicationsResponseOps[Self <: SchemaListSearchApplicationsResponse] (val x: Self) extends AnyVal {
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
    def withSearchApplications(value: js.Array[SchemaSearchApplication]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchApplications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchApplications")(js.undefined)
        ret
    }
  }
  
}

