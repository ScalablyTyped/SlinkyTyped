package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to create developer metadata.
  */
@js.native
trait SchemaCreateDeveloperMetadataRequest extends js.Object {
  /**
    * The developer metadata to create.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.native
}

object SchemaCreateDeveloperMetadataRequest {
  @scala.inline
  def apply(): SchemaCreateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateDeveloperMetadataRequest]
  }
  @scala.inline
  implicit class SchemaCreateDeveloperMetadataRequestOps[Self <: SchemaCreateDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeveloperMetadata(value: SchemaDeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(js.undefined)
        ret
    }
  }
  
}

