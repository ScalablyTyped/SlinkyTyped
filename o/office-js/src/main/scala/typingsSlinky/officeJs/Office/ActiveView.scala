package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActiveView extends js.Object
// Enumerations
/**
  * Specifies the state of the active view of the document, for example, whether the user can edit the document.
  */
@JSGlobal("Office.ActiveView")
@js.native
object ActiveView extends js.Object {
  
  /**
    * The active view of the host application lets the user edit the content in the document.
    */
  @js.native
  sealed trait Edit extends ActiveView
  
  /**
    * The active view of the host application only lets the user read the content in the document.
    */
  @js.native
  sealed trait Read extends ActiveView
}
