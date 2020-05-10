package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchReadSuccessfulResponse extends js.Object {
  /**
    * The list of attributes to retrieve from the typed link.
    */
  var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributesResponse] = js.native
  /**
    * Retrieves attributes within a facet that are associated with an object.
    */
  var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributesResponse] = js.native
  /**
    * Retrieves metadata about an object.
    */
  var GetObjectInformation: js.UndefOr[BatchGetObjectInformationResponse] = js.native
  /**
    * Lists indices attached to an object.
    */
  var ListAttachedIndices: js.UndefOr[BatchListAttachedIndicesResponse] = js.native
  /**
    * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinksResponse] = js.native
  /**
    * Lists objects attached to the specified index.
    */
  var ListIndex: js.UndefOr[BatchListIndexResponse] = js.native
  /**
    * Lists all attributes that are associated with an object.
    */
  var ListObjectAttributes: js.UndefOr[BatchListObjectAttributesResponse] = js.native
  /**
    * Returns a paginated list of child objects that are associated with a given object.
    */
  var ListObjectChildren: js.UndefOr[BatchListObjectChildrenResponse] = js.native
  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure.
    */
  var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPathsResponse] = js.native
  var ListObjectParents: js.UndefOr[BatchListObjectParentsResponse] = js.native
  /**
    * Returns policies attached to an object in pagination fashion.
    */
  var ListObjectPolicies: js.UndefOr[BatchListObjectPoliciesResponse] = js.native
  /**
    * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinksResponse] = js.native
  /**
    * Returns all of the ObjectIdentifiers to which a given policy is attached.
    */
  var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachmentsResponse] = js.native
  /**
    * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
    */
  var LookupPolicy: js.UndefOr[BatchLookupPolicyResponse] = js.native
}

object BatchReadSuccessfulResponse {
  @scala.inline
  def apply(): BatchReadSuccessfulResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadSuccessfulResponse]
  }
  @scala.inline
  implicit class BatchReadSuccessfulResponseOps[Self <: BatchReadSuccessfulResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLinkAttributes(value: BatchGetLinkAttributesResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLinkAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetLinkAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLinkAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetObjectAttributes(value: BatchGetObjectAttributesResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjectAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetObjectAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjectAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetObjectInformation(value: BatchGetObjectInformationResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjectInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetObjectInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjectInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withListAttachedIndices(value: BatchListAttachedIndicesResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListAttachedIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListAttachedIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListAttachedIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withListIncomingTypedLinks(value: BatchListIncomingTypedLinksResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListIncomingTypedLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListIncomingTypedLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListIncomingTypedLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withListIndex(value: BatchListIndexResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withListObjectAttributes(value: BatchListObjectAttributesResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListObjectAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListObjectAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListObjectAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withListObjectChildren(value: BatchListObjectChildrenResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListObjectChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListObjectChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListObjectChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withListObjectParentPaths(value: BatchListObjectParentPathsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListObjectParentPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListObjectParentPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListObjectParentPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withListObjectParents(value: BatchListObjectParentsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListObjectParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListObjectParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListObjectParents")(js.undefined)
        ret
    }
    @scala.inline
    def withListObjectPolicies(value: BatchListObjectPoliciesResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListObjectPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListObjectPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListObjectPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withListOutgoingTypedLinks(value: BatchListOutgoingTypedLinksResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListOutgoingTypedLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListOutgoingTypedLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListOutgoingTypedLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withListPolicyAttachments(value: BatchListPolicyAttachmentsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListPolicyAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListPolicyAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListPolicyAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupPolicy(value: BatchLookupPolicyResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookupPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookupPolicy")(js.undefined)
        ret
    }
  }
  
}

