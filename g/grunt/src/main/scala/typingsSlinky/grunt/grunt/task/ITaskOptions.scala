package typingsSlinky.grunt.grunt.task

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/configuring-tasks}
  *
  * A TaskConfig can be either be a full config or a compacted files config.
  * @see ITaskCompactOptions
  */
@js.native
trait ITaskOptions extends js.Object {
  // files?: grunt.file.IFilesArray
  // files?: grunt.file.IFilesMap
  var files: js.UndefOr[js.Any] = js.native
  var options: js.UndefOr[js.Any] = js.native
}

object ITaskOptions {
  @scala.inline
  def apply(): ITaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITaskOptions]
  }
  @scala.inline
  implicit class ITaskOptionsOps[Self <: ITaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

