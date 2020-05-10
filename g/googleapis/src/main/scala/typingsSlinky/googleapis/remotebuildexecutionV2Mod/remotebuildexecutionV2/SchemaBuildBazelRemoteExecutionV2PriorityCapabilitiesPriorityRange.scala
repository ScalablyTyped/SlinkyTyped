package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported range of priorities, including boundaries.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange extends js.Object {
  var maxPriority: js.UndefOr[Double] = js.native
  var minPriority: js.UndefOr[Double] = js.native
}

object SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRangeOps[Self <: SchemaBuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPriority")(js.undefined)
        ret
    }
  }
  
}

