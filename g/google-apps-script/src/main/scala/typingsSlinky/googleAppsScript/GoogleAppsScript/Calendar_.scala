package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Collection.AclCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Collection.CalendarListCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Collection.CalendarsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Collection.ChannelsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Collection.ColorsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Collection.EventsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Collection.FreebusyCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Collection.SettingsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.AclRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.AclRuleScope
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarListEntry
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarListEntryNotificationSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarNotification
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.Channel
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceParameters
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceParametersAddOnParameters
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceRequestStatus
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceSolution
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceSolutionKey
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.CreateConferenceRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EntryPoint
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.Event
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventAttachment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventAttendee
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventCreator
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventDateTime
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventExtendedProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventGadget
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventOrganizer
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventReminder
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventReminders
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventSource
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.FreeBusyRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.FreeBusyRequestItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar_ extends js.Object {
  var Acl: js.UndefOr[AclCollection] = js.undefined
  var CalendarList: js.UndefOr[CalendarListCollection] = js.undefined
  var Calendars: js.UndefOr[CalendarsCollection] = js.undefined
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  var Colors: js.UndefOr[ColorsCollection] = js.undefined
  var Events: js.UndefOr[EventsCollection] = js.undefined
  var Freebusy: js.UndefOr[FreebusyCollection] = js.undefined
  var Settings: js.UndefOr[SettingsCollection] = js.undefined
  // Create a new instance of AclRule
  def newAclRule(): AclRule
  // Create a new instance of AclRuleScope
  def newAclRuleScope(): AclRuleScope
  // Create a new instance of Calendar
  def newCalendar(): typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar
  // Create a new instance of CalendarListEntry
  def newCalendarListEntry(): CalendarListEntry
  // Create a new instance of CalendarListEntryNotificationSettings
  def newCalendarListEntryNotificationSettings(): CalendarListEntryNotificationSettings
  // Create a new instance of CalendarNotification
  def newCalendarNotification(): CalendarNotification
  // Create a new instance of Channel
  def newChannel(): Channel
  // Create a new instance of ConferenceData
  def newConferenceData(): ConferenceData
  // Create a new instance of ConferenceParameters
  def newConferenceParameters(): ConferenceParameters
  // Create a new instance of ConferenceParametersAddOnParameters
  def newConferenceParametersAddOnParameters(): ConferenceParametersAddOnParameters
  // Create a new instance of ConferenceProperties
  def newConferenceProperties(): ConferenceProperties
  // Create a new instance of ConferenceRequestStatus
  def newConferenceRequestStatus(): ConferenceRequestStatus
  // Create a new instance of ConferenceSolution
  def newConferenceSolution(): ConferenceSolution
  // Create a new instance of ConferenceSolutionKey
  def newConferenceSolutionKey(): ConferenceSolutionKey
  // Create a new instance of CreateConferenceRequest
  def newCreateConferenceRequest(): CreateConferenceRequest
  // Create a new instance of EntryPoint
  def newEntryPoint(): EntryPoint
  // Create a new instance of Event
  def newEvent(): Event
  // Create a new instance of EventAttachment
  def newEventAttachment(): EventAttachment
  // Create a new instance of EventAttendee
  def newEventAttendee(): EventAttendee
  // Create a new instance of EventCreator
  def newEventCreator(): EventCreator
  // Create a new instance of EventDateTime
  def newEventDateTime(): EventDateTime
  // Create a new instance of EventExtendedProperties
  def newEventExtendedProperties(): EventExtendedProperties
  // Create a new instance of EventGadget
  def newEventGadget(): EventGadget
  // Create a new instance of EventOrganizer
  def newEventOrganizer(): EventOrganizer
  // Create a new instance of EventReminder
  def newEventReminder(): EventReminder
  // Create a new instance of EventReminders
  def newEventReminders(): EventReminders
  // Create a new instance of EventSource
  def newEventSource(): EventSource
  // Create a new instance of FreeBusyRequest
  def newFreeBusyRequest(): FreeBusyRequest
  // Create a new instance of FreeBusyRequestItem
  def newFreeBusyRequestItem(): FreeBusyRequestItem
}

object Calendar_ {
  @scala.inline
  def apply(
    newAclRule: () => AclRule,
    newAclRuleScope: () => AclRuleScope,
    newCalendar: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar,
    newCalendarListEntry: () => CalendarListEntry,
    newCalendarListEntryNotificationSettings: () => CalendarListEntryNotificationSettings,
    newCalendarNotification: () => CalendarNotification,
    newChannel: () => Channel,
    newConferenceData: () => ConferenceData,
    newConferenceParameters: () => ConferenceParameters,
    newConferenceParametersAddOnParameters: () => ConferenceParametersAddOnParameters,
    newConferenceProperties: () => ConferenceProperties,
    newConferenceRequestStatus: () => ConferenceRequestStatus,
    newConferenceSolution: () => ConferenceSolution,
    newConferenceSolutionKey: () => ConferenceSolutionKey,
    newCreateConferenceRequest: () => CreateConferenceRequest,
    newEntryPoint: () => EntryPoint,
    newEvent: () => Event,
    newEventAttachment: () => EventAttachment,
    newEventAttendee: () => EventAttendee,
    newEventCreator: () => EventCreator,
    newEventDateTime: () => EventDateTime,
    newEventExtendedProperties: () => EventExtendedProperties,
    newEventGadget: () => EventGadget,
    newEventOrganizer: () => EventOrganizer,
    newEventReminder: () => EventReminder,
    newEventReminders: () => EventReminders,
    newEventSource: () => EventSource,
    newFreeBusyRequest: () => FreeBusyRequest,
    newFreeBusyRequestItem: () => FreeBusyRequestItem,
    Acl: AclCollection = null,
    CalendarList: CalendarListCollection = null,
    Calendars: CalendarsCollection = null,
    Channels: ChannelsCollection = null,
    Colors: ColorsCollection = null,
    Events: EventsCollection = null,
    Freebusy: FreebusyCollection = null,
    Settings: SettingsCollection = null
  ): Calendar_ = {
    val __obj = js.Dynamic.literal(newAclRule = js.Any.fromFunction0(newAclRule), newAclRuleScope = js.Any.fromFunction0(newAclRuleScope), newCalendar = js.Any.fromFunction0(newCalendar), newCalendarListEntry = js.Any.fromFunction0(newCalendarListEntry), newCalendarListEntryNotificationSettings = js.Any.fromFunction0(newCalendarListEntryNotificationSettings), newCalendarNotification = js.Any.fromFunction0(newCalendarNotification), newChannel = js.Any.fromFunction0(newChannel), newConferenceData = js.Any.fromFunction0(newConferenceData), newConferenceParameters = js.Any.fromFunction0(newConferenceParameters), newConferenceParametersAddOnParameters = js.Any.fromFunction0(newConferenceParametersAddOnParameters), newConferenceProperties = js.Any.fromFunction0(newConferenceProperties), newConferenceRequestStatus = js.Any.fromFunction0(newConferenceRequestStatus), newConferenceSolution = js.Any.fromFunction0(newConferenceSolution), newConferenceSolutionKey = js.Any.fromFunction0(newConferenceSolutionKey), newCreateConferenceRequest = js.Any.fromFunction0(newCreateConferenceRequest), newEntryPoint = js.Any.fromFunction0(newEntryPoint), newEvent = js.Any.fromFunction0(newEvent), newEventAttachment = js.Any.fromFunction0(newEventAttachment), newEventAttendee = js.Any.fromFunction0(newEventAttendee), newEventCreator = js.Any.fromFunction0(newEventCreator), newEventDateTime = js.Any.fromFunction0(newEventDateTime), newEventExtendedProperties = js.Any.fromFunction0(newEventExtendedProperties), newEventGadget = js.Any.fromFunction0(newEventGadget), newEventOrganizer = js.Any.fromFunction0(newEventOrganizer), newEventReminder = js.Any.fromFunction0(newEventReminder), newEventReminders = js.Any.fromFunction0(newEventReminders), newEventSource = js.Any.fromFunction0(newEventSource), newFreeBusyRequest = js.Any.fromFunction0(newFreeBusyRequest), newFreeBusyRequestItem = js.Any.fromFunction0(newFreeBusyRequestItem))
    if (Acl != null) __obj.updateDynamic("Acl")(Acl.asInstanceOf[js.Any])
    if (CalendarList != null) __obj.updateDynamic("CalendarList")(CalendarList.asInstanceOf[js.Any])
    if (Calendars != null) __obj.updateDynamic("Calendars")(Calendars.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (Colors != null) __obj.updateDynamic("Colors")(Colors.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (Freebusy != null) __obj.updateDynamic("Freebusy")(Freebusy.asInstanceOf[js.Any])
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar_]
  }
}

