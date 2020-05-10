package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSimulationJobBatchesResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListSimulationJobBatches request. When the results of a ListSimulationJobBatches request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of simulation job batch summaries.
    */
  var simulationJobBatchSummaries: js.UndefOr[SimulationJobBatchSummaries] = js.native
}

object ListSimulationJobBatchesResponse {
  @scala.inline
  def apply(): ListSimulationJobBatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSimulationJobBatchesResponse]
  }
  @scala.inline
  implicit class ListSimulationJobBatchesResponseOps[Self <: ListSimulationJobBatchesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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
    @scala.inline
    def withSimulationJobBatchSummaries(value: SimulationJobBatchSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulationJobBatchSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulationJobBatchSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulationJobBatchSummaries")(js.undefined)
        ret
    }
  }
  
}

