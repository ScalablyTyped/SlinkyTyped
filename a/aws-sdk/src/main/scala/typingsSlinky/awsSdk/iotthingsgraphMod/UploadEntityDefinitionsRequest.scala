package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadEntityDefinitionsRequest extends js.Object {
  /**
    * A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new DefinitionDocument. If set to true, the upload will create a new namespace version.
    */
  var deprecateExistingEntities: js.UndefOr[DeprecateExistingEntities] = js.native
  /**
    * The DefinitionDocument that defines the updated entities.
    */
  var document: js.UndefOr[DefinitionDocument] = js.native
  /**
    * A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to true, the upload will create a new namespace version.
    */
  var syncWithPublicNamespace: js.UndefOr[SyncWithPublicNamespace] = js.native
}

object UploadEntityDefinitionsRequest {
  @scala.inline
  def apply(): UploadEntityDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadEntityDefinitionsRequest]
  }
  @scala.inline
  implicit class UploadEntityDefinitionsRequestOps[Self <: UploadEntityDefinitionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecateExistingEntities(value: DeprecateExistingEntities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecateExistingEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecateExistingEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecateExistingEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: DefinitionDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncWithPublicNamespace(value: SyncWithPublicNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncWithPublicNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncWithPublicNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncWithPublicNamespace")(js.undefined)
        ret
    }
  }
  
}

