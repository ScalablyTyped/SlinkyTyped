package typingsSlinky.jqueryAjaxfile.AjaxFileKnockout

import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileInputWrapper extends js.Object {
  def fileSelected(): Boolean = js.native
  def getElement(): HTMLInputElement = js.native
}

object IFileInputWrapper {
  @scala.inline
  def apply(fileSelected: () => Boolean, getElement: () => HTMLInputElement): IFileInputWrapper = {
    val __obj = js.Dynamic.literal(fileSelected = js.Any.fromFunction0(fileSelected), getElement = js.Any.fromFunction0(getElement))
    __obj.asInstanceOf[IFileInputWrapper]
  }
  @scala.inline
  implicit class IFileInputWrapperOps[Self <: IFileInputWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSelected(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetElement(value: () => HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

