package typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage

import typingsSlinky.reactNativeFirebase.AnonCACHESDIRECTORYPATH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageStatics extends js.Object {
  var Native: js.UndefOr[AnonCACHESDIRECTORYPATH] = js.native
  var TaskEvent: typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.TaskEvent = js.native
  var TaskState: typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.TaskState = js.native
}

object StorageStatics {
  @scala.inline
  def apply(TaskEvent: TaskEvent, TaskState: TaskState): StorageStatics = {
    val __obj = js.Dynamic.literal(TaskEvent = TaskEvent.asInstanceOf[js.Any], TaskState = TaskState.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageStatics]
  }
  @scala.inline
  implicit class StorageStaticsOps[Self <: StorageStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskEvent(value: TaskEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskState(value: TaskState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNative(value: AnonCACHESDIRECTORYPATH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Native")(js.undefined)
        ret
    }
  }
  
}

