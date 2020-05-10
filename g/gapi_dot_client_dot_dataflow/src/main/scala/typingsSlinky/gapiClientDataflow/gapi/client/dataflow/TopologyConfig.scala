package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopologyConfig extends js.Object {
  /** The computations associated with a streaming Dataflow job. */
  var computations: js.UndefOr[js.Array[ComputationTopology]] = js.native
  /** The disks assigned to a streaming Dataflow job. */
  var dataDiskAssignments: js.UndefOr[js.Array[DataDiskAssignment]] = js.native
  /** The size (in bits) of keys that will be assigned to source messages. */
  var forwardingKeyBits: js.UndefOr[Double] = js.native
  /** Version number for persistent state. */
  var persistentStateVersion: js.UndefOr[Double] = js.native
  /** Maps user stage names to stable computation names. */
  var userStageToComputationNameMap: js.UndefOr[Record[String, String]] = js.native
}

object TopologyConfig {
  @scala.inline
  def apply(): TopologyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopologyConfig]
  }
  @scala.inline
  implicit class TopologyConfigOps[Self <: TopologyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputations(value: js.Array[ComputationTopology]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computations")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDiskAssignments(value: js.Array[DataDiskAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDiskAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDiskAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDiskAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardingKeyBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingKeyBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingKeyBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingKeyBits")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentStateVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentStateVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStageToComputationNameMap(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStageToComputationNameMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStageToComputationNameMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStageToComputationNameMap")(js.undefined)
        ret
    }
  }
  
}

