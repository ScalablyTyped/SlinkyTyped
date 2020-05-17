package typingsSlinky.ckeditor.anon

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusElement extends js.Object {
  var focusElement: js.UndefOr[element | Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object FocusElement {
  @scala.inline
  def apply(): FocusElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusElement]
  }
  @scala.inline
  implicit class FocusElementOps[Self <: FocusElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusElement(value: element | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusElement")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

