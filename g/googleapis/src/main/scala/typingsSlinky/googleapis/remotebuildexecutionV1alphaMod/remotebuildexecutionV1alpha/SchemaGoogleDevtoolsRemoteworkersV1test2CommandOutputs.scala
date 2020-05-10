package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - use CommandResult instead. Describes the actual outputs from
  * the task.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs extends js.Object {
  /**
    * exit_code is only fully reliable if the status&#39; code is OK. If the
    * task exceeded its deadline or was cancelled, the process may still
    * produce an exit code as it is cancelled, and this will be populated, but
    * a successful (zero) is unlikely to be correct unless the status code is
    * OK.
    */
  var exitCode: js.UndefOr[Double] = js.native
  /**
    * The output files. The blob referenced by the digest should contain one of
    * the following (implementation-dependent):    * A marshalled
    * DirectoryMetadata of the returned filesystem    * A LUCI-style .isolated
    * file
    */
  var outputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputsOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExitCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2Digest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
  }
  
}

