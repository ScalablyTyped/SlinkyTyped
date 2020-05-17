package typingsSlinky.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputState> */
@js.native
trait PartialITagInputState extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.native
  var inputValue: js.UndefOr[String] = js.native
  var isInputFocused: js.UndefOr[Boolean] = js.native
  var prevInputValueProp: js.UndefOr[String] = js.native
}

object PartialITagInputState {
  @scala.inline
  def apply(): PartialITagInputState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITagInputState]
  }
  @scala.inline
  implicit class PartialITagInputStateOps[Self <: PartialITagInputState] (val x: Self) extends AnyVal {
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
    def withoutActiveIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInputFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInputFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInputFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInputFocused")(js.undefined)
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

