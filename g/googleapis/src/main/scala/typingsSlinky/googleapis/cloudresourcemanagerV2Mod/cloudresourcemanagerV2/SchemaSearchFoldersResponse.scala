package typingsSlinky.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for searching folders.
  */
@js.native
trait SchemaSearchFoldersResponse extends js.Object {
  /**
    * A possibly paginated folder search results. the specified parent
    * resource.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.native
  /**
    * A pagination token returned from a previous call to `SearchFolders` that
    * indicates from where searching should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaSearchFoldersResponse {
  @scala.inline
  def apply(): SchemaSearchFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchFoldersResponse]
  }
  @scala.inline
  implicit class SchemaSearchFoldersResponseOps[Self <: SchemaSearchFoldersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolders(value: js.Array[SchemaFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(js.undefined)
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

