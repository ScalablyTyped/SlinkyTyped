package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudresourcemanager.anon.Accesstoken
import typingsSlinky.gapiClientCloudresourcemanager.anon.Alt
import typingsSlinky.gapiClientCloudresourcemanager.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationsResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: Accesstoken): Request[js.Object] = js.native
  /** Fetches an Organization resource identified by the specified resource name. */
  def get(request: Bearertoken): Request[Organization] = js.native
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: Accesstoken): Request[OrgPolicy] = js.native
  /**
    * Gets the access control policy for an Organization resource. May be empty
    * if no such policy or resource exists. The `resource` field should be the
    * organization's resource name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.getIamPolicy` on the specified organization
    */
  def getIamPolicy(request: Accesstoken): Request[Policy] = js.native
  /**
    * Gets a `Policy` on a resource.
    *
    * If no `Policy` is set on the resource, a `Policy` is returned with default
    * values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The
    * `etag` value can be used with `SetOrgPolicy()` to create or update a
    * `Policy` during read-modify-write.
    */
  def getOrgPolicy(request: Accesstoken): Request[OrgPolicy] = js.native
  /** Lists `Constraints` that could be applied on the specified resource. */
  def listAvailableOrgPolicyConstraints(request: Accesstoken): Request[ListAvailableOrgPolicyConstraintsResponse] = js.native
  /** Lists all the `Policies` set for a particular resource. */
  def listOrgPolicies(request: Accesstoken): Request[ListOrgPoliciesResponse] = js.native
  /**
    * Searches Organization resources that are visible to the user and satisfy
    * the specified filter. This method returns Organizations in an unspecified
    * order. New Organizations do not necessarily appear at the end of the
    * results.
    *
    * Search will only return organizations on which the user has the permission
    * `resourcemanager.organizations.get`
    */
  def search(request: Alt): Request[SearchOrganizationsResponse] = js.native
  /**
    * Sets the access control policy on an Organization resource. Replaces any
    * existing policy. The `resource` field should be the organization's resource
    * name, e.g. "organizations/123".
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.setIamPolicy` on the specified organization
    */
  def setIamPolicy(request: Accesstoken): Request[Policy] = js.native
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: Accesstoken): Request[OrgPolicy] = js.native
  /**
    * Returns permissions that a caller has on the specified Organization.
    * The `resource` field should be the organization's resource name,
    * e.g. "organizations/123".
    *
    * There are no permissions required for making this API call.
    */
  def testIamPermissions(request: Accesstoken): Request[TestIamPermissionsResponse] = js.native
}

object OrganizationsResource {
  @scala.inline
  def apply(
    clearOrgPolicy: Accesstoken => Request[js.Object],
    get: Bearertoken => Request[Organization],
    getEffectiveOrgPolicy: Accesstoken => Request[OrgPolicy],
    getIamPolicy: Accesstoken => Request[Policy],
    getOrgPolicy: Accesstoken => Request[OrgPolicy],
    listAvailableOrgPolicyConstraints: Accesstoken => Request[ListAvailableOrgPolicyConstraintsResponse],
    listOrgPolicies: Accesstoken => Request[ListOrgPoliciesResponse],
    search: Alt => Request[SearchOrganizationsResponse],
    setIamPolicy: Accesstoken => Request[Policy],
    setOrgPolicy: Accesstoken => Request[OrgPolicy],
    testIamPermissions: Accesstoken => Request[TestIamPermissionsResponse]
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
    def withClearOrgPolicy(value: Accesstoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOrgPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Bearertoken => Request[Organization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEffectiveOrgPolicy(value: Accesstoken => Request[OrgPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEffectiveOrgPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: Accesstoken => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOrgPolicy(value: Accesstoken => Request[OrgPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrgPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListAvailableOrgPolicyConstraints(value: Accesstoken => Request[ListAvailableOrgPolicyConstraintsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAvailableOrgPolicyConstraints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListOrgPolicies(value: Accesstoken => Request[ListOrgPoliciesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listOrgPolicies")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: Alt => Request[SearchOrganizationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: Accesstoken => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOrgPolicy(value: Accesstoken => Request[OrgPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrgPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: Accesstoken => Request[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

