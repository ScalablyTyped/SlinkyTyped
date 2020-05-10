package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `LogFile` is a log stored in the CAS.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2LogFile extends js.Object {
  /**
    * The digest of the log contents.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * This is a hint as to the purpose of the log, and is set to true if the
    * log is human-readable text that can be usefully displayed to a user, and
    * false otherwise. For instance, if a command-line client wishes to print
    * the server logs to the terminal for a failed action, this allows it to
    * avoid displaying a binary file.
    */
  var humanReadable: js.UndefOr[Boolean] = js.native
}

object SchemaBuildBazelRemoteExecutionV2LogFile {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2LogFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2LogFile]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2LogFileOps[Self <: SchemaBuildBazelRemoteExecutionV2LogFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(js.undefined)
        ret
    }
    @scala.inline
    def withHumanReadable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanReadable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanReadable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanReadable")(js.undefined)
        ret
    }
  }
  
}

