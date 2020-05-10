package typingsSlinky.googleapis.composerV1Mod.composerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ImageVersions in a project and location.
  */
@js.native
trait SchemaListImageVersionsResponse extends js.Object {
  /**
    * The list of supported ImageVersions in a location.
    */
  var imageVersions: js.UndefOr[js.Array[SchemaImageVersion]] = js.native
  /**
    * The page token used to query for the next page if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListImageVersionsResponse {
  @scala.inline
  def apply(): SchemaListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListImageVersionsResponse]
  }
  @scala.inline
  implicit class SchemaListImageVersionsResponseOps[Self <: SchemaListImageVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageVersions(value: js.Array[SchemaImageVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageVersions")(js.undefined)
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

