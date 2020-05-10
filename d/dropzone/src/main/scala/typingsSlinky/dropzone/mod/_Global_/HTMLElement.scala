package typingsSlinky.dropzone.mod._Global_

import typingsSlinky.dropzone.mod.Dropzone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  var dropzone: Dropzone = js.native
}

object HTMLElement {
  @scala.inline
  def apply(dropzone: Dropzone): HTMLElement = {
    val __obj = js.Dynamic.literal(dropzone = dropzone.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  @scala.inline
  implicit class HTMLElementOps[Self <: HTMLElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropzone(value: Dropzone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropzone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

