package typingsSlinky.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListMembershipsResponse extends js.Object {
  /**
    * List of Memberships
    */
  var memberships: js.UndefOr[js.Array[SchemaMembership]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results available for listing.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListMembershipsResponse {
  @scala.inline
  def apply(): SchemaListMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMembershipsResponse]
  }
  @scala.inline
  implicit class SchemaListMembershipsResponseOps[Self <: SchemaListMembershipsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberships(value: js.Array[SchemaMembership]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberships")(js.undefined)
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

