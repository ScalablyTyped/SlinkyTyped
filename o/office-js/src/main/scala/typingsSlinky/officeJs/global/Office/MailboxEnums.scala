package typingsSlinky.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MailboxEnums {
  
  /**
    * Specifies the formatting that applies to an attachment's content.
    * 
    * [Api set: Mailbox 1.8]
    * 
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.AttachmentContentFormat")
  @js.native
  object AttachmentContentFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.AttachmentContentFormat with String] = js.native
    
    /* "base64" */ val Base64: typingsSlinky.officeJs.Office.MailboxEnums.AttachmentContentFormat.Base64 with String = js.native
    
    /* "eml" */ val Eml: typingsSlinky.officeJs.Office.MailboxEnums.AttachmentContentFormat.Eml with String = js.native
    
    /* "iCalendar" */ val ICalendar: typingsSlinky.officeJs.Office.MailboxEnums.AttachmentContentFormat.ICalendar with String = js.native
    
    /* "url" */ val Url: typingsSlinky.officeJs.Office.MailboxEnums.AttachmentContentFormat.Url with String = js.native
  }
  
  /**
    * Specifies whether an attachment was added to or removed from an item.
    * 
    * [Api set: Mailbox 1.8]
    * 
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.AttachmentStatus")
  @js.native
  object AttachmentStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.AttachmentStatus with String] = js.native
    
    /* "added" */ val Added: typingsSlinky.officeJs.Office.MailboxEnums.AttachmentStatus.Added with String = js.native
    
    /* "removed" */ val Removed: typingsSlinky.officeJs.Office.MailboxEnums.AttachmentStatus.Removed with String = js.native
  }
  
  /**
    * Specifies an attachment's type.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.AttachmentType")
  @js.native
  object AttachmentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.AttachmentType with String] = js.native
    
    /* "cloud" */ val Cloud: typingsSlinky.officeJs.Office.MailboxEnums.AttachmentType.Cloud with String = js.native
    
    /* "file" */ val File: typingsSlinky.officeJs.Office.MailboxEnums.AttachmentType.File with String = js.native
    
    /* "item" */ val Item: typingsSlinky.officeJs.Office.MailboxEnums.AttachmentType.Item with String = js.native
  }
  
  /**
    * Specifies the category color.
    * 
    * **Note**: The actual color depends on how the Outlook client renders it.
    * In this case, the colors noted on each preset are for the Outlook desktop client.
    * 
    * [Api set: Mailbox 1.8]
    * 
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.CategoryColor")
  @js.native
  object CategoryColor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor with Double] = js.native
    
    /* 0 */ val None: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.None with Double = js.native
    
    /* 1 */ val Preset0: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset0 with Double = js.native
    
    /* 2 */ val Preset1: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset1 with Double = js.native
    
    /* 11 */ val Preset10: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset10 with Double = js.native
    
    /* 12 */ val Preset11: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset11 with Double = js.native
    
    /* 13 */ val Preset12: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset12 with Double = js.native
    
    /* 14 */ val Preset13: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset13 with Double = js.native
    
    /* 15 */ val Preset14: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset14 with Double = js.native
    
    /* 16 */ val Preset15: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset15 with Double = js.native
    
    /* 17 */ val Preset16: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset16 with Double = js.native
    
    /* 18 */ val Preset17: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset17 with Double = js.native
    
    /* 19 */ val Preset18: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset18 with Double = js.native
    
    /* 20 */ val Preset19: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset19 with Double = js.native
    
    /* 3 */ val Preset2: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset2 with Double = js.native
    
    /* 21 */ val Preset20: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset20 with Double = js.native
    
    /* 22 */ val Preset21: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset21 with Double = js.native
    
    /* 23 */ val Preset22: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset22 with Double = js.native
    
    /* 24 */ val Preset23: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset23 with Double = js.native
    
    /* 25 */ val Preset24: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset24 with Double = js.native
    
    /* 4 */ val Preset3: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset3 with Double = js.native
    
    /* 5 */ val Preset4: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset4 with Double = js.native
    
    /* 6 */ val Preset5: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset5 with Double = js.native
    
    /* 7 */ val Preset6: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset6 with Double = js.native
    
    /* 8 */ val Preset7: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset7 with Double = js.native
    
    /* 9 */ val Preset8: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset8 with Double = js.native
    
    /* 10 */ val Preset9: typingsSlinky.officeJs.Office.MailboxEnums.CategoryColor.Preset9 with Double = js.native
  }
  
  /**
    * Specifies the day of week or type of day.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.Days")
  @js.native
  object Days extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.Days with String] = js.native
    
    /* "day" */ val Day: typingsSlinky.officeJs.Office.MailboxEnums.Days.Day with String = js.native
    
    /* "fri" */ val Fri: typingsSlinky.officeJs.Office.MailboxEnums.Days.Fri with String = js.native
    
    /* "mon" */ val Mon: typingsSlinky.officeJs.Office.MailboxEnums.Days.Mon with String = js.native
    
    /* "sat" */ val Sat: typingsSlinky.officeJs.Office.MailboxEnums.Days.Sat with String = js.native
    
    /* "sun" */ val Sun: typingsSlinky.officeJs.Office.MailboxEnums.Days.Sun with String = js.native
    
    /* "thu" */ val Thu: typingsSlinky.officeJs.Office.MailboxEnums.Days.Thu with String = js.native
    
    /* "tue" */ val Tue: typingsSlinky.officeJs.Office.MailboxEnums.Days.Tue with String = js.native
    
    /* "wed" */ val Wed: typingsSlinky.officeJs.Office.MailboxEnums.Days.Wed with String = js.native
    
    /* "weekday" */ val Weekday: typingsSlinky.officeJs.Office.MailboxEnums.Days.Weekday with String = js.native
    
    /* "weekendDay" */ val WeekendDay: typingsSlinky.officeJs.Office.MailboxEnums.Days.WeekendDay with String = js.native
  }
  
  /**
    * This bit mask represents a delegate's permissions on a shared folder.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.DelegatePermissions")
  @js.native
  object DelegatePermissions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.DelegatePermissions with Double] = js.native
    
    /* 8 */ val DeleteAll: typingsSlinky.officeJs.Office.MailboxEnums.DelegatePermissions.DeleteAll with Double = js.native
    
    /* 4 */ val DeleteOwn: typingsSlinky.officeJs.Office.MailboxEnums.DelegatePermissions.DeleteOwn with Double = js.native
    
    /* 32 */ val EditAll: typingsSlinky.officeJs.Office.MailboxEnums.DelegatePermissions.EditAll with Double = js.native
    
    /* 16 */ val EditOwn: typingsSlinky.officeJs.Office.MailboxEnums.DelegatePermissions.EditOwn with Double = js.native
    
    /* 1 */ val Read: typingsSlinky.officeJs.Office.MailboxEnums.DelegatePermissions.Read with Double = js.native
    
    /* 2 */ val Write: typingsSlinky.officeJs.Office.MailboxEnums.DelegatePermissions.Write with Double = js.native
  }
  
  /**
    * Specifies an entity's type.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.EntityType")
  @js.native
  object EntityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.EntityType with String] = js.native
    
    /* "address" */ val Address: typingsSlinky.officeJs.Office.MailboxEnums.EntityType.Address with String = js.native
    
    /* "contact" */ val Contact: typingsSlinky.officeJs.Office.MailboxEnums.EntityType.Contact with String = js.native
    
    /* "emailAddress" */ val EmailAddress: typingsSlinky.officeJs.Office.MailboxEnums.EntityType.EmailAddress with String = js.native
    
    /* "meetingSuggestion" */ val MeetingSuggestion: typingsSlinky.officeJs.Office.MailboxEnums.EntityType.MeetingSuggestion with String = js.native
    
    /* "phoneNumber" */ val PhoneNumber: typingsSlinky.officeJs.Office.MailboxEnums.EntityType.PhoneNumber with String = js.native
    
    /* "taskSuggestion" */ val TaskSuggestion: typingsSlinky.officeJs.Office.MailboxEnums.EntityType.TaskSuggestion with String = js.native
    
    /* "url" */ val Url: typingsSlinky.officeJs.Office.MailboxEnums.EntityType.Url with String = js.native
  }
  
  /**
    * Specifies the notification message type for an appointment or message.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.ItemNotificationMessageType")
  @js.native
  object ItemNotificationMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.officeJs.Office.MailboxEnums.ItemNotificationMessageType with String
      ] = js.native
    
    /* "errorMessage" */ val ErrorMessage: typingsSlinky.officeJs.Office.MailboxEnums.ItemNotificationMessageType.ErrorMessage with String = js.native
    
    /* "informationalMessage" */ val InformationalMessage: typingsSlinky.officeJs.Office.MailboxEnums.ItemNotificationMessageType.InformationalMessage with String = js.native
    
    /* "progressIndicator" */ val ProgressIndicator: typingsSlinky.officeJs.Office.MailboxEnums.ItemNotificationMessageType.ProgressIndicator with String = js.native
  }
  
  /**
    * Specifies an item's type.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.ItemType")
  @js.native
  object ItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.ItemType with String] = js.native
    
    /* "appointment" */ val Appointment: typingsSlinky.officeJs.Office.MailboxEnums.ItemType.Appointment with String = js.native
    
    /* "message" */ val Message: typingsSlinky.officeJs.Office.MailboxEnums.ItemType.Message with String = js.native
  }
  
  /**
    * Specifies an appointment location's type.
    * 
    * [Api set: Mailbox 1.8]
    * 
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.LocationType")
  @js.native
  object LocationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.LocationType with String] = js.native
    
    /* "custom" */ val Custom: typingsSlinky.officeJs.Office.MailboxEnums.LocationType.Custom with String = js.native
    
    /* "room" */ val Room: typingsSlinky.officeJs.Office.MailboxEnums.LocationType.Room with String = js.native
  }
  
  /**
    * Specifies the month.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.Month")
  @js.native
  object Month extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.Month with String] = js.native
    
    /* "apr" */ val Apr: typingsSlinky.officeJs.Office.MailboxEnums.Month.Apr with String = js.native
    
    /* "aug" */ val Aug: typingsSlinky.officeJs.Office.MailboxEnums.Month.Aug with String = js.native
    
    /* "dec" */ val Dec: typingsSlinky.officeJs.Office.MailboxEnums.Month.Dec with String = js.native
    
    /* "feb" */ val Feb: typingsSlinky.officeJs.Office.MailboxEnums.Month.Feb with String = js.native
    
    /* "jan" */ val Jan: typingsSlinky.officeJs.Office.MailboxEnums.Month.Jan with String = js.native
    
    /* "jul" */ val Jul: typingsSlinky.officeJs.Office.MailboxEnums.Month.Jul with String = js.native
    
    /* "jun" */ val Jun: typingsSlinky.officeJs.Office.MailboxEnums.Month.Jun with String = js.native
    
    /* "mar" */ val Mar: typingsSlinky.officeJs.Office.MailboxEnums.Month.Mar with String = js.native
    
    /* "may" */ val May: typingsSlinky.officeJs.Office.MailboxEnums.Month.May with String = js.native
    
    /* "nov" */ val Nov: typingsSlinky.officeJs.Office.MailboxEnums.Month.Nov with String = js.native
    
    /* "oct" */ val Oct: typingsSlinky.officeJs.Office.MailboxEnums.Month.Oct with String = js.native
    
    /* "sep" */ val Sep: typingsSlinky.officeJs.Office.MailboxEnums.Month.Sep with String = js.native
  }
  
  /**
    * Represents the current view of Outlook on the web.
    */
  @JSGlobal("Office.MailboxEnums.OWAView")
  @js.native
  object OWAView extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.OWAView with String] = js.native
    
    /* "OneColumn" */ val OneColumn: typingsSlinky.officeJs.Office.MailboxEnums.OWAView.OneColumn with String = js.native
    
    /* "ThreeColumns" */ val ThreeColumns: typingsSlinky.officeJs.Office.MailboxEnums.OWAView.ThreeColumns with String = js.native
    
    /* "TwoColumns" */ val TwoColumns: typingsSlinky.officeJs.Office.MailboxEnums.OWAView.TwoColumns with String = js.native
  }
  
  /**
    * Specifies the type of recipient for an appointment.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RecipientType")
  @js.native
  object RecipientType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.RecipientType with String] = js.native
    
    /* "distributionList" */ val DistributionList: typingsSlinky.officeJs.Office.MailboxEnums.RecipientType.DistributionList with String = js.native
    
    /* "externalUser" */ val ExternalUser: typingsSlinky.officeJs.Office.MailboxEnums.RecipientType.ExternalUser with String = js.native
    
    /* "other" */ val Other: typingsSlinky.officeJs.Office.MailboxEnums.RecipientType.Other with String = js.native
    
    /* "user" */ val User: typingsSlinky.officeJs.Office.MailboxEnums.RecipientType.User with String = js.native
  }
  
  /**
    * Specifies the time zone applied to the recurrence.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RecurrenceTimeZone")
  @js.native
  object RecurrenceTimeZone extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone with String] = js.native
    
    /* "AUS Central Standard Time" */ val AUSCentralStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AUSCentralStandardTime with String = js.native
    
    /* "AUS Eastern Standard Time" */ val AUSEasternStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AUSEasternStandardTime with String = js.native
    
    /* "Afghanistan Standard Time" */ val AfghanistanStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AfghanistanStandardTime with String = js.native
    
    /* "Alaskan Standard Time" */ val AlaskanStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AlaskanStandardTime with String = js.native
    
    /* "Aleutian Standard Time" */ val AleutianStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AleutianStandardTime with String = js.native
    
    /* "Altai Standard Time" */ val AltaiStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AltaiStandardTime with String = js.native
    
    /* "Arab Standard Time" */ val ArabStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.ArabStandardTime with String = js.native
    
    /* "Arabian Standard Time" */ val ArabianStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.ArabianStandardTime with String = js.native
    
    /* "Arabic Standard Time" */ val ArabicStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.ArabicStandardTime with String = js.native
    
    /* "Argentina Standard Time" */ val ArgentinaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.ArgentinaStandardTime with String = js.native
    
    /* "Astrakhan Standard Time" */ val AstrakhanStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AstrakhanStandardTime with String = js.native
    
    /* "Atlantic Standard Time" */ val AtlanticStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AtlanticStandardTime with String = js.native
    
    /* "Aus Central W. Standard Time" */ val AusCentralW_StandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AusCentralW_StandardTime with String = js.native
    
    /* "Azerbaijan Standard Time" */ val AzerbaijanStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AzerbaijanStandardTime with String = js.native
    
    /* "Azores Standard Time" */ val AzoresStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.AzoresStandardTime with String = js.native
    
    /* "Bahia Standard Time" */ val BahiaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.BahiaStandardTime with String = js.native
    
    /* "Bangladesh Standard Time" */ val BangladeshStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.BangladeshStandardTime with String = js.native
    
    /* "Belarus Standard Time" */ val BelarusStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.BelarusStandardTime with String = js.native
    
    /* "Bougainville Standard Time" */ val BougainvilleStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.BougainvilleStandardTime with String = js.native
    
    /* "Canada Central Standard Time" */ val CanadaCentralStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CanadaCentralStandardTime with String = js.native
    
    /* "Cape Verde Standard Time" */ val CapeVerdeStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CapeVerdeStandardTime with String = js.native
    
    /* "Caucasus Standard Time" */ val CaucasusStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CaucasusStandardTime with String = js.native
    
    /* "Cen. Australia Standard Time" */ val CenAustraliaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CenAustraliaStandardTime with String = js.native
    
    /* "Central America Standard Time" */ val CentralAmericaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CentralAmericaStandardTime with String = js.native
    
    /* "Central Asia Standard Time" */ val CentralAsiaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CentralAsiaStandardTime with String = js.native
    
    /* "Central Brazilian Standard Time" */ val CentralBrazilianStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CentralBrazilianStandardTime with String = js.native
    
    /* "Central Europe Standard Time" */ val CentralEuropeStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CentralEuropeStandardTime with String = js.native
    
    /* "Central European Standard Time" */ val CentralEuropeanStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CentralEuropeanStandardTime with String = js.native
    
    /* "Central Pacific Standard Time" */ val CentralPacificStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CentralPacificStandardTime with String = js.native
    
    /* "Central Standard Time" */ val CentralStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CentralStandardTime with String = js.native
    
    /* "Central Standard Time (Mexico)" */ val CentralStandardTime_Mexico: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CentralStandardTime_Mexico with String = js.native
    
    /* "Chatham Islands Standard Time" */ val ChathamIslandsStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.ChathamIslandsStandardTime with String = js.native
    
    /* "China Standard Time" */ val ChinaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.ChinaStandardTime with String = js.native
    
    /* "Cuba Standard Time" */ val CubaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.CubaStandardTime with String = js.native
    
    /* "Dateline Standard Time" */ val DatelineStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.DatelineStandardTime with String = js.native
    
    /* "E. Africa Standard Time" */ val E_AfricaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.E_AfricaStandardTime with String = js.native
    
    /* "E. Australia Standard Time" */ val E_AustraliaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.E_AustraliaStandardTime with String = js.native
    
    /* "E. Europe Standard Time" */ val E_EuropeStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.E_EuropeStandardTime with String = js.native
    
    /* "E. South America Standard Time" */ val E_SouthAmericaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.E_SouthAmericaStandardTime with String = js.native
    
    /* "Easter Island Standard Time" */ val EasterIslandStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.EasterIslandStandardTime with String = js.native
    
    /* "Eastern Standard Time" */ val EasternStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.EasternStandardTime with String = js.native
    
    /* "Eastern Standard Time (Mexico)" */ val EasternStandardTime_Mexico: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.EasternStandardTime_Mexico with String = js.native
    
    /* "Egypt Standard Time" */ val EgyptStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.EgyptStandardTime with String = js.native
    
    /* "Ekaterinburg Standard Time" */ val EkaterinburgStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.EkaterinburgStandardTime with String = js.native
    
    /* "FLE Standard Time" */ val FLEStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.FLEStandardTime with String = js.native
    
    /* "Fiji Standard Time" */ val FijiStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.FijiStandardTime with String = js.native
    
    /* "GMT Standard Time" */ val GMTStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.GMTStandardTime with String = js.native
    
    /* "GTB Standard Time" */ val GTBStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.GTBStandardTime with String = js.native
    
    /* "Georgian Standard Time" */ val GeorgianStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.GeorgianStandardTime with String = js.native
    
    /* "Greenland Standard Time" */ val GreenlandStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.GreenlandStandardTime with String = js.native
    
    /* "Greenwich Standard Time" */ val GreenwichStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.GreenwichStandardTime with String = js.native
    
    /* "Haiti Standard Time" */ val HaitiStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.HaitiStandardTime with String = js.native
    
    /* "Hawaiian Standard Time" */ val HawaiianStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.HawaiianStandardTime with String = js.native
    
    /* "India Standard Time" */ val IndiaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.IndiaStandardTime with String = js.native
    
    /* "Iran Standard Time" */ val IranStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.IranStandardTime with String = js.native
    
    /* "Israel Standard Time" */ val IsraelStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.IsraelStandardTime with String = js.native
    
    /* "Jordan Standard Time" */ val JordanStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.JordanStandardTime with String = js.native
    
    /* "Kaliningrad Standard Time" */ val KaliningradStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.KaliningradStandardTime with String = js.native
    
    /* "Kamchatka Standard Time" */ val KamchatkaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.KamchatkaStandardTime with String = js.native
    
    /* "Korea Standard Time" */ val KoreaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.KoreaStandardTime with String = js.native
    
    /* "Libya Standard Time" */ val LibyaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.LibyaStandardTime with String = js.native
    
    /* "Line Islands Standard Time" */ val LineIslandsStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.LineIslandsStandardTime with String = js.native
    
    /* "Lord Howe Standard Time" */ val LordHoweStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.LordHoweStandardTime with String = js.native
    
    /* "Magadan Standard Time" */ val MagadanStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MagadanStandardTime with String = js.native
    
    /* "Magallanes Standard Time" */ val MagallanesStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MagallanesStandardTime with String = js.native
    
    /* "Marquesas Standard Time" */ val MarquesasStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MarquesasStandardTime with String = js.native
    
    /* "Mauritius Standard Time" */ val MauritiusStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MauritiusStandardTime with String = js.native
    
    /* "Mid-Atlantic Standard Time" */ val MidAtlanticStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MidAtlanticStandardTime with String = js.native
    
    /* "Middle East Standard Time" */ val MiddleEastStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MiddleEastStandardTime with String = js.native
    
    /* "Montevideo Standard Time" */ val MontevideoStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MontevideoStandardTime with String = js.native
    
    /* "Morocco Standard Time" */ val MoroccoStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MoroccoStandardTime with String = js.native
    
    /* "Mountain Standard Time" */ val MountainStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MountainStandardTime with String = js.native
    
    /* "Mountain Standard Time (Mexico)" */ val MountainStandardTime_Mexico: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MountainStandardTime_Mexico with String = js.native
    
    /* "Myanmar Standard Time" */ val MyanmarStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.MyanmarStandardTime with String = js.native
    
    /* "N. Central Asia Standard Time" */ val N_CentralAsiaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.N_CentralAsiaStandardTime with String = js.native
    
    /* "Namibia Standard Time" */ val NamibiaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.NamibiaStandardTime with String = js.native
    
    /* "Nepal Standard Time" */ val NepalStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.NepalStandardTime with String = js.native
    
    /* "New Zealand Standard Time" */ val NewZealandStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.NewZealandStandardTime with String = js.native
    
    /* "Newfoundland Standard Time" */ val NewfoundlandStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.NewfoundlandStandardTime with String = js.native
    
    /* "Norfolk Standard Time" */ val NorfolkStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.NorfolkStandardTime with String = js.native
    
    /* "North Asia East Standard Time" */ val NorthAsiaEastStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.NorthAsiaEastStandardTime with String = js.native
    
    /* "North Asia Standard Time" */ val NorthAsiaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.NorthAsiaStandardTime with String = js.native
    
    /* "North Korea Standard Time" */ val NorthKoreaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.NorthKoreaStandardTime with String = js.native
    
    /* "Omsk Standard Time" */ val OmskStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.OmskStandardTime with String = js.native
    
    /* "Pacific SA Standard Time" */ val PacificSAStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.PacificSAStandardTime with String = js.native
    
    /* "Pacific Standard Time" */ val PacificStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.PacificStandardTime with String = js.native
    
    /* "Pacific Standard Time (Mexico)" */ val PacificStandardTimeMexico: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.PacificStandardTimeMexico with String = js.native
    
    /* "Pakistan Standard Time" */ val PakistanStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.PakistanStandardTime with String = js.native
    
    /* "Paraguay Standard Time" */ val ParaguayStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.ParaguayStandardTime with String = js.native
    
    /* "Romance Standard Time" */ val RomanceStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.RomanceStandardTime with String = js.native
    
    /* "Russia Time Zone 10" */ val RussiaTimeZone10: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone10 with String = js.native
    
    /* "Russia Time Zone 11" */ val RussiaTimeZone11: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone11 with String = js.native
    
    /* "Russia Time Zone 3" */ val RussiaTimeZone3: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone3 with String = js.native
    
    /* "Russian Standard Time" */ val RussianStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.RussianStandardTime with String = js.native
    
    /* "SA Eastern Standard Time" */ val SAEasternStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SAEasternStandardTime with String = js.native
    
    /* "SA Pacific Standard Time" */ val SAPacificStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SAPacificStandardTime with String = js.native
    
    /* "SA Western Standard Time" */ val SAWesternStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SAWesternStandardTime with String = js.native
    
    /* "SE Asia Standard Time" */ val SEAsiaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SEAsiaStandardTime with String = js.native
    
    /* "Saint Pierre Standard Time" */ val SaintPierreStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SaintPierreStandardTime with String = js.native
    
    /* "Sakhalin Standard Time" */ val SakhalinStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SakhalinStandardTime with String = js.native
    
    /* "Samoa Standard Time" */ val SamoaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SamoaStandardTime with String = js.native
    
    /* "Saratov Standard Time" */ val SaratovStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SaratovStandardTime with String = js.native
    
    /* "Singapore Standard Time" */ val SingaporeStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SingaporeStandardTime with String = js.native
    
    /* "South Africa Standard Time" */ val SouthAfricaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SouthAfricaStandardTime with String = js.native
    
    /* "Sri Lanka Standard Time" */ val SriLankaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SriLankaStandardTime with String = js.native
    
    /* "Sudan Standard Time" */ val SudanStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SudanStandardTime with String = js.native
    
    /* "Syria Standard Time" */ val SyriaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.SyriaStandardTime with String = js.native
    
    /* "Taipei Standard Time" */ val TaipeiStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.TaipeiStandardTime with String = js.native
    
    /* "Tasmania Standard Time" */ val TasmaniaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.TasmaniaStandardTime with String = js.native
    
    /* "Tocantins Standard Time" */ val TocantinsStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.TocantinsStandardTime with String = js.native
    
    /* "Tokyo Standard Time" */ val TokyoStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.TokyoStandardTime with String = js.native
    
    /* "Tomsk Standard Time" */ val TomskStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.TomskStandardTime with String = js.native
    
    /* "Tonga Standard Time" */ val TongaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.TongaStandardTime with String = js.native
    
    /* "Transbaikal Standard Time" */ val TransbaikalStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.TransbaikalStandardTime with String = js.native
    
    /* "Turkey Standard Time" */ val TurkeyStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.TurkeyStandardTime with String = js.native
    
    /* "Turks And Caicos Standard Time" */ val TurksAndCaicosStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.TurksAndCaicosStandardTime with String = js.native
    
    /* "US Eastern Standard Time" */ val USEasternStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.USEasternStandardTime with String = js.native
    
    /* "US Mountain Standard Time" */ val USMountainStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.USMountainStandardTime with String = js.native
    
    /* "UTC" */ val UTC: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.UTC with String = js.native
    
    /* "UTC-02" */ val UTCMINUS02: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS02 with String = js.native
    
    /* "UTC-08" */ val UTCMINUS08: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS08 with String = js.native
    
    /* "UTC-09" */ val UTCMINUS09: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS09 with String = js.native
    
    /* "UTC-11" */ val UTCMINUS11: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS11 with String = js.native
    
    /* "UTC+12" */ val UTCPLUS12: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.UTCPLUS12 with String = js.native
    
    /* "UTC+13" */ val UTCPLUS13: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.UTCPLUS13 with String = js.native
    
    /* "Ulaanbaatar Standard Time" */ val UlaanbaatarStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.UlaanbaatarStandardTime with String = js.native
    
    /* "Venezuela Standard Time" */ val VenezuelaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.VenezuelaStandardTime with String = js.native
    
    /* "Vladivostok Standard Time" */ val VladivostokStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.VladivostokStandardTime with String = js.native
    
    /* "W. Australia Standard Time" */ val W_AustraliaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.W_AustraliaStandardTime with String = js.native
    
    /* "W. Central Africa Standard Time" */ val W_CentralAfricaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.W_CentralAfricaStandardTime with String = js.native
    
    /* "W. Europe Standard Time" */ val W_EuropeStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.W_EuropeStandardTime with String = js.native
    
    /* "W. Mongolia Standard Time" */ val W_MongoliaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.W_MongoliaStandardTime with String = js.native
    
    /* "West Asia Standard Time" */ val WestAsiaStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.WestAsiaStandardTime with String = js.native
    
    /* "West Bank Standard Time" */ val WestBankStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.WestBankStandardTime with String = js.native
    
    /* "West Pacific Standard Time" */ val WestPacificStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.WestPacificStandardTime with String = js.native
    
    /* "Yakutsk Standard Time" */ val YakutskStandardTime: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone.YakutskStandardTime with String = js.native
  }
  
  /**
    * Specifies the type of recurrence.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RecurrenceType")
  @js.native
  object RecurrenceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceType with String] = js.native
    
    /* "daily" */ val Daily: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceType.Daily with String = js.native
    
    /* "monthly" */ val Monthly: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceType.Monthly with String = js.native
    
    /* "weekday" */ val Weekday: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceType.Weekday with String = js.native
    
    /* "weekly" */ val Weekly: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceType.Weekly with String = js.native
    
    /* "yearly" */ val Yearly: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceType.Yearly with String = js.native
  }
  
  /**  
    * Specifies the type of response to a meeting invitation.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.ResponseType with String] = js.native
    
    /* "accepted" */ val Accepted: typingsSlinky.officeJs.Office.MailboxEnums.ResponseType.Accepted with String = js.native
    
    /* "declined" */ val Declined: typingsSlinky.officeJs.Office.MailboxEnums.ResponseType.Declined with String = js.native
    
    /* "none" */ val None: typingsSlinky.officeJs.Office.MailboxEnums.ResponseType.None with String = js.native
    
    /* "organizer" */ val Organizer: typingsSlinky.officeJs.Office.MailboxEnums.ResponseType.Organizer with String = js.native
    
    /* "tentative" */ val Tentative: typingsSlinky.officeJs.Office.MailboxEnums.ResponseType.Tentative with String = js.native
  }
  
  /**
    * Specifies the version of the REST API that corresponds to a REST-formatted item ID.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RestVersion")
  @js.native
  object RestVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.RestVersion with String] = js.native
    
    /* "beta" */ val Beta: typingsSlinky.officeJs.Office.MailboxEnums.RestVersion.Beta with String = js.native
    
    /* "v1.0" */ val v1_0: typingsSlinky.officeJs.Office.MailboxEnums.RestVersion.v1_0 with String = js.native
    
    /* "v2.0" */ val v2_0: typingsSlinky.officeJs.Office.MailboxEnums.RestVersion.v2_0 with String = js.native
  }
  
  /**
    * Specifies the source of the selected data in an item (see `Office.mailbox.item.getSelectedDataAsync` for details).
    * 
    * [Api set: Mailbox 1.2]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    */
  @JSGlobal("Office.MailboxEnums.SourceProperty")
  @js.native
  object SourceProperty extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.SourceProperty with String] = js.native
    
    /* "body" */ val Body: typingsSlinky.officeJs.Office.MailboxEnums.SourceProperty.Body with String = js.native
    
    /* "subject" */ val Subject: typingsSlinky.officeJs.Office.MailboxEnums.SourceProperty.Subject with String = js.native
  }
  
  /**
    * Specifies the week of the month.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.WeekNumber")
  @js.native
  object WeekNumber extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.MailboxEnums.WeekNumber with String] = js.native
    
    /* "first" */ val First: typingsSlinky.officeJs.Office.MailboxEnums.WeekNumber.First with String = js.native
    
    /* "fourth" */ val Fourth: typingsSlinky.officeJs.Office.MailboxEnums.WeekNumber.Fourth with String = js.native
    
    /* "last" */ val Last: typingsSlinky.officeJs.Office.MailboxEnums.WeekNumber.Last with String = js.native
    
    /* "second" */ val Second: typingsSlinky.officeJs.Office.MailboxEnums.WeekNumber.Second with String = js.native
    
    /* "third" */ val Third: typingsSlinky.officeJs.Office.MailboxEnums.WeekNumber.Third with String = js.native
  }
}
