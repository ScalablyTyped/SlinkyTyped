package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingSetupTask extends js.Object {
  /** The user has requested drain. */
  var drain: js.UndefOr[Boolean] = js.native
  /**
    * The TCP port on which the worker should listen for messages from
    * other streaming computation workers.
    */
  var receiveWorkPort: js.UndefOr[Double] = js.native
  /** The global topology of the streaming Dataflow job. */
  var streamingComputationTopology: js.UndefOr[TopologyConfig] = js.native
  /**
    * The TCP port used by the worker to communicate with the Dataflow
    * worker harness.
    */
  var workerHarnessPort: js.UndefOr[Double] = js.native
}

object StreamingSetupTask {
  @scala.inline
  def apply(): StreamingSetupTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingSetupTask]
  }
  @scala.inline
  implicit class StreamingSetupTaskOps[Self <: StreamingSetupTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drain")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiveWorkPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveWorkPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiveWorkPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveWorkPort")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingComputationTopology(value: TopologyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingComputationTopology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingComputationTopology: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingComputationTopology")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerHarnessPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerHarnessPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerHarnessPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerHarnessPort")(js.undefined)
        ret
    }
  }
  
}

