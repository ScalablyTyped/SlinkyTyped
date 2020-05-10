package typingsSlinky.atom.mod._Global_

import typingsSlinky.atom.mod.TextEditorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElementTagNameMap extends js.Object {
  var `atom-text-editor`: TextEditorElement = js.native
}

object HTMLElementTagNameMap {
  @scala.inline
  def apply(`atom-text-editor`: TextEditorElement): HTMLElementTagNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atom-text-editor")(`atom-text-editor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElementTagNameMap]
  }
  @scala.inline
  implicit class HTMLElementTagNameMapOps[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAtom-text-editor`(value: TextEditorElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atom-text-editor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

