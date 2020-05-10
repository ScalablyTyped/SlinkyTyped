package typingsSlinky.azdata.mod

import typingsSlinky.azdata.mod.connection.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskInfo extends js.Object {
  var connection: js.UndefOr[Connection] = js.native
  var databaseName: String = js.native
  var description: String = js.native
  var isCancelable: Boolean = js.native
  var name: String = js.native
  var providerName: String = js.native
  var serverName: String = js.native
  var status: TaskStatus = js.native
  var taskExecutionMode: TaskExecutionMode = js.native
  var taskId: String = js.native
}

object TaskInfo {
  @scala.inline
  def apply(
    databaseName: String,
    description: String,
    isCancelable: Boolean,
    name: String,
    providerName: String,
    serverName: String,
    status: TaskStatus,
    taskExecutionMode: TaskExecutionMode,
    taskId: String
  ): TaskInfo = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isCancelable = isCancelable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskExecutionMode = taskExecutionMode.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskInfo]
  }
  @scala.inline
  implicit class TaskInfoOps[Self <: TaskInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: TaskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskExecutionMode(value: TaskExecutionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskExecutionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
  }
  
}

