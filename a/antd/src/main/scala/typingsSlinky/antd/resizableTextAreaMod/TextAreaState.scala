package typingsSlinky.antd.resizableTextAreaMod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaState extends js.Object {
  /** We need add process style to disable scroll first and then add back to avoid unexpected scrollbar  */
  var resizeStatus: js.UndefOr[/* 0 */ Double] = js.native
  var textareaStyles: js.UndefOr[CSSProperties] = js.native
}

object TextAreaState {
  @scala.inline
  def apply(): TextAreaState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaState]
  }
  @scala.inline
  implicit class TextAreaStateOps[Self <: TextAreaState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResizeStatus(value: /* 0 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTextareaStyles(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textareaStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextareaStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textareaStyles")(js.undefined)
        ret
    }
  }
  
}

