package typingsSlinky.ngTable

import typingsSlinky.angular.mod.IAttributes
import typingsSlinky.angular.mod.IAugmentedJQuery
import typingsSlinky.angular.mod.ICompileService
import typingsSlinky.angular.mod.IDocumentService
import typingsSlinky.angular.mod.IParseService
import typingsSlinky.angular.mod.IRootScopeService
import typingsSlinky.angular.mod.ITimeoutService
import typingsSlinky.ngTable.anon.Columns
import typingsSlinky.ngTable.anon.Disabled
import typingsSlinky.ngTable.anon.Header
import typingsSlinky.ngTable.anon.Show
import typingsSlinky.ngTable.coreMod.NgTableEventsChannel
import typingsSlinky.ngTable.coreMod.NgTableParams
import typingsSlinky.ngTable.ngTableColumnMod.NgTableColumn
import typingsSlinky.ngTable.pagingMod.IPageButton
import typingsSlinky.ngTable.publicInterfacesMod.IColumnDef
import typingsSlinky.ngTable.publicInterfacesMod.IDynamicTableColDef
import typingsSlinky.ngTable.publicInterfacesMod.ITableInputAttributes
import typingsSlinky.ngTable.resultsMod.DataResults
import typingsSlinky.ngTable.resultsMod.GroupedDataResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableControllerMod {
  
  @JSImport("ng-table/src/browser/ngTableController", "NgTableController")
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected () extends StObject {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes with ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: NgTableEventsChannel
    ) = this()
    
    @JSName("$attrs")
    var $attrs: js.Any = js.native
    
    @JSName("$compile")
    var $compile: js.Any = js.native
    
    @JSName("$document")
    var $document: js.Any = js.native
    
    @JSName("$element")
    var $element: js.Any = js.native
    
    @JSName("$parse")
    var $parse: js.Any = js.native
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
    def buildColumns(columns: js.Array[TCol]): js.Array[IColumnDef] = js.native
    
    def compileDirectiveTemplates(): Unit = js.native
    
    var delayFilter: js.Any = js.native
    
    /* private */ def getVisibleColumns(): js.Any = js.native
    
    val hasVisibleFilterColumn: js.Any = js.native
    
    def loadFilterData($columns: js.Array[IColumnDef]): Unit = js.native
    
    var ngTableColumn: js.Any = js.native
    
    var ngTableEventsChannel: js.Any = js.native
    
    /* private */ def onDataReloadStatusChange(newStatus: js.Any): js.Any = js.native
    
    def parseNgTableDynamicExpr(attr: String): Columns = js.native
    
    def setupBindingsToInternalScope(tableParamsExpr: String): Unit = js.native
    
    /* private */ def setupFilterRowBindingsToInternalScope(): js.Any = js.native
    
    /* private */ def setupGroupRowBindingsToInternalScope(): js.Any = js.native
    
    /* private */ def some[T](array: js.Any, predicate: js.Any): js.Any = js.native
    
    /* private */ def subscribeToTableEvents(): js.Any = js.native
  }
  /* static members */
  object NgTableController {
    
    @JSImport("ng-table/src/browser/ngTableController", "NgTableController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableController", "NgTableController.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITableScope[T] extends IRootScopeService {
    
    @JSName("$columns")
    var $columns: js.Array[IColumnDef] = js.native
    
    @JSName("$data")
    var $data: js.UndefOr[DataResults[T]] = js.native
    
    @JSName("$filterRow")
    var $filterRow: Disabled = js.native
    
    @JSName("$groupRow")
    var $groupRow: Show = js.native
    
    @JSName("$groups")
    var $groups: js.UndefOr[GroupedDataResults[T]] = js.native
    
    @JSName("$loading")
    var $loading: Boolean = js.native
    
    var pages: js.Array[IPageButton] = js.native
    
    var params: NgTableParams[T] = js.native
    
    var show_filter: Boolean = js.native
    
    var templates: Header = js.native
  }
}
