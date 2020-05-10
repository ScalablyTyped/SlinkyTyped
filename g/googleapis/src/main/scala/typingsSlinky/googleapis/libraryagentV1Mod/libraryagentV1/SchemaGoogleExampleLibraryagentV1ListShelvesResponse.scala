package typingsSlinky.googleapis.libraryagentV1Mod.libraryagentV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for LibraryAgent.ListShelves.
  */
@js.native
trait SchemaGoogleExampleLibraryagentV1ListShelvesResponse extends js.Object {
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListShelvesRequest.page_token field in the subsequent call to
    * `ListShelves` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of shelves.
    */
  var shelves: js.UndefOr[js.Array[SchemaGoogleExampleLibraryagentV1Shelf]] = js.native
}

object SchemaGoogleExampleLibraryagentV1ListShelvesResponse {
  @scala.inline
  def apply(): SchemaGoogleExampleLibraryagentV1ListShelvesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleExampleLibraryagentV1ListShelvesResponseOps[Self <: SchemaGoogleExampleLibraryagentV1ListShelvesResponse] (val x: Self) extends AnyVal {
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
    def withShelves(value: js.Array[SchemaGoogleExampleLibraryagentV1Shelf]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shelves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShelves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shelves")(js.undefined)
        ret
    }
  }
  
}

