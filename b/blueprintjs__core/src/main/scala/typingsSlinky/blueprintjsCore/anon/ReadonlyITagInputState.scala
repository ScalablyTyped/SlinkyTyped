package typingsSlinky.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputState> */
@js.native
trait ReadonlyITagInputState extends js.Object {
  val activeIndex: Double = js.native
  val inputValue: String = js.native
  val isInputFocused: Boolean = js.native
  val prevInputValueProp: js.UndefOr[String] = js.native
}

object ReadonlyITagInputState {
  @scala.inline
  def apply(activeIndex: Double, inputValue: String, isInputFocused: Boolean): ReadonlyITagInputState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isInputFocused = isInputFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyITagInputState]
  }
  @scala.inline
  implicit class ReadonlyITagInputStateOps[Self <: ReadonlyITagInputState] (val x: Self) extends AnyVal {
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

