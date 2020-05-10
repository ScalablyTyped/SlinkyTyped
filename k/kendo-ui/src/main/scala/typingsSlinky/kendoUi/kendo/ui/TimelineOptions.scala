package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineOptions extends js.Object {
  var actionClick: js.UndefOr[js.Function1[/* e */ TimelineActionClickEvent, Unit]] = js.native
  var alternatingMode: js.UndefOr[Boolean] = js.native
  var change: js.UndefOr[js.Function1[/* e */ TimelineChangeEvent, Unit]] = js.native
  var collapse: js.UndefOr[js.Function1[/* e */ TimelineCollapseEvent, Unit]] = js.native
  var collapsibleEvents: js.UndefOr[Boolean] = js.native
  var dataActionsField: js.UndefOr[String] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ TimelineDataBoundEvent, Unit]] = js.native
  var dataDateField: js.UndefOr[String] = js.native
  var dataDescriptionField: js.UndefOr[String] = js.native
  var dataImagesField: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[DataSource | js.Any] = js.native
  var dataSubTitleField: js.UndefOr[String] = js.native
  var dataTitleField: js.UndefOr[String] = js.native
  var dateformat: js.UndefOr[String] = js.native
  var eventHeight: js.UndefOr[Double] = js.native
  var eventTemplate: js.UndefOr[String | js.Function] = js.native
  var eventWidth: js.UndefOr[Double] = js.native
  var expand: js.UndefOr[js.Function1[/* e */ TimelineExpandEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var navigate: js.UndefOr[js.Function1[/* e */ TimelineNavigateEvent, Unit]] = js.native
  var orientation: js.UndefOr[String] = js.native
  var showDateLabels: js.UndefOr[Boolean] = js.native
}

object TimelineOptions {
  @scala.inline
  def apply(): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOptions]
  }
  @scala.inline
  implicit class TimelineOptionsOps[Self <: TimelineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionClick(value: /* e */ TimelineActionClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionClick")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternatingMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternatingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ TimelineChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(value: /* e */ TimelineCollapseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsibleEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsibleEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsibleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsibleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withDataActionsField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataActionsField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataActionsField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataActionsField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: /* e */ TimelineDataBoundEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDateField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDateField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDateField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDateField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDescriptionField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDescriptionField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDescriptionField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDescriptionField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataImagesField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataImagesField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataImagesField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataImagesField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: DataSource | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSubTitleField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSubTitleField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSubTitleField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSubTitleField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTitleField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTitleField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTitleField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTitleField")(js.undefined)
        ret
    }
    @scala.inline
    def withDateformat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateformat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateformat")(js.undefined)
        ret
    }
    @scala.inline
    def withEventHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEventWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: /* e */ TimelineExpandEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigate(value: /* e */ TimelineNavigateEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDateLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDateLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDateLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDateLabels")(js.undefined)
        ret
    }
  }
  
}

