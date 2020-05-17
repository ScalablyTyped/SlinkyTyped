package typingsSlinky.officeJsPreview.global.Excel

import typingsSlinky.officeJsPreview.Excel.ValueFilterCondition.equals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Enum representing all accepted conditions by which a value filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.exclusive` can be set to true to invert many of these conditions.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.ValueFilterCondition")
@js.native
object ValueFilterCondition extends js.Object {
  /* "Between" */ val between: typingsSlinky.officeJsPreview.Excel.ValueFilterCondition.between with String = js.native
  /* "BottomN" */ val bottomN: typingsSlinky.officeJsPreview.Excel.ValueFilterCondition.bottomN with String = js.native
  /* "Equals" */ @JSName("equals")
  val equals_ : equals with String = js.native
  /* "GreaterThan" */ val greaterThan: typingsSlinky.officeJsPreview.Excel.ValueFilterCondition.greaterThan with String = js.native
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typingsSlinky.officeJsPreview.Excel.ValueFilterCondition.greaterThanOrEqualTo with String = js.native
  /* "LessThan" */ val lessThan: typingsSlinky.officeJsPreview.Excel.ValueFilterCondition.lessThan with String = js.native
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typingsSlinky.officeJsPreview.Excel.ValueFilterCondition.lessThanOrEqualTo with String = js.native
  /* "TopN" */ val topN: typingsSlinky.officeJsPreview.Excel.ValueFilterCondition.topN with String = js.native
  /* "Unknown" */ val unknown: typingsSlinky.officeJsPreview.Excel.ValueFilterCondition.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Excel.ValueFilterCondition with String] = js.native
}

