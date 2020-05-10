package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response returned from the ListOrgPolicies method. It will be empty if
  * no `Policies` are set on the resource.
  */
@js.native
trait SchemaListOrgPoliciesResponse extends js.Object {
  /**
    * Page token used to retrieve the next page. This is currently not used,
    * but the server may at any point start supplying a valid token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The `Policies` that are set on the resource. It will be empty if no
    * `Policies` are set.
    */
  var policies: js.UndefOr[js.Array[SchemaOrgPolicy]] = js.native
}

object SchemaListOrgPoliciesResponse {
  @scala.inline
  def apply(): SchemaListOrgPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOrgPoliciesResponse]
  }
  @scala.inline
  implicit class SchemaListOrgPoliciesResponseOps[Self <: SchemaListOrgPoliciesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPolicies(value: js.Array[SchemaOrgPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(js.undefined)
        ret
    }
  }
  
}

