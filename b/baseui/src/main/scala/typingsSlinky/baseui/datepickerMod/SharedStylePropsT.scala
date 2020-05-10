package typingsSlinky.baseui.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsT extends js.Object {
  @JSName("$date")
  var $date: js.Date = js.native
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  @JSName("$hasRangeHighlighted")
  var $hasRangeHighlighted: Boolean = js.native
  @JSName("$hasRangeOnRight")
  var $hasRangeOnRight: Boolean = js.native
  @JSName("$hasRangeSelected")
  var $hasRangeSelected: Boolean = js.native
  @JSName("$isHeader")
  var $isHeader: Boolean = js.native
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean = js.native
  @JSName("$isHovered")
  var $isHovered: Boolean = js.native
  @JSName("$outsideMonth")
  var $outsideMonth: Boolean = js.native
  @JSName("$pseudoHighlighted")
  var $pseudoHighlighted: Boolean = js.native
  @JSName("$pseudoSelected")
  var $pseudoSelected: Boolean = js.native
  @JSName("$range")
  var $range: Boolean = js.native
  @JSName("$selected")
  var $selected: Boolean = js.native
  @JSName("$startDate")
  var $startDate: Boolean = js.native
}

object SharedStylePropsT {
  @scala.inline
  def apply(
    $date: js.Date,
    $disabled: Boolean,
    $hasRangeHighlighted: Boolean,
    $hasRangeOnRight: Boolean,
    $hasRangeSelected: Boolean,
    $isHeader: Boolean,
    $isHighlighted: Boolean,
    $isHovered: Boolean,
    $outsideMonth: Boolean,
    $pseudoHighlighted: Boolean,
    $pseudoSelected: Boolean,
    $range: Boolean,
    $selected: Boolean,
    $startDate: Boolean
  ): SharedStylePropsT = {
    val __obj = js.Dynamic.literal($date = $date.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $hasRangeHighlighted = $hasRangeHighlighted.asInstanceOf[js.Any], $hasRangeOnRight = $hasRangeOnRight.asInstanceOf[js.Any], $hasRangeSelected = $hasRangeSelected.asInstanceOf[js.Any], $isHeader = $isHeader.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $isHovered = $isHovered.asInstanceOf[js.Any], $outsideMonth = $outsideMonth.asInstanceOf[js.Any], $pseudoHighlighted = $pseudoHighlighted.asInstanceOf[js.Any], $pseudoSelected = $pseudoSelected.asInstanceOf[js.Any], $range = $range.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any], $startDate = $startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsT]
  }
  @scala.inline
  implicit class SharedStylePropsTOps[Self <: SharedStylePropsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$date(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$disabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$hasRangeHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$hasRangeHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$hasRangeOnRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$hasRangeOnRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$hasRangeSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$hasRangeSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isHovered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$outsideMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$outsideMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$pseudoHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pseudoHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$pseudoSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$pseudoSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$range(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$selected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$startDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$startDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

