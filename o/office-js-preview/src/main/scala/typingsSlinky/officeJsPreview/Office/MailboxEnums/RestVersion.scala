package typingsSlinky.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RestVersion extends StObject
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
  
  /**
    * Beta.
    */
  @js.native
  sealed trait Beta extends RestVersion
  
  /**
    * Version 1.0.
    */
  @js.native
  sealed trait v1_0 extends RestVersion
  
  /**
    * Version 2.0.
    */
  @js.native
  sealed trait v2_0 extends RestVersion
}
