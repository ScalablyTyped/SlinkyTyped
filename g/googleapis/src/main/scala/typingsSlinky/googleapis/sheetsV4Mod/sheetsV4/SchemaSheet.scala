package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A sheet in a spreadsheet.
  */
@js.native
trait SchemaSheet extends StObject {
  
  /**
    * The banded (alternating colors) ranges on this sheet.
    */
  var bandedRanges: js.UndefOr[js.Array[SchemaBandedRange]] = js.native
  
  /**
    * The filter on this sheet, if any.
    */
  var basicFilter: js.UndefOr[SchemaBasicFilter] = js.native
  
  /**
    * The specifications of every chart on this sheet.
    */
  var charts: js.UndefOr[js.Array[SchemaEmbeddedChart]] = js.native
  
  /**
    * All column groups on this sheet, ordered by increasing range start index,
    * then by group depth.
    */
  var columnGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
  
  /**
    * The conditional format rules in this sheet.
    */
  var conditionalFormats: js.UndefOr[js.Array[SchemaConditionalFormatRule]] = js.native
  
  /**
    * Data in the grid, if this is a grid sheet. The number of GridData objects
    * returned is dependent on the number of ranges requested on this sheet.
    * For example, if this is representing `Sheet1`, and the spreadsheet was
    * requested with ranges `Sheet1!A1:C10` and `Sheet1!D15:E20`, then the
    * first GridData will have a startRow/startColumn of `0`, while the second
    * one will have `startRow 14` (zero-based row 15), and `startColumn 3`
    * (zero-based column D).
    */
  var data: js.UndefOr[js.Array[SchemaGridData]] = js.native
  
  /**
    * The developer metadata associated with a sheet.
    */
  var developerMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
  
  /**
    * The filter views in this sheet.
    */
  var filterViews: js.UndefOr[js.Array[SchemaFilterView]] = js.native
  
  /**
    * The ranges that are merged together.
    */
  var merges: js.UndefOr[js.Array[SchemaGridRange]] = js.native
  
  /**
    * The properties of the sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
  
  /**
    * The protected ranges in this sheet.
    */
  var protectedRanges: js.UndefOr[js.Array[SchemaProtectedRange]] = js.native
  
  /**
    * All row groups on this sheet, ordered by increasing range start index,
    * then by group depth.
    */
  var rowGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
}
object SchemaSheet {
  
  @scala.inline
  def apply(): SchemaSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheet]
  }
  
  @scala.inline
  implicit class SchemaSheetMutableBuilder[Self <: SchemaSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandedRanges(value: js.Array[SchemaBandedRange]): Self = StObject.set(x, "bandedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandedRangesUndefined: Self = StObject.set(x, "bandedRanges", js.undefined)
    
    @scala.inline
    def setBandedRangesVarargs(value: SchemaBandedRange*): Self = StObject.set(x, "bandedRanges", js.Array(value :_*))
    
    @scala.inline
    def setBasicFilter(value: SchemaBasicFilter): Self = StObject.set(x, "basicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicFilterUndefined: Self = StObject.set(x, "basicFilter", js.undefined)
    
    @scala.inline
    def setCharts(value: js.Array[SchemaEmbeddedChart]): Self = StObject.set(x, "charts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartsUndefined: Self = StObject.set(x, "charts", js.undefined)
    
    @scala.inline
    def setChartsVarargs(value: SchemaEmbeddedChart*): Self = StObject.set(x, "charts", js.Array(value :_*))
    
    @scala.inline
    def setColumnGroups(value: js.Array[SchemaDimensionGroup]): Self = StObject.set(x, "columnGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroupsUndefined: Self = StObject.set(x, "columnGroups", js.undefined)
    
    @scala.inline
    def setColumnGroupsVarargs(value: SchemaDimensionGroup*): Self = StObject.set(x, "columnGroups", js.Array(value :_*))
    
    @scala.inline
    def setConditionalFormats(value: js.Array[SchemaConditionalFormatRule]): Self = StObject.set(x, "conditionalFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalFormatsUndefined: Self = StObject.set(x, "conditionalFormats", js.undefined)
    
    @scala.inline
    def setConditionalFormatsVarargs(value: SchemaConditionalFormatRule*): Self = StObject.set(x, "conditionalFormats", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[SchemaGridData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: SchemaGridData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    @scala.inline
    def setDeveloperMetadataVarargs(value: SchemaDeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
    
    @scala.inline
    def setFilterViews(value: js.Array[SchemaFilterView]): Self = StObject.set(x, "filterViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterViewsUndefined: Self = StObject.set(x, "filterViews", js.undefined)
    
    @scala.inline
    def setFilterViewsVarargs(value: SchemaFilterView*): Self = StObject.set(x, "filterViews", js.Array(value :_*))
    
    @scala.inline
    def setMerges(value: js.Array[SchemaGridRange]): Self = StObject.set(x, "merges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergesUndefined: Self = StObject.set(x, "merges", js.undefined)
    
    @scala.inline
    def setMergesVarargs(value: SchemaGridRange*): Self = StObject.set(x, "merges", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: SchemaSheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setProtectedRanges(value: js.Array[SchemaProtectedRange]): Self = StObject.set(x, "protectedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangesUndefined: Self = StObject.set(x, "protectedRanges", js.undefined)
    
    @scala.inline
    def setProtectedRangesVarargs(value: SchemaProtectedRange*): Self = StObject.set(x, "protectedRanges", js.Array(value :_*))
    
    @scala.inline
    def setRowGroups(value: js.Array[SchemaDimensionGroup]): Self = StObject.set(x, "rowGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowGroupsUndefined: Self = StObject.set(x, "rowGroups", js.undefined)
    
    @scala.inline
    def setRowGroupsVarargs(value: SchemaDimensionGroup*): Self = StObject.set(x, "rowGroups", js.Array(value :_*))
  }
}
