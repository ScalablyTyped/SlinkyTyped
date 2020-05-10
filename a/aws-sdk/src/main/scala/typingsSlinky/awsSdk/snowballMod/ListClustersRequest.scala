package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClustersRequest extends js.Object {
  /**
    * The number of ClusterListEntry objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.native
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of ClusterListEntry objects, you have the option of specifying NextToken as the starting point for your returned list.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListClustersRequest {
  @scala.inline
  def apply(): ListClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersRequest]
  }
  @scala.inline
  implicit class ListClustersRequestOps[Self <: ListClustersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: ListLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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

