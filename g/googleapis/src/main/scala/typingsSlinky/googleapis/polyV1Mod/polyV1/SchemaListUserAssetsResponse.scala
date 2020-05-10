package typingsSlinky.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message from a request to list.
  */
@js.native
trait SchemaListUserAssetsResponse extends js.Object {
  /**
    * The continuation token for retrieving the next page. If empty, indicates
    * that there are no more pages. To get the next page, submit the same
    * request specifying this value as the page_token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of assets in the list, without pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
  /**
    * A list of UserAssets matching the request.
    */
  var userAssets: js.UndefOr[js.Array[SchemaUserAsset]] = js.native
}

object SchemaListUserAssetsResponse {
  @scala.inline
  def apply(): SchemaListUserAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUserAssetsResponse]
  }
  @scala.inline
  implicit class SchemaListUserAssetsResponseOps[Self <: SchemaListUserAssetsResponse] (val x: Self) extends AnyVal {
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
    def withTotalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAssets(value: js.Array[SchemaUserAsset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAssets")(js.undefined)
        ret
    }
  }
  
}

