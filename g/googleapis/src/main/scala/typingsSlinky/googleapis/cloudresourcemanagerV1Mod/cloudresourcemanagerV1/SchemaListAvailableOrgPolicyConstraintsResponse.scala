package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response returned from the ListAvailableOrgPolicyConstraints method.
  * Returns all `Constraints` that could be set at this level of the hierarchy
  * (contrast with the response from `ListPolicies`, which returns all policies
  * which are set).
  */
@js.native
trait SchemaListAvailableOrgPolicyConstraintsResponse extends js.Object {
  /**
    * The collection of constraints that are settable on the request resource.
    */
  var constraints: js.UndefOr[js.Array[SchemaConstraint]] = js.native
  /**
    * Page token used to retrieve the next page. This is currently not used.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAvailableOrgPolicyConstraintsResponse {
  @scala.inline
  def apply(): SchemaListAvailableOrgPolicyConstraintsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAvailableOrgPolicyConstraintsResponse]
  }
  @scala.inline
  implicit class SchemaListAvailableOrgPolicyConstraintsResponseOps[Self <: SchemaListAvailableOrgPolicyConstraintsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: js.Array[SchemaConstraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

