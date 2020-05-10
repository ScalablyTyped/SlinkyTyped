package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGroup extends js.Object {
  var groupRule: js.UndefOr[PivotGroupRule] = js.native
  var label: js.UndefOr[String] = js.native
  var repeatHeadings: js.UndefOr[Boolean] = js.native
  var showTotals: js.UndefOr[Boolean] = js.native
  var sortOrder: js.UndefOr[String] = js.native
  var sourceColumnOffset: js.UndefOr[Double] = js.native
  var valueBucket: js.UndefOr[PivotGroupSortValueBucket] = js.native
  var valueMetadata: js.UndefOr[js.Array[PivotGroupValueMetadata]] = js.native
}

object PivotGroup {
  @scala.inline
  def apply(): PivotGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroup]
  }
  @scala.inline
  implicit class PivotGroupOps[Self <: PivotGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupRule(value: PivotGroupRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRule")(js.undefined)
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
    def withRepeatHeadings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatHeadings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatHeadings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatHeadings")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceColumnOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumnOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceColumnOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumnOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBucket(value: PivotGroupSortValueBucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withValueMetadata(value: js.Array[PivotGroupValueMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMetadata")(js.undefined)
        ret
    }
  }
  
}

