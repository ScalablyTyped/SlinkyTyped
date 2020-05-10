package typingsSlinky.atlaskitSingleSelect.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.atlaskitSingleSelect.atlaskitSingleSelectStrings.bottom
import typingsSlinky.atlaskitSingleSelect.atlaskitSingleSelectStrings.left
import typingsSlinky.atlaskitSingleSelect.atlaskitSingleSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemType extends js.Object {
  var content: js.UndefOr[TagMod[Any]] = js.native
  var description: js.UndefOr[String] = js.native
  var elemBefore: js.UndefOr[TagMod[Any]] = js.native
  var filterValues: js.UndefOr[js.Array[String]] = js.native
  var isDisabled: js.UndefOr[Boolean] = js.native
  var isSelected: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var tooltipDescription: js.UndefOr[String] = js.native
  var tooltipPosition: js.UndefOr[top | bottom | left] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object ItemType {
  @scala.inline
  def apply(): ItemType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemType]
  }
  @scala.inline
  implicit class ItemTypeOps[Self <: ItemType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withElemBeforeReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elemBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElemBefore(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elemBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElemBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elemBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValues")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipPosition(value: top | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

