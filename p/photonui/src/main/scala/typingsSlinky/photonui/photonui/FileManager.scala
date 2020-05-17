package typingsSlinky.photonui.photonui

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Widgets
@js.native
trait FileManager extends Base {
  var acceptedExts: js.Array[String] = js.native
  var acceptedMimes: js.Array[String] = js.native
  var dropZone: HTMLElement = js.native
  var multiselect: Boolean = js.native
  def open(): Unit = js.native
}

object FileManager {
  @scala.inline
  def apply(
    acceptedExts: js.Array[String],
    acceptedMimes: js.Array[String],
    destroy: () => Unit,
    dropZone: HTMLElement,
    multiselect: Boolean,
    open: () => Unit,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit
  ): FileManager = {
    val __obj = js.Dynamic.literal(acceptedExts = acceptedExts.asInstanceOf[js.Any], acceptedMimes = acceptedMimes.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), dropZone = dropZone.asInstanceOf[js.Any], multiselect = multiselect.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback))
    __obj.asInstanceOf[FileManager]
  }
  @scala.inline
  implicit class FileManagerOps[Self <: FileManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedExts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedExts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptedMimes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedMimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropZone(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

