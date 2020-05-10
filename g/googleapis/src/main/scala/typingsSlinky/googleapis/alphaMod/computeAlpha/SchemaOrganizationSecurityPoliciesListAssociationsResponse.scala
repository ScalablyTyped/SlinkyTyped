package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrganizationSecurityPoliciesListAssociationsResponse extends js.Object {
  /**
    * A list of associations.
    */
  var associations: js.UndefOr[js.Array[SchemaSecurityPolicyAssociation]] = js.native
  /**
    * [Output Only] Type of securityPolicy associations. Always
    * compute#organizationSecurityPoliciesListAssociations for lists of
    * securityPolicy associations.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOrganizationSecurityPoliciesListAssociationsResponse {
  @scala.inline
  def apply(): SchemaOrganizationSecurityPoliciesListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganizationSecurityPoliciesListAssociationsResponse]
  }
  @scala.inline
  implicit class SchemaOrganizationSecurityPoliciesListAssociationsResponseOps[Self <: SchemaOrganizationSecurityPoliciesListAssociationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociations(value: js.Array[SchemaSecurityPolicyAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

