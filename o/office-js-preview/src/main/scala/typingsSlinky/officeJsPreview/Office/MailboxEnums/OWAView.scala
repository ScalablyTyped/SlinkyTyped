package typingsSlinky.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OWAView extends StObject
/**
  * Represents the current view of Outlook on the web.
  */
@JSGlobal("Office.MailboxEnums.OWAView")
@js.native
object OWAView extends StObject {
  
  /**
    * One-column view. Displayed when the screen is narrow. Outlook on the web uses this single-column layout on the entire screen of a smartphone.
    */
  @js.native
  sealed trait OneColumn extends OWAView
  
  /**
    Three-column view. Displayed when the screen is wide. For example, Outlook on the web uses this view in a full screen window on a desktop
    computer.
    */
  @js.native
  sealed trait ThreeColumns extends OWAView
  
  /**
    * Two-column view. Displayed when the screen is wider. Outlook on the web uses this view on most tablets.
    */
  @js.native
  sealed trait TwoColumns extends OWAView
}
