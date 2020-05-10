package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListSpacesResponse extends js.Object {
  /**
    * Continuation token to retrieve the next page of results. It will be empty
    * for the last page of results. Tokens expire in an hour. An error is
    * thrown if an expired token is passed.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of spaces in the requested (or first) page.
    */
  var spaces: js.UndefOr[js.Array[SchemaSpace]] = js.native
}

object SchemaListSpacesResponse {
  @scala.inline
  def apply(): SchemaListSpacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSpacesResponse]
  }
  @scala.inline
  implicit class SchemaListSpacesResponseOps[Self <: SchemaListSpacesResponse] (val x: Self) extends AnyVal {
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
    def withSpaces(value: js.Array[SchemaSpace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(js.undefined)
        ret
    }
  }
  
}

