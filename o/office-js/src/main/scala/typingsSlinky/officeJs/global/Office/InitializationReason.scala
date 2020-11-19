package typingsSlinky.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether the add-in was just inserted or was already contained in the document.
  */
@JSGlobal("Office.InitializationReason")
@js.native
object InitializationReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.officeJs.Office.InitializationReason with Double] = js.native
  
  /* 1 */ val DocumentOpened: typingsSlinky.officeJs.Office.InitializationReason.DocumentOpened with Double = js.native
  
  /* 0 */ val Inserted: typingsSlinky.officeJs.Office.InitializationReason.Inserted with Double = js.native
}
