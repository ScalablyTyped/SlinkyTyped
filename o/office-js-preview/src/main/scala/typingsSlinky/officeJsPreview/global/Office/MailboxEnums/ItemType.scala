package typingsSlinky.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies an item's type.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.ItemType")
@js.native
object ItemType extends js.Object {
  /* "appointment" */ val Appointment: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemType.Appointment with String = js.native
  /* "message" */ val Message: typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemType.Message with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.ItemType with String] = js.native
}

