package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.file
import typingsSlinky.electron.electronStrings.separator
import typingsSlinky.electron.electronStrings.task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JumpListItem extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/jump-list-item
  /**
    * The command line arguments when program is executed. Should only be set if type
    * is task.
    */
  var args: js.UndefOr[String] = js.native
  /**
    * Description of the task (displayed in a tooltip). Should only be set if type is
    * task.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The index of the icon in the resource file. If a resource file contains multiple
    * icons this value can be used to specify the zero-based index of the icon that
    * should be displayed for this task. If a resource file contains only one icon,
    * this property should be set to zero.
    */
  var iconIndex: js.UndefOr[Double] = js.native
  /**
    * The absolute path to an icon to be displayed in a Jump List, which can be an
    * arbitrary resource file that contains an icon (e.g. .ico, .exe, .dll). You can
    * usually specify process.execPath to show the program icon.
    */
  var iconPath: js.UndefOr[String] = js.native
  /**
    * Path of the file to open, should only be set if type is file.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Path of the program to execute, usually you should specify process.execPath
    * which opens the current program. Should only be set if type is task.
    */
  var program: js.UndefOr[String] = js.native
  /**
    * The text to be displayed for the item in the Jump List. Should only be set if
    * type is task.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * One of the following:
    */
  var `type`: js.UndefOr[task | separator | file] = js.native
  /**
    * The working directory. Default is empty.
    */
  var workingDirectory: js.UndefOr[String] = js.native
}

object JumpListItem {
  @scala.inline
  def apply(): JumpListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpListItem]
  }
  @scala.inline
  implicit class JumpListItemOps[Self <: JumpListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIconIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIconPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(js.undefined)
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
    def withProgram(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: task | separator | file): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

