package typingsSlinky.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether the add-in was just inserted or was already contained in the document.
  */
@JSGlobal("Office.InitializationReason")
@js.native
object InitializationReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.officeJsPreview.Office.InitializationReason with Double] = js.native
  
  /* 1 */ val DocumentOpened: typingsSlinky.officeJsPreview.Office.InitializationReason.DocumentOpened with Double = js.native
  
  /* 0 */ val Inserted: typingsSlinky.officeJsPreview.Office.InitializationReason.Inserted with Double = js.native
}
