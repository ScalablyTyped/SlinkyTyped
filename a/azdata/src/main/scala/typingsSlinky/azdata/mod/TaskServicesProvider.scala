package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskServicesProvider extends DataProvider {
  def cancelTask(cancelTaskParams: CancelTaskParams): Thenable[Boolean] = js.native
  def getAllTasks(listTasksParams: ListTasksParams): Thenable[ListTasksResponse] = js.native
  def registerOnTaskCreated(handler: js.Function1[/* response */ TaskInfo, _]): Unit = js.native
  def registerOnTaskStatusChanged(handler: js.Function1[/* response */ TaskProgressInfo, _]): Unit = js.native
}

object TaskServicesProvider {
  @scala.inline
  def apply(
    cancelTask: CancelTaskParams => Thenable[Boolean],
    getAllTasks: ListTasksParams => Thenable[ListTasksResponse],
    providerId: String,
    registerOnTaskCreated: js.Function1[/* response */ TaskInfo, _] => Unit,
    registerOnTaskStatusChanged: js.Function1[/* response */ TaskProgressInfo, _] => Unit
  ): TaskServicesProvider = {
    val __obj = js.Dynamic.literal(cancelTask = js.Any.fromFunction1(cancelTask), getAllTasks = js.Any.fromFunction1(getAllTasks), providerId = providerId.asInstanceOf[js.Any], registerOnTaskCreated = js.Any.fromFunction1(registerOnTaskCreated), registerOnTaskStatusChanged = js.Any.fromFunction1(registerOnTaskStatusChanged))
    __obj.asInstanceOf[TaskServicesProvider]
  }
  @scala.inline
  implicit class TaskServicesProviderOps[Self <: TaskServicesProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelTask(value: CancelTaskParams => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTask")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllTasks(value: ListTasksParams => Thenable[ListTasksResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllTasks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnTaskCreated(value: js.Function1[/* response */ TaskInfo, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnTaskCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnTaskStatusChanged(value: js.Function1[/* response */ TaskProgressInfo, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnTaskStatusChanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

