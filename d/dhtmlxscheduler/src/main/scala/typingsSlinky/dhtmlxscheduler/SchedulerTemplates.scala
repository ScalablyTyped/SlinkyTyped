package typingsSlinky.dhtmlxscheduler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerTemplates extends StObject {
  
  /**
    * specifies the date in the header of the view
    * @param start the start date of the view
    * @param end the end date of the view
    */
  def agenda_date(start: js.Date, end: js.Date): String = js.native
  
  /**
    * specifies the text in the second column of the Agenda view
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def agenda_text(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the date in the first column of the Agenda view
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def agenda_time(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the format of dates that are set by means of API methods. Used to parse incoming dates
    * @param date the date which needs formatting
    */
  def api_date(date: js.Date): String = js.native
  
  /**
    * specifies the format of the date in a cell
    * @param date the cell's date
    */
  def calendar_date(date: js.Date): String = js.native
  
  /**
    * specifies the date in the header of the calendar
    * @param date the date which needs formatting
    */
  def calendar_month(date: js.Date): String = js.native
  
  /**
    * specifies the day name in the week sub-header of the view
    * @param date the date which needs formatting
    */
  def calendar_scale_date(date: js.Date): String = js.native
  
  /**
    * specifies the date format of the lightbox's start and end date inputs
    * @param date the date which needs formatting
    */
  def calendar_time(date: js.Date): String = js.native
  
  /**
    * specifies the date in the header of the Day and Units views
    * @param date the date which needs formatting
    */
  def day_date(date: js.Date): String = js.native
  
  /**
    * specifies the date in the sub-header of the Day view
    * @param date the date which needs formatting
    */
  def day_scale_date(date: js.Date): String = js.native
  
  /**
    * specifies the CSS class that will be applied to the highlighted event's duration on the time scale
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param ev the event's object
    */
  def drag_marker_class(start: js.Date, end: js.Date, ev: js.Any): Unit = js.native
  
  /**
    * specifies the content of the highlighted block  on the time scale
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param ev the event's object
    */
  def drag_marker_content(start: js.Date, end: js.Date, ev: js.Any): Unit = js.native
  
  /**
    * specifies the date of an event. Applied to one-day events only
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def event_bar_date(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the event's text. Applied to multi-day events only
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event's object
    */
  def event_bar_text(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the CSS class that will be applied to the event's container
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param ev the event's object
    */
  def event_class(start: js.Date, end: js.Date, ev: js.Any): String = js.native
  
  /**
    * specifies the time part of the start and end dates of the event. Mostly used by other templates for presenting time periods
    * @param date the date which needs formatting
    */
  def event_date(date: js.Date): String = js.native
  
  /**
    * specifies the event's header
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event's object
    */
  def event_header(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the event's text
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def event_text(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the date in the header of the view
    * @param start the start date of the view
    * @param end the end date of the view
    */
  def grid_date(start: js.Date, end: js.Date): String = js.native
  
  /**
    * specifies the text in the columns
    * @param field_name the column's id
    * @param event the event object
    */
  def grid_field(field_name: String, event: js.Any): String = js.native
  
  /**
    * specifies the format of dates in columns with id='date'
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param ev the event object
    */
  def grid_full_date(start: js.Date, end: js.Date, ev: js.Any): String = js.native
  
  /**
    * specifies the format of dates in columns with id='start_date' or id='end_date'
    * @param date the date which needs formatting
    */
  def grid_single_date(date: js.Date): String = js.native
  
  /**
    * specifies the items of the Y-Axis
    * @param date the date which needs formatting
    */
  def hour_scale(date: js.Date): String = js.native
  
  /**
    * specifies the lightbox's header
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def lightbox_header(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the format of requests in the dynamic loading mode
    * @param date the date which needs formatting
    */
  def load_format(date: js.Date): String = js.native
  
  /**
    * specifies the date in the header of the view
    * @param start the start date of the view
    * @param end the end date of the view
    */
  def map_date(start: js.Date, end: js.Date): String = js.native
  
  /**
    * specifies the text in the second column of the view
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def map_text(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the date in the first column of the view
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def map_time(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the date of the event in the Google Maps popup marker
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def marker_date(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the text of the event in the Google Maps popup marker
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def marker_text(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the date in the header of the view
    * @param date the date which needs formatting
    */
  def month_date(date: js.Date): String = js.native
  
  /**
    * specifies the CSS class that will be applied to a day cell
    * @param date the date which needs formatting
    */
  def month_date_class(date: js.Date): String = js.native
  
  /**
    * specifies the format of the day in a cell
    * @param date the date which needs formatting
    */
  def month_day(date: js.Date): String = js.native
  
  /**
    * specifies the presentation of the 'View more' link in the cell of the Month view
    * @param date the date of a month cell
    * @param count the number of events in the cell
    */
  def month_events_link(date: js.Date, count: Double): String = js.native
  
  /**
    * specifies the date format of the X-Axis of the view
    * @param date the date which needs formatting
    */
  def month_scale_date(date: js.Date): String = js.native
  
  /**
    * specifies the date string before events parse and load methods
    * @param start the date string before assigned to event
    */
  def parse_date(date: String): String = js.native
  
  /**
    * specifies the content of the pop-up edit form
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def quick_info_content(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the date of the pop-up edit form
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def quick_info_date(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the title of the pop-up edit form
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def quick_info_title(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the drop-down time selector in the lightbox
    */
  def time_picker(): String = js.native
  
  /**
    * specifies the CSS class that will be applied to a cell of the view
    * @param evs an array of objects of events contained in a cell (defined only in the 'cell' mode)
    * @param date the date of a column
    * @param section the section object
    */
  def timeline_cell_class(evs: js.Array[_], date: js.Date, section: js.Any): String = js.native
  
  /**
    * specifies the number of scheduled events in a cell of the view
    * @param evs an array of objects of events contained in a cell
    * @param date the date of a cell
    */
  def timeline_cell_value(evs: js.Array[_], date: js.Date): String = js.native
  
  /**
    * specifies the date in the header of the view
    * @param date1 the date when an event is scheduled to begin
    * @param date2 the date when an event is scheduled to be completed
    */
  def timeline_date(date1: js.Date, date2: js.Date): String = js.native
  
  /**
    * specifies items of the X-Axis
    * @param date the date which needs formatting
    */
  def timeline_scale_date(date: js.Date): String = js.native
  
  /**
    * specifies items of the Y-Axis
    * @param key the section's id (key)
    * @param label the section's label
    * @param section the section object containing the 'key' and 'label' properties
    */
  def timeline_scale_label(key: String, label: String, section: js.Any): String = js.native
  
  /**
    * specifies the name of a CSS class that will be applied to items of the X-Axis
    * @param date the date which needs formatting
    */
  def timeline_scalex_class(date: js.Date): String = js.native
  
  /**
    * specifies the name of a CSS class that will be applied to items of the Y-Axis
    * @param key the section's id
    * @param label the section's label
    * @param section the section object that contains the 'key' and 'label' properties
    */
  def timeline_scaley_class(key: String, label: String, section: js.Any): String = js.native
  
  /**
    * specifies items of the second X-Axis
    * @param date the date which needs formatting
    */
  def timeline_second_scale_date(date: js.Date): String = js.native
  
  /**
    * specifies the name of a CSS class that will be applied to items of the second X-Axis
    * @param date the date which needs formatting
    */
  def timeline_second_scalex_class(date: js.Date): String = js.native
  
  /**
    * specifies the tooltip over a day cell containing some scheduled event(s)
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def timeline_tooltip(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the format of start and end dates displayed in the tooltip
    * @param date the date which needs formatting
    */
  def tooltip_date_format(date: js.Date): String = js.native
  
  /**
    * specifies the text of tooltips
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def tooltip_text(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the date in the header of the view
    * @param date the date which needs formatting
    */
  def units_date(date: js.Date): String = js.native
  
  /**
    * specifies items of the X-Axis
    * @param key the unit's id (key)
    * @param label the unit's label
    * @param unit the unit object containing the 'key' and 'label' properties
    */
  def units_scale_text(key: String, label: String, unit: js.Any): String = js.native
  
  /**
    * specifies the event's text
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    * @param cellDate the date of a day cell that a one-day event or a single occurrence of <br> the recurring event displays in
    * @param pos the position of a single occurrence in the recurring event: 'start' - the first occurrence, 'end' - the last occurrence, 'middle' - for remaining occurrences
    */
  def week_agenda_event_text(start: js.Date, end: js.Date, event: js.Any, cellDate: js.Date, pos: String): String = js.native
  
  /**
    * the date of a day cell of the view
    * @param date the date which needs formatting
    */
  def week_agenda_scale_date(date: js.Date): String = js.native
  
  /**
    * specifies the date in the header of the view
    * @param start the start date of the view
    * @param end the end date of the view
    */
  def week_date(start: js.Date, end: js.Date): String = js.native
  
  /**
    * specifies the CSS class that will be applied to a day cell
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def week_date_class(start: js.Date, end: js.Date, event: js.Any): String = js.native
  
  /**
    * specifies the date in the sub-header of the view
    * @param date the date which needs formatting
    */
  def week_scale_date(date: js.Date): String = js.native
  
  /**
    * a string from an XML file is converted into a date object in conformity with this template
    * @param date the string which need to be parsed
    */
  def xml_date(date: js.Date): js.Date = js.native
  
  /**
    * a date object is converted into a string in conformity with this template. Used to send data back to the server
    * @param date the date which needs formatting
    */
  def xml_format(date: js.Date): String = js.native
  
  /**
    * specifies the date in the header of the view
    * @param date the date which needs formatting
    */
  def year_date(date: js.Date): String = js.native
  
  /**
    * specifies the month's name in the header of a month block of the view.
    * @param date the date which needs formatting
    */
  def year_month(date: js.Date): String = js.native
  
  /**
    * specifies the day's name in the sub-header of a month block of the view
    * @param date the date which needs formatting
    */
  def year_scale_date(date: js.Date): String = js.native
  
  /**
    * specifies the tooltip over a day cell containing some scheduled event(s)
    * @param start the date when an event is scheduled to begin
    * @param end the date when an event is scheduled to be completed
    * @param event the event object
    */
  def year_tooltip(start: js.Date, end: js.Date, event: js.Any): String = js.native
}
object SchedulerTemplates {
  
  @scala.inline
  def apply(
    agenda_date: (js.Date, js.Date) => String,
    agenda_text: (js.Date, js.Date, js.Any) => String,
    agenda_time: (js.Date, js.Date, js.Any) => String,
    api_date: js.Date => String,
    calendar_date: js.Date => String,
    calendar_month: js.Date => String,
    calendar_scale_date: js.Date => String,
    calendar_time: js.Date => String,
    day_date: js.Date => String,
    day_scale_date: js.Date => String,
    drag_marker_class: (js.Date, js.Date, js.Any) => Unit,
    drag_marker_content: (js.Date, js.Date, js.Any) => Unit,
    event_bar_date: (js.Date, js.Date, js.Any) => String,
    event_bar_text: (js.Date, js.Date, js.Any) => String,
    event_class: (js.Date, js.Date, js.Any) => String,
    event_date: js.Date => String,
    event_header: (js.Date, js.Date, js.Any) => String,
    event_text: (js.Date, js.Date, js.Any) => String,
    grid_date: (js.Date, js.Date) => String,
    grid_field: (String, js.Any) => String,
    grid_full_date: (js.Date, js.Date, js.Any) => String,
    grid_single_date: js.Date => String,
    hour_scale: js.Date => String,
    lightbox_header: (js.Date, js.Date, js.Any) => String,
    load_format: js.Date => String,
    map_date: (js.Date, js.Date) => String,
    map_text: (js.Date, js.Date, js.Any) => String,
    map_time: (js.Date, js.Date, js.Any) => String,
    marker_date: (js.Date, js.Date, js.Any) => String,
    marker_text: (js.Date, js.Date, js.Any) => String,
    month_date: js.Date => String,
    month_date_class: js.Date => String,
    month_day: js.Date => String,
    month_events_link: (js.Date, Double) => String,
    month_scale_date: js.Date => String,
    parse_date: String => String,
    quick_info_content: (js.Date, js.Date, js.Any) => String,
    quick_info_date: (js.Date, js.Date, js.Any) => String,
    quick_info_title: (js.Date, js.Date, js.Any) => String,
    time_picker: () => String,
    timeline_cell_class: (js.Array[_], js.Date, js.Any) => String,
    timeline_cell_value: (js.Array[_], js.Date) => String,
    timeline_date: (js.Date, js.Date) => String,
    timeline_scale_date: js.Date => String,
    timeline_scale_label: (String, String, js.Any) => String,
    timeline_scalex_class: js.Date => String,
    timeline_scaley_class: (String, String, js.Any) => String,
    timeline_second_scale_date: js.Date => String,
    timeline_second_scalex_class: js.Date => String,
    timeline_tooltip: (js.Date, js.Date, js.Any) => String,
    tooltip_date_format: js.Date => String,
    tooltip_text: (js.Date, js.Date, js.Any) => String,
    units_date: js.Date => String,
    units_scale_text: (String, String, js.Any) => String,
    week_agenda_event_text: (js.Date, js.Date, js.Any, js.Date, String) => String,
    week_agenda_scale_date: js.Date => String,
    week_date: (js.Date, js.Date) => String,
    week_date_class: (js.Date, js.Date, js.Any) => String,
    week_scale_date: js.Date => String,
    xml_date: js.Date => js.Date,
    xml_format: js.Date => String,
    year_date: js.Date => String,
    year_month: js.Date => String,
    year_scale_date: js.Date => String,
    year_tooltip: (js.Date, js.Date, js.Any) => String
  ): SchedulerTemplates = {
    val __obj = js.Dynamic.literal(agenda_date = js.Any.fromFunction2(agenda_date), agenda_text = js.Any.fromFunction3(agenda_text), agenda_time = js.Any.fromFunction3(agenda_time), api_date = js.Any.fromFunction1(api_date), calendar_date = js.Any.fromFunction1(calendar_date), calendar_month = js.Any.fromFunction1(calendar_month), calendar_scale_date = js.Any.fromFunction1(calendar_scale_date), calendar_time = js.Any.fromFunction1(calendar_time), day_date = js.Any.fromFunction1(day_date), day_scale_date = js.Any.fromFunction1(day_scale_date), drag_marker_class = js.Any.fromFunction3(drag_marker_class), drag_marker_content = js.Any.fromFunction3(drag_marker_content), event_bar_date = js.Any.fromFunction3(event_bar_date), event_bar_text = js.Any.fromFunction3(event_bar_text), event_class = js.Any.fromFunction3(event_class), event_date = js.Any.fromFunction1(event_date), event_header = js.Any.fromFunction3(event_header), event_text = js.Any.fromFunction3(event_text), grid_date = js.Any.fromFunction2(grid_date), grid_field = js.Any.fromFunction2(grid_field), grid_full_date = js.Any.fromFunction3(grid_full_date), grid_single_date = js.Any.fromFunction1(grid_single_date), hour_scale = js.Any.fromFunction1(hour_scale), lightbox_header = js.Any.fromFunction3(lightbox_header), load_format = js.Any.fromFunction1(load_format), map_date = js.Any.fromFunction2(map_date), map_text = js.Any.fromFunction3(map_text), map_time = js.Any.fromFunction3(map_time), marker_date = js.Any.fromFunction3(marker_date), marker_text = js.Any.fromFunction3(marker_text), month_date = js.Any.fromFunction1(month_date), month_date_class = js.Any.fromFunction1(month_date_class), month_day = js.Any.fromFunction1(month_day), month_events_link = js.Any.fromFunction2(month_events_link), month_scale_date = js.Any.fromFunction1(month_scale_date), parse_date = js.Any.fromFunction1(parse_date), quick_info_content = js.Any.fromFunction3(quick_info_content), quick_info_date = js.Any.fromFunction3(quick_info_date), quick_info_title = js.Any.fromFunction3(quick_info_title), time_picker = js.Any.fromFunction0(time_picker), timeline_cell_class = js.Any.fromFunction3(timeline_cell_class), timeline_cell_value = js.Any.fromFunction2(timeline_cell_value), timeline_date = js.Any.fromFunction2(timeline_date), timeline_scale_date = js.Any.fromFunction1(timeline_scale_date), timeline_scale_label = js.Any.fromFunction3(timeline_scale_label), timeline_scalex_class = js.Any.fromFunction1(timeline_scalex_class), timeline_scaley_class = js.Any.fromFunction3(timeline_scaley_class), timeline_second_scale_date = js.Any.fromFunction1(timeline_second_scale_date), timeline_second_scalex_class = js.Any.fromFunction1(timeline_second_scalex_class), timeline_tooltip = js.Any.fromFunction3(timeline_tooltip), tooltip_date_format = js.Any.fromFunction1(tooltip_date_format), tooltip_text = js.Any.fromFunction3(tooltip_text), units_date = js.Any.fromFunction1(units_date), units_scale_text = js.Any.fromFunction3(units_scale_text), week_agenda_event_text = js.Any.fromFunction5(week_agenda_event_text), week_agenda_scale_date = js.Any.fromFunction1(week_agenda_scale_date), week_date = js.Any.fromFunction2(week_date), week_date_class = js.Any.fromFunction3(week_date_class), week_scale_date = js.Any.fromFunction1(week_scale_date), xml_date = js.Any.fromFunction1(xml_date), xml_format = js.Any.fromFunction1(xml_format), year_date = js.Any.fromFunction1(year_date), year_month = js.Any.fromFunction1(year_month), year_scale_date = js.Any.fromFunction1(year_scale_date), year_tooltip = js.Any.fromFunction3(year_tooltip))
    __obj.asInstanceOf[SchedulerTemplates]
  }
  
  @scala.inline
  implicit class SchedulerTemplatesMutableBuilder[Self <: SchedulerTemplates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgenda_date(value: (js.Date, js.Date) => String): Self = StObject.set(x, "agenda_date", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAgenda_text(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "agenda_text", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAgenda_time(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "agenda_time", js.Any.fromFunction3(value))
    
    @scala.inline
    def setApi_date(value: js.Date => String): Self = StObject.set(x, "api_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalendar_date(value: js.Date => String): Self = StObject.set(x, "calendar_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalendar_month(value: js.Date => String): Self = StObject.set(x, "calendar_month", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalendar_scale_date(value: js.Date => String): Self = StObject.set(x, "calendar_scale_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalendar_time(value: js.Date => String): Self = StObject.set(x, "calendar_time", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDay_date(value: js.Date => String): Self = StObject.set(x, "day_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDay_scale_date(value: js.Date => String): Self = StObject.set(x, "day_scale_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrag_marker_class(value: (js.Date, js.Date, js.Any) => Unit): Self = StObject.set(x, "drag_marker_class", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDrag_marker_content(value: (js.Date, js.Date, js.Any) => Unit): Self = StObject.set(x, "drag_marker_content", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEvent_bar_date(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "event_bar_date", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEvent_bar_text(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "event_bar_text", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEvent_class(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "event_class", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEvent_date(value: js.Date => String): Self = StObject.set(x, "event_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvent_header(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "event_header", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEvent_text(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "event_text", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGrid_date(value: (js.Date, js.Date) => String): Self = StObject.set(x, "grid_date", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGrid_field(value: (String, js.Any) => String): Self = StObject.set(x, "grid_field", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGrid_full_date(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "grid_full_date", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGrid_single_date(value: js.Date => String): Self = StObject.set(x, "grid_single_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHour_scale(value: js.Date => String): Self = StObject.set(x, "hour_scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLightbox_header(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "lightbox_header", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLoad_format(value: js.Date => String): Self = StObject.set(x, "load_format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap_date(value: (js.Date, js.Date) => String): Self = StObject.set(x, "map_date", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMap_text(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "map_text", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMap_time(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "map_time", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMarker_date(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "marker_date", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMarker_text(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "marker_text", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMonth_date(value: js.Date => String): Self = StObject.set(x, "month_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonth_date_class(value: js.Date => String): Self = StObject.set(x, "month_date_class", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonth_day(value: js.Date => String): Self = StObject.set(x, "month_day", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonth_events_link(value: (js.Date, Double) => String): Self = StObject.set(x, "month_events_link", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMonth_scale_date(value: js.Date => String): Self = StObject.set(x, "month_scale_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse_date(value: String => String): Self = StObject.set(x, "parse_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuick_info_content(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "quick_info_content", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQuick_info_date(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "quick_info_date", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQuick_info_title(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "quick_info_title", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTime_picker(value: () => String): Self = StObject.set(x, "time_picker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimeline_cell_class(value: (js.Array[_], js.Date, js.Any) => String): Self = StObject.set(x, "timeline_cell_class", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTimeline_cell_value(value: (js.Array[_], js.Date) => String): Self = StObject.set(x, "timeline_cell_value", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTimeline_date(value: (js.Date, js.Date) => String): Self = StObject.set(x, "timeline_date", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTimeline_scale_date(value: js.Date => String): Self = StObject.set(x, "timeline_scale_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeline_scale_label(value: (String, String, js.Any) => String): Self = StObject.set(x, "timeline_scale_label", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTimeline_scalex_class(value: js.Date => String): Self = StObject.set(x, "timeline_scalex_class", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeline_scaley_class(value: (String, String, js.Any) => String): Self = StObject.set(x, "timeline_scaley_class", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTimeline_second_scale_date(value: js.Date => String): Self = StObject.set(x, "timeline_second_scale_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeline_second_scalex_class(value: js.Date => String): Self = StObject.set(x, "timeline_second_scalex_class", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeline_tooltip(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "timeline_tooltip", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTooltip_date_format(value: js.Date => String): Self = StObject.set(x, "tooltip_date_format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltip_text(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "tooltip_text", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUnits_date(value: js.Date => String): Self = StObject.set(x, "units_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnits_scale_text(value: (String, String, js.Any) => String): Self = StObject.set(x, "units_scale_text", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWeek_agenda_event_text(value: (js.Date, js.Date, js.Any, js.Date, String) => String): Self = StObject.set(x, "week_agenda_event_text", js.Any.fromFunction5(value))
    
    @scala.inline
    def setWeek_agenda_scale_date(value: js.Date => String): Self = StObject.set(x, "week_agenda_scale_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeek_date(value: (js.Date, js.Date) => String): Self = StObject.set(x, "week_date", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWeek_date_class(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "week_date_class", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWeek_scale_date(value: js.Date => String): Self = StObject.set(x, "week_scale_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXml_date(value: js.Date => js.Date): Self = StObject.set(x, "xml_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXml_format(value: js.Date => String): Self = StObject.set(x, "xml_format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYear_date(value: js.Date => String): Self = StObject.set(x, "year_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYear_month(value: js.Date => String): Self = StObject.set(x, "year_month", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYear_scale_date(value: js.Date => String): Self = StObject.set(x, "year_scale_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYear_tooltip(value: (js.Date, js.Date, js.Any) => String): Self = StObject.set(x, "year_tooltip", js.Any.fromFunction3(value))
  }
}
