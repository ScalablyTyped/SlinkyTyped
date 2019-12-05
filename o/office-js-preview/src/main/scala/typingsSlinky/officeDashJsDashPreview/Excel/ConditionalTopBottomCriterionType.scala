package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalTopBottomCriterionType extends js.Object

/**
  *
  * Represents the criteria for the above/below average conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalTopBottomCriterionType")
@js.native
object ConditionalTopBottomCriterionType extends js.Object {
  @js.native
  sealed trait bottomItems extends ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait bottomPercent extends ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait invalid extends ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait topItems extends ConditionalTopBottomCriterionType
  
  @js.native
  sealed trait topPercent extends ConditionalTopBottomCriterionType
  
  /* "BottomItems" */ val bottomItems: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalTopBottomCriterionType.bottomItems with String = js.native
  /* "BottomPercent" */ val bottomPercent: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalTopBottomCriterionType.bottomPercent with String = js.native
  /* "Invalid" */ val invalid: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalTopBottomCriterionType.invalid with String = js.native
  /* "TopItems" */ val topItems: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalTopBottomCriterionType.topItems with String = js.native
  /* "TopPercent" */ val topPercent: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalTopBottomCriterionType.topPercent with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalTopBottomCriterionType with String] = js.native
}

