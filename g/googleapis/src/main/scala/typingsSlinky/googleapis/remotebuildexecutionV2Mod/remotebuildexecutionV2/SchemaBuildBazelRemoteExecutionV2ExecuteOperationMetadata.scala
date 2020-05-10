package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about an ongoing execution, which will be contained in the
  * metadata field of the Operation.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata extends js.Object {
  /**
    * The digest of the Action being executed.
    */
  var actionDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  var stage: js.UndefOr[String] = js.native
  /**
    * If set, the client can use this name with ByteStream.Read to stream the
    * standard error.
    */
  var stderrStreamName: js.UndefOr[String] = js.native
  /**
    * If set, the client can use this name with ByteStream.Read to stream the
    * standard output.
    */
  var stdoutStreamName: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadataOps[Self <: SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata] (val x: Self) extends AnyVal {
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
    def withStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(js.undefined)
        ret
    }
    @scala.inline
    def withStderrStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderrStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderrStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderrStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withStdoutStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdoutStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdoutStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdoutStreamName")(js.undefined)
        ret
    }
  }
  
}

