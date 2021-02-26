package typingsSlinky.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridInstance extends StObject {
  
  @JSName("$canvas")
  var $canvas: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  
  @JSName("$footerPanel")
  var $footerPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  
  @JSName("$groupPanel")
  var $groupPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  
  @JSName("$headerContainer")
  var $headerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  
  @JSName("$headerScroller")
  var $headerScroller: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  
  @JSName("$headers")
  var $headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  
  @JSName("$root")
  var $root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  
  @JSName("$topPanel")
  var $topPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  
  @JSName("$viewport")
  var $viewport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any = js.native
  
  def buildColumnDefsFromData(): Unit = js.native
  
  def buildColumns(): Unit = js.native
  
  def calcMaxCanvasHeight(): Unit = js.native
  
  def clearSortingData(): Unit = js.native
  
  var config: IGridOptions = js.native
  
  def configureColumnWidths(): Unit = js.native
  
  var data: js.Any = js.native
  
  var elementDims: IElementDimension = js.native
  
  var eventProvider: IEventProvider = js.native
  
  var filteredRows: js.Array[IRow] = js.native
  
  def fixColumnIndexes(): Unit = js.native
  
  def fixGroupIndexes(): Unit = js.native
  
  var footerController: js.Any = js.native
  
  def getTemplate(key: String): js.Any = js.native
  
  var gridId: String = js.native
  
  def init(): js.Any = js.native
  
  def initTemplates(): js.Any = js.native
  
  var lastSortedColumns: js.Array[IColumn] = js.native
  
  var lateBindColumns: Boolean = js.native
  
  var maxCanvasHt: Double = js.native
  
  def minRowsToRender(): Unit = js.native
  
  var prevScrollIndex: Double = js.native
  
  var prevScrollTop: Double = js.native
  
  def refreshDomSizes(): Unit = js.native
  
  def resizeOnData(col: IColumn): Unit = js.native
  
  var rootDim: IDimension = js.native
  
  var rowCache: js.Array[IRow] = js.native
  
  var rowFactory: IRowFactory = js.native
  
  var rowMap: js.Array[IRow] = js.native
  
  var searchProvider: ISearchProvider = js.native
  
  def setRenderedRows(newRows: js.Array[IRow]): Unit = js.native
  
  def sortActual(): Unit = js.native
  
  def sortColumnsInit(): Unit = js.native
  
  def sortData(col: IColumn, event: js.Any): Unit = js.native
  
  var styleProvider: IStyleProvider = js.native
}
object IGridInstance {
  
  @scala.inline
  def apply(
    $canvas: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $footerPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $groupPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $headerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $headerScroller: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $topPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    $viewport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    buildColumnDefsFromData: () => Unit,
    buildColumns: () => Unit,
    calcMaxCanvasHeight: () => Unit,
    clearSortingData: () => Unit,
    config: IGridOptions,
    configureColumnWidths: () => Unit,
    data: js.Any,
    elementDims: IElementDimension,
    eventProvider: IEventProvider,
    filteredRows: js.Array[IRow],
    fixColumnIndexes: () => Unit,
    fixGroupIndexes: () => Unit,
    footerController: js.Any,
    getTemplate: String => js.Any,
    gridId: String,
    init: () => js.Any,
    initTemplates: () => js.Any,
    lastSortedColumns: js.Array[IColumn],
    lateBindColumns: Boolean,
    maxCanvasHt: Double,
    minRowsToRender: () => Unit,
    prevScrollIndex: Double,
    prevScrollTop: Double,
    refreshDomSizes: () => Unit,
    resizeOnData: IColumn => Unit,
    rootDim: IDimension,
    rowCache: js.Array[IRow],
    rowFactory: IRowFactory,
    rowMap: js.Array[IRow],
    searchProvider: ISearchProvider,
    setRenderedRows: js.Array[IRow] => Unit,
    sortActual: () => Unit,
    sortColumnsInit: () => Unit,
    sortData: (IColumn, js.Any) => Unit,
    styleProvider: IStyleProvider
  ): IGridInstance = {
    val __obj = js.Dynamic.literal($canvas = $canvas.asInstanceOf[js.Any], $footerPanel = $footerPanel.asInstanceOf[js.Any], $groupPanel = $groupPanel.asInstanceOf[js.Any], $headerContainer = $headerContainer.asInstanceOf[js.Any], $headerScroller = $headerScroller.asInstanceOf[js.Any], $headers = $headers.asInstanceOf[js.Any], $root = $root.asInstanceOf[js.Any], $topPanel = $topPanel.asInstanceOf[js.Any], $viewport = $viewport.asInstanceOf[js.Any], buildColumnDefsFromData = js.Any.fromFunction0(buildColumnDefsFromData), buildColumns = js.Any.fromFunction0(buildColumns), calcMaxCanvasHeight = js.Any.fromFunction0(calcMaxCanvasHeight), clearSortingData = js.Any.fromFunction0(clearSortingData), config = config.asInstanceOf[js.Any], configureColumnWidths = js.Any.fromFunction0(configureColumnWidths), data = data.asInstanceOf[js.Any], elementDims = elementDims.asInstanceOf[js.Any], eventProvider = eventProvider.asInstanceOf[js.Any], filteredRows = filteredRows.asInstanceOf[js.Any], fixColumnIndexes = js.Any.fromFunction0(fixColumnIndexes), fixGroupIndexes = js.Any.fromFunction0(fixGroupIndexes), footerController = footerController.asInstanceOf[js.Any], getTemplate = js.Any.fromFunction1(getTemplate), gridId = gridId.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initTemplates = js.Any.fromFunction0(initTemplates), lastSortedColumns = lastSortedColumns.asInstanceOf[js.Any], lateBindColumns = lateBindColumns.asInstanceOf[js.Any], maxCanvasHt = maxCanvasHt.asInstanceOf[js.Any], minRowsToRender = js.Any.fromFunction0(minRowsToRender), prevScrollIndex = prevScrollIndex.asInstanceOf[js.Any], prevScrollTop = prevScrollTop.asInstanceOf[js.Any], refreshDomSizes = js.Any.fromFunction0(refreshDomSizes), resizeOnData = js.Any.fromFunction1(resizeOnData), rootDim = rootDim.asInstanceOf[js.Any], rowCache = rowCache.asInstanceOf[js.Any], rowFactory = rowFactory.asInstanceOf[js.Any], rowMap = rowMap.asInstanceOf[js.Any], searchProvider = searchProvider.asInstanceOf[js.Any], setRenderedRows = js.Any.fromFunction1(setRenderedRows), sortActual = js.Any.fromFunction0(sortActual), sortColumnsInit = js.Any.fromFunction0(sortColumnsInit), sortData = js.Any.fromFunction2(sortData), styleProvider = styleProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridInstance]
  }
  
  @scala.inline
  implicit class IGridInstanceMutableBuilder[Self <: IGridInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$canvas(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = StObject.set(x, "$canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$footerPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = StObject.set(x, "$footerPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$groupPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = StObject.set(x, "$groupPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$headerContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = StObject.set(x, "$headerContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$headerScroller(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = StObject.set(x, "$headerScroller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$headers(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = StObject.set(x, "$headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$root(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = StObject.set(x, "$root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$topPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = StObject.set(x, "$topPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$viewport(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = StObject.set(x, "$viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildColumnDefsFromData(value: () => Unit): Self = StObject.set(x, "buildColumnDefsFromData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuildColumns(value: () => Unit): Self = StObject.set(x, "buildColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCalcMaxCanvasHeight(value: () => Unit): Self = StObject.set(x, "calcMaxCanvasHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearSortingData(value: () => Unit): Self = StObject.set(x, "clearSortingData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfig(value: IGridOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigureColumnWidths(value: () => Unit): Self = StObject.set(x, "configureColumnWidths", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementDims(value: IElementDimension): Self = StObject.set(x, "elementDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventProvider(value: IEventProvider): Self = StObject.set(x, "eventProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredRows(value: js.Array[IRow]): Self = StObject.set(x, "filteredRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredRowsVarargs(value: IRow*): Self = StObject.set(x, "filteredRows", js.Array(value :_*))
    
    @scala.inline
    def setFixColumnIndexes(value: () => Unit): Self = StObject.set(x, "fixColumnIndexes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFixGroupIndexes(value: () => Unit): Self = StObject.set(x, "fixGroupIndexes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFooterController(value: js.Any): Self = StObject.set(x, "footerController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTemplate(value: String => js.Any): Self = StObject.set(x, "getTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGridId(value: String): Self = StObject.set(x, "gridId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: () => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitTemplates(value: () => js.Any): Self = StObject.set(x, "initTemplates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastSortedColumns(value: js.Array[IColumn]): Self = StObject.set(x, "lastSortedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSortedColumnsVarargs(value: IColumn*): Self = StObject.set(x, "lastSortedColumns", js.Array(value :_*))
    
    @scala.inline
    def setLateBindColumns(value: Boolean): Self = StObject.set(x, "lateBindColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCanvasHt(value: Double): Self = StObject.set(x, "maxCanvasHt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowsToRender(value: () => Unit): Self = StObject.set(x, "minRowsToRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrevScrollIndex(value: Double): Self = StObject.set(x, "prevScrollIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevScrollTop(value: Double): Self = StObject.set(x, "prevScrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshDomSizes(value: () => Unit): Self = StObject.set(x, "refreshDomSizes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResizeOnData(value: IColumn => Unit): Self = StObject.set(x, "resizeOnData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRootDim(value: IDimension): Self = StObject.set(x, "rootDim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCache(value: js.Array[IRow]): Self = StObject.set(x, "rowCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCacheVarargs(value: IRow*): Self = StObject.set(x, "rowCache", js.Array(value :_*))
    
    @scala.inline
    def setRowFactory(value: IRowFactory): Self = StObject.set(x, "rowFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowMap(value: js.Array[IRow]): Self = StObject.set(x, "rowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowMapVarargs(value: IRow*): Self = StObject.set(x, "rowMap", js.Array(value :_*))
    
    @scala.inline
    def setSearchProvider(value: ISearchProvider): Self = StObject.set(x, "searchProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRenderedRows(value: js.Array[IRow] => Unit): Self = StObject.set(x, "setRenderedRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortActual(value: () => Unit): Self = StObject.set(x, "sortActual", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSortColumnsInit(value: () => Unit): Self = StObject.set(x, "sortColumnsInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSortData(value: (IColumn, js.Any) => Unit): Self = StObject.set(x, "sortData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleProvider(value: IStyleProvider): Self = StObject.set(x, "styleProvider", value.asInstanceOf[js.Any])
  }
}
