package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.onClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyFilter extends js.Object {
  var applyFilter: js.UndefOr[auto | onClick] = js.native
  var applyFilterText: js.UndefOr[String] = js.native
  var betweenEndText: js.UndefOr[String] = js.native
  var betweenStartText: js.UndefOr[String] = js.native
  var operationDescriptions: js.UndefOr[Between] = js.native
  var resetOperationText: js.UndefOr[String] = js.native
  var showAllText: js.UndefOr[String] = js.native
  var showOperationChooser: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object ApplyFilter {
  @scala.inline
  def apply(): ApplyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyFilter]
  }
  @scala.inline
  implicit class ApplyFilterOps[Self <: ApplyFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyFilter(value: auto | onClick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyFilterText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyFilterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyFilterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyFilterText")(js.undefined)
        ret
    }
    @scala.inline
    def withBetweenEndText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betweenEndText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetweenEndText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betweenEndText")(js.undefined)
        ret
    }
    @scala.inline
    def withBetweenStartText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betweenStartText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetweenStartText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betweenStartText")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationDescriptions(value: Between): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOperationText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOperationText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOperationText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOperationText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAllText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOperationChooser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOperationChooser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOperationChooser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOperationChooser")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

