package typingsSlinky.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to `ListAccessLevelsRequest`.
  */
@js.native
trait SchemaListAccessLevelsResponse extends js.Object {
  /**
    * List of the Access Level instances.
    */
  var accessLevels: js.UndefOr[js.Array[SchemaAccessLevel]] = js.native
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAccessLevelsResponse {
  @scala.inline
  def apply(): SchemaListAccessLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccessLevelsResponse]
  }
  @scala.inline
  implicit class SchemaListAccessLevelsResponseOps[Self <: SchemaListAccessLevelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessLevels(value: js.Array[SchemaAccessLevel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLevels")(js.undefined)
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

