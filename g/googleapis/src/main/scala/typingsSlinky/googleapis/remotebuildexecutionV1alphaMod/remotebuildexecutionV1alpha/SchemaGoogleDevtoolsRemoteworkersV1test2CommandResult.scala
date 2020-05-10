package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All information about the execution of a command, suitable for providing as
  * the Bots interface&#39;s `Lease.result` field.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult extends js.Object {
  /**
    * The elapsed time between calling Accept and Complete. The server will
    * also have its own idea of what this should be, but this excludes the
    * overhead of the RPCs and the bot response time.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * The exit code of the process. An exit code of &quot;0&quot; should only
    * be trusted if `status` has a code of OK (otherwise it may simply be
    * unset).
    */
  var exitCode: js.UndefOr[Double] = js.native
  /**
    * Implementation-dependent metadata about the task. Both servers and bots
    * may define messages which can be encoded here; bots are free to provide
    * metadata in multiple formats, and servers are free to choose one or more
    * of the values to process and ignore others. In particular, it is *not*
    * considered an error for the bot to provide the server with a field that
    * it doesn&#39;t know about.
    */
  var metadata: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  /**
    * The output files. The blob referenced by the digest should contain one of
    * the following (implementation-dependent):    * A marshalled
    * DirectoryMetadata of the returned filesystem    * A LUCI-style .isolated
    * file
    */
  var outputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.native
  /**
    * The amount of time *not* spent executing the command (ie
    * uploading/downloading files).
    */
  var overhead: js.UndefOr[String] = js.native
  /**
    * An overall status for the command. For example, if the command timed out,
    * this might have a code of DEADLINE_EXCEEDED; if it was killed by the OS
    * for memory exhaustion, it might have a code of RESOURCE_EXHAUSTED.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandResultOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
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
    def withMetadata(value: js.Array[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
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
    @scala.inline
    def withOverhead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverhead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overhead")(js.undefined)
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

