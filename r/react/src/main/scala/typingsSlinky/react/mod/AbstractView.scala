package typingsSlinky.react.mod

import typingsSlinky.std.Document_
import typingsSlinky.std.StyleMedia_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Browser Interfaces
// https://github.com/nikeee/2048-typescript/blob/master/2048/js/touch.d.ts
// ----------------------------------------------------------------------
@js.native
trait AbstractView extends js.Object {
  var document: Document_ = js.native
  var styleMedia: StyleMedia_ = js.native
}

object AbstractView {
  @scala.inline
  def apply(document: Document_, styleMedia: StyleMedia_): AbstractView = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], styleMedia = styleMedia.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractView]
  }
  @scala.inline
  implicit class AbstractViewOps[Self <: AbstractView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: Document_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleMedia(value: StyleMedia_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleMedia")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

