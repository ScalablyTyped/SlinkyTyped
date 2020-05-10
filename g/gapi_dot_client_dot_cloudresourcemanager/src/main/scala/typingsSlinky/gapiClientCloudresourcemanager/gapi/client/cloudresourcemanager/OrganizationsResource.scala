package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudresourcemanager.AnonAccesstoken
import typingsSlinky.gapiClientCloudresourcemanager.AnonAlt
import typingsSlinky.gapiClientCloudresourcemanager.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationsResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: AnonAccesstoken): Request_[js.Object] = js.native
  /** Fetches an Organization resource identified by the specified resource name. */
  def get(request: AnonBearertoken): Request_[Organization] = js.native
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy] = js.native
  /**
    * Gets the access control policy for an Organization resource. May be empty
    * if no such policy or resource exists. The `resource` field should be the
    * organization's resource name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.getIamPolicy` on the specified organization
    */
  def getIamPolicy(request: AnonAccesstoken): Request_[Policy] = js.native
  /**
    * Gets a `Policy` on a resource.
    *
    * If no `Policy` is set on the resource, a `Policy` is returned with default
    * values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The
    * `etag` value can be used with `SetOrgPolicy()` to create or update a
    * `Policy` during read-modify-write.
    */
  def getOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy] = js.native
  /** Lists `Constraints` that could be applied on the specified resource. */
  def listAvailableOrgPolicyConstraints(request: AnonAccesstoken): Request_[ListAvailableOrgPolicyConstraintsResponse] = js.native
  /** Lists all the `Policies` set for a particular resource. */
  def listOrgPolicies(request: AnonAccesstoken): Request_[ListOrgPoliciesResponse] = js.native
  /**
    * Searches Organization resources that are visible to the user and satisfy
    * the specified filter. This method returns Organizations in an unspecified
    * order. New Organizations do not necessarily appear at the end of the
    * results.
    *
    * Search will only return organizations on which the user has the permission
    * `resourcemanager.organizations.get`
    */
  def search(request: AnonAlt): Request_[SearchOrganizationsResponse] = js.native
  /**
    * Sets the access control policy on an Organization resource. Replaces any
    * existing policy. The `resource` field should be the organization's resource
    * name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.setIamPolicy` on the specified organization
    */
  def setIamPolicy(request: AnonAccesstoken): Request_[Policy] = js.native
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy] = js.native
  /**
    * Returns permissions that a caller has on the specified Organization.
    * The `resource` field should be the organization's resource name,
    * e.g. "organizations/123".
    *
    * There are no permissions required for making this API call.
    */
  def testIamPermissions(request: AnonAccesstoken): Request_[TestIamPermissionsResponse] = js.native
}

object OrganizationsResource {
  @scala.inline
  def apply(
    clearOrgPolicy: AnonAccesstoken => Request_[js.Object],
    get: AnonBearertoken => Request_[Organization],
    getEffectiveOrgPolicy: AnonAccesstoken => Request_[OrgPolicy],
    getIamPolicy: AnonAccesstoken => Request_[Policy],
    getOrgPolicy: AnonAccesstoken => Request_[OrgPolicy],
    listAvailableOrgPolicyConstraints: AnonAccesstoken => Request_[ListAvailableOrgPolicyConstraintsResponse],
    listOrgPolicies: AnonAccesstoken => Request_[ListOrgPoliciesResponse],
    search: AnonAlt => Request_[SearchOrganizationsResponse],
    setIamPolicy: AnonAccesstoken => Request_[Policy],
    setOrgPolicy: AnonAccesstoken => Request_[OrgPolicy],
    testIamPermissions: AnonAccesstoken => Request_[TestIamPermissionsResponse]
  ): OrganizationsResource = {
    val __obj = js.Dynamic.literal(clearOrgPolicy = js.Any.fromFunction1(clearOrgPolicy), get = js.Any.fromFunction1(get), getEffectiveOrgPolicy = js.Any.fromFunction1(getEffectiveOrgPolicy), getIamPolicy = js.Any.fromFunction1(getIamPolicy), getOrgPolicy = js.Any.fromFunction1(getOrgPolicy), listAvailableOrgPolicyConstraints = js.Any.fromFunction1(listAvailableOrgPolicyConstraints), listOrgPolicies = js.Any.fromFunction1(listOrgPolicies), search = js.Any.fromFunction1(search), setIamPolicy = js.Any.fromFunction1(setIamPolicy), setOrgPolicy = js.Any.fromFunction1(setOrgPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[OrganizationsResource]
  }
  @scala.inline
  implicit class OrganizationsResourceOps[Self <: OrganizationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearOrgPolicy(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOrgPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonBearertoken => Request_[Organization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEffectiveOrgPolicy(value: AnonAccesstoken => Request_[OrgPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEffectiveOrgPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonAccesstoken => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOrgPolicy(value: AnonAccesstoken => Request_[OrgPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrgPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListAvailableOrgPolicyConstraints(value: AnonAccesstoken => Request_[ListAvailableOrgPolicyConstraintsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAvailableOrgPolicyConstraints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListOrgPolicies(value: AnonAccesstoken => Request_[ListOrgPoliciesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listOrgPolicies")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: AnonAlt => Request_[SearchOrganizationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonAccesstoken => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOrgPolicy(value: AnonAccesstoken => Request_[OrgPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrgPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonAccesstoken => Request_[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

