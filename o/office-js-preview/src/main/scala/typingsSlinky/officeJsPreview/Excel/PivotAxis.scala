package typingsSlinky.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotAxis extends StObject
/**
  *
  * Represents the axis from which to get the PivotItems.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotAxis")
@js.native
object PivotAxis extends StObject {
  
  /**
    * The column axis.
    *
    */
  @js.native
  sealed trait column extends PivotAxis
  
  /**
    * The data axis.
    *
    */
  @js.native
  sealed trait data extends PivotAxis
  
  /**
    * The filter axis.
    *
    */
  @js.native
  sealed trait filter extends PivotAxis
  
  /**
    * The row axis.
    *
    */
  @js.native
  sealed trait row extends PivotAxis
  
  /**
    * The axis or region is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends PivotAxis
}
