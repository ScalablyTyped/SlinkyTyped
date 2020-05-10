package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgBrowseButtonMethods extends js.Object {
  def attachFilePicker(e: js.Object, isHidden: js.Object): Unit = js.native
  /**
  	 * $(".selector").igUpload("destroy");
  	 */
  def destroy(): Unit = js.native
  def getFilePicker(): Unit = js.native
}

object IgBrowseButtonMethods {
  @scala.inline
  def apply(attachFilePicker: (js.Object, js.Object) => Unit, destroy: () => Unit, getFilePicker: () => Unit): IgBrowseButtonMethods = {
    val __obj = js.Dynamic.literal(attachFilePicker = js.Any.fromFunction2(attachFilePicker), destroy = js.Any.fromFunction0(destroy), getFilePicker = js.Any.fromFunction0(getFilePicker))
    __obj.asInstanceOf[IgBrowseButtonMethods]
  }
  @scala.inline
  implicit class IgBrowseButtonMethodsOps[Self <: IgBrowseButtonMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachFilePicker(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachFilePicker")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFilePicker(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilePicker")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

