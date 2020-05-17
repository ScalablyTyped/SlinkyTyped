package typingsSlinky.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object AttachmentStatus extends js.Object {
  /* "added" */ val Added: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentStatus.Added with String = js.native
  /* "removed" */ val Removed: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentStatus.Removed with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentStatus with String] = js.native
}

