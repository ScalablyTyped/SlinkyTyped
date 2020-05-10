package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reply to a developer metadata search request.
  */
@js.native
trait SchemaSearchDeveloperMetadataResponse extends js.Object {
  /**
    * The metadata matching the criteria of the search request.
    */
  var matchedDeveloperMetadata: js.UndefOr[js.Array[SchemaMatchedDeveloperMetadata]] = js.native
}

object SchemaSearchDeveloperMetadataResponse {
  @scala.inline
  def apply(): SchemaSearchDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchDeveloperMetadataResponse]
  }
  @scala.inline
  implicit class SchemaSearchDeveloperMetadataResponseOps[Self <: SchemaSearchDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchedDeveloperMetadata(value: js.Array[SchemaMatchedDeveloperMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedDeveloperMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchedDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedDeveloperMetadata")(js.undefined)
        ret
    }
  }
  
}

