package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRevisionAssetsResponse extends js.Object {
  /**
    * The asset objects listed by the request.
    */
  var Assets: js.UndefOr[ListOfAssetEntry] = js.native
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.NextToken] = js.native
}

object ListRevisionAssetsResponse {
  @scala.inline
  def apply(): ListRevisionAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRevisionAssetsResponse]
  }
  @scala.inline
  implicit class ListRevisionAssetsResponseOps[Self <: ListRevisionAssetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: ListOfAssetEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assets")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

