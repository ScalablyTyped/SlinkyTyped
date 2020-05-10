package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Tasks.Collection.TasklistsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Tasks.Collection.TasksCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Tasks.Schema.Task
import typingsSlinky.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskLinks
import typingsSlinky.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tasks_ extends js.Object {
  var Tasklists: js.UndefOr[TasklistsCollection] = js.native
  var Tasks: js.UndefOr[TasksCollection] = js.native
  // Create a new instance of Task
  def newTask(): Task = js.native
  // Create a new instance of TaskLinks
  def newTaskLinks(): TaskLinks = js.native
  // Create a new instance of TaskList
  def newTaskList(): TaskList = js.native
}

object Tasks_ {
  @scala.inline
  def apply(newTask: () => Task, newTaskLinks: () => TaskLinks, newTaskList: () => TaskList): Tasks_ = {
    val __obj = js.Dynamic.literal(newTask = js.Any.fromFunction0(newTask), newTaskLinks = js.Any.fromFunction0(newTaskLinks), newTaskList = js.Any.fromFunction0(newTaskList))
    __obj.asInstanceOf[Tasks_]
  }
  @scala.inline
  implicit class Tasks_Ops[Self <: Tasks_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewTask(value: () => Task): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTask")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTaskLinks(value: () => TaskLinks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTaskLinks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTaskList(value: () => TaskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTaskList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTasklists(value: TasklistsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tasklists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTasklists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tasklists")(js.undefined)
        ret
    }
    @scala.inline
    def withTasks(value: TasksCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tasks")(js.undefined)
        ret
    }
  }
  
}

