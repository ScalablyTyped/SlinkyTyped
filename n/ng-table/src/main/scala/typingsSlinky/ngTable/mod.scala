package typingsSlinky.ngTable

import typingsSlinky.angular.mod.IAttributes
import typingsSlinky.angular.mod.IAugmentedJQuery
import typingsSlinky.angular.mod.ICompileService
import typingsSlinky.angular.mod.IDocumentService
import typingsSlinky.angular.mod.ILogService
import typingsSlinky.angular.mod.IModule
import typingsSlinky.angular.mod.IParseService
import typingsSlinky.angular.mod.IQService
import typingsSlinky.angular.mod.IRootScopeService
import typingsSlinky.angular.mod.ITimeoutService
import typingsSlinky.angular.mod.auto.IInjectorService
import typingsSlinky.ngTable.ngTableColumnMod.NgTableColumn
import typingsSlinky.ngTable.ngTableControllerMod.ITableScope
import typingsSlinky.ngTable.ngTableDefaultsMod.IDefaults
import typingsSlinky.ngTable.ngTableParamsMod.IParamValues
import typingsSlinky.ngTable.ngTableSettingsMod.ISettings
import typingsSlinky.ngTable.ngTableSettingsMod.NgTableSettings
import typingsSlinky.ngTable.publicInterfacesMod.IColumnDef
import typingsSlinky.ngTable.publicInterfacesMod.IDynamicTableColDef
import typingsSlinky.ngTable.publicInterfacesMod.IFilterConfigValues
import typingsSlinky.ngTable.publicInterfacesMod.ITableInputAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class NgTableController[TParams, TCol /* <: IColumnDef | IDynamicTableColDef */] protected ()
    extends typingsSlinky.ngTable.browserMod.NgTableController[TParams, TCol] {
    def this(
      $scope: ITableScope[TParams],
      $timeout: ITimeoutService,
      $parse: IParseService,
      $compile: ICompileService,
      $attrs: IAttributes with ITableInputAttributes,
      $element: IAugmentedJQuery,
      $document: IDocumentService,
      ngTableColumn: NgTableColumn[TCol],
      ngTableEventsChannel: typingsSlinky.ngTable.coreMod.NgTableEventsChannel
    ) = this()
  }
  
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typingsSlinky.ngTable.coreMod.NgTableDefaultGetDataProvider
  
  @js.native
  class NgTableEventsChannel protected ()
    extends typingsSlinky.ngTable.coreMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  
  @js.native
  class NgTableFilterConfig protected ()
    extends typingsSlinky.ngTable.browserMod.NgTableFilterConfig {
    def this(/**
      * Readonly copy of the final values used to configure the service.
      */
    config: IFilterConfigValues) = this()
  }
  
  @js.native
  class NgTableFilterConfigProvider protected ()
    extends typingsSlinky.ngTable.browserMod.NgTableFilterConfigProvider {
    def this($injector: IInjectorService) = this()
  }
  
  @js.native
  class NgTableParams[T] ()
    extends typingsSlinky.ngTable.coreMod.NgTableParams[T] {
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
      ngTableEventsChannel: typingsSlinky.ngTable.ngTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = js.native
  }
  
}

