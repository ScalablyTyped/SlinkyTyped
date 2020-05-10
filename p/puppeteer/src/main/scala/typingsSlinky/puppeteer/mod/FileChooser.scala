package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileChooser extends js.Object {
  /**
    * Accept the file chooser request with given paths.
    * If some of the filePaths are relative paths, then they are resolved relative to the current working directory.
    */
  def accept(filePaths: js.Array[String]): js.Promise[Unit] = js.native
  /** Closes the file chooser without selecting any files. */
  def cancel(): js.Promise[Unit] = js.native
  /** Whether file chooser allow for multiple file selection. */
  def isMultiple(): Boolean = js.native
}

object FileChooser {
  @scala.inline
  def apply(
    accept: js.Array[String] => js.Promise[Unit],
    cancel: () => js.Promise[Unit],
    isMultiple: () => Boolean
  ): FileChooser = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), cancel = js.Any.fromFunction0(cancel), isMultiple = js.Any.fromFunction0(isMultiple))
    __obj.asInstanceOf[FileChooser]
  }
  @scala.inline
  implicit class FileChooserOps[Self <: FileChooser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: js.Array[String] => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancel(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMultiple(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiple")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

