package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartAxisCategoryType extends js.Object
/**
  *
  * Specifies the type of the category axis.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisCategoryType")
@js.native
object ChartAxisCategoryType extends js.Object {
  
  /**
    * Excel controls the axis type.
    *
    */
  @js.native
  sealed trait automatic extends ChartAxisCategoryType
  
  /**
    * Axis groups data on a time scale.
    *
    */
  @js.native
  sealed trait dateAxis extends ChartAxisCategoryType
  
  /**
    * Axis groups data by an arbitrary set of categories.
    *
    */
  @js.native
  sealed trait textAxis extends ChartAxisCategoryType
}
