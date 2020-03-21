package typingsSlinky.fullcalendar.jqueryHooksMod._Global_

import typingsSlinky.fullcalendar.calendarMod.default
import typingsSlinky.fullcalendar.fullcalendarStrings.addEventSource
import typingsSlinky.fullcalendar.fullcalendarStrings.changeView
import typingsSlinky.fullcalendar.fullcalendarStrings.clientEvents
import typingsSlinky.fullcalendar.fullcalendarStrings.destroy
import typingsSlinky.fullcalendar.fullcalendarStrings.getCalendar
import typingsSlinky.fullcalendar.fullcalendarStrings.getDate
import typingsSlinky.fullcalendar.fullcalendarStrings.getEventSourceById
import typingsSlinky.fullcalendar.fullcalendarStrings.getEventSources
import typingsSlinky.fullcalendar.fullcalendarStrings.getNow
import typingsSlinky.fullcalendar.fullcalendarStrings.getView
import typingsSlinky.fullcalendar.fullcalendarStrings.gotoDate
import typingsSlinky.fullcalendar.fullcalendarStrings.incrementDate
import typingsSlinky.fullcalendar.fullcalendarStrings.isValidViewType
import typingsSlinky.fullcalendar.fullcalendarStrings.moment
import typingsSlinky.fullcalendar.fullcalendarStrings.next
import typingsSlinky.fullcalendar.fullcalendarStrings.nextYear
import typingsSlinky.fullcalendar.fullcalendarStrings.option
import typingsSlinky.fullcalendar.fullcalendarStrings.prev
import typingsSlinky.fullcalendar.fullcalendarStrings.prevYear
import typingsSlinky.fullcalendar.fullcalendarStrings.refetchEventSources
import typingsSlinky.fullcalendar.fullcalendarStrings.refetchEvents
import typingsSlinky.fullcalendar.fullcalendarStrings.removeEventSource
import typingsSlinky.fullcalendar.fullcalendarStrings.removeEventSources
import typingsSlinky.fullcalendar.fullcalendarStrings.removeEvents
import typingsSlinky.fullcalendar.fullcalendarStrings.render
import typingsSlinky.fullcalendar.fullcalendarStrings.renderEvent
import typingsSlinky.fullcalendar.fullcalendarStrings.renderEvents
import typingsSlinky.fullcalendar.fullcalendarStrings.rerenderEvents
import typingsSlinky.fullcalendar.fullcalendarStrings.select
import typingsSlinky.fullcalendar.fullcalendarStrings.today
import typingsSlinky.fullcalendar.fullcalendarStrings.unselect
import typingsSlinky.fullcalendar.fullcalendarStrings.updateEvent
import typingsSlinky.fullcalendar.fullcalendarStrings.updateEvents
import typingsSlinky.fullcalendar.fullcalendarStrings.zoomTo
import typingsSlinky.fullcalendar.inputTypesMod.EventObjectInput
import typingsSlinky.fullcalendar.inputTypesMod.EventSourceInput
import typingsSlinky.fullcalendar.inputTypesMod.MomentInput
import typingsSlinky.fullcalendar.inputTypesMod.OptionsInput
import typingsSlinky.fullcalendar.inputTypesMod.RangeInput
import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def fullCalendar(): JQuery = js.native
  def fullCalendar(options: OptionsInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_addEventSource(method: addEventSource, sourceInput: EventSourceInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(method: changeView, viewName: String): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(method: changeView, viewName: String, dateOrRange: MomentInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(method: changeView, viewName: String, dateOrRange: RangeInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_clientEvents(method: clientEvents, legacyQuery: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_destroy(method: destroy): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_getCalendar(method: getCalendar): default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getDate(method: getDate): Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_getEventSourceById(method: getEventSourceById, id: js.Any): typingsSlinky.fullcalendar.eventSourceMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getEventSources(method: getEventSources): typingsSlinky.fullcalendar.eventSourceMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getNow(method: getNow): Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_getView(method: getView): typingsSlinky.fullcalendar.viewMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_gotoDate(method: gotoDate, zonedDateInput: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_incrementDate(method: incrementDate, delta: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_isValidViewType(method: isValidViewType, viewType: String): Boolean = js.native
  @JSName("fullCalendar")
  def fullCalendar_moment(method: moment, args: js.Any*): Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_next(method: next): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_nextYear(method: nextYear): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: String): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: String, value: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: js.Object): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: js.Object, value: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_prev(method: prev): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_prevYear(method: prevYear): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_refetchEventSources(method: refetchEventSources, sourceMultiQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_refetchEvents(method: refetchEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEventSource(method: removeEventSource, sourceQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEventSources(method: removeEventSources, sourceMultiQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEvents(method: removeEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEvents(method: removeEvents, legacyQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_render(method: render): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvent(method: renderEvent, eventInput: EventObjectInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvent(method: renderEvent, eventInput: EventObjectInput, isSticky: Boolean): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvents(method: renderEvents, eventInputs: js.Array[EventObjectInput]): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvents(method: renderEvents, eventInputs: js.Array[EventObjectInput], isSticky: Boolean): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_rerenderEvents(method: rerenderEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(method: select, zonedStartInput: MomentInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(method: select, zonedStartInput: MomentInput, zonedEndInput: MomentInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(method: select, zonedStartInput: MomentInput, zonedEndInput: MomentInput, resourceId: String): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_today(method: today): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_unselect(method: unselect): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_updateEvent(method: updateEvent, eventProps: EventObjectInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_updateEvents(method: updateEvents, eventPropsArray: js.Array[EventObjectInput]): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_zoomTo(method: zoomTo, newDate: Moment): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_zoomTo(method: zoomTo, newDate: Moment, viewType: String): JQuery = js.native
}

