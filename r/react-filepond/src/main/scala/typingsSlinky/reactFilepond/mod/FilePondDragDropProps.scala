package typingsSlinky.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondDragDropProps extends js.Object {
  /** Require drop on the FilePond element itself to catch the file. */
  var dropOnElement: js.UndefOr[Boolean] = js.native
  /** FilePond will catch all files dropped on the webpage */
  var dropOnPage: js.UndefOr[Boolean] = js.native
  /**
    * When enabled, files are validated before they are dropped.
    * A file is not added when it’s invalid.
    */
  var dropValidation: js.UndefOr[Boolean] = js.native
  /**
    * Ignored file names when handling dropped directories.
    * Dropping directories is not supported on all browsers.
    */
  var ignoredFiles: js.UndefOr[js.Array[String]] = js.native
}

object FilePondDragDropProps {
  @scala.inline
  def apply(): FilePondDragDropProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondDragDropProps]
  }
  @scala.inline
  implicit class FilePondDragDropPropsOps[Self <: FilePondDragDropProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropOnElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOnElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropOnElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOnElement")(js.undefined)
        ret
    }
    @scala.inline
    def withDropOnPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOnPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropOnPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOnPage")(js.undefined)
        ret
    }
    @scala.inline
    def withDropValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoredFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoredFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredFiles")(js.undefined)
        ret
    }
  }
  
}

