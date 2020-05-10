package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/task
  /**
    * The command line arguments when program is executed.
    */
  var arguments: String = js.native
  /**
    * Description of this task.
    */
  var description: String = js.native
  /**
    * The icon index in the icon file. If an icon file consists of two or more icons,
    * set this value to identify the icon. If an icon file consists of one icon, this
    * value is 0.
    */
  var iconIndex: Double = js.native
  /**
    * The absolute path to an icon to be displayed in a JumpList, which can be an
    * arbitrary resource file that contains an icon. You can usually specify
    * process.execPath to show the icon of the program.
    */
  var iconPath: String = js.native
  /**
    * Path of the program to execute, usually you should specify process.execPath
    * which opens the current program.
    */
  var program: String = js.native
  /**
    * The string to be displayed in a JumpList.
    */
  var title: String = js.native
  /**
    * The working directory. Default is empty.
    */
  var workingDirectory: js.UndefOr[String] = js.native
}

object Task {
  @scala.inline
  def apply(
    arguments: String,
    description: String,
    iconIndex: Double,
    iconPath: String,
    program: String,
    title: String
  ): Task = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconIndex = iconIndex.asInstanceOf[js.Any], iconPath = iconPath.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgram(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkingDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDirectory")(js.undefined)
        ret
    }
  }
  
}

