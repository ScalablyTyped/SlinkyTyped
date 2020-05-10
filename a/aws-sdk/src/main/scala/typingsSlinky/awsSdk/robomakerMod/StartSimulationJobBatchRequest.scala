package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSimulationJobBatchRequest extends js.Object {
  /**
    * The batch policy.
    */
  var batchPolicy: js.UndefOr[BatchPolicy] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * A list of simulation job requests to create in the batch.
    */
  var createSimulationJobRequests: CreateSimulationJobRequests = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the deployment job batch.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object StartSimulationJobBatchRequest {
  @scala.inline
  def apply(createSimulationJobRequests: CreateSimulationJobRequests): StartSimulationJobBatchRequest = {
    val __obj = js.Dynamic.literal(createSimulationJobRequests = createSimulationJobRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSimulationJobBatchRequest]
  }
  @scala.inline
  implicit class StartSimulationJobBatchRequestOps[Self <: StartSimulationJobBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateSimulationJobRequests(value: CreateSimulationJobRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSimulationJobRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchPolicy(value: BatchPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

