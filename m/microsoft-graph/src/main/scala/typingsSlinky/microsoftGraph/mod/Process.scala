package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process extends js.Object {
  // User account identifier (user account context the process ran under) for example, AccountName, SID, and so on.
  var accountName: js.UndefOr[String] = js.native
  // The full process invocation commandline including all parameters.
  var commandLine: js.UndefOr[String] = js.native
  /**
    * Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  // Complex type containing file hashes (cryptographic and location-sensitive).
  var fileHash: js.UndefOr[FileHash] = js.native
  // The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
  var integrityLevel: js.UndefOr[ProcessIntegrityLevel] = js.native
  // True if the process is elevated.
  var isElevated: js.UndefOr[Boolean] = js.native
  // The name of the process' Image file.
  var name: js.UndefOr[String] = js.native
  /**
    * DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'.
    */
  var parentProcessCreatedDateTime: js.UndefOr[String] = js.native
  // The Process ID (PID) of the parent process.
  var parentProcessId: js.UndefOr[Double] = js.native
  // The name of the image file of the parent process.
  var parentProcessName: js.UndefOr[String] = js.native
  // Full path, including filename.
  var path: js.UndefOr[String] = js.native
  // The Process ID (PID) of the process.
  var processId: js.UndefOr[Double] = js.native
}

object Process {
  @scala.inline
  def apply(): Process = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Process]
  }
  @scala.inline
  implicit class ProcessOps[Self <: Process] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLine")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFileHash(value: FileHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHash")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrityLevel(value: ProcessIntegrityLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withIsElevated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isElevated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsElevated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isElevated")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParentProcessCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcessCreatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentProcessCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcessCreatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withParentProcessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcessId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentProcessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcessId")(js.undefined)
        ret
    }
    @scala.inline
    def withParentProcessName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcessName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentProcessName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcessName")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(js.undefined)
        ret
    }
  }
  
}

