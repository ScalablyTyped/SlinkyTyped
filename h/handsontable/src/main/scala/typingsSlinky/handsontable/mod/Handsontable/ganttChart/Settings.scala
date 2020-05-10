package typingsSlinky.handsontable.mod.Handsontable.ganttChart

import typingsSlinky.handsontable.handsontableStrings.monday
import typingsSlinky.handsontable.handsontableStrings.sunday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var allowSplitWeeks: js.UndefOr[Boolean] = js.native
  var dataSource: HandsontableBindingInformation | js.Array[DataObject] = js.native
  var firstWeekDay: monday | sunday = js.native
  var hideDaysAfterFullWeeks: js.UndefOr[Boolean] = js.native
  var hideDaysBeforeFullWeeks: js.UndefOr[Boolean] = js.native
  var startYear: Double = js.native
  var weekHeaderGenerator: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, String]] = js.native
}

object Settings {
  @scala.inline
  def apply(
    dataSource: HandsontableBindingInformation | js.Array[DataObject],
    firstWeekDay: monday | sunday,
    startYear: Double
  ): Settings = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], firstWeekDay = firstWeekDay.asInstanceOf[js.Any], startYear = startYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: HandsontableBindingInformation | js.Array[DataObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstWeekDay(value: monday | sunday): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstWeekDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowSplitWeeks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSplitWeeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSplitWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSplitWeeks")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDaysAfterFullWeeks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDaysAfterFullWeeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDaysAfterFullWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDaysAfterFullWeeks")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDaysBeforeFullWeeks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDaysBeforeFullWeeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDaysBeforeFullWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDaysBeforeFullWeeks")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekHeaderGenerator(value: (/* start */ Double, /* end */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekHeaderGenerator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWeekHeaderGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekHeaderGenerator")(js.undefined)
        ret
    }
  }
  
}

