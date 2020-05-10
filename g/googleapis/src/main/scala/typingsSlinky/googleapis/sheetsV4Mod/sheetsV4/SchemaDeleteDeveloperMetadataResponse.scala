package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from deleting developer metadata.
  */
@js.native
trait SchemaDeleteDeveloperMetadataResponse extends js.Object {
  /**
    * The metadata that was deleted.
    */
  var deletedDeveloperMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
}

object SchemaDeleteDeveloperMetadataResponse {
  @scala.inline
  def apply(): SchemaDeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDeveloperMetadataResponse]
  }
  @scala.inline
  implicit class SchemaDeleteDeveloperMetadataResponseOps[Self <: SchemaDeleteDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedDeveloperMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedDeveloperMetadata")(js.undefined)
        ret
    }
  }
  
}

