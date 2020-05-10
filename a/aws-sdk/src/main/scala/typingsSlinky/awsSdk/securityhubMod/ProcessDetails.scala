package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessDetails extends js.Object {
  /**
    * The date/time that the process was launched.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the process.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The parent process ID.
    */
  var ParentPid: js.UndefOr[Integer] = js.native
  /**
    * The path to the process executable.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  /**
    * The process ID.
    */
  var Pid: js.UndefOr[Integer] = js.native
  /**
    * The date and time when the process was terminated.
    */
  var TerminatedAt: js.UndefOr[NonEmptyString] = js.native
}

object ProcessDetails {
  @scala.inline
  def apply(): ProcessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessDetails]
  }
  @scala.inline
  implicit class ProcessDetailsOps[Self <: ProcessDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchedAt(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withParentPid(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentPid")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(js.undefined)
        ret
    }
    @scala.inline
    def withPid(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pid")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminatedAt(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminatedAt")(js.undefined)
        ret
    }
  }
  
}

