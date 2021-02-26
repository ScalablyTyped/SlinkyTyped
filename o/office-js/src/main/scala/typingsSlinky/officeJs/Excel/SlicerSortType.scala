package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SlicerSortType extends StObject
/**
  *
  * Specifies the slicer sort behavior for Slicer.sortBy API.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.SlicerSortType")
@js.native
object SlicerSortType extends StObject {
  
  /**
    * Sort slicer items in ascending order by item captions.
    *
    */
  @js.native
  sealed trait ascending extends SlicerSortType
  
  /**
    * Sort slicer items in the order provided by the data source.
    *
    */
  @js.native
  sealed trait dataSourceOrder extends SlicerSortType
  
  /**
    * Sort slicer items in descending order by item captions.
    *
    */
  @js.native
  sealed trait descending extends SlicerSortType
}
