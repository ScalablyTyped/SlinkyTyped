package typingsSlinky.officeJs.global.Excel

import typingsSlinky.officeJs.Excel.ValueFilterCondition.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Enum representing all accepted conditions by which a value filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.exclusive` can be set to true to invert many of these conditions.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.ValueFilterCondition")
@js.native
object ValueFilterCondition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Excel.ValueFilterCondition with String] = js.native
  
  /* "Between" */ val between: typingsSlinky.officeJs.Excel.ValueFilterCondition.between with String = js.native
  
  /* "BottomN" */ val bottomN: typingsSlinky.officeJs.Excel.ValueFilterCondition.bottomN with String = js.native
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals with String = js.native
  
  /* "GreaterThan" */ val greaterThan: typingsSlinky.officeJs.Excel.ValueFilterCondition.greaterThan with String = js.native
  
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typingsSlinky.officeJs.Excel.ValueFilterCondition.greaterThanOrEqualTo with String = js.native
  
  /* "LessThan" */ val lessThan: typingsSlinky.officeJs.Excel.ValueFilterCondition.lessThan with String = js.native
  
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typingsSlinky.officeJs.Excel.ValueFilterCondition.lessThanOrEqualTo with String = js.native
  
  /* "TopN" */ val topN: typingsSlinky.officeJs.Excel.ValueFilterCondition.topN with String = js.native
  
  /* "Unknown" */ val unknown: typingsSlinky.officeJs.Excel.ValueFilterCondition.unknown with String = js.native
}
