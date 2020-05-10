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

@js.native
trait Calendar_ extends js.Object {
  var Acl: js.UndefOr[AclCollection] = js.native
  var CalendarList: js.UndefOr[CalendarListCollection] = js.native
  var Calendars: js.UndefOr[CalendarsCollection] = js.native
  var Channels: js.UndefOr[ChannelsCollection] = js.native
  var Colors: js.UndefOr[ColorsCollection] = js.native
  var Events: js.UndefOr[EventsCollection] = js.native
  var Freebusy: js.UndefOr[FreebusyCollection] = js.native
  var Settings: js.UndefOr[SettingsCollection] = js.native
  // Create a new instance of AclRule
  def newAclRule(): AclRule = js.native
  // Create a new instance of AclRuleScope
  def newAclRuleScope(): AclRuleScope = js.native
  // Create a new instance of Calendar
  def newCalendar(): typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
  // Create a new instance of CalendarListEntry
  def newCalendarListEntry(): CalendarListEntry = js.native
  // Create a new instance of CalendarListEntryNotificationSettings
  def newCalendarListEntryNotificationSettings(): CalendarListEntryNotificationSettings = js.native
  // Create a new instance of CalendarNotification
  def newCalendarNotification(): CalendarNotification = js.native
  // Create a new instance of Channel
  def newChannel(): Channel = js.native
  // Create a new instance of ConferenceData
  def newConferenceData(): ConferenceData = js.native
  // Create a new instance of ConferenceParameters
  def newConferenceParameters(): ConferenceParameters = js.native
  // Create a new instance of ConferenceParametersAddOnParameters
  def newConferenceParametersAddOnParameters(): ConferenceParametersAddOnParameters = js.native
  // Create a new instance of ConferenceProperties
  def newConferenceProperties(): ConferenceProperties = js.native
  // Create a new instance of ConferenceRequestStatus
  def newConferenceRequestStatus(): ConferenceRequestStatus = js.native
  // Create a new instance of ConferenceSolution
  def newConferenceSolution(): ConferenceSolution = js.native
  // Create a new instance of ConferenceSolutionKey
  def newConferenceSolutionKey(): ConferenceSolutionKey = js.native
  // Create a new instance of CreateConferenceRequest
  def newCreateConferenceRequest(): CreateConferenceRequest = js.native
  // Create a new instance of EntryPoint
  def newEntryPoint(): EntryPoint = js.native
  // Create a new instance of Event
  def newEvent(): Event = js.native
  // Create a new instance of EventAttachment
  def newEventAttachment(): EventAttachment = js.native
  // Create a new instance of EventAttendee
  def newEventAttendee(): EventAttendee = js.native
  // Create a new instance of EventCreator
  def newEventCreator(): EventCreator = js.native
  // Create a new instance of EventDateTime
  def newEventDateTime(): EventDateTime = js.native
  // Create a new instance of EventExtendedProperties
  def newEventExtendedProperties(): EventExtendedProperties = js.native
  // Create a new instance of EventGadget
  def newEventGadget(): EventGadget = js.native
  // Create a new instance of EventOrganizer
  def newEventOrganizer(): EventOrganizer = js.native
  // Create a new instance of EventReminder
  def newEventReminder(): EventReminder = js.native
  // Create a new instance of EventReminders
  def newEventReminders(): EventReminders = js.native
  // Create a new instance of EventSource
  def newEventSource(): EventSource = js.native
  // Create a new instance of FreeBusyRequest
  def newFreeBusyRequest(): FreeBusyRequest = js.native
  // Create a new instance of FreeBusyRequestItem
  def newFreeBusyRequestItem(): FreeBusyRequestItem = js.native
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
    newFreeBusyRequestItem: () => FreeBusyRequestItem
  ): Calendar_ = {
    val __obj = js.Dynamic.literal(newAclRule = js.Any.fromFunction0(newAclRule), newAclRuleScope = js.Any.fromFunction0(newAclRuleScope), newCalendar = js.Any.fromFunction0(newCalendar), newCalendarListEntry = js.Any.fromFunction0(newCalendarListEntry), newCalendarListEntryNotificationSettings = js.Any.fromFunction0(newCalendarListEntryNotificationSettings), newCalendarNotification = js.Any.fromFunction0(newCalendarNotification), newChannel = js.Any.fromFunction0(newChannel), newConferenceData = js.Any.fromFunction0(newConferenceData), newConferenceParameters = js.Any.fromFunction0(newConferenceParameters), newConferenceParametersAddOnParameters = js.Any.fromFunction0(newConferenceParametersAddOnParameters), newConferenceProperties = js.Any.fromFunction0(newConferenceProperties), newConferenceRequestStatus = js.Any.fromFunction0(newConferenceRequestStatus), newConferenceSolution = js.Any.fromFunction0(newConferenceSolution), newConferenceSolutionKey = js.Any.fromFunction0(newConferenceSolutionKey), newCreateConferenceRequest = js.Any.fromFunction0(newCreateConferenceRequest), newEntryPoint = js.Any.fromFunction0(newEntryPoint), newEvent = js.Any.fromFunction0(newEvent), newEventAttachment = js.Any.fromFunction0(newEventAttachment), newEventAttendee = js.Any.fromFunction0(newEventAttendee), newEventCreator = js.Any.fromFunction0(newEventCreator), newEventDateTime = js.Any.fromFunction0(newEventDateTime), newEventExtendedProperties = js.Any.fromFunction0(newEventExtendedProperties), newEventGadget = js.Any.fromFunction0(newEventGadget), newEventOrganizer = js.Any.fromFunction0(newEventOrganizer), newEventReminder = js.Any.fromFunction0(newEventReminder), newEventReminders = js.Any.fromFunction0(newEventReminders), newEventSource = js.Any.fromFunction0(newEventSource), newFreeBusyRequest = js.Any.fromFunction0(newFreeBusyRequest), newFreeBusyRequestItem = js.Any.fromFunction0(newFreeBusyRequestItem))
    __obj.asInstanceOf[Calendar_]
  }
  @scala.inline
  implicit class Calendar_Ops[Self <: Calendar_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAclRule(value: () => AclRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAclRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAclRuleScope(value: () => AclRuleScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAclRuleScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCalendar(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCalendar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCalendarListEntry(value: () => CalendarListEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCalendarListEntry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCalendarListEntryNotificationSettings(value: () => CalendarListEntryNotificationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCalendarListEntryNotificationSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCalendarNotification(value: () => CalendarNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCalendarNotification")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChannel(value: () => Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChannel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConferenceData(value: () => ConferenceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConferenceData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConferenceParameters(value: () => ConferenceParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConferenceParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConferenceParametersAddOnParameters(value: () => ConferenceParametersAddOnParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConferenceParametersAddOnParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConferenceProperties(value: () => ConferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConferenceProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConferenceRequestStatus(value: () => ConferenceRequestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConferenceRequestStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConferenceSolution(value: () => ConferenceSolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConferenceSolution")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConferenceSolutionKey(value: () => ConferenceSolutionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConferenceSolutionKey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateConferenceRequest(value: () => CreateConferenceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateConferenceRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEntryPoint(value: () => EntryPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEntryPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEvent(value: () => Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEvent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEventAttachment(value: () => EventAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEventAttachment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEventAttendee(value: () => EventAttendee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEventAttendee")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEventCreator(value: () => EventCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEventCreator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEventDateTime(value: () => EventDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEventDateTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEventExtendedProperties(value: () => EventExtendedProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEventExtendedProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEventGadget(value: () => EventGadget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEventGadget")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEventOrganizer(value: () => EventOrganizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEventOrganizer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEventReminder(value: () => EventReminder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEventReminder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEventReminders(value: () => EventReminders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEventReminders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEventSource(value: () => EventSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEventSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFreeBusyRequest(value: () => FreeBusyRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFreeBusyRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFreeBusyRequestItem(value: () => FreeBusyRequestItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFreeBusyRequestItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAcl(value: AclCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Acl")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarList(value: CalendarListCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalendarList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalendarList")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendars(value: CalendarsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Calendars")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: ChannelsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: ColorsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Colors")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: EventsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(js.undefined)
        ret
    }
    @scala.inline
    def withFreebusy(value: FreebusyCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Freebusy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreebusy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Freebusy")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: SettingsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(js.undefined)
        ret
    }
  }
  
}

