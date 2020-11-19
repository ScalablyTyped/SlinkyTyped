package typingsSlinky.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object RecipientType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.MailboxEnums.RecipientType with String] = js.native
  
  /* "distributionList" */ val DistributionList: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecipientType.DistributionList with String = js.native
  
  /* "externalUser" */ val ExternalUser: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecipientType.ExternalUser with String = js.native
  
  /* "other" */ val Other: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecipientType.Other with String = js.native
  
  /* "user" */ val User: typingsSlinky.officeJsPreview.Office.MailboxEnums.RecipientType.User with String = js.native
}
