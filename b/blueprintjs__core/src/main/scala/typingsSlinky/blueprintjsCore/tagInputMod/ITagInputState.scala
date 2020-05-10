package typingsSlinky.blueprintjsCore.tagInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITagInputState extends js.Object {
  var activeIndex: Double = js.native
  var inputValue: String = js.native
  var isInputFocused: Boolean = js.native
  var prevInputValueProp: js.UndefOr[String] = js.native
}

object ITagInputState {
  @scala.inline
  def apply(activeIndex: Double, inputValue: String, isInputFocused: Boolean): ITagInputState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isInputFocused = isInputFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagInputState]
  }
  @scala.inline
  implicit class ITagInputStateOps[Self <: ITagInputState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInputFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInputFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevInputValueProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevInputValueProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevInputValueProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevInputValueProp")(js.undefined)
        ret
    }
  }
  
}

