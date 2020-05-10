package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task which initializes part of a streaming Dataflow job.
  */
@js.native
trait SchemaStreamingSetupTask extends js.Object {
  /**
    * The user has requested drain.
    */
  var drain: js.UndefOr[Boolean] = js.native
  /**
    * The TCP port on which the worker should listen for messages from other
    * streaming computation workers.
    */
  var receiveWorkPort: js.UndefOr[Double] = js.native
  /**
    * Configures streaming appliance snapshot.
    */
  var snapshotConfig: js.UndefOr[SchemaStreamingApplianceSnapshotConfig] = js.native
  /**
    * The global topology of the streaming Dataflow job.
    */
  var streamingComputationTopology: js.UndefOr[SchemaTopologyConfig] = js.native
  /**
    * The TCP port used by the worker to communicate with the Dataflow worker
    * harness.
    */
  var workerHarnessPort: js.UndefOr[Double] = js.native
}

object SchemaStreamingSetupTask {
  @scala.inline
  def apply(): SchemaStreamingSetupTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingSetupTask]
  }
  @scala.inline
  implicit class SchemaStreamingSetupTaskOps[Self <: SchemaStreamingSetupTask] (val x: Self) extends AnyVal {
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
    def withSnapshotConfig(value: SchemaStreamingApplianceSnapshotConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingComputationTopology(value: SchemaTopologyConfig): Self = {
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

