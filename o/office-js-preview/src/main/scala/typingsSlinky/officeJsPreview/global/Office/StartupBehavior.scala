package typingsSlinky.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Enumerations
/**
  * Provides options to determine the startup behavior of the add-in upon next start-up.
  */
@JSGlobal("Office.StartupBehavior")
@js.native
object StartupBehavior extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Office.StartupBehavior with String] = js.native
  
  /* "Load" */ val load: typingsSlinky.officeJsPreview.Office.StartupBehavior.load with String = js.native
  
  /* "None" */ val none: typingsSlinky.officeJsPreview.Office.StartupBehavior.none with String = js.native
}
