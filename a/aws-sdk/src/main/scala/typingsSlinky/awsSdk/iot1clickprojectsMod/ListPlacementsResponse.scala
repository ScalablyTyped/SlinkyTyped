package typingsSlinky.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlacementsResponse extends js.Object {
  /**
    * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An object listing the requested placements.
    */
  var placements: PlacementSummaryList = js.native
}

object ListPlacementsResponse {
  @scala.inline
  def apply(placements: PlacementSummaryList): ListPlacementsResponse = {
    val __obj = js.Dynamic.literal(placements = placements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlacementsResponse]
  }
  @scala.inline
  implicit class ListPlacementsResponseOps[Self <: ListPlacementsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlacements(value: PlacementSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placements")(value.asInstanceOf[js.Any])
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

