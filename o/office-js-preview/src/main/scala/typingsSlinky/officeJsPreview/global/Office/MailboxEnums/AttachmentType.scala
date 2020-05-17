package typingsSlinky.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies an attachment's type.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  /* "cloud" */ val Cloud: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentType.Cloud with String = js.native
  /* "file" */ val File: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentType.File with String = js.native
  /* "item" */ val Item: typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentType.Item with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentType with String] = js.native
}

