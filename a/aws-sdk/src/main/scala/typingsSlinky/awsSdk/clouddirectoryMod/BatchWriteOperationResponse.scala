package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchWriteOperationResponse extends js.Object {
  /**
    * The result of an add facet to object batch operation.
    */
  var AddFacetToObject: js.UndefOr[BatchAddFacetToObjectResponse] = js.native
  /**
    * Attaches an object to a Directory.
    */
  var AttachObject: js.UndefOr[BatchAttachObjectResponse] = js.native
  /**
    * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
    */
  var AttachPolicy: js.UndefOr[BatchAttachPolicyResponse] = js.native
  /**
    * Attaches the specified object to the specified index.
    */
  var AttachToIndex: js.UndefOr[BatchAttachToIndexResponse] = js.native
  /**
    * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
    */
  var AttachTypedLink: js.UndefOr[BatchAttachTypedLinkResponse] = js.native
  /**
    * Creates an index object. See Indexing and search for more information.
    */
  var CreateIndex: js.UndefOr[BatchCreateIndexResponse] = js.native
  /**
    * Creates an object in a Directory.
    */
  var CreateObject: js.UndefOr[BatchCreateObjectResponse] = js.native
  /**
    * Deletes an object in a Directory.
    */
  var DeleteObject: js.UndefOr[BatchDeleteObjectResponse] = js.native
  /**
    * Detaches the specified object from the specified index.
    */
  var DetachFromIndex: js.UndefOr[BatchDetachFromIndexResponse] = js.native
  /**
    * Detaches an object from a Directory.
    */
  var DetachObject: js.UndefOr[BatchDetachObjectResponse] = js.native
  /**
    * Detaches a policy from a Directory.
    */
  var DetachPolicy: js.UndefOr[BatchDetachPolicyResponse] = js.native
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  var DetachTypedLink: js.UndefOr[BatchDetachTypedLinkResponse] = js.native
  /**
    * The result of a batch remove facet from object operation.
    */
  var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObjectResponse] = js.native
  /**
    * Represents the output of a BatchWrite response operation.
    */
  var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributesResponse] = js.native
  /**
    * Updates a given object’s attributes.
    */
  var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributesResponse] = js.native
}

object BatchWriteOperationResponse {
  @scala.inline
  def apply(): BatchWriteOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteOperationResponse]
  }
  @scala.inline
  implicit class BatchWriteOperationResponseOps[Self <: BatchWriteOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFacetToObject(value: BatchAddFacetToObjectResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddFacetToObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddFacetToObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddFacetToObject")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachObject(value: BatchAttachObjectResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachObject")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachPolicy(value: BatchAttachPolicyResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachToIndex(value: BatchAttachToIndexResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachToIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachToIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachToIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachTypedLink(value: BatchAttachTypedLinkResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachTypedLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachTypedLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachTypedLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateIndex(value: BatchCreateIndexResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateObject(value: BatchCreateObjectResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteObject(value: BatchDeleteObjectResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDetachFromIndex(value: BatchDetachFromIndexResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachFromIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetachFromIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachFromIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDetachObject(value: BatchDetachObjectResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetachObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDetachPolicy(value: BatchDetachPolicyResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetachPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withDetachTypedLink(value: BatchDetachTypedLinkResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachTypedLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetachTypedLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachTypedLink")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFacetFromObject(value: BatchRemoveFacetFromObjectResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveFacetFromObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveFacetFromObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveFacetFromObject")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateLinkAttributes(value: BatchUpdateLinkAttributesResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateLinkAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateLinkAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateLinkAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateObjectAttributes(value: BatchUpdateObjectAttributesResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateObjectAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateObjectAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateObjectAttributes")(js.undefined)
        ret
    }
  }
  
}

