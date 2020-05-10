package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global topology of the streaming Dataflow job, including all computations
  * and their sharded locations.
  */
@js.native
trait SchemaTopologyConfig extends js.Object {
  /**
    * The computations associated with a streaming Dataflow job.
    */
  var computations: js.UndefOr[js.Array[SchemaComputationTopology]] = js.native
  /**
    * The disks assigned to a streaming Dataflow job.
    */
  var dataDiskAssignments: js.UndefOr[js.Array[SchemaDataDiskAssignment]] = js.native
  /**
    * The size (in bits) of keys that will be assigned to source messages.
    */
  var forwardingKeyBits: js.UndefOr[Double] = js.native
  /**
    * Version number for persistent state.
    */
  var persistentStateVersion: js.UndefOr[Double] = js.native
  /**
    * Maps user stage names to stable computation names.
    */
  var userStageToComputationNameMap: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaTopologyConfig {
  @scala.inline
  def apply(): SchemaTopologyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopologyConfig]
  }
  @scala.inline
  implicit class SchemaTopologyConfigOps[Self <: SchemaTopologyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputations(value: js.Array[SchemaComputationTopology]): Self = {
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
    def withDataDiskAssignments(value: js.Array[SchemaDataDiskAssignment]): Self = {
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
    def withUserStageToComputationNameMap(value: StringDictionary[String]): Self = {
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

