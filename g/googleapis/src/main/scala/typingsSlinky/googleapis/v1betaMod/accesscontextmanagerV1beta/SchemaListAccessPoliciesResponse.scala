package typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to `ListAccessPoliciesRequest`.
  */
@js.native
trait SchemaListAccessPoliciesResponse extends js.Object {
  /**
    * List of the AccessPolicy instances.
    */
  var accessPolicies: js.UndefOr[js.Array[SchemaAccessPolicy]] = js.native
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAccessPoliciesResponse {
  @scala.inline
  def apply(): SchemaListAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccessPoliciesResponse]
  }
  @scala.inline
  implicit class SchemaListAccessPoliciesResponseOps[Self <: SchemaListAccessPoliciesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPolicies(value: js.Array[SchemaAccessPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPolicies")(js.undefined)
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

