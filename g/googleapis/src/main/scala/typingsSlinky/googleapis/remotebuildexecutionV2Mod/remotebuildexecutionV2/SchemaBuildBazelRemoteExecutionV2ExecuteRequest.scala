package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for Execution.Execute.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ExecuteRequest extends js.Object {
  /**
    * The digest of the Action to execute.
    */
  var actionDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * An optional policy for execution of the action. The server will have a
    * default policy if this is not provided.
    */
  var executionPolicy: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ExecutionPolicy] = js.native
  /**
    * An optional policy for the results of this execution in the remote cache.
    * The server will have a default policy if this is not provided. This may
    * be applied to both the ActionResult and the associated blobs.
    */
  var resultsCachePolicy: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy] = js.native
  /**
    * If true, the action will be executed anew even if its result was already
    * present in the cache. If false, the result may be served from the
    * ActionCache.
    */
  var skipCacheLookup: js.UndefOr[Boolean] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ExecuteRequest {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecuteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecuteRequest]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecuteRequestOps[Self <: SchemaBuildBazelRemoteExecutionV2ExecuteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionPolicy(value: SchemaBuildBazelRemoteExecutionV2ExecutionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withResultsCachePolicy(value: SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsCachePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultsCachePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsCachePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipCacheLookup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCacheLookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipCacheLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCacheLookup")(js.undefined)
        ret
    }
  }
  
}

