package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClustersResult extends js.Object {
  /**
    * Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
    */
  var ClusterListEntries: js.UndefOr[ClusterListEntryList] = js.native
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next ClusterListEntry call, your list of returned clusters will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListClustersResult {
  @scala.inline
  def apply(): ListClustersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResult]
  }
  @scala.inline
  implicit class ListClustersResultOps[Self <: ListClustersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterListEntries(value: ClusterListEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterListEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterListEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterListEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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

