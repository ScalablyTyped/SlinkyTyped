package typingsSlinky.ngDashTable

import typingsSlinky.angular.angularMod.IAttributes
import typingsSlinky.angular.angularMod.IAugmentedJQuery
import typingsSlinky.angular.angularMod.ICompileService
import typingsSlinky.angular.angularMod.IDocumentService
import typingsSlinky.angular.angularMod.ILogService
import typingsSlinky.angular.angularMod.IModule
import typingsSlinky.angular.angularMod.IParseService
import typingsSlinky.angular.angularMod.IQService
import typingsSlinky.angular.angularMod.IRootScopeService
import typingsSlinky.angular.angularMod.ITimeoutService
import typingsSlinky.angular.angularMod.auto.IInjectorService
import typingsSlinky.ngDashTable.srcBrowserNgTableColumnMod.NgTableColumn
import typingsSlinky.ngDashTable.srcBrowserNgTableControllerMod.ITableScope
import typingsSlinky.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import typingsSlinky.ngDashTable.srcBrowserPublicDashInterfacesMod.IDynamicTableColDef
import typingsSlinky.ngDashTable.srcBrowserPublicDashInterfacesMod.IFilterConfigValues
import typingsSlinky.ngDashTable.srcBrowserPublicDashInterfacesMod.ITableInputAttributes
import typingsSlinky.ngDashTable.srcCoreNgTableDefaultsMod.IDefaults
import typingsSlinky.ngDashTable.srcCoreNgTableParamsMod.IParamValues
import typingsSlinky.ngDashTable.srcCoreNgTableSettingsMod.ISettings
import typingsSlinky.ngDashTable.srcCoreNgTableSettingsMod.NgTableSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table", JSImport.Namespace)
@js.native
object ngDashTableMod extends js.Object {
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typingsSlinky.ngDashTable.srcBrowserMod.NgTableController[TParams, TCol] {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes with ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: typingsSlinky.ngDashTable.srcCoreMod.NgTableEventsChannel
    ) = this()
  }
  
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typingsSlinky.ngDashTable.srcCoreMod.NgTableDefaultGetDataProvider
  
  @js.native
  class NgTableEventsChannel protected ()
    extends typingsSlinky.ngDashTable.srcCoreMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  
  @js.native
  class NgTableFilterConfig protected ()
    extends typingsSlinky.ngDashTable.srcBrowserMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typingsSlinky.ngDashTable.srcBrowserMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  
  @js.native
  class NgTableParams[T] ()
    extends typingsSlinky.ngDashTable.srcCoreMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  
  val ngTableBrowserModule: IModule = js.native
  val ngTableCoreModule: IModule = js.native
  val ngTableModule: IModule = js.native
  /* static members */
  @js.native
  object NgTableController extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableEventsChannel extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableFilterConfig extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableFilterConfigProvider extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object NgTableParams extends js.Object {
    @JSName("$log")
    var $log: js.Any = js.native
    @JSName("$q")
    var $q: js.Any = js.native
    var ngTableDefaults: js.Any = js.native
    var ngTableEventsChannel: js.Any = js.native
    var ngTableSettings: js.Any = js.native
    def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: typingsSlinky.ngDashTable.srcCoreNgTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = js.native
  }
  
}

