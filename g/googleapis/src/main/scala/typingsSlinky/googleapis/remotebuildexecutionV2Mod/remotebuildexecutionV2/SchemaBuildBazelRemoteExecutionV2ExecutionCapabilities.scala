package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Capabilities of the remote execution system.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities extends js.Object {
  /**
    * Remote execution may only support a single digest function.
    */
  var digestFunction: js.UndefOr[String] = js.native
  /**
    * Whether remote execution is enabled for the particular server/instance.
    */
  var execEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Supported execution priority range.
    */
  var executionPriorityCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2PriorityCapabilities] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecutionCapabilitiesOps[Self <: SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigestFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigestFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withExecEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionPriorityCapabilities(value: SchemaBuildBazelRemoteExecutionV2PriorityCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionPriorityCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionPriorityCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionPriorityCapabilities")(js.undefined)
        ret
    }
  }
  
}

