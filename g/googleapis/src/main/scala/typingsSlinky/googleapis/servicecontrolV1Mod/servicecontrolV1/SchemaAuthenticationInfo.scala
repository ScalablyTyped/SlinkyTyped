package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authentication information for the operation.
  */
@js.native
trait SchemaAuthenticationInfo extends js.Object {
  /**
    * The authority selector specified by the requestor, if any. It is not
    * guaranteed that the principal was allowed to use this authority.
    */
  var authoritySelector: js.UndefOr[String] = js.native
  /**
    * The email address of the authenticated user (or service account on behalf
    * of third party principal) making the request. For privacy reasons, the
    * principal email address is redacted for all read-only operations that
    * fail with a &quot;permission denied&quot; error.
    */
  var principalEmail: js.UndefOr[String] = js.native
  /**
    * Identity delegation history of an authenticated service account that
    * makes the request. It contains information on the real authorities that
    * try to access GCP resources by delegating on a service account. When
    * multiple authorities present, they are guaranteed to be sorted based on
    * the original ordering of the identity delegation events.
    */
  var serviceAccountDelegationInfo: js.UndefOr[js.Array[SchemaServiceAccountDelegationInfo]] = js.native
  /**
    * The name of the service account key used to create or exchange
    * credentials for authenticating the service account making the request.
    * This is a scheme-less URI full resource name. For example:
    * &quot;//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}&quot;
    */
  var serviceAccountKeyName: js.UndefOr[String] = js.native
  /**
    * The third party identification (if any) of the authenticated user making
    * the request. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var thirdPartyPrincipal: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaAuthenticationInfo {
  @scala.inline
  def apply(): SchemaAuthenticationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticationInfo]
  }
  @scala.inline
  implicit class SchemaAuthenticationInfoOps[Self <: SchemaAuthenticationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthoritySelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoritySelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthoritySelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoritySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountDelegationInfo(value: js.Array[SchemaServiceAccountDelegationInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountDelegationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountDelegationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountDelegationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withThirdPartyPrincipal(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyPrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThirdPartyPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyPrincipal")(js.undefined)
        ret
    }
  }
  
}

