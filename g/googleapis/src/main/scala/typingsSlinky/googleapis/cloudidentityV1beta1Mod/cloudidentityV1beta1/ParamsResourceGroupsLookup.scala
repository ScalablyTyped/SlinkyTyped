package typingsSlinky.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGroupsLookup extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The id of the entity within the given namespace. The id must be unique
    * within its namespace.
    */
  @JSName("groupKey.id")
  var groupKeyDotid: js.UndefOr[String] = js.native
  /**
    * Namespaces provide isolation for ids, i.e an id only needs to be unique
    * within its namespace.  Namespaces are currently only created as part of
    * IdentitySource creation from Admin Console. A namespace
    * `"identitysources/{identity_source_id}"` is created corresponding to
    * every Identity Source `identity_source_id`.
    */
  @JSName("groupKey.namespace")
  var groupKeyDotnamespace: js.UndefOr[String] = js.native
}

object ParamsResourceGroupsLookup {
  @scala.inline
  def apply(): ParamsResourceGroupsLookup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsLookup]
  }
  @scala.inline
  implicit class ParamsResourceGroupsLookupOps[Self <: ParamsResourceGroupsLookup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupKeyDotid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupKey.id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupKeyDotid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupKey.id")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupKeyDotnamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupKey.namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupKeyDotnamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupKey.namespace")(js.undefined)
        ret
    }
  }
  
}

