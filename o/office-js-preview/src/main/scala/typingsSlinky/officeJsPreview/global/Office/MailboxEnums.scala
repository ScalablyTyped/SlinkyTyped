package typingsSlinky.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MailboxEnums {
  
  /**
    * Specifies the type of action in a notification message.
    *
    * [Api set: Mailbox Preview]
    *
    * @beta
    */
  @JSGlobal("Office.MailboxEnums.ActionType")
  @js.native
  object ActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.ActionType with String] = js.native
    
    /* "showTaskPane" */ val ShowTaskPane: typingsSlinky.officeJsPreview.Office.MailboxEnums.ActionType.ShowTaskPane with String = js.native
  }
  
  /**
    * Specifies the sensitivity type of an appointment.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @beta
    */
  @JSGlobal("Office.MailboxEnums.AppointmentSensitivityType")
  @js.native
  object AppointmentSensitivityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType with String
      ] = js.native
    
    /* "confidential" */ val Confidential: typingsSlinky.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Confidential with String = js.native
    
    /* "normal" */ val Normal: typingsSlinky.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Normal with String = js.native
    
    /* "personal" */ val Personal: typingsSlinky.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Personal with String = js.native
    
    /* "private" */ val Private: typingsSlinky.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Private with String = js.native
  }
  
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
    def apply(value: String): js.UndefOr[
        typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat with String
      ] = js.native
    
    /* "base64" */ val Base64: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Base64 with String = js.native
    
    /* "eml" */ val Eml: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Eml with String = js.native
    
    /* "iCalendar" */ val ICalendar: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.ICalendar with String = js.native
    
    /* "url" */ val Url: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Url with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentStatus with String] = js.native
    
    /* "added" */ val Added: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentStatus.Added with String = js.native
    
    /* "removed" */ val Removed: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentStatus.Removed with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentType with String] = js.native
    
    /* "cloud" */ val Cloud: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentType.Cloud with String = js.native
    
    /* "file" */ val File: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentType.File with String = js.native
    
    /* "item" */ val Item: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentType.Item with String = js.native
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
    def apply(value: Double): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor with Double] = js.native
    
    /* 0 */ val None: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.None with Double = js.native
    
    /* 1 */ val Preset0: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset0 with Double = js.native
    
    /* 2 */ val Preset1: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset1 with Double = js.native
    
    /* 11 */ val Preset10: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset10 with Double = js.native
    
    /* 12 */ val Preset11: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset11 with Double = js.native
    
    /* 13 */ val Preset12: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset12 with Double = js.native
    
    /* 14 */ val Preset13: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset13 with Double = js.native
    
    /* 15 */ val Preset14: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset14 with Double = js.native
    
    /* 16 */ val Preset15: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset15 with Double = js.native
    
    /* 17 */ val Preset16: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset16 with Double = js.native
    
    /* 18 */ val Preset17: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset17 with Double = js.native
    
    /* 19 */ val Preset18: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset18 with Double = js.native
    
    /* 20 */ val Preset19: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset19 with Double = js.native
    
    /* 3 */ val Preset2: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset2 with Double = js.native
    
    /* 21 */ val Preset20: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset20 with Double = js.native
    
    /* 22 */ val Preset21: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset21 with Double = js.native
    
    /* 23 */ val Preset22: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset22 with Double = js.native
    
    /* 24 */ val Preset23: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset23 with Double = js.native
    
    /* 25 */ val Preset24: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset24 with Double = js.native
    
    /* 4 */ val Preset3: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset3 with Double = js.native
    
    /* 5 */ val Preset4: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset4 with Double = js.native
    
    /* 6 */ val Preset5: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset5 with Double = js.native
    
    /* 7 */ val Preset6: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset6 with Double = js.native
    
    /* 8 */ val Preset7: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset7 with Double = js.native
    
    /* 9 */ val Preset8: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset8 with Double = js.native
    
    /* 10 */ val Preset9: typingsSlinky.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset9 with Double = js.native
  }
  
  /**
    * Compose type.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @beta
    */
  @JSGlobal("Office.MailboxEnums.ComposeType")
  @js.native
  object ComposeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.ComposeType with String] = js.native
    
    /* "forward" */ val Forward: typingsSlinky.officeJsPreview.Office.MailboxEnums.ComposeType.Forward with String = js.native
    
    /* "newMail" */ val NewMail: typingsSlinky.officeJsPreview.Office.MailboxEnums.ComposeType.NewMail with String = js.native
    
    /* "reply" */ val Reply: typingsSlinky.officeJsPreview.Office.MailboxEnums.ComposeType.Reply with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.Days with String] = js.native
    
    /* "day" */ val Day: typingsSlinky.officeJsPreview.Office.MailboxEnums.Days.Day with String = js.native
    
    /* "fri" */ val Fri: typingsSlinky.officeJsPreview.Office.MailboxEnums.Days.Fri with String = js.native
    
    /* "mon" */ val Mon: typingsSlinky.officeJsPreview.Office.MailboxEnums.Days.Mon with String = js.native
    
    /* "sat" */ val Sat: typingsSlinky.officeJsPreview.Office.MailboxEnums.Days.Sat with String = js.native
    
    /* "sun" */ val Sun: typingsSlinky.officeJsPreview.Office.MailboxEnums.Days.Sun with String = js.native
    
    /* "thu" */ val Thu: typingsSlinky.officeJsPreview.Office.MailboxEnums.Days.Thu with String = js.native
    
    /* "tue" */ val Tue: typingsSlinky.officeJsPreview.Office.MailboxEnums.Days.Tue with String = js.native
    
    /* "wed" */ val Wed: typingsSlinky.officeJsPreview.Office.MailboxEnums.Days.Wed with String = js.native
    
    /* "weekday" */ val Weekday: typingsSlinky.officeJsPreview.Office.MailboxEnums.Days.Weekday with String = js.native
    
    /* "weekendDay" */ val WeekendDay: typingsSlinky.officeJsPreview.Office.MailboxEnums.Days.WeekendDay with String = js.native
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
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeJsPreview.Office.MailboxEnums.DelegatePermissions with Double
      ] = js.native
    
    /* 8 */ val DeleteAll: typingsSlinky.officeJsPreview.Office.MailboxEnums.DelegatePermissions.DeleteAll with Double = js.native
    
    /* 4 */ val DeleteOwn: typingsSlinky.officeJsPreview.Office.MailboxEnums.DelegatePermissions.DeleteOwn with Double = js.native
    
    /* 32 */ val EditAll: typingsSlinky.officeJsPreview.Office.MailboxEnums.DelegatePermissions.EditAll with Double = js.native
    
    /* 16 */ val EditOwn: typingsSlinky.officeJsPreview.Office.MailboxEnums.DelegatePermissions.EditOwn with Double = js.native
    
    /* 1 */ val Read: typingsSlinky.officeJsPreview.Office.MailboxEnums.DelegatePermissions.Read with Double = js.native
    
    /* 2 */ val Write: typingsSlinky.officeJsPreview.Office.MailboxEnums.DelegatePermissions.Write with Double = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.EntityType with String] = js.native
    
    /* "address" */ val Address: typingsSlinky.officeJsPreview.Office.MailboxEnums.EntityType.Address with String = js.native
    
    /* "contact" */ val Contact: typingsSlinky.officeJsPreview.Office.MailboxEnums.EntityType.Contact with String = js.native
    
    /* "emailAddress" */ val EmailAddress: typingsSlinky.officeJsPreview.Office.MailboxEnums.EntityType.EmailAddress with String = js.native
    
    /* "meetingSuggestion" */ val MeetingSuggestion: typingsSlinky.officeJsPreview.Office.MailboxEnums.EntityType.MeetingSuggestion with String = js.native
    
    /* "phoneNumber" */ val PhoneNumber: typingsSlinky.officeJsPreview.Office.MailboxEnums.EntityType.PhoneNumber with String = js.native
    
    /* "taskSuggestion" */ val TaskSuggestion: typingsSlinky.officeJsPreview.Office.MailboxEnums.EntityType.TaskSuggestion with String = js.native
    
    /* "url" */ val Url: typingsSlinky.officeJsPreview.Office.MailboxEnums.EntityType.Url with String = js.native
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
        typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType with String
      ] = js.native
    
    /* "errorMessage" */ val ErrorMessage: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.ErrorMessage with String = js.native
    
    /* "informationalMessage" */ val InformationalMessage: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.InformationalMessage with String = js.native
    
    /* "insightMessage" */ val InsightMessage: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.InsightMessage with String = js.native
    
    /* "progressIndicator" */ val ProgressIndicator: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.ProgressIndicator with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemType with String] = js.native
    
    /* "appointment" */ val Appointment: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemType.Appointment with String = js.native
    
    /* "message" */ val Message: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemType.Message with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.LocationType with String] = js.native
    
    /* "custom" */ val Custom: typingsSlinky.officeJsPreview.Office.MailboxEnums.LocationType.Custom with String = js.native
    
    /* "room" */ val Room: typingsSlinky.officeJsPreview.Office.MailboxEnums.LocationType.Room with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.Month with String] = js.native
    
    /* "apr" */ val Apr: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Apr with String = js.native
    
    /* "aug" */ val Aug: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Aug with String = js.native
    
    /* "dec" */ val Dec: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Dec with String = js.native
    
    /* "feb" */ val Feb: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Feb with String = js.native
    
    /* "jan" */ val Jan: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Jan with String = js.native
    
    /* "jul" */ val Jul: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Jul with String = js.native
    
    /* "jun" */ val Jun: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Jun with String = js.native
    
    /* "mar" */ val Mar: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Mar with String = js.native
    
    /* "may" */ val May: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.May with String = js.native
    
    /* "nov" */ val Nov: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Nov with String = js.native
    
    /* "oct" */ val Oct: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Oct with String = js.native
    
    /* "sep" */ val Sep: typingsSlinky.officeJsPreview.Office.MailboxEnums.Month.Sep with String = js.native
  }
  
  /**
    * Represents the current view of Outlook on the web.
    */
  @JSGlobal("Office.MailboxEnums.OWAView")
  @js.native
  object OWAView extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.OWAView with String] = js.native
    
    /* "OneColumn" */ val OneColumn: typingsSlinky.officeJsPreview.Office.MailboxEnums.OWAView.OneColumn with String = js.native
    
    /* "ThreeColumns" */ val ThreeColumns: typingsSlinky.officeJsPreview.Office.MailboxEnums.OWAView.ThreeColumns with String = js.native
    
    /* "TwoColumns" */ val TwoColumns: typingsSlinky.officeJsPreview.Office.MailboxEnums.OWAView.TwoColumns with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.RecipientType with String] = js.native
    
    /* "distributionList" */ val DistributionList: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecipientType.DistributionList with String = js.native
    
    /* "externalUser" */ val ExternalUser: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecipientType.ExternalUser with String = js.native
    
    /* "other" */ val Other: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecipientType.Other with String = js.native
    
    /* "user" */ val User: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecipientType.User with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone with String] = js.native
    
    /* "AUS Central Standard Time" */ val AUSCentralStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AUSCentralStandardTime with String = js.native
    
    /* "AUS Eastern Standard Time" */ val AUSEasternStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AUSEasternStandardTime with String = js.native
    
    /* "Afghanistan Standard Time" */ val AfghanistanStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AfghanistanStandardTime with String = js.native
    
    /* "Alaskan Standard Time" */ val AlaskanStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AlaskanStandardTime with String = js.native
    
    /* "Aleutian Standard Time" */ val AleutianStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AleutianStandardTime with String = js.native
    
    /* "Altai Standard Time" */ val AltaiStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AltaiStandardTime with String = js.native
    
    /* "Arab Standard Time" */ val ArabStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArabStandardTime with String = js.native
    
    /* "Arabian Standard Time" */ val ArabianStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArabianStandardTime with String = js.native
    
    /* "Arabic Standard Time" */ val ArabicStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArabicStandardTime with String = js.native
    
    /* "Argentina Standard Time" */ val ArgentinaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArgentinaStandardTime with String = js.native
    
    /* "Astrakhan Standard Time" */ val AstrakhanStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AstrakhanStandardTime with String = js.native
    
    /* "Atlantic Standard Time" */ val AtlanticStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AtlanticStandardTime with String = js.native
    
    /* "Aus Central W. Standard Time" */ val AusCentralW_StandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AusCentralW_StandardTime with String = js.native
    
    /* "Azerbaijan Standard Time" */ val AzerbaijanStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AzerbaijanStandardTime with String = js.native
    
    /* "Azores Standard Time" */ val AzoresStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AzoresStandardTime with String = js.native
    
    /* "Bahia Standard Time" */ val BahiaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BahiaStandardTime with String = js.native
    
    /* "Bangladesh Standard Time" */ val BangladeshStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BangladeshStandardTime with String = js.native
    
    /* "Belarus Standard Time" */ val BelarusStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BelarusStandardTime with String = js.native
    
    /* "Bougainville Standard Time" */ val BougainvilleStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BougainvilleStandardTime with String = js.native
    
    /* "Canada Central Standard Time" */ val CanadaCentralStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CanadaCentralStandardTime with String = js.native
    
    /* "Cape Verde Standard Time" */ val CapeVerdeStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CapeVerdeStandardTime with String = js.native
    
    /* "Caucasus Standard Time" */ val CaucasusStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CaucasusStandardTime with String = js.native
    
    /* "Cen. Australia Standard Time" */ val CenAustraliaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CenAustraliaStandardTime with String = js.native
    
    /* "Central America Standard Time" */ val CentralAmericaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralAmericaStandardTime with String = js.native
    
    /* "Central Asia Standard Time" */ val CentralAsiaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralAsiaStandardTime with String = js.native
    
    /* "Central Brazilian Standard Time" */ val CentralBrazilianStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralBrazilianStandardTime with String = js.native
    
    /* "Central Europe Standard Time" */ val CentralEuropeStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralEuropeStandardTime with String = js.native
    
    /* "Central European Standard Time" */ val CentralEuropeanStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralEuropeanStandardTime with String = js.native
    
    /* "Central Pacific Standard Time" */ val CentralPacificStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralPacificStandardTime with String = js.native
    
    /* "Central Standard Time" */ val CentralStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralStandardTime with String = js.native
    
    /* "Central Standard Time (Mexico)" */ val CentralStandardTime_Mexico: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralStandardTime_Mexico with String = js.native
    
    /* "Chatham Islands Standard Time" */ val ChathamIslandsStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ChathamIslandsStandardTime with String = js.native
    
    /* "China Standard Time" */ val ChinaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ChinaStandardTime with String = js.native
    
    /* "Cuba Standard Time" */ val CubaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CubaStandardTime with String = js.native
    
    /* "Dateline Standard Time" */ val DatelineStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.DatelineStandardTime with String = js.native
    
    /* "E. Africa Standard Time" */ val E_AfricaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_AfricaStandardTime with String = js.native
    
    /* "E. Australia Standard Time" */ val E_AustraliaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_AustraliaStandardTime with String = js.native
    
    /* "E. Europe Standard Time" */ val E_EuropeStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_EuropeStandardTime with String = js.native
    
    /* "E. South America Standard Time" */ val E_SouthAmericaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_SouthAmericaStandardTime with String = js.native
    
    /* "Easter Island Standard Time" */ val EasterIslandStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EasterIslandStandardTime with String = js.native
    
    /* "Eastern Standard Time" */ val EasternStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EasternStandardTime with String = js.native
    
    /* "Eastern Standard Time (Mexico)" */ val EasternStandardTime_Mexico: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EasternStandardTime_Mexico with String = js.native
    
    /* "Egypt Standard Time" */ val EgyptStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EgyptStandardTime with String = js.native
    
    /* "Ekaterinburg Standard Time" */ val EkaterinburgStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EkaterinburgStandardTime with String = js.native
    
    /* "FLE Standard Time" */ val FLEStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.FLEStandardTime with String = js.native
    
    /* "Fiji Standard Time" */ val FijiStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.FijiStandardTime with String = js.native
    
    /* "GMT Standard Time" */ val GMTStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GMTStandardTime with String = js.native
    
    /* "GTB Standard Time" */ val GTBStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GTBStandardTime with String = js.native
    
    /* "Georgian Standard Time" */ val GeorgianStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GeorgianStandardTime with String = js.native
    
    /* "Greenland Standard Time" */ val GreenlandStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GreenlandStandardTime with String = js.native
    
    /* "Greenwich Standard Time" */ val GreenwichStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GreenwichStandardTime with String = js.native
    
    /* "Haiti Standard Time" */ val HaitiStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.HaitiStandardTime with String = js.native
    
    /* "Hawaiian Standard Time" */ val HawaiianStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.HawaiianStandardTime with String = js.native
    
    /* "India Standard Time" */ val IndiaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.IndiaStandardTime with String = js.native
    
    /* "Iran Standard Time" */ val IranStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.IranStandardTime with String = js.native
    
    /* "Israel Standard Time" */ val IsraelStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.IsraelStandardTime with String = js.native
    
    /* "Jordan Standard Time" */ val JordanStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.JordanStandardTime with String = js.native
    
    /* "Kaliningrad Standard Time" */ val KaliningradStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.KaliningradStandardTime with String = js.native
    
    /* "Kamchatka Standard Time" */ val KamchatkaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.KamchatkaStandardTime with String = js.native
    
    /* "Korea Standard Time" */ val KoreaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.KoreaStandardTime with String = js.native
    
    /* "Libya Standard Time" */ val LibyaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.LibyaStandardTime with String = js.native
    
    /* "Line Islands Standard Time" */ val LineIslandsStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.LineIslandsStandardTime with String = js.native
    
    /* "Lord Howe Standard Time" */ val LordHoweStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.LordHoweStandardTime with String = js.native
    
    /* "Magadan Standard Time" */ val MagadanStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MagadanStandardTime with String = js.native
    
    /* "Magallanes Standard Time" */ val MagallanesStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MagallanesStandardTime with String = js.native
    
    /* "Marquesas Standard Time" */ val MarquesasStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MarquesasStandardTime with String = js.native
    
    /* "Mauritius Standard Time" */ val MauritiusStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MauritiusStandardTime with String = js.native
    
    /* "Mid-Atlantic Standard Time" */ val MidAtlanticStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MidAtlanticStandardTime with String = js.native
    
    /* "Middle East Standard Time" */ val MiddleEastStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MiddleEastStandardTime with String = js.native
    
    /* "Montevideo Standard Time" */ val MontevideoStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MontevideoStandardTime with String = js.native
    
    /* "Morocco Standard Time" */ val MoroccoStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MoroccoStandardTime with String = js.native
    
    /* "Mountain Standard Time" */ val MountainStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MountainStandardTime with String = js.native
    
    /* "Mountain Standard Time (Mexico)" */ val MountainStandardTime_Mexico: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MountainStandardTime_Mexico with String = js.native
    
    /* "Myanmar Standard Time" */ val MyanmarStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MyanmarStandardTime with String = js.native
    
    /* "N. Central Asia Standard Time" */ val N_CentralAsiaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.N_CentralAsiaStandardTime with String = js.native
    
    /* "Namibia Standard Time" */ val NamibiaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NamibiaStandardTime with String = js.native
    
    /* "Nepal Standard Time" */ val NepalStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NepalStandardTime with String = js.native
    
    /* "New Zealand Standard Time" */ val NewZealandStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NewZealandStandardTime with String = js.native
    
    /* "Newfoundland Standard Time" */ val NewfoundlandStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NewfoundlandStandardTime with String = js.native
    
    /* "Norfolk Standard Time" */ val NorfolkStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorfolkStandardTime with String = js.native
    
    /* "North Asia East Standard Time" */ val NorthAsiaEastStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorthAsiaEastStandardTime with String = js.native
    
    /* "North Asia Standard Time" */ val NorthAsiaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorthAsiaStandardTime with String = js.native
    
    /* "North Korea Standard Time" */ val NorthKoreaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorthKoreaStandardTime with String = js.native
    
    /* "Omsk Standard Time" */ val OmskStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.OmskStandardTime with String = js.native
    
    /* "Pacific SA Standard Time" */ val PacificSAStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PacificSAStandardTime with String = js.native
    
    /* "Pacific Standard Time" */ val PacificStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PacificStandardTime with String = js.native
    
    /* "Pacific Standard Time (Mexico)" */ val PacificStandardTimeMexico: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PacificStandardTimeMexico with String = js.native
    
    /* "Pakistan Standard Time" */ val PakistanStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PakistanStandardTime with String = js.native
    
    /* "Paraguay Standard Time" */ val ParaguayStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ParaguayStandardTime with String = js.native
    
    /* "Romance Standard Time" */ val RomanceStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RomanceStandardTime with String = js.native
    
    /* "Russia Time Zone 10" */ val RussiaTimeZone10: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone10 with String = js.native
    
    /* "Russia Time Zone 11" */ val RussiaTimeZone11: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone11 with String = js.native
    
    /* "Russia Time Zone 3" */ val RussiaTimeZone3: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone3 with String = js.native
    
    /* "Russian Standard Time" */ val RussianStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussianStandardTime with String = js.native
    
    /* "SA Eastern Standard Time" */ val SAEasternStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SAEasternStandardTime with String = js.native
    
    /* "SA Pacific Standard Time" */ val SAPacificStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SAPacificStandardTime with String = js.native
    
    /* "SA Western Standard Time" */ val SAWesternStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SAWesternStandardTime with String = js.native
    
    /* "SE Asia Standard Time" */ val SEAsiaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SEAsiaStandardTime with String = js.native
    
    /* "Saint Pierre Standard Time" */ val SaintPierreStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SaintPierreStandardTime with String = js.native
    
    /* "Sakhalin Standard Time" */ val SakhalinStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SakhalinStandardTime with String = js.native
    
    /* "Samoa Standard Time" */ val SamoaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SamoaStandardTime with String = js.native
    
    /* "Saratov Standard Time" */ val SaratovStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SaratovStandardTime with String = js.native
    
    /* "Singapore Standard Time" */ val SingaporeStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SingaporeStandardTime with String = js.native
    
    /* "South Africa Standard Time" */ val SouthAfricaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SouthAfricaStandardTime with String = js.native
    
    /* "Sri Lanka Standard Time" */ val SriLankaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SriLankaStandardTime with String = js.native
    
    /* "Sudan Standard Time" */ val SudanStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SudanStandardTime with String = js.native
    
    /* "Syria Standard Time" */ val SyriaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SyriaStandardTime with String = js.native
    
    /* "Taipei Standard Time" */ val TaipeiStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TaipeiStandardTime with String = js.native
    
    /* "Tasmania Standard Time" */ val TasmaniaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TasmaniaStandardTime with String = js.native
    
    /* "Tocantins Standard Time" */ val TocantinsStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TocantinsStandardTime with String = js.native
    
    /* "Tokyo Standard Time" */ val TokyoStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TokyoStandardTime with String = js.native
    
    /* "Tomsk Standard Time" */ val TomskStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TomskStandardTime with String = js.native
    
    /* "Tonga Standard Time" */ val TongaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TongaStandardTime with String = js.native
    
    /* "Transbaikal Standard Time" */ val TransbaikalStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TransbaikalStandardTime with String = js.native
    
    /* "Turkey Standard Time" */ val TurkeyStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TurkeyStandardTime with String = js.native
    
    /* "Turks And Caicos Standard Time" */ val TurksAndCaicosStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TurksAndCaicosStandardTime with String = js.native
    
    /* "US Eastern Standard Time" */ val USEasternStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.USEasternStandardTime with String = js.native
    
    /* "US Mountain Standard Time" */ val USMountainStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.USMountainStandardTime with String = js.native
    
    /* "UTC" */ val UTC: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTC with String = js.native
    
    /* "UTC-02" */ val UTCMINUS02: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS02 with String = js.native
    
    /* "UTC-08" */ val UTCMINUS08: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS08 with String = js.native
    
    /* "UTC-09" */ val UTCMINUS09: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS09 with String = js.native
    
    /* "UTC-11" */ val UTCMINUS11: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS11 with String = js.native
    
    /* "UTC+12" */ val UTCPLUS12: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCPLUS12 with String = js.native
    
    /* "UTC+13" */ val UTCPLUS13: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCPLUS13 with String = js.native
    
    /* "Ulaanbaatar Standard Time" */ val UlaanbaatarStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UlaanbaatarStandardTime with String = js.native
    
    /* "Venezuela Standard Time" */ val VenezuelaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.VenezuelaStandardTime with String = js.native
    
    /* "Vladivostok Standard Time" */ val VladivostokStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.VladivostokStandardTime with String = js.native
    
    /* "W. Australia Standard Time" */ val W_AustraliaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_AustraliaStandardTime with String = js.native
    
    /* "W. Central Africa Standard Time" */ val W_CentralAfricaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_CentralAfricaStandardTime with String = js.native
    
    /* "W. Europe Standard Time" */ val W_EuropeStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_EuropeStandardTime with String = js.native
    
    /* "W. Mongolia Standard Time" */ val W_MongoliaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_MongoliaStandardTime with String = js.native
    
    /* "West Asia Standard Time" */ val WestAsiaStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.WestAsiaStandardTime with String = js.native
    
    /* "West Bank Standard Time" */ val WestBankStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.WestBankStandardTime with String = js.native
    
    /* "West Pacific Standard Time" */ val WestPacificStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.WestPacificStandardTime with String = js.native
    
    /* "Yakutsk Standard Time" */ val YakutskStandardTime: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.YakutskStandardTime with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceType with String] = js.native
    
    /* "daily" */ val Daily: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceType.Daily with String = js.native
    
    /* "monthly" */ val Monthly: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceType.Monthly with String = js.native
    
    /* "weekday" */ val Weekday: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceType.Weekday with String = js.native
    
    /* "weekly" */ val Weekly: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceType.Weekly with String = js.native
    
    /* "yearly" */ val Yearly: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecurrenceType.Yearly with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.ResponseType with String] = js.native
    
    /* "accepted" */ val Accepted: typingsSlinky.officeJsPreview.Office.MailboxEnums.ResponseType.Accepted with String = js.native
    
    /* "declined" */ val Declined: typingsSlinky.officeJsPreview.Office.MailboxEnums.ResponseType.Declined with String = js.native
    
    /* "none" */ val None: typingsSlinky.officeJsPreview.Office.MailboxEnums.ResponseType.None with String = js.native
    
    /* "organizer" */ val Organizer: typingsSlinky.officeJsPreview.Office.MailboxEnums.ResponseType.Organizer with String = js.native
    
    /* "tentative" */ val Tentative: typingsSlinky.officeJsPreview.Office.MailboxEnums.ResponseType.Tentative with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.RestVersion with String] = js.native
    
    /* "beta" */ val Beta: typingsSlinky.officeJsPreview.Office.MailboxEnums.RestVersion.Beta with String = js.native
    
    /* "v1.0" */ val v1_0: typingsSlinky.officeJsPreview.Office.MailboxEnums.RestVersion.v1_0 with String = js.native
    
    /* "v2.0" */ val v2_0: typingsSlinky.officeJsPreview.Office.MailboxEnums.RestVersion.v2_0 with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.SourceProperty with String] = js.native
    
    /* "body" */ val Body: typingsSlinky.officeJsPreview.Office.MailboxEnums.SourceProperty.Body with String = js.native
    
    /* "subject" */ val Subject: typingsSlinky.officeJsPreview.Office.MailboxEnums.SourceProperty.Subject with String = js.native
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
    def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.WeekNumber with String] = js.native
    
    /* "first" */ val First: typingsSlinky.officeJsPreview.Office.MailboxEnums.WeekNumber.First with String = js.native
    
    /* "fourth" */ val Fourth: typingsSlinky.officeJsPreview.Office.MailboxEnums.WeekNumber.Fourth with String = js.native
    
    /* "last" */ val Last: typingsSlinky.officeJsPreview.Office.MailboxEnums.WeekNumber.Last with String = js.native
    
    /* "second" */ val Second: typingsSlinky.officeJsPreview.Office.MailboxEnums.WeekNumber.Second with String = js.native
    
    /* "third" */ val Third: typingsSlinky.officeJsPreview.Office.MailboxEnums.WeekNumber.Third with String = js.native
  }
}
