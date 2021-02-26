package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartParentLabelStrategy extends StObject
/**
  *
  * Represents the parent label strategy of the chart series layout. This only applies to treemap charts
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartParentLabelStrategy")
@js.native
object ChartParentLabelStrategy extends StObject {
  
  @js.native
  sealed trait banner extends ChartParentLabelStrategy
  
  @js.native
  sealed trait none extends ChartParentLabelStrategy
  
  @js.native
  sealed trait overlapping extends ChartParentLabelStrategy
}
