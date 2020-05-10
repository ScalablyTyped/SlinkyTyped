package typingsSlinky.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response returned from the `ListOrganizations` method.
  */
@js.native
trait SchemaListOrganizationsResponse extends js.Object {
  /**
    * A pagination token to be used to retrieve the next page of results. If
    * the result is too large to fit within the page size specified in the
    * request, this field will be set with a token that can be used to fetch
    * the next page of results. If this field is empty, it indicates that this
    * response contains the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of Organizations that matched the list query, possibly
    * paginated.
    */
  var organizations: js.UndefOr[js.Array[SchemaOrganization]] = js.native
}

object SchemaListOrganizationsResponse {
  @scala.inline
  def apply(): SchemaListOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOrganizationsResponse]
  }
  @scala.inline
  implicit class SchemaListOrganizationsResponseOps[Self <: SchemaListOrganizationsResponse] (val x: Self) extends AnyVal {
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
    def withOrganizations(value: js.Array[SchemaOrganization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(js.undefined)
        ret
    }
  }
  
}

