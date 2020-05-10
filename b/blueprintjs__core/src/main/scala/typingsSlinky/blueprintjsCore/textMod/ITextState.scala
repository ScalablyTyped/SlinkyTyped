package typingsSlinky.blueprintjsCore.textMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextState extends js.Object {
  var isContentOverflowing: Boolean = js.native
  var textContent: String = js.native
}

object ITextState {
  @scala.inline
  def apply(isContentOverflowing: Boolean, textContent: String): ITextState = {
    val __obj = js.Dynamic.literal(isContentOverflowing = isContentOverflowing.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextState]
  }
  @scala.inline
  implicit class ITextStateOps[Self <: ITextState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsContentOverflowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContentOverflowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

