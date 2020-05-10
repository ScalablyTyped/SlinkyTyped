package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellStyleSuggestionState extends js.Object {
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
  var borderBottomSuggested: js.UndefOr[Boolean] = js.native
  var borderLeftSuggested: js.UndefOr[Boolean] = js.native
  var borderRightSuggested: js.UndefOr[Boolean] = js.native
  var borderTopSuggested: js.UndefOr[Boolean] = js.native
  var columnSpanSuggested: js.UndefOr[Boolean] = js.native
  var contentAlignmentSuggested: js.UndefOr[Boolean] = js.native
  var paddingBottomSuggested: js.UndefOr[Boolean] = js.native
  var paddingLeftSuggested: js.UndefOr[Boolean] = js.native
  var paddingRightSuggested: js.UndefOr[Boolean] = js.native
  var paddingTopSuggested: js.UndefOr[Boolean] = js.native
  var rowSpanSuggested: js.UndefOr[Boolean] = js.native
}

object TableCellStyleSuggestionState {
  @scala.inline
  def apply(): TableCellStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellStyleSuggestionState]
  }
  @scala.inline
  implicit class TableCellStyleSuggestionStateOps[Self <: TableCellStyleSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColorSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColorSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeftSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeftSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRightSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRightSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSpanSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpanSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSpanSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpanSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withContentAlignmentSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAlignmentSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAlignmentSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAlignmentSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingBottomSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottomSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBottomSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottomSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingLeftSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeftSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingLeftSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeftSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingRightSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRightSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingRightSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRightSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTopSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTopSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSpanSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpanSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSpanSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpanSuggested")(js.undefined)
        ret
    }
  }
  
}

