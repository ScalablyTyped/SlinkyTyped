package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServerNeighborsResponse extends js.Object {
  /**
    * Count of distinct servers that are one hop away from the given server.
    */
  var knownDependencyCount: js.UndefOr[Long] = js.native
  /**
    * List of distinct servers that are one hop away from the given server.
    */
  var neighbors: NeighborDetailsList = js.native
  /**
    * Token to retrieve the next set of results. For example, if you specified 100 IDs for ListServerNeighborsRequest$neighborConfigurationIds but set ListServerNeighborsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListServerNeighborsResponse {
  @scala.inline
  def apply(neighbors: NeighborDetailsList): ListServerNeighborsResponse = {
    val __obj = js.Dynamic.literal(neighbors = neighbors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServerNeighborsResponse]
  }
  @scala.inline
  implicit class ListServerNeighborsResponseOps[Self <: ListServerNeighborsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNeighbors(value: NeighborDetailsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighbors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKnownDependencyCount(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownDependencyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnownDependencyCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownDependencyCount")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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

