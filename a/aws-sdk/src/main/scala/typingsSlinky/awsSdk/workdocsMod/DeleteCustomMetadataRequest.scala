package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCustomMetadataRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * Flag to indicate removal of all custom metadata properties from the specified resource.
    */
  var DeleteAll: js.UndefOr[BooleanType] = js.native
  /**
    * List of properties to remove.
    */
  var Keys: js.UndefOr[CustomMetadataKeyList] = js.native
  /**
    * The ID of the resource, either a document or folder.
    */
  var ResourceId: ResourceIdType = js.native
  /**
    * The ID of the version, if the custom metadata is being deleted from a document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.native
}

object DeleteCustomMetadataRequest {
  @scala.inline
  def apply(ResourceId: ResourceIdType): DeleteCustomMetadataRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomMetadataRequest]
  }
  @scala.inline
  implicit class DeleteCustomMetadataRequestOps[Self <: DeleteCustomMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: ResourceIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationToken(value: AuthenticationHeaderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteAll(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteAll")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: CustomMetadataKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keys")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: DocumentVersionIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

