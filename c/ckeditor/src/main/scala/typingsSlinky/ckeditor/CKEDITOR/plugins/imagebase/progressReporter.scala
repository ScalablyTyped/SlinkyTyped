package typingsSlinky.ckeditor.CKEDITOR.plugins.imagebase

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.fileTools.fileLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait progressReporter extends js.Object {
  var wrapper: element = js.native
  def aborted(): Unit = js.native
  def bindLoader(loader: fileLoader): Unit = js.native
  def done(): Unit = js.native
  def failed(): Unit = js.native
  def remove(): Unit = js.native
  def updated(progress: Double): Unit = js.native
}

object progressReporter {
  @scala.inline
  def apply(
    aborted: () => Unit,
    bindLoader: fileLoader => Unit,
    done: () => Unit,
    failed: () => Unit,
    remove: () => Unit,
    updated: Double => Unit,
    wrapper: element
  ): progressReporter = {
    val __obj = js.Dynamic.literal(aborted = js.Any.fromFunction0(aborted), bindLoader = js.Any.fromFunction1(bindLoader), done = js.Any.fromFunction0(done), failed = js.Any.fromFunction0(failed), remove = js.Any.fromFunction0(remove), updated = js.Any.fromFunction1(updated), wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[progressReporter]
  }
  @scala.inline
  implicit class progressReporterOps[Self <: progressReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAborted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aborted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBindLoader(value: fileLoader => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindLoader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFailed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdated(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrapper(value: element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

