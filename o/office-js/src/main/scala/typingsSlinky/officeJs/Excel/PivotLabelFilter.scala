package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.BeginsWith
import typingsSlinky.officeJs.officeJsStrings.Between
import typingsSlinky.officeJs.officeJsStrings.Contains
import typingsSlinky.officeJs.officeJsStrings.EndsWith
import typingsSlinky.officeJs.officeJsStrings.Equals
import typingsSlinky.officeJs.officeJsStrings.GreaterThan
import typingsSlinky.officeJs.officeJsStrings.GreaterThanOrEqualTo
import typingsSlinky.officeJs.officeJsStrings.LessThan
import typingsSlinky.officeJs.officeJsStrings.LessThanOrEqualTo
import typingsSlinky.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Configurable template for a label filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait PivotLabelFilter extends StObject {
  
  /**
    *
    * The comparator is the static value to which other values are compared. The type of comparison is defined by the condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var comparator: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies the condition for the filter, which defines the necessary filtering criteria.
    *
    * [Api set: ExcelApi 1.12]
    */
  var condition: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between = js.native
  
  /**
    *
    * If true, filter *excludes* items that meet criteria. The default is false (filter to include items that meet criteria).
    *
    * [Api set: ExcelApi 1.12]
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The lower-bound of the range for the Between filter condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var lowerBound: js.UndefOr[String] = js.native
  
  /**
    *
    * The substring used for `BeginsWith`, `EndsWith`, and `Contains` filter conditions.
    *
    * [Api set: ExcelApi 1.12]
    */
  var substring: js.UndefOr[String] = js.native
  
  /**
    *
    * The upper-bound of the range for the Between filter condition.
    Note: A numeric string is treated as a number when being compared against other numeric strings.
    *
    * [Api set: ExcelApi 1.12]
    */
  var upperBound: js.UndefOr[String] = js.native
}
object PivotLabelFilter {
  
  @scala.inline
  def apply(
    condition: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between
  ): PivotLabelFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotLabelFilter]
  }
  
  @scala.inline
  implicit class PivotLabelFilterMutableBuilder[Self <: PivotLabelFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: String): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setCondition(
      value: LabelFilterCondition | Unknown_ | Equals | BeginsWith | EndsWith | Contains | GreaterThan | GreaterThanOrEqualTo | LessThan | LessThanOrEqualTo | Between
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setLowerBound(value: String): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    @scala.inline
    def setSubstring(value: String): Self = StObject.set(x, "substring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstringUndefined: Self = StObject.set(x, "substring", js.undefined)
    
    @scala.inline
    def setUpperBound(value: String): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
  }
}
