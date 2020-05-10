package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with the list of the versions for the specified script project.
  */
@js.native
trait SchemaListVersionsResponse extends js.Object {
  /**
    * The token use to fetch the next page of records. if not exist in the
    * response, that means no more versions to list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of versions.
    */
  var versions: js.UndefOr[js.Array[SchemaVersion]] = js.native
}

object SchemaListVersionsResponse {
  @scala.inline
  def apply(): SchemaListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVersionsResponse]
  }
  @scala.inline
  implicit class SchemaListVersionsResponseOps[Self <: SchemaListVersionsResponse] (val x: Self) extends AnyVal {
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
    def withVersions(value: js.Array[SchemaVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(js.undefined)
        ret
    }
  }
  
}

