package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing existing `BuildTriggers`.
  */
@js.native
trait SchemaListBuildTriggersResponse extends js.Object {
  /**
    * Token to receive the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * `BuildTriggers` for the project, sorted by `create_time` descending.
    */
  var triggers: js.UndefOr[js.Array[SchemaBuildTrigger]] = js.native
}

object SchemaListBuildTriggersResponse {
  @scala.inline
  def apply(): SchemaListBuildTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBuildTriggersResponse]
  }
  @scala.inline
  implicit class SchemaListBuildTriggersResponseOps[Self <: SchemaListBuildTriggersResponse] (val x: Self) extends AnyVal {
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
    def withTriggers(value: js.Array[SchemaBuildTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(js.undefined)
        ret
    }
  }
  
}

