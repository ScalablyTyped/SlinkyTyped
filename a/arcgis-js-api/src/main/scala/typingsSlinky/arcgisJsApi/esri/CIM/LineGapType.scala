package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineGapType extends StObject
@JSGlobal("__esri.CIM.LineGapType")
@js.native
object LineGapType extends StObject {
  
  /**
    * Exact - Sets a fixed line spacing
    */
  @js.native
  sealed trait Exact extends LineGapType
  
  /**
    * Extra Leading - Adds the specified value to the line spacing that accommodates the largest font in the line
    */
  @js.native
  sealed trait ExtraLeading extends LineGapType
  
  /**
    * Multiple - Sets the line spacing based on a multiple of the line.
    */
  @js.native
  sealed trait Multiple extends LineGapType
}
