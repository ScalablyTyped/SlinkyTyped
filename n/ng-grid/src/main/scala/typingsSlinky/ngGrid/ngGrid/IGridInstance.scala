package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridInstance extends js.Object {
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
  var config: IGridOptions = js.native
  var data: js.Any = js.native
  var elementDims: IElementDimension = js.native
  var eventProvider: IEventProvider = js.native
  var filteredRows: js.Array[IRow] = js.native
  var footerController: js.Any = js.native
  var gridId: String = js.native
  var lastSortedColumns: js.Array[IColumn] = js.native
  var lateBindColumns: Boolean = js.native
  var maxCanvasHt: Double = js.native
  var prevScrollIndex: Double = js.native
  var prevScrollTop: Double = js.native
  var rootDim: IDimension = js.native
  var rowCache: js.Array[IRow] = js.native
  var rowFactory: IRowFactory = js.native
  var rowMap: js.Array[IRow] = js.native
  var searchProvider: ISearchProvider = js.native
  var styleProvider: IStyleProvider = js.native
  def buildColumnDefsFromData(): Unit = js.native
  def buildColumns(): Unit = js.native
  def calcMaxCanvasHeight(): Unit = js.native
  def clearSortingData(): Unit = js.native
  def configureColumnWidths(): Unit = js.native
  def fixColumnIndexes(): Unit = js.native
  def fixGroupIndexes(): Unit = js.native
  def getTemplate(key: String): js.Any = js.native
  def init(): js.Any = js.native
  def initTemplates(): js.Any = js.native
  def minRowsToRender(): Unit = js.native
  def refreshDomSizes(): Unit = js.native
  def resizeOnData(col: IColumn): Unit = js.native
  def setRenderedRows(newRows: js.Array[IRow]): Unit = js.native
  def sortActual(): Unit = js.native
  def sortColumnsInit(): Unit = js.native
  def sortData(col: IColumn, event: js.Any): Unit = js.native
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
  implicit class IGridInstanceOps[Self <: IGridInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$canvas(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$footerPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$footerPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$groupPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$groupPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$headerContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$headerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$headerScroller(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$headerScroller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$headers(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$root(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$topPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$topPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$viewport(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildColumnDefsFromData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildColumnDefsFromData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBuildColumns(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCalcMaxCanvasHeight(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calcMaxCanvasHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearSortingData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSortingData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConfig(value: IGridOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigureColumnWidths(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureColumnWidths")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementDims(value: IElementDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementDims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventProvider(value: IEventProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilteredRows(value: js.Array[IRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixColumnIndexes(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixColumnIndexes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFixGroupIndexes(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixGroupIndexes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFooterController(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTemplate(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGridId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitTemplates(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initTemplates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastSortedColumns(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSortedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLateBindColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lateBindColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCanvasHt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCanvasHt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinRowsToRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowsToRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrevScrollIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevScrollIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevScrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshDomSizes(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshDomSizes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResizeOnData(value: IColumn => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeOnData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRootDim(value: IDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCache(value: js.Array[IRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowFactory(value: IRowFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowMap(value: js.Array[IRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchProvider(value: ISearchProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRenderedRows(value: js.Array[IRow] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRenderedRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSortActual(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortActual")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSortColumnsInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumnsInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSortData(value: (IColumn, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStyleProvider(value: IStyleProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

