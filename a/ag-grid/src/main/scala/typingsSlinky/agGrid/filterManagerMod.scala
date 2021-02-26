package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.eventsMod.ColumnEventType
import typingsSlinky.agGrid.iFilterMod.IFilterComp
import typingsSlinky.agGrid.utilsMod.ExternalPromise
import typingsSlinky.agGrid.utilsMod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterManagerMod {
  
  @JSImport("ag-grid/dist/lib/filter/filterManager", "FilterManager")
  @js.native
  class FilterManager () extends StObject {
    
    @JSName("$compile")
    var $compile: js.Any = js.native
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
    var advancedFilterPresent: js.Any = js.native
    
    /* private */ def aggregateRowForQuickFilter(node: js.Any): js.Any = js.native
    
    var allFilters: js.Any = js.native
    
    def cachedFilter(column: Column): FilterWrapper = js.native
    
    /* private */ def checkExternalFilter(): js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var componentResolver: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createFilterInstance(column: js.Any, $scope: js.Any): js.Any = js.native
    
    /* private */ def createFilterWrapper(column: js.Any): js.Any = js.native
    
    /* private */ def createValueGetter(column: js.Any): js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def destroyFilter(column: Column): Unit = js.native
    def destroyFilter(column: Column, source: ColumnEventType): Unit = js.native
    
    /* private */ def disposeFilterWrapper(filterWrapper: js.Any, source: js.Any): js.Any = js.native
    
    /* private */ def doesFilterPass(node: js.Any, filterToSkip: js.Any): js.Any = js.native
    
    def doesRowPassFilter(node: js.Any): Boolean = js.native
    def doesRowPassFilter(node: js.Any, filterToSkip: js.Any): Boolean = js.native
    
    def doesRowPassOtherFilters(filterToSkip: js.Any, node: js.Any): Boolean = js.native
    
    /* private */ def doesRowPassQuickFilter(node: js.Any): js.Any = js.native
    
    /* private */ def doesRowPassQuickFilterCache(node: js.Any, filterPart: js.Any): js.Any = js.native
    
    /* private */ def doesRowPassQuickFilterNoCache(node: js.Any, filterPart: js.Any): js.Any = js.native
    
    var enterprise: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var externalFilterPresent: js.Any = js.native
    
    def getFilterComponent(column: Column): Promise[IFilterComp] = js.native
    
    def getFilterModel(): js.Any = js.native
    
    def getOrCreateFilterWrapper(column: Column): FilterWrapper = js.native
    
    /* private */ def getQuickFilterTextForColumn(column: js.Any, rowNode: js.Any): js.Any = js.native
    
    var gridApi: js.Any = js.native
    
    var gridCore: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def init(): Unit = js.native
    
    def isAdvancedFilterPresent(): Boolean = js.native
    
    def isAnyFilterPresent(): Boolean = js.native
    
    def isQuickFilterPresent(): Boolean = js.native
    
    def onFilterChanged(): Unit = js.native
    
    /* private */ def onNewColumnsLoaded(): js.Any = js.native
    
    /* private */ def onNewRowsLoaded(source: js.Any): js.Any = js.native
    
    /* private */ def parseQuickFilter(newFilter: js.Any): js.Any = js.native
    
    var popupService: js.Any = js.native
    
    /* private */ def putIntoGui(filterWrapper: js.Any): js.Any = js.native
    
    var quickFilter: js.Any = js.native
    
    var quickFilterParts: js.Any = js.native
    
    var rowModel: js.Any = js.native
    
    /* private */ def setAdvancedFilterPresent(): js.Any = js.native
    
    def setFilterModel(model: js.Any): Unit = js.native
    
    /* private */ def setModelOnFilterWrapper(filterPromise: js.Any, newModel: js.Any): js.Any = js.native
    
    def setQuickFilter(newFilter: js.Any): Unit = js.native
    
    /* private */ def setQuickFilterParts(): js.Any = js.native
    
    /* private */ def updateFilterFlagInColumns(source: js.Any): js.Any = js.native
    
    var valueService: js.Any = js.native
  }
  /* static members */
  object FilterManager {
    
    @JSImport("ag-grid/dist/lib/filter/filterManager", "FilterManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/filter/filterManager", "FilterManager.QUICK_FILTER_SEPARATOR")
    @js.native
    def QUICK_FILTER_SEPARATOR: String = js.native
    @scala.inline
    def QUICK_FILTER_SEPARATOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUICK_FILTER_SEPARATOR")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FilterWrapper extends StObject {
    
    var column: Column = js.native
    
    var compiledElement: js.Any = js.native
    
    var filterPromise: Promise[IFilterComp] = js.native
    
    var guiPromise: ExternalPromise[HTMLElement] = js.native
    
    var scope: js.Any = js.native
  }
  object FilterWrapper {
    
    @scala.inline
    def apply(
      column: Column,
      compiledElement: js.Any,
      filterPromise: Promise[IFilterComp],
      guiPromise: ExternalPromise[HTMLElement],
      scope: js.Any
    ): FilterWrapper = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compiledElement = compiledElement.asInstanceOf[js.Any], filterPromise = filterPromise.asInstanceOf[js.Any], guiPromise = guiPromise.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterWrapper]
    }
    
    @scala.inline
    implicit class FilterWrapperMutableBuilder[Self <: FilterWrapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompiledElement(value: js.Any): Self = StObject.set(x, "compiledElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPromise(value: Promise[IFilterComp]): Self = StObject.set(x, "filterPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuiPromise(value: ExternalPromise[HTMLElement]): Self = StObject.set(x, "guiPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
