package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotValue extends StObject {
  
  /**
    * If specified, indicates that pivot values should be displayed as the result of a calculation with another pivot value. For example, if calculated_display_type is specified as
    * PERCENT_OF_GRAND_TOTAL, all the pivot values are displayed as the percentage of the grand total. In the Sheets editor, this is referred to as "Show As" in the value section of a
    * pivot table.
    */
  var calculatedDisplayType: js.UndefOr[String] = js.native
  
  /** The reference to the data source column that this value reads from. */
  var dataSourceColumnReference: js.UndefOr[DataSourceColumnReference] = js.native
  
  /** A custom formula to calculate the value. The formula must start with an `=` character. */
  var formula: js.UndefOr[String] = js.native
  
  /** A name to use for the value. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The column offset of the source range that this value reads from. For example, if the source was `C10:E15`, a `sourceColumnOffset` of `0` means this value refers to column `C`,
    * whereas the offset `1` would refer to column `D`.
    */
  var sourceColumnOffset: js.UndefOr[Double] = js.native
  
  /** A function to summarize the value. If formula is set, the only supported values are SUM and CUSTOM. If sourceColumnOffset is set, then `CUSTOM` is not supported. */
  var summarizeFunction: js.UndefOr[String] = js.native
}
object PivotValue {
  
  @scala.inline
  def apply(): PivotValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotValue]
  }
  
  @scala.inline
  implicit class PivotValueMutableBuilder[Self <: PivotValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculatedDisplayType(value: String): Self = StObject.set(x, "calculatedDisplayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedDisplayTypeUndefined: Self = StObject.set(x, "calculatedDisplayType", js.undefined)
    
    @scala.inline
    def setDataSourceColumnReference(value: DataSourceColumnReference): Self = StObject.set(x, "dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceColumnReferenceUndefined: Self = StObject.set(x, "dataSourceColumnReference", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSourceColumnOffset(value: Double): Self = StObject.set(x, "sourceColumnOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceColumnOffsetUndefined: Self = StObject.set(x, "sourceColumnOffset", js.undefined)
    
    @scala.inline
    def setSummarizeFunction(value: String): Self = StObject.set(x, "summarizeFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummarizeFunctionUndefined: Self = StObject.set(x, "summarizeFunction", js.undefined)
  }
}
