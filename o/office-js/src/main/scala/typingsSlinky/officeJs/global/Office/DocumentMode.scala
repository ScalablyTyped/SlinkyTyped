package typingsSlinky.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether the document in the associated application is read-only or read-write.
  * 
  * @remarks
  *  
  * Returned by the mode property of the {@link Office.Document | Document} object.
  */
@JSGlobal("Office.DocumentMode")
@js.native
object DocumentMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.officeJs.Office.DocumentMode with Double] = js.native
  
  /* 0 */ val ReadOnly: typingsSlinky.officeJs.Office.DocumentMode.ReadOnly with Double = js.native
  
  /* 1 */ val ReadWrite: typingsSlinky.officeJs.Office.DocumentMode.ReadWrite with Double = js.native
}
