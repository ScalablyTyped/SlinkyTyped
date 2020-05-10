package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Execution.Execute, which will be contained in the
  * response field of the Operation.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ExecuteResponse extends js.Object {
  /**
    * True if the result was served from cache, false if it was executed.
    */
  var cachedResult: js.UndefOr[Boolean] = js.native
  /**
    * Freeform informational message with details on the execution of the
    * action that may be displayed to the user upon failure or when requested
    * explicitly.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The result of the action.
    */
  var result: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  /**
    * An optional list of additional log outputs the server wishes to provide.
    * A server can use this to return execution-specific logs however it
    * wishes. This is intended primarily to make it easier for users to debug
    * issues that may be outside of the actual job execution, such as by
    * identifying the worker executing the action or by providing logs from the
    * worker&#39;s setup phase. The keys SHOULD be human readable so that a
    * client can display them to a user.
    */
  var serverLogs: js.UndefOr[StringDictionary[SchemaBuildBazelRemoteExecutionV2LogFile]] = js.native
  /**
    * If the status has a code other than `OK`, it indicates that the action
    * did not finish execution. For example, if the operation times out during
    * execution, the status will have a `DEADLINE_EXCEEDED` code. Servers MUST
    * use this field for errors in execution, rather than the error field on
    * the `Operation` object.  If the status code is other than `OK`, then the
    * result MUST NOT be cached. For an error status, the `result` field is
    * optional; the server may populate the output-, stdout-, and
    * stderr-related fields if it has any information available, such as the
    * stdout and stderr of a timed-out action.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ExecuteResponse {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecuteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecuteResponse]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecuteResponseOps[Self <: SchemaBuildBazelRemoteExecutionV2ExecuteResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCachedResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachedResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedResult")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: SchemaBuildBazelRemoteExecutionV2ActionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withServerLogs(value: StringDictionary[SchemaBuildBazelRemoteExecutionV2LogFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaGoogleRpcStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

