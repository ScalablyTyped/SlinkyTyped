package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartBinType extends StObject
/**
  *
  * Specifies the bin's type of a histogram chart or pareto chart series.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinType")
@js.native
object ChartBinType extends StObject {
  
  @js.native
  sealed trait auto extends ChartBinType
  
  @js.native
  sealed trait binCount extends ChartBinType
  
  @js.native
  sealed trait binWidth extends ChartBinType
  
  @js.native
  sealed trait category extends ChartBinType
}
