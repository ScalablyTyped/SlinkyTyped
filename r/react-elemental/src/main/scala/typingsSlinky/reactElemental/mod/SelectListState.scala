package typingsSlinky.reactElemental.mod

import typingsSlinky.reactElemental.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectListState extends js.Object {
  val highlightedIdx: Double | Null = js.native
  val isExpanded: Boolean = js.native
  val isFocused: Boolean = js.native
  val isHovered: Boolean = js.native
  val selectedOption: AnonValue = js.native
}

object SelectListState {
  @scala.inline
  def apply(isExpanded: Boolean, isFocused: Boolean, isHovered: Boolean, selectedOption: AnonValue): SelectListState = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], selectedOption = selectedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListState]
  }
  @scala.inline
  implicit class SelectListStateOps[Self <: SelectListState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHovered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedOption(value: AnonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedIdxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedIdx")(null)
        ret
    }
  }
  
}

