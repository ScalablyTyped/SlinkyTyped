package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the timeouts associated with this task.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts extends js.Object {
  /**
    * This specifies the maximum time that the task can run, excluding the time
    * required to download inputs or upload outputs. That is, the worker will
    * terminate the task if it runs longer than this.
    */
  var execution: js.UndefOr[String] = js.native
  /**
    * This specifies the maximum amount of time the task can be idle - that is,
    * go without generating some output in either stdout or stderr. If the
    * process is silent for more than the specified time, the worker will
    * terminate the task.
    */
  var idle: js.UndefOr[String] = js.native
  /**
    * If the execution or IO timeouts are exceeded, the worker will try to
    * gracefully terminate the task and return any existing logs. However,
    * tasks may be hard-frozen in which case this process will fail. This
    * timeout specifies how long to wait for a terminated task to shut down
    * gracefully (e.g. via SIGTERM) before we bring down the hammer (e.g.
    * SIGKILL on *nix, CTRL_BREAK_EVENT on Windows).
    */
  var shutdown: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeoutsOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(js.undefined)
        ret
    }
    @scala.inline
    def withIdle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(js.undefined)
        ret
    }
  }
  
}

