package typingsSlinky.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Enumerations
/**
  * Provides options to determine the startup behavior of the add-in upon next start-up.
  */
@JSGlobal("Office.StartupBehavior")
@js.native
object StartupBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Office.StartupBehavior with String] = js.native
  
  /* "Load" */ val load: typingsSlinky.officeJs.Office.StartupBehavior.load with String = js.native
  
  /* "None" */ val none: typingsSlinky.officeJs.Office.StartupBehavior.none with String = js.native
}
