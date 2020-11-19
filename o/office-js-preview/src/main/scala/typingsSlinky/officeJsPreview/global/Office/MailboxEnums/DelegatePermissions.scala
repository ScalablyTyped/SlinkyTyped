package typingsSlinky.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object DelegatePermissions extends js.Object {
  
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
