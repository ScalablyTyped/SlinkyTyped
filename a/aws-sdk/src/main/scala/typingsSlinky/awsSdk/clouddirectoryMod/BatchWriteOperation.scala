package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchWriteOperation extends js.Object {
  /**
    * A batch operation that adds a facet to an object.
    */
  var AddFacetToObject: js.UndefOr[BatchAddFacetToObject] = js.native
  /**
    * Attaches an object to a Directory.
    */
  var AttachObject: js.UndefOr[BatchAttachObject] = js.native
  /**
    * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
    */
  var AttachPolicy: js.UndefOr[BatchAttachPolicy] = js.native
  /**
    * Attaches the specified object to the specified index.
    */
  var AttachToIndex: js.UndefOr[BatchAttachToIndex] = js.native
  /**
    * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
    */
  var AttachTypedLink: js.UndefOr[BatchAttachTypedLink] = js.native
  /**
    * Creates an index object. See Indexing and search for more information.
    */
  var CreateIndex: js.UndefOr[BatchCreateIndex] = js.native
  /**
    * Creates an object.
    */
  var CreateObject: js.UndefOr[BatchCreateObject] = js.native
  /**
    * Deletes an object in a Directory.
    */
  var DeleteObject: js.UndefOr[BatchDeleteObject] = js.native
  /**
    * Detaches the specified object from the specified index.
    */
  var DetachFromIndex: js.UndefOr[BatchDetachFromIndex] = js.native
  /**
    * Detaches an object from a Directory.
    */
  var DetachObject: js.UndefOr[BatchDetachObject] = js.native
  /**
    * Detaches a policy from a Directory.
    */
  var DetachPolicy: js.UndefOr[BatchDetachPolicy] = js.native
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  var DetachTypedLink: js.UndefOr[BatchDetachTypedLink] = js.native
  /**
    * A batch operation that removes a facet from an object.
    */
  var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObject] = js.native
  /**
    * Updates a given object's attributes.
    */
  var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributes] = js.native
  /**
    * Updates a given object's attributes.
    */
  var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributes] = js.native
}

object BatchWriteOperation {
  @scala.inline
  def apply(): BatchWriteOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteOperation]
  }
  @scala.inline
  implicit class BatchWriteOperationOps[Self <: BatchWriteOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFacetToObject(value: BatchAddFacetToObject): Self = {
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
    def withAttachObject(value: BatchAttachObject): Self = {
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
    def withAttachPolicy(value: BatchAttachPolicy): Self = {
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
    def withAttachToIndex(value: BatchAttachToIndex): Self = {
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
    def withAttachTypedLink(value: BatchAttachTypedLink): Self = {
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
    def withCreateIndex(value: BatchCreateIndex): Self = {
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
    def withCreateObject(value: BatchCreateObject): Self = {
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
    def withDeleteObject(value: BatchDeleteObject): Self = {
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
    def withDetachFromIndex(value: BatchDetachFromIndex): Self = {
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
    def withDetachObject(value: BatchDetachObject): Self = {
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
    def withDetachPolicy(value: BatchDetachPolicy): Self = {
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
    def withDetachTypedLink(value: BatchDetachTypedLink): Self = {
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
    def withRemoveFacetFromObject(value: BatchRemoveFacetFromObject): Self = {
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
    def withUpdateLinkAttributes(value: BatchUpdateLinkAttributes): Self = {
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
    def withUpdateObjectAttributes(value: BatchUpdateObjectAttributes): Self = {
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

