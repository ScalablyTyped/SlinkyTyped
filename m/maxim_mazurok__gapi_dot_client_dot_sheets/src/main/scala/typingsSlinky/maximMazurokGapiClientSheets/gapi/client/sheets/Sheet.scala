package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet extends StObject {
  
  /** The banded (alternating colors) ranges on this sheet. */
  var bandedRanges: js.UndefOr[js.Array[BandedRange]] = js.native
  
  /** The filter on this sheet, if any. */
  var basicFilter: js.UndefOr[BasicFilter] = js.native
  
  /** The specifications of every chart on this sheet. */
  var charts: js.UndefOr[js.Array[EmbeddedChart]] = js.native
  
  /** All column groups on this sheet, ordered by increasing range start index, then by group depth. */
  var columnGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
  
  /** The conditional format rules in this sheet. */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatRule]] = js.native
  
  /**
    * Data in the grid, if this is a grid sheet. The number of GridData objects returned is dependent on the number of ranges requested on this sheet. For example, if this is representing
    * `Sheet1`, and the spreadsheet was requested with ranges `Sheet1!A1:C10` and `Sheet1!D15:E20`, then the first GridData will have a startRow/startColumn of `0`, while the second one
    * will have `startRow 14` (zero-based row 15), and `startColumn 3` (zero-based column D). For a DATA_SOURCE sheet, you can not request a specific range, the GridData contains all the
    * values.
    */
  var data: js.UndefOr[js.Array[GridData]] = js.native
  
  /** The developer metadata associated with a sheet. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
  
  /** The filter views in this sheet. */
  var filterViews: js.UndefOr[js.Array[FilterView]] = js.native
  
  /** The ranges that are merged together. */
  var merges: js.UndefOr[js.Array[GridRange]] = js.native
  
  /** The properties of the sheet. */
  var properties: js.UndefOr[SheetProperties] = js.native
  
  /** The protected ranges in this sheet. */
  var protectedRanges: js.UndefOr[js.Array[ProtectedRange]] = js.native
  
  /** All row groups on this sheet, ordered by increasing range start index, then by group depth. */
  var rowGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
  
  /** The slicers on this sheet. */
  var slicers: js.UndefOr[js.Array[Slicer]] = js.native
}
object Sheet {
  
  @scala.inline
  def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  
  @scala.inline
  implicit class SheetMutableBuilder[Self <: Sheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandedRanges(value: js.Array[BandedRange]): Self = StObject.set(x, "bandedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandedRangesUndefined: Self = StObject.set(x, "bandedRanges", js.undefined)
    
    @scala.inline
    def setBandedRangesVarargs(value: BandedRange*): Self = StObject.set(x, "bandedRanges", js.Array(value :_*))
    
    @scala.inline
    def setBasicFilter(value: BasicFilter): Self = StObject.set(x, "basicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicFilterUndefined: Self = StObject.set(x, "basicFilter", js.undefined)
    
    @scala.inline
    def setCharts(value: js.Array[EmbeddedChart]): Self = StObject.set(x, "charts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartsUndefined: Self = StObject.set(x, "charts", js.undefined)
    
    @scala.inline
    def setChartsVarargs(value: EmbeddedChart*): Self = StObject.set(x, "charts", js.Array(value :_*))
    
    @scala.inline
    def setColumnGroups(value: js.Array[DimensionGroup]): Self = StObject.set(x, "columnGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroupsUndefined: Self = StObject.set(x, "columnGroups", js.undefined)
    
    @scala.inline
    def setColumnGroupsVarargs(value: DimensionGroup*): Self = StObject.set(x, "columnGroups", js.Array(value :_*))
    
    @scala.inline
    def setConditionalFormats(value: js.Array[ConditionalFormatRule]): Self = StObject.set(x, "conditionalFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalFormatsUndefined: Self = StObject.set(x, "conditionalFormats", js.undefined)
    
    @scala.inline
    def setConditionalFormatsVarargs(value: ConditionalFormatRule*): Self = StObject.set(x, "conditionalFormats", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[GridData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: GridData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    @scala.inline
    def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
    
    @scala.inline
    def setFilterViews(value: js.Array[FilterView]): Self = StObject.set(x, "filterViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterViewsUndefined: Self = StObject.set(x, "filterViews", js.undefined)
    
    @scala.inline
    def setFilterViewsVarargs(value: FilterView*): Self = StObject.set(x, "filterViews", js.Array(value :_*))
    
    @scala.inline
    def setMerges(value: js.Array[GridRange]): Self = StObject.set(x, "merges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergesUndefined: Self = StObject.set(x, "merges", js.undefined)
    
    @scala.inline
    def setMergesVarargs(value: GridRange*): Self = StObject.set(x, "merges", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setProtectedRanges(value: js.Array[ProtectedRange]): Self = StObject.set(x, "protectedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangesUndefined: Self = StObject.set(x, "protectedRanges", js.undefined)
    
    @scala.inline
    def setProtectedRangesVarargs(value: ProtectedRange*): Self = StObject.set(x, "protectedRanges", js.Array(value :_*))
    
    @scala.inline
    def setRowGroups(value: js.Array[DimensionGroup]): Self = StObject.set(x, "rowGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowGroupsUndefined: Self = StObject.set(x, "rowGroups", js.undefined)
    
    @scala.inline
    def setRowGroupsVarargs(value: DimensionGroup*): Self = StObject.set(x, "rowGroups", js.Array(value :_*))
    
    @scala.inline
    def setSlicers(value: js.Array[Slicer]): Self = StObject.set(x, "slicers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicersUndefined: Self = StObject.set(x, "slicers", js.undefined)
    
    @scala.inline
    def setSlicersVarargs(value: Slicer*): Self = StObject.set(x, "slicers", js.Array(value :_*))
  }
}
