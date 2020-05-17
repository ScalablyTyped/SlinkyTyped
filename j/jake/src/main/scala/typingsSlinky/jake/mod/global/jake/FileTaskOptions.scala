package typingsSlinky.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTaskOptions extends js.Object {
  /**
  		 * Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
  		 * @default false
  		 */
  var async: js.UndefOr[Boolean] = js.native
}

object FileTaskOptions {
  @scala.inline
  def apply(): FileTaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileTaskOptions]
  }
  @scala.inline
  implicit class FileTaskOptionsOps[Self <: FileTaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
  }
  
}

