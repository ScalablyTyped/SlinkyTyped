package typingsSlinky.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBundlesResult extends js.Object {
  /**
    *  A list of bundles. 
    */
  var bundleList: js.UndefOr[BundleList] = js.native
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBundlesResult {
  @scala.inline
  def apply(): ListBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBundlesResult]
  }
  @scala.inline
  implicit class ListBundlesResultOps[Self <: ListBundlesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleList(value: BundleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

