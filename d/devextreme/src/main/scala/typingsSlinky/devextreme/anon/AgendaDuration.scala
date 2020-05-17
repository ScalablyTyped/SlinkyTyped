package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeNumbers.`1`
import typingsSlinky.devextreme.devextremeNumbers.`2`
import typingsSlinky.devextreme.devextremeNumbers.`3`
import typingsSlinky.devextreme.devextremeNumbers.`4`
import typingsSlinky.devextreme.devextremeNumbers.`5`
import typingsSlinky.devextreme.devextremeNumbers.`6`
import typingsSlinky.devextreme.devextremeStrings.agenda
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.timelineDay
import typingsSlinky.devextreme.devextremeStrings.timelineMonth
import typingsSlinky.devextreme.devextremeStrings.timelineWeek
import typingsSlinky.devextreme.devextremeStrings.timelineWorkWeek
import typingsSlinky.devextreme.devextremeStrings.unlimited
import typingsSlinky.devextreme.devextremeStrings.vertical
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.workWeek
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgendaDuration extends js.Object {
  var agendaDuration: js.UndefOr[Double] = js.native
  var appointmentCollectorTemplate: js.UndefOr[
    template | (js.Function2[
      /* data */ AppointmentCount, 
      /* collectorElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.native
  var appointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.native
  var appointmentTooltipTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.native
  var cellDuration: js.UndefOr[Double] = js.native
  var dataCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.native
  var dateCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.native
  var dropDownAppointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.native
  var endDayHour: js.UndefOr[Double] = js.native
  var firstDayOfWeek: js.UndefOr[
    typingsSlinky.devextreme.devextremeNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`
  ] = js.native
  var groupByDate: js.UndefOr[Boolean] = js.native
  var groupOrientation: js.UndefOr[horizontal | vertical] = js.native
  var groups: js.UndefOr[js.Array[String]] = js.native
  var intervalCount: js.UndefOr[Double] = js.native
  var maxAppointmentsPerCell: js.UndefOr[Double | auto | unlimited] = js.native
  var name: js.UndefOr[String] = js.native
  var resourceCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.native
  var startDate: js.UndefOr[js.Date | Double | String] = js.native
  var startDayHour: js.UndefOr[Double] = js.native
  var timeCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.native
  var `type`: js.UndefOr[
    agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
  ] = js.native
}

object AgendaDuration {
  @scala.inline
  def apply(): AgendaDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaDuration]
  }
  @scala.inline
  implicit class AgendaDurationOps[Self <: AgendaDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgendaDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentCollectorTemplateFunction2(
      value: (/* data */ AppointmentCount, /* collectorElement */ dxElement) => String | org.scalajs.dom.raw.Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCollectorTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAppointmentCollectorTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCollectorTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentCollectorTemplate(
      value: template | (js.Function2[
          /* data */ AppointmentCount, 
          /* collectorElement */ dxElement, 
          String | org.scalajs.dom.raw.Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCollectorTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentCollectorTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCollectorTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentTemplateFunction3(
      value: (/* model */ AppointmentData, /* itemIndex */ Double, /* contentElement */ dxElement) => String | org.scalajs.dom.raw.Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAppointmentTemplate(
      value: template | (js.Function3[
          /* model */ AppointmentData, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | org.scalajs.dom.raw.Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentTooltipTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentTooltipTemplateFunction3(
      value: (/* model */ AppointmentData, /* itemIndex */ Double, /* contentElement */ dxElement) => String | org.scalajs.dom.raw.Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTooltipTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAppointmentTooltipTemplate(
      value: template | (js.Function3[
          /* model */ AppointmentData, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | org.scalajs.dom.raw.Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentTooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withCellDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDataCellTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | org.scalajs.dom.raw.Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCellTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDataCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | org.scalajs.dom.raw.Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCellTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | org.scalajs.dom.raw.Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDateCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | org.scalajs.dom.raw.Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownAppointmentTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAppointmentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropDownAppointmentTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* contentElement */ dxElement) => String | org.scalajs.dom.raw.Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAppointmentTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDropDownAppointmentTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* contentElement */ dxElement, 
          String | org.scalajs.dom.raw.Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAppointmentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownAppointmentTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAppointmentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDayHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDayHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDayHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDayHour")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: typingsSlinky.devextreme.devextremeNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAppointmentsPerCell(value: Double | auto | unlimited): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAppointmentsPerCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAppointmentsPerCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAppointmentsPerCell")(js.undefined)
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
    def withResourceCellTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | org.scalajs.dom.raw.Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCellTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withResourceCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | org.scalajs.dom.raw.Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDayHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDayHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDayHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDayHour")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeCellTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeCellTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | org.scalajs.dom.raw.Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCellTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTimeCellTemplate(
      value: template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | org.scalajs.dom.raw.Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

