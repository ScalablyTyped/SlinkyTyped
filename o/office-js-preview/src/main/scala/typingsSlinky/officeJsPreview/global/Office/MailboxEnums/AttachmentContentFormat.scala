package typingsSlinky.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object AttachmentContentFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat with String
  ] = js.native
  
  /* "base64" */ val Base64: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Base64 with String = js.native
  
  /* "eml" */ val Eml: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Eml with String = js.native
  
  /* "iCalendar" */ val ICalendar: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.ICalendar with String = js.native
  
  /* "url" */ val Url: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Url with String = js.native
}
