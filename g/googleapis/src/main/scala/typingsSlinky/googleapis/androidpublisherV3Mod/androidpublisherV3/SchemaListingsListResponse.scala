package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListingsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#listingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var listings: js.UndefOr[js.Array[SchemaListing]] = js.native
}

object SchemaListingsListResponse {
  @scala.inline
  def apply(): SchemaListingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListingsListResponse]
  }
  @scala.inline
  implicit class SchemaListingsListResponseOps[Self <: SchemaListingsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withListings(value: js.Array[SchemaListing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listings")(js.undefined)
        ret
    }
  }
  
}

