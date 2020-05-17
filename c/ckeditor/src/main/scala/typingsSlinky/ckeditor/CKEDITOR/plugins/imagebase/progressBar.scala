package typingsSlinky.ckeditor.CKEDITOR.plugins.imagebase

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.fileTools.fileLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait progressBar extends progressReporter {
  var bar: element = js.native
}

object progressBar {
  @scala.inline
  def apply(
    aborted: () => Unit,
    bar: element,
    bindLoader: fileLoader => Unit,
    done: () => Unit,
    failed: () => Unit,
    remove: () => Unit,
    updated: Double => Unit,
    wrapper: element
  ): progressBar = {
    val __obj = js.Dynamic.literal(aborted = js.Any.fromFunction0(aborted), bar = bar.asInstanceOf[js.Any], bindLoader = js.Any.fromFunction1(bindLoader), done = js.Any.fromFunction0(done), failed = js.Any.fromFunction0(failed), remove = js.Any.fromFunction0(remove), updated = js.Any.fromFunction1(updated), wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[progressBar]
  }
  @scala.inline
  implicit class progressBarOps[Self <: progressBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBar(value: element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

