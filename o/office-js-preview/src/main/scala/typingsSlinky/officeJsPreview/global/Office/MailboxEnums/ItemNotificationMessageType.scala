package typingsSlinky.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ItemNotificationMessageType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType with String
  ] = js.native
  
  /* "errorMessage" */ val ErrorMessage: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.ErrorMessage with String = js.native
  
  /* "informationalMessage" */ val InformationalMessage: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.InformationalMessage with String = js.native
  
  /* "insightMessage" */ val InsightMessage: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.InsightMessage with String = js.native
  
  /* "progressIndicator" */ val ProgressIndicator: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.ProgressIndicator with String = js.native
}
