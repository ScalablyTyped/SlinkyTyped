package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomMetadataRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * Custom metadata in the form of name-value pairs.
    */
  var CustomMetadata: CustomMetadataMap = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
  /**
    * The ID of the version, if the custom metadata is being added to a document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.native
}

object CreateCustomMetadataRequest {
  @scala.inline
  def apply(CustomMetadata: CustomMetadataMap, ResourceId: ResourceIdType): CreateCustomMetadataRequest = {
    val __obj = js.Dynamic.literal(CustomMetadata = CustomMetadata.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomMetadataRequest]
  }
  @scala.inline
  implicit class CreateCustomMetadataRequestOps[Self <: CreateCustomMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomMetadata(value: CustomMetadataMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMetadata")(value.asInstanceOf[js.Any])
        ret
    }
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

