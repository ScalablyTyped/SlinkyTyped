package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintMarginUnit extends StObject
/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintMarginUnit")
@js.native
object PrintMarginUnit extends StObject {
  
  /**
    * Assign the page margins in centimeters.
    *
    */
  @js.native
  sealed trait centimeters extends PrintMarginUnit
  
  /**
    * Assign the page margins in inches.
    *
    */
  @js.native
  sealed trait inches extends PrintMarginUnit
  
  /**
    * Assign the page margins in points. A point is 1/72 of an inch.
    *
    */
  @js.native
  sealed trait points extends PrintMarginUnit
}
