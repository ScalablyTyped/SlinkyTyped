package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about an ongoing execution, which will be contained in the
  * metadata field of the Operation.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata extends js.Object {
  /**
    * The digest of the Action being executed.
    */
  var actionDigest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
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

object SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadataOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = {
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

