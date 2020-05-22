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

trait AgendaDuration extends js.Object {
  var agendaDuration: js.UndefOr[Double] = js.undefined
  var appointmentCollectorTemplate: js.UndefOr[
    template | (js.Function2[
      /* data */ AppointmentCount, 
      /* collectorElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.undefined
  var appointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.undefined
  var appointmentTooltipTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.undefined
  var cellDuration: js.UndefOr[Double] = js.undefined
  var dataCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.undefined
  var dateCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.undefined
  var dropDownAppointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.undefined
  var endDayHour: js.UndefOr[Double] = js.undefined
  var firstDayOfWeek: js.UndefOr[
    typingsSlinky.devextreme.devextremeNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`
  ] = js.undefined
  var groupByDate: js.UndefOr[Boolean] = js.undefined
  var groupOrientation: js.UndefOr[horizontal | vertical] = js.undefined
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var intervalCount: js.UndefOr[Double] = js.undefined
  var maxAppointmentsPerCell: js.UndefOr[Double | auto | unlimited] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var resourceCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.undefined
  var startDate: js.UndefOr[js.Date | Double | String] = js.undefined
  var startDayHour: js.UndefOr[Double] = js.undefined
  var timeCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.undefined
  var `type`: js.UndefOr[
    agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
  ] = js.undefined
}

object AgendaDuration {
  @scala.inline
  def apply(
    agendaDuration: js.UndefOr[Double] = js.undefined,
    appointmentCollectorTemplate: template | (js.Function2[
      /* data */ AppointmentCount, 
      /* collectorElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ]) = null,
    appointmentTemplate: template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ]) = null,
    appointmentTooltipTemplate: template | (js.Function3[
      /* model */ AppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ]) = null,
    cellDuration: js.UndefOr[Double] = js.undefined,
    dataCellTemplate: template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ]) = null,
    dateCellTemplate: template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ]) = null,
    dropDownAppointmentTemplate: template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ]) = null,
    endDayHour: js.UndefOr[Double] = js.undefined,
    firstDayOfWeek: typingsSlinky.devextreme.devextremeNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    groupByDate: js.UndefOr[Boolean] = js.undefined,
    groupOrientation: horizontal | vertical = null,
    groups: js.Array[String] = null,
    intervalCount: js.UndefOr[Double] = js.undefined,
    maxAppointmentsPerCell: Double | auto | unlimited = null,
    name: String = null,
    resourceCellTemplate: template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ]) = null,
    startDate: js.Date | Double | String = null,
    startDayHour: js.UndefOr[Double] = js.undefined,
    timeCellTemplate: template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ]) = null,
    `type`: agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek = null
  ): AgendaDuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agendaDuration)) __obj.updateDynamic("agendaDuration")(agendaDuration.get.asInstanceOf[js.Any])
    if (appointmentCollectorTemplate != null) __obj.updateDynamic("appointmentCollectorTemplate")(appointmentCollectorTemplate.asInstanceOf[js.Any])
    if (appointmentTemplate != null) __obj.updateDynamic("appointmentTemplate")(appointmentTemplate.asInstanceOf[js.Any])
    if (appointmentTooltipTemplate != null) __obj.updateDynamic("appointmentTooltipTemplate")(appointmentTooltipTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(cellDuration)) __obj.updateDynamic("cellDuration")(cellDuration.get.asInstanceOf[js.Any])
    if (dataCellTemplate != null) __obj.updateDynamic("dataCellTemplate")(dataCellTemplate.asInstanceOf[js.Any])
    if (dateCellTemplate != null) __obj.updateDynamic("dateCellTemplate")(dateCellTemplate.asInstanceOf[js.Any])
    if (dropDownAppointmentTemplate != null) __obj.updateDynamic("dropDownAppointmentTemplate")(dropDownAppointmentTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(endDayHour)) __obj.updateDynamic("endDayHour")(endDayHour.get.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByDate)) __obj.updateDynamic("groupByDate")(groupByDate.get.asInstanceOf[js.Any])
    if (groupOrientation != null) __obj.updateDynamic("groupOrientation")(groupOrientation.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(intervalCount)) __obj.updateDynamic("intervalCount")(intervalCount.get.asInstanceOf[js.Any])
    if (maxAppointmentsPerCell != null) __obj.updateDynamic("maxAppointmentsPerCell")(maxAppointmentsPerCell.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceCellTemplate != null) __obj.updateDynamic("resourceCellTemplate")(resourceCellTemplate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(startDayHour)) __obj.updateDynamic("startDayHour")(startDayHour.get.asInstanceOf[js.Any])
    if (timeCellTemplate != null) __obj.updateDynamic("timeCellTemplate")(timeCellTemplate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgendaDuration]
  }
}

